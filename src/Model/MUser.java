/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandaru
 */
public class MUser {
    public void updateUser(String a, String b,String c,String d, String e,String f,String g,String h){

     try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("Update users set UserFName ='"+a+"',UserLName ='"+b+"',Username ='"+c+"',Email ='"+d+"',Contact ='"+e+"',Passwords ='"+f+"'where Username='"+g+"' and Passwords ='"+h+"'");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"You Got Updated!");}
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}
    }
}
