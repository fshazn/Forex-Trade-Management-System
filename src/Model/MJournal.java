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
public class MJournal {
    public void addJournal(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l){

 try
      {
        MyDatabaseConnection mycon=new MyDatabaseConnection();
        Statement st=mycon.createDbConnection().createStatement();
        int count=st.executeUpdate("insert into trade(Date,Pair,Zone,BS,LotSize,EntryPrice,ClosedPrice,Target,StopLoss,Profit,Description,USID) values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"')");
        if (count>0)
       {JOptionPane.showMessageDialog(null,"Trade details submitted successfully!");}
      }
      catch(Exception ex)
      {JOptionPane.showMessageDialog(null,ex.getMessage());}



}
}
