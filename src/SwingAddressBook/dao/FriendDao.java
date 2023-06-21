/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingAddressBook.dao;

import SwingAddressBook.dbutil.DBConnection;
import SwingAddressBook.pojo.FriendPojo;
import SwingAddressBook.pojo.UserPojo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class FriendDao {
     public static boolean addFriend(FriendPojo u)throws SQLException
    {
       
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("insert into home_frame (name,email,phone,address) values (?,?,?,?)");
        ps.setString(1,u.getName());
        ps.setString(2, u.getEmail());
        
        ps.setString(4, u.getPhone());
        ps.setString(5,u.getAddress());
       
        return (ps.executeUpdate()!=0);    
    }
   public static boolean updateFriend(FriendPojo p) throws SQLException, InterruptedException{
    
    
    String name=p.getName();
    String email=p.getEmail();
    String phone=p.getPhone();
    String address=p.getAddress();
   
   
   
    Statement st=DBConnection.getConnection().createStatement();
   int x=st.executeUpdate("update patients set name='"+name+"',email='"+email+"',phone='"+phone+"',address='"+address+"'");
   return x==1;
}  
   public static boolean deleteFriend(String name)throws SQLException, InterruptedException{
    
   PreparedStatement ps=DBConnection.getConnection().prepareStatement("Delete from home_frame where name=?");
     ps.setString(1, name);
    int result= ps.executeUpdate();
    return result==1;
}
   public static ArrayList<String> getAllFriends()throws SQLException
    {
        ArrayList<String> names = new ArrayList<>();
        ResultSet rs = DBConnection.getConnection().createStatement().executeQuery("select name from home_frame");
        while(rs.next())
        {
            names.add(rs.getString(1));
        }
        return names;
    }
}
