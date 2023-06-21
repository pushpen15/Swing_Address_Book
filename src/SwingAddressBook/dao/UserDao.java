/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingAddressBook.dao;

import SwingAddressBook.dbutil.DBConnection;
import SwingAddressBook.pojo.User;
import SwingAddressBook.pojo.UserPojo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author User
 */
public class UserDao {
    public static String validateUser(User user)throws SQLException{
         String qry="Select username from Users where login_name=? and password=?";
         PreparedStatement ps=DBConnection.getConnection().prepareStatement(qry);
         System.out.println(user);
         ps.setString(1, user.getLogin_name());
         ps.setString(2, user.getPassword());
        
         ResultSet rs=ps.executeQuery();
         String username=null;
         if(rs.next())
         {
             username=rs.getString(1);
             
         }
         return username;
    }
     public static boolean addUser(UserPojo u)throws SQLException
    {
       
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("insert into users (username,login_name,password,phone,address) values (?,?,?,?,?)");
        ps.setString(1,u.getUsername());
        ps.setString(2, u.getLogin_name());
        ps.setString(3, u.getPassword());
        ps.setString(4, u.getPhone());
        ps.setString(5,u.getAddress());
       
        return (ps.executeUpdate()!=0);    
    }
}
    
     
     
     
        