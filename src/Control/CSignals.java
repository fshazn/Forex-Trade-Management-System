/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.MManageUser;
import Model.MSignals;
import java.sql.ResultSet;
/**
 *
 * @author Sandaru
 */
public class CSignals {
    public void submitSignals(String date,String pair,String bs,String entry,String stop,String target,String description){

    MSignals ms = new MSignals();
    ms.submitSignals(date,pair,bs,entry,stop,target,description);
}
 public ResultSet viewSignals()
    {
      ResultSet rs;
      MSignals mm=new MSignals();
      rs=mm.viewSignals();
      return rs;
    }
public void deleteSignals(int row,String cell){

 MSignals ms = new MSignals();
 ms.deleteSignals(row,cell);

}
public ResultSet refreshTable()
    {
      ResultSet rs;
      MSignals mm=new MSignals();
      rs=mm.refreshTable();
      return rs;
    }

}
