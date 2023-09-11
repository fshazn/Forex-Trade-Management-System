/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.MAdmin;
/**
 *
 * @author Sandaru
 */
public class CAdmin {
   public void updateAdmin(String firstname,String lastname,String username,String email,String contact,String password,int id){
   MAdmin ma = new MAdmin();
   ma.updateAdmin(firstname,lastname,username,email,contact,password,id);
}
}
