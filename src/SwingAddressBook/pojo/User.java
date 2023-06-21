/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingAddressBook.pojo;

/**
 *
 * @author User
 */
public class User {

    @Override
    public String toString() {
        return "User{" + "login_name=" + login_name + ", password=" + password + '}';
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String userId) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    private String login_name;
    private String password;
    
    
    
}
