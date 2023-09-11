/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MViewTrade;
import java.sql.ResultSet;

/**
 *
 * @author Sandaru
 */
public class CViewTrade {
    public ResultSet viewTrade()
    {
      ResultSet rs;
      MViewTrade mm=new MViewTrade();
      rs=mm.viewTrade();
      return rs;
    }

public void deleteTrade(int row,String cell){

 MViewTrade ms = new MViewTrade();
 ms.deleteTrade(row,cell);

}
public ResultSet refreshTable()
    {
      ResultSet rs;
      MViewTrade mm=new MViewTrade();
      rs=mm.refreshTable();
      return rs;
    }
}
