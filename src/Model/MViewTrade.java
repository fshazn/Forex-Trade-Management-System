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
public class MViewTrade {
     public ResultSet viewTrade()
    {
      ResultSet rs= null;
      try{
          MyDatabaseConnection mycon = new MyDatabaseConnection();
          Statement st = mycon.createDbConnection().createStatement();
          rs= st.executeQuery("select * from trade");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null,e.getMessage());}
      return rs;
}


public void deleteTrade(int row,String cell){

    try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("delete from trade where TradeID = '"+cell+"'");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"Trade Details Removed Successfully!");
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
          rs= st.executeQuery("select * from trade");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null,e.getMessage());}
      return rs;
    }
}
