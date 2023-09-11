/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MManageMeetings;
import java.sql.ResultSet;

/**
 *
 * @author Sandaru
 */
public class CManageMeetings {
    public void managemeetings(String date, String description, String passcode, String link){

   MManageMeetings mm = new  MManageMeetings();
   mm.managemeetings(date,description,passcode,link);


}
 public ResultSet managemeetings()
    {
      ResultSet rs;
      MManageMeetings mm=new  MManageMeetings();
      rs=mm.managemeetings();
      return rs;
    }
public ResultSet refreshTable()
    {
      ResultSet rs;
      MManageMeetings k=new MManageMeetings();
      rs=k.refreshTable();
      return rs;
    }

public void deletemeetings(int row,String cell){

 MManageMeetings ms = new MManageMeetings();
 ms.deletemeetings(row,cell);

}
}
