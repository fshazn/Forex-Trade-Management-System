/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MMeetings;
import java.sql.ResultSet;

/**
 *
 * @author Sandaru
 */
public class CMeetings {
     public ResultSet managemeetings()
    {
      ResultSet rs;
      MMeetings mm=new MMeetings();
      rs=mm.managemeetings();
      return rs;
    }
}
