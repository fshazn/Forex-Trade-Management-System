/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MViewSignals;
import java.sql.ResultSet;

/**
 *
 * @author Sandaru
 */
public class CViewSignals {
    public ResultSet viewSignals()
    {
      ResultSet rs;
      MViewSignals mm=new MViewSignals();
      rs=mm.viewSignals();
      return rs;
    }
}
