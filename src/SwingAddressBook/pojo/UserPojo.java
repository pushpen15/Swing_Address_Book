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
public class UserPojo {

    public UserPojo(String username, String login_name, String password, String phone, String address) {
        this.username = username;
        this.login_name = login_name;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserPojo{" + "username=" + username + ", login_name=" + login_name + ", password=" + password + ", phone=" + phone+ ", Address=" + address + '}';
    }

    public void setPhone(String phone) {
        this.phone=phone;
    }

    public String getAddress() {
        return address;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    private String username;
    private String login_name;
    private String password;
    private String phone;
    private String address;
    
}
