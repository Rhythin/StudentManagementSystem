/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import ConnectionProvider.ConnectionProviderCode;

/**
 *
 * @author Rhythin
 */
public class StudentResult extends javax.swing.JFrame {

    /**
     * Creates new form StudentResult
     */
    public StudentResult() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public StudentResult(int rollno) {
        initComponents();
        rollNoTextField.setText(Integer.toString(rollno));
        rollNoTextField.setEditable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rollNoTextField = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        GenderTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FatherNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CourseTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BranchTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TotalTextField = new javax.swing.JTextField();
        physicsTextField = new javax.swing.JTextField();
        mathsTextField = new javax.swing.JTextField();
        ChemistryTextField = new javax.swing.JTextField();
        EletricalTextField = new javax.swing.JTextField();
        BiologyTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        VerdictTextField = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 500));
        setMinimumSize(new java.awt.Dimension(550, 500));
        setPreferredSize(new java.awt.Dimension(550, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Roll No");
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 160, 30));

        rollNoTextField.setMaximumSize(new java.awt.Dimension(150, 30));
        rollNoTextField.setMinimumSize(new java.awt.Dimension(150, 30));
        rollNoTextField.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(rollNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        label2.setText("Name");
        label2.setMaximumSize(new java.awt.Dimension(150, 30));
        label2.setMinimumSize(new java.awt.Dimension(150, 30));
        label2.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        NameTextField.setMaximumSize(new java.awt.Dimension(150, 30));
        NameTextField.setMinimumSize(new java.awt.Dimension(150, 30));
        NameTextField.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel3.setText("Gender");
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(150, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        GenderTextField.setMaximumSize(new java.awt.Dimension(150, 30));
        GenderTextField.setMinimumSize(new java.awt.Dimension(150, 30));
        GenderTextField.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(GenderTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel4.setText("Father's Name");
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        FatherNameTextField.setMaximumSize(new java.awt.Dimension(150, 30));
        FatherNameTextField.setMinimumSize(new java.awt.Dimension(150, 30));
        FatherNameTextField.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(FatherNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel5.setText("Course");
        jLabel5.setMaximumSize(new java.awt.Dimension(150, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(150, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        CourseTextField.setMaximumSize(new java.awt.Dimension(150, 30));
        CourseTextField.setMinimumSize(new java.awt.Dimension(150, 30));
        CourseTextField.setPreferredSize(new java.awt.Dimension(150, 30));
        CourseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(CourseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel6.setText("Branch");
        jLabel6.setMaximumSize(new java.awt.Dimension(150, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(150, 30));
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        BranchTextField.setMaximumSize(new java.awt.Dimension(150, 30));
        BranchTextField.setMinimumSize(new java.awt.Dimension(150, 30));
        BranchTextField.setPreferredSize(new java.awt.Dimension(150, 30));
        BranchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(BranchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel7.setText("Subject");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel8.setText("Maximum Score");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel9.setText("Passing Score");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel10.setText("Marks Obtained");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel11.setText("Physics");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel14.setText("Maths");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel15.setText("Chemistry");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel16.setText("Eletrical");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel17.setText("Biology");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel18.setText("Total");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel20.setText("100");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jLabel21.setText("100");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jLabel22.setText("100");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel23.setText("100");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel24.setText("100");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel25.setText("30");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel26.setText("30");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel27.setText("30");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        jLabel28.setText("30");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel29.setText("30");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        TotalTextField.setMaximumSize(new java.awt.Dimension(100, 30));
        TotalTextField.setMinimumSize(new java.awt.Dimension(100, 30));
        TotalTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(TotalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        physicsTextField.setMaximumSize(new java.awt.Dimension(100, 30));
        physicsTextField.setMinimumSize(new java.awt.Dimension(100, 30));
        physicsTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(physicsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        mathsTextField.setMaximumSize(new java.awt.Dimension(100, 30));
        mathsTextField.setMinimumSize(new java.awt.Dimension(100, 30));
        mathsTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(mathsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        ChemistryTextField.setMaximumSize(new java.awt.Dimension(100, 30));
        ChemistryTextField.setMinimumSize(new java.awt.Dimension(100, 30));
        ChemistryTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(ChemistryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        EletricalTextField.setMaximumSize(new java.awt.Dimension(100, 30));
        EletricalTextField.setMinimumSize(new java.awt.Dimension(100, 30));
        EletricalTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(EletricalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        BiologyTextField.setMaximumSize(new java.awt.Dimension(100, 30));
        BiologyTextField.setMinimumSize(new java.awt.Dimension(100, 30));
        BiologyTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(BiologyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jLabel19.setText("Verdict");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        VerdictTextField.setMaximumSize(new java.awt.Dimension(100, 30));
        VerdictTextField.setMinimumSize(new java.awt.Dimension(100, 30));
        VerdictTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(VerdictTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CourseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseTextFieldActionPerformed

    private void BranchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BranchTextFieldActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        int rollNo=Integer.parseInt(rollNoTextField.getText());
        
        try {
            Connection con=ConnectionProviderCode.getcon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("SELECT * FROM STUDENT S INNER JOIN RESULT R ON S.ROLLNO=R.ROLLNO WHERE "
                    + "R.ROLLNO="+rollNo);
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "No Results yet");
                setVisible(false);
                Student frame =new Student();
            }
            else{
                NameTextField.setText(rs.getString(1));
                GenderTextField.setText(rs.getString(3));
                FatherNameTextField.setText(rs.getString(4));
                CourseTextField.setText(rs.getString(5));
                BranchTextField.setText(rs.getString(6));
                
                physicsTextField.setText(rs.getString(8));
                mathsTextField.setText(rs.getString(9));
                ChemistryTextField.setText(rs.getString(10));
                EletricalTextField.setText(rs.getString(11));
                BiologyTextField.setText(rs.getString(12));
                TotalTextField.setText(rs.getString(13));
                
                NameTextField.setEditable(false);
                GenderTextField.setEditable(false);
                FatherNameTextField.setEditable(false);
                CourseTextField.setEditable(false);
                BranchTextField.setEditable(false);
                physicsTextField.setEditable(false);
                mathsTextField.setEditable(false);
                ChemistryTextField.setEditable(false);
                EletricalTextField.setEditable(false);
                BiologyTextField.setEditable(false);
                TotalTextField.setEditable(false);
                
                int physicsMarks=Integer.parseInt(physicsTextField.getText());
                int mathsMarks=Integer.parseInt(mathsTextField.getText());
                int chemistrysMarks=Integer.parseInt(ChemistryTextField.getText());
                int eletricalMarks=Integer.parseInt(EletricalTextField.getText());
                int biologyMarks=Integer.parseInt(BiologyTextField.getText());
                
                if(physicsMarks<30 || mathsMarks<30 || chemistrysMarks<30 || eletricalMarks<30 || biologyMarks<30){
                    VerdictTextField.setText("Fail");
                }
                else{
                    VerdictTextField.setText("Pass");
                }
                VerdictTextField.setEditable(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Student frame=new Student();
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BiologyTextField;
    private javax.swing.JTextField BranchTextField;
    private javax.swing.JTextField ChemistryTextField;
    private javax.swing.JTextField CourseTextField;
    private javax.swing.JTextField EletricalTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FatherNameTextField;
    private javax.swing.JTextField GenderTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField TotalTextField;
    private javax.swing.JTextField VerdictTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label2;
    private javax.swing.JTextField mathsTextField;
    private javax.swing.JTextField physicsTextField;
    private javax.swing.JTextField rollNoTextField;
    // End of variables declaration//GEN-END:variables
}
