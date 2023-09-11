/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import View.Admin;
import View.AdminLogin;

/**
 *
 * @author Sandaru
 */
public class MAdminLogin {
    public void adminLogin(String a, String b)
    { ResultSet rs= null;
       try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        rs= st.executeQuery("select * from admins where AdminUsername='"+a+"' and AdminPassword='"+b+"'");
        
        if (rs.next())
       {Admin admin = new Admin();
        
        admin.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null,"Invalid username or password");
        }
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}
    }
}
