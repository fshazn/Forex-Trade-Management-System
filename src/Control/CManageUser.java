/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.MManageUser;
import java.sql.ResultSet;
/**
 *
 * @author Sandaru
 */
public class CManageUser {
   public ResultSet viewUser()
    {
      ResultSet rs;
      MManageUser mm=new MManageUser();
      rs=mm.viewUser();
      return rs;
    }
public void deleteUsers(int row,String cell){

 MManageUser ms = new MManageUser();
 ms.deleteUsers(row,cell);

}

public ResultSet refreshTable()
    {
      ResultSet rs;
      MManageUser mm=new MManageUser();
      rs=mm.refreshTable();
      return rs;
    }
}
