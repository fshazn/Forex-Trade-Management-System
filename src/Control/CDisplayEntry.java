/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MDisplayEntry;
import java.sql.ResultSet;

/**
 *
 * @author Sandaru
 */
public class CDisplayEntry {
    public ResultSet viewentry()
    {
      ResultSet rs;
      MDisplayEntry mm=new MDisplayEntry();
      rs=mm.viewentry();
      return rs;
    }
}
