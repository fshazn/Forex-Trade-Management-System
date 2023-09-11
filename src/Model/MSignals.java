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
public class MSignals {
    public void submitSignals(String date,String pair,String bs,String entry,String stop,String target,String description){

    try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("insert into signals(Date,Pair,BS,EntryPrice,StopLoss,Target,Description) values('"+date+"','"+pair+"','"+bs+"','"+entry+"','"+stop+"','"+target+"','"+description+"')");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"Signal Submitted!");}
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}
    }
     public ResultSet viewSignals()
    {
      ResultSet rs= null;
      try{
          MyDatabaseConnection mycon = new MyDatabaseConnection();
          Statement st = mycon.createDbConnection().createStatement();
          rs= st.executeQuery("select * from signals");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null,e.getMessage());}
      return rs;
    }
   public void deleteSignals(int row,String cell){

    try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("delete from signals where SignalID = '"+cell+"'");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"Signal Removed Successfully!");
         refreshTable();}
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}


}

 public ResultSet refreshTable()
    {
      ResultSet rs= null;
      try{
          MyDatabaseConnection mycon = new MyDatabaseConnection();
          Statement st = mycon.createDbConnection().createStatement();
          rs= st.executeQuery("select * from signals");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null,e.getMessage());}
      return rs;
    }
}

