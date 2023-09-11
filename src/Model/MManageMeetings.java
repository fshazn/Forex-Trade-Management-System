/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandaru
 */
public class MManageMeetings {
    public void managemeetings(String date, String description, String passcode, String link){

try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("insert into meetings(Date,Description,Passcode,Link) values('"+date+"','"+description+"','"+passcode+"','"+link+"')");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"Meeting scheduled successfully!");
         }
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}

}
public ResultSet managemeetings()
    {
      ResultSet rs= null;
      try{
          MyDatabaseConnection mycon = new MyDatabaseConnection();
          Statement st = mycon.createDbConnection().createStatement();
          rs= st.executeQuery("SELECT * FROM meetings");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null,e.getMessage());}
      return rs;
    }

public ResultSet refreshTable()
    {
      ResultSet rs= null;
      try{
          MyDatabaseConnection mycon = new MyDatabaseConnection();
          Statement st = mycon.createDbConnection().createStatement();
          rs= st.executeQuery("select * from meetings");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null,e.getMessage());}
      return rs;
    }
public void deletemeetings(int row,String cell){

    try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("delete from meetings where MeetingID = '"+cell+"'");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"Meeting Removed Successfully!");
         refreshTable();}
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}


}

}
