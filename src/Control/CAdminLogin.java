/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.MAdminLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandaru
 */
public class CAdminLogin {
     public void adminLogin(String a, String b)
   {     if(a.equals(""))
{
JOptionPane.showMessageDialog(null,"Please Enter Your Username");
}
else if(b.equals(""))
{
JOptionPane.showMessageDialog(null,"Please Enter Your Password");
}

else{
MAdminLogin mm=new MAdminLogin();
      mm.adminLogin(a,b); 
    }
}
}
