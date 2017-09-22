/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import userService.UserService;

/**
 *
 * @author 740991
 */
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String loggedOut = request.getParameter("loggedOut");
        request.setAttribute("loggedOut", loggedOut);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (username == null||password == null)
        {
//          request.setAttribute("errorMessage", "Please enter both fields");
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }        
        if (username.trim().isEmpty()||password.trim().isEmpty())
        {
          request.setAttribute("errorMessage", "Please enter both fields");
          getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
        UserService u = new UserService();
        boolean loginSuccessful = u.login(request.getParameter("username"), request.getParameter("password"));
        if (loginSuccessful)
        {
            request.setAttribute("username", username);
            getServletContext().getRequestDispatcher("WEB-INF/mainPage.jsp").forward(request, response);
        }
        else
        {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.setAttribute("errorMessage", "Invalid username or password");
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
        // get username and passowrd and pass to login()
        //if login == true forward to main page.jsp
        //if invalid display error messages
        //save values in text boxes
    }
}
