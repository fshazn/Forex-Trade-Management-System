/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.User;
import View.UserLogin;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Sandaru
 */
public class MUserLogin {
     public void userLogin(String a, String b)
    { ResultSet rs= null;
       try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        rs= st.executeQuery("select * from users where Username='"+a+"' and Passwords='"+b+"'");
        
        if (rs.next())
       { 
         UserLogin ul = new UserLogin();
         ul.dispose();
         User u = new User();
         u.setVisible(true);
         
        }
        else{
        JOptionPane.showMessageDialog(null,"Invalid username or password");
        }
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}
    }
}
