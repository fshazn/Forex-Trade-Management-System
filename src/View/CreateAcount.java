/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Control.CCreateAccount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author Sandaru
 */
public class CreateAcount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAcount
     */
    public CreateAcount() {
        initComponents();
    icon2.setVisible(false);
    icon4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_UserLName = new javax.swing.JTextField();
        txt_UserFName = new javax.swing.JTextField();
        txt_UserUserName = new javax.swing.JTextField();
        txt_UserContact = new javax.swing.JTextField();
        txt_UserEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_Create = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        txt_UserConfirmPassword = new javax.swing.JPasswordField();
        txt_UserPassword = new javax.swing.JPasswordField();
        icon4 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 13, 218, 66));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 212, 239, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 212, 239, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 296, 522, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 385, 522, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 473, 522, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 564, 239, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 564, 239, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 144, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("First Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 144, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 229, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Contact:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 402, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 319, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 501, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Confirm Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 501, -1, -1));

        txt_UserLName.setBackground(new java.awt.Color(204, 204, 204));
        txt_UserLName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_UserLName.setBorder(null);
        jPanel1.add(txt_UserLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 240, 30));

        txt_UserFName.setBackground(new java.awt.Color(204, 204, 204));
        txt_UserFName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_UserFName.setBorder(null);
        jPanel1.add(txt_UserFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 240, 30));

        txt_UserUserName.setBackground(new java.awt.Color(204, 204, 204));
        txt_UserUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_UserUserName.setBorder(null);
        jPanel1.add(txt_UserUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 520, 30));

        txt_UserContact.setBackground(new java.awt.Color(204, 204, 204));
        txt_UserContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_UserContact.setBorder(null);
        jPanel1.add(txt_UserContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 520, 30));

        txt_UserEmail.setBackground(new java.awt.Color(204, 204, 204));
        txt_UserEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_UserEmail.setBorder(null);
        jPanel1.add(txt_UserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 520, 30));

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setBorder(null);
        jButton1.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 610, 100, 30));

        btn_Create.setBackground(new java.awt.Color(51, 153, 255));
        btn_Create.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Create.setText("Create");
        btn_Create.setBorder(null);
        btn_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 110, 30));

        btn_Clear.setBackground(new java.awt.Color(102, 102, 102));
        btn_Clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.setBorder(null);
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, 110, 30));

        txt_UserConfirmPassword.setBackground(new java.awt.Color(204, 204, 204));
        txt_UserConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_UserConfirmPassword.setBorder(null);
        jPanel1.add(txt_UserConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 190, 30));

        txt_UserPassword.setBackground(new java.awt.Color(204, 204, 204));
        txt_UserPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_UserPassword.setBorder(null);
        jPanel1.add(txt_UserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 190, 30));

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/hidden (2).png"))); // NOI18N
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon4MousePressed(evt);
            }
        });
        jPanel1.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 25, 25));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/view (1).png"))); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 25, 25));

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/view (1).png"))); // NOI18N
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon3MousePressed(evt);
            }
        });
        jPanel1.add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 25, 25));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/hidden (2).png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        jPanel1.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 25, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateActionPerformed
        // TODO add your handling code here:
String UserFName,UserLName,UserUserName,UserEmail,UserPassword,UserConfirmPassword,UserContact;
String regex = "^[0-9]{10}$";
String Epattern= "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
Pattern pattern = Pattern.compile(Epattern);
UserFName = txt_UserFName.getText();
UserLName = txt_UserLName.getText();
UserUserName = txt_UserUserName.getText();
UserEmail = txt_UserEmail.getText();
UserPassword = txt_UserPassword.getText();
UserConfirmPassword = txt_UserConfirmPassword.getText();
UserContact = txt_UserContact.getText();
Matcher matcher=pattern.matcher(UserEmail);
if(UserFName.equals(""))
{
JOptionPane.showMessageDialog(null,"First Name Cannot Be Blank!");
}
else if(UserLName.equals(""))
{
JOptionPane.showMessageDialog(null,"Last Name Cannot Be Blank!");
}
else if(UserUserName.equals(""))
{
JOptionPane.showMessageDialog(null,"Useraname Cannot Be Blank!");
}
else if(UserEmail.equals(""))
{
JOptionPane.showMessageDialog(null,"Email Cannot Be Blank!");
}
else if(!matcher.matches())
{
JOptionPane.showMessageDialog(null,"Invaild Email!");
txt_UserEmail.setText("");
}
else if(UserContact.equals(""))
{
JOptionPane.showMessageDialog(null,"Contact Cannot Be Blank!");
}
else if(!UserContact.matches(regex))
{
JOptionPane.showMessageDialog(null,"Invalid phone Number!!");
txt_UserContact.setText("");
}
else if(UserPassword.equals(""))
{
JOptionPane.showMessageDialog(null,"Password Cannot Be Blank!");
}
else if(UserConfirmPassword.equals(""))
{
JOptionPane.showMessageDialog(null,"Confrim Password Cannot Be Blank!");
}
else if(!UserPassword.equals(UserConfirmPassword))
{
JOptionPane.showMessageDialog(null,"Password Doesn't match!");
txt_UserConfirmPassword.setText("");
}
else{
CCreateAccount cm=new CCreateAccount();
    cm.saveUserData(UserFName,UserLName,UserUserName,UserEmail,UserContact,UserPassword,UserConfirmPassword);

    }
    }//GEN-LAST:event_btn_CreateActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        // TODO add your handling code here:
txt_UserFName.setText("");
txt_UserLName.setText("");
txt_UserUserName.setText("");
txt_UserEmail.setText("");
txt_UserPassword.setText("");
txt_UserConfirmPassword.setText("");
txt_UserContact.setText("");
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        // TODO add your handling code here:
icon1.setVisible(true);
icon2.setVisible(false);
txt_UserPassword.setEchoChar('*');
    }//GEN-LAST:event_icon2MousePressed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        // TODO add your handling code here:
icon2.setVisible(true);
icon1.setVisible(false);
txt_UserPassword.setEchoChar((char)0);
    }//GEN-LAST:event_icon1MousePressed

    private void icon3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MousePressed
        // TODO add your handling code here:
icon4.setVisible(true);
icon3.setVisible(false);
txt_UserConfirmPassword.setEchoChar((char)0);
    }//GEN-LAST:event_icon3MousePressed

    private void icon4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MousePressed
        // TODO add your handling code here:
icon3.setVisible(true);
icon4.setVisible(false);
txt_UserPassword.setEchoChar('*');
    }//GEN-LAST:event_icon4MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  this.setVisible(false);
  UserLogin ul= new UserLogin();
  ul.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAcount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAcount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAcount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAcount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAcount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Create;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPasswordField txt_UserConfirmPassword;
    private javax.swing.JTextField txt_UserContact;
    private javax.swing.JTextField txt_UserEmail;
    private javax.swing.JTextField txt_UserFName;
    private javax.swing.JTextField txt_UserLName;
    private javax.swing.JPasswordField txt_UserPassword;
    private javax.swing.JTextField txt_UserUserName;
    // End of variables declaration//GEN-END:variables
}
