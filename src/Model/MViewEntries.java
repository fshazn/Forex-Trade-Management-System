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
public class MViewEntries {
     public ResultSet viewEntries()
    {
      ResultSet rs= null;
      try{
          MyDatabaseConnection mycon = new MyDatabaseConnection();
          Statement st = mycon.createDbConnection().createStatement();
          rs= st.executeQuery("SELECT Date,Pair,BS,EntryPrice,StopLoss,Target,Description FROM signals");
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
          rs= st.executeQuery("select entryID,Date,Image,description from entries");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null,e.getMessage());}
      return rs;
    }
public void deleteentries(int row,String cell){

    try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("delete from entries where entryID = '"+cell+"'");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"Entry Removed Successfully!");
         refreshTable();}
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}


}
}
