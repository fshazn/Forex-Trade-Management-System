/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MViewEntries;
import java.sql.ResultSet;

/**
 *
 * @author Sandaru
 */
public class CViewEntries {
    public ResultSet viewEntries()
    {
      ResultSet rs;
      MViewEntries mm=new MViewEntries();
      rs=mm.viewEntries();
      return rs;
    }
public ResultSet refreshTable()
    {
      ResultSet rs;
      MViewEntries mm=new MViewEntries();
      rs=mm.refreshTable();
      return rs;
    }
public void deleteentries(int row,String cell)
    {
      MViewEntries ms = new MViewEntries();
 ms.deleteentries(row,cell);
    }
}
