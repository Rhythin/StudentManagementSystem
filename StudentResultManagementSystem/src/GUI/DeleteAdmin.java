/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Rhythin
 */
public class DeleteAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DeleteAdmin
     */
    public DeleteAdmin() {
        initComponents();
        setVisible(false);
        setLocationRelativeTo(null);
        setTitle("Delete Admin");
        DeleteButton.setEnabled(false);
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

        UserNameLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 500));
        setPreferredSize(new java.awt.Dimension(550, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserNameLabel.setText("User Name");
        getContentPane().add(UserNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, 20));

        UsernameTextField.setMaximumSize(new java.awt.Dimension(150, 30));
        UsernameTextField.setMinimumSize(new java.awt.Dimension(150, 30));
        UsernameTextField.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        SearchButton.setText("Search");
        SearchButton.setMaximumSize(new java.awt.Dimension(150, 30));
        SearchButton.setMinimumSize(new java.awt.Dimension(150, 30));
        SearchButton.setPreferredSize(new java.awt.Dimension(150, 30));
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        DeleteButton.setText("Delete");
        DeleteButton.setMaximumSize(new java.awt.Dimension(150, 30));
        DeleteButton.setMinimumSize(new java.awt.Dimension(150, 30));
        DeleteButton.setPreferredSize(new java.awt.Dimension(150, 30));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        ExitButton.setText("Exit");
        ExitButton.setMaximumSize(new java.awt.Dimension(150, 30));
        ExitButton.setMinimumSize(new java.awt.Dimension(150, 30));
        ExitButton.setPreferredSize(new java.awt.Dimension(150, 30));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 270));

        BackgroundLabel.setText("jLabel1");
        getContentPane().add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Admin frame =new Admin();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int option=JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete", JOptionPane.YES_NO_OPTION);
        if(option==JOptionPane.YES_OPTION){
            String username=UsernameTextField.getText();
            try {
                Connection con=ConnectionProviderCode.getcon();
                Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                String query="DELETE FROM ADMINLOGIN WHERE USERNAME ='"+username+"'";
                System.out.println(query);
                st.execute(query);
                JOptionPane.showMessageDialog(null, "Admin Removed");
                this.setVisible(false);
                DeleteResult frame=new DeleteResult();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        String username=UsernameTextField.getText();
        try {
            Connection con=ConnectionProviderCode.getcon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query="SELECT * FROM ADMINLOGIN WHERE USERNAME ='"+username+"'";
            ResultSet rs=st.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "No admins for given username");
            }
            else{
                
                DeleteButton.setEnabled(true);
                UsernameTextField.setEditable(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
