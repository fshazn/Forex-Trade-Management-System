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
public class MDisplayEntry {
    public ResultSet viewentry()
    {
      ResultSet rs= null;
      try{
          MyDatabaseConnection mycon = new MyDatabaseConnection();
          Statement st = mycon.createDbConnection().createStatement();
          rs= st.executeQuery("SELECT entryID,Date FROM entries");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null,e.getMessage());}
      return rs;
    }
}
