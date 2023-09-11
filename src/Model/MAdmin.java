/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Sandaru
 */
public class MAdmin {
   
   public void updateAdmin(String firstname,String lastname,String username,String email,String contact,String password,int id){

     try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("Update admins set AdminFName ='"+firstname+"',AdminLName ='"+lastname+"',AdminUsername ='"+username+"',AdminEmail ='"+email+"',AdminContact ='"+contact+"',AdminFName ='"+password+"'where AdminID='"+id+"'");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"You Got Updated!");}
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}
    }

}

