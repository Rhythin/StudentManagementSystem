/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import ConnectionProvider.ConnectionProviderCode;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Rhythin
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setTitle("Admin Login");
        scaleimage();
        
    }
    public void scaleimage(){
        BackgroundLabel.setPreferredSize(this.getPreferredSize());
        BackgroundLabel.setBounds(this.getBounds());
        ImageIcon icon= new ImageIcon(getClass().getResource("background.jpg"));
        Image img=icon.getImage();
        Image scaledImage = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(scaledImage);
        BackgroundLabel.setIcon(scaledIcon);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 400));
        setMinimumSize(new java.awt.Dimension(550, 400));
        setPreferredSize(new java.awt.Dimension(550, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameLabel.setText("User Name");
        UsernameLabel.setMaximumSize(new java.awt.Dimension(100, 30));
        UsernameLabel.setMinimumSize(new java.awt.Dimension(100, 30));
        UsernameLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 107, -1, -1));

        passwordLabel.setText("Password");
        passwordLabel.setMaximumSize(new java.awt.Dimension(100, 30));
        passwordLabel.setMinimumSize(new java.awt.Dimension(100, 30));
        passwordLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 180, -1, -1));

        UserNameTextField.setMaximumSize(new java.awt.Dimension(100, 30));
        UserNameTextField.setMinimumSize(new java.awt.Dimension(100, 30));
        UserNameTextField.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(UserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 150, 30));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        PasswordField.setMaximumSize(new java.awt.Dimension(150, 30));
        PasswordField.setMinimumSize(new java.awt.Dimension(150, 30));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, 30));

        BackgroundLabel.setText("jLabel1");
        getContentPane().add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username=UserNameTextField.getText();
        String password=new String(PasswordField.getPassword());
        
//        if(username.contentEquals("admin") && password.contentEquals("password")){
//            setVisible(false);
//            Admin frame=new Admin();
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Username or password is incorrect");
//        }


        try {
            Connection con=ConnectionProviderCode.getcon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("SELECT * FROM ADMINLOGIN WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Username or password is incorrect");
                setVisible(false);
                AdminLogin frame =new AdminLogin();
            }
            else{
                setVisible(false);
                Admin frame=new Admin();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int response=JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
                "submit",JOptionPane.YES_NO_OPTION);
        if(response==JOptionPane.YES_OPTION){
            this.setVisible(false);
            HomePage frame=new HomePage();
            frame.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
