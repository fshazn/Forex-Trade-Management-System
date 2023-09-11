/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author Sandaru
 */
public class MyDatabaseConnection {
    private Connection con;
    public Connection createDbConnection()
    {  try{
         String MyDbPath="jdbc:mysql://localhost/eadproject";
         con=DriverManager.getConnection(MyDbPath,"root","");
        }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null,e.getMessage());
       }
     return con;
     
    }
}
