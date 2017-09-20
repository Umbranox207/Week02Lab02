/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userService;

/**
 *
 * @author 740991
 */
public class UserService {
    private String password = "password";
    private String correctUsername1 = "adam";
    private String correctUsername2 = "betty";
    public boolean login(String username, String password)
    {
        //this determines whether the password and username are the correct combination
        if (username.equals(correctUsername1)&&password.equals(this.password)||username.equals(correctUsername2)&&password.equals(this.password))
        {
            return true;
        }
            
            return false;
    }
    
}
