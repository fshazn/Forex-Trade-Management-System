/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Sandaru
 */
public class MCreateAccount {
    public void saveUserData(String a, String b,String c,String d, String e,String f,String g)
    {
       try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("insert into Users(UserFName,UserLName,Username,Email,Contact,Passwords) values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"')");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"You Got Registered!");
         }
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}
    }
}
