/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;
import java.io.File; //File class will be used to check whether or not the filename 'Employees.csv' exists
import classes.Employee; //to access the necessary properties of the Employee class
import java.awt.Dialog;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DREAM PC
 */
public class FrmNewEmployee extends javax.swing.JDialog { //Changed from Jframe to JDialog for further execution of methods in FrmMainMenu

    /**
     * Creates new form FrmNewEmployee
     */
    public FrmNewEmployee() {
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL); //puts priority on the modality type of the frame itself
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmployeeNo = new javax.swing.JLabel();
        txtEmployeeNo = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblSSSNo = new javax.swing.JLabel();
        txtSSSNo = new javax.swing.JTextField();
        lblPhealthNo = new javax.swing.JLabel();
        txtPhealthNo = new javax.swing.JTextField();
        lblTinNo = new javax.swing.JLabel();
        txtTinNo = new javax.swing.JTextField();
        lblPagibigNo = new javax.swing.JLabel();
        txtPagibigNo = new javax.swing.JTextField();
        btnSaveEmployee = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblBirthday = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblImmediateSup = new javax.swing.JLabel();
        txtImmediateSup = new javax.swing.JTextField();
        lblBasicSalary = new javax.swing.JLabel();
        lblRiceSubsidy = new javax.swing.JLabel();
        lblPhoneAllowance = new javax.swing.JLabel();
        lblClothingAllowance = new javax.swing.JLabel();
        lblgrossSemiMonthlyRate = new javax.swing.JLabel();
        lblHourlyRate = new javax.swing.JLabel();
        txtBasicSalary = new javax.swing.JTextField();
        txtRiceSubsidy = new javax.swing.JTextField();
        txtPhoneAllowance = new javax.swing.JTextField();
        txtClothingAllowance = new javax.swing.JTextField();
        txtGrossSemiMonthlyRate = new javax.swing.JTextField();
        txtHourlyRate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblEmployeeNo.setText("Employee No.:");

        lblLastName.setText("Last Name:");

        lblFirstName.setText("First Name:");

        lblSSSNo.setText("SSS No.:");

        lblPhealthNo.setText("PhilHealth No.:");

        lblTinNo.setText("TIN No.:");

        lblPagibigNo.setText("Pagibig No.:");

        btnSaveEmployee.setText("Save Employee Record");
        btnSaveEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveEmployee(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrameClose(evt);
            }
        });

        lblBirthday.setText("Birthday:");

        lblAddress.setText("Address:");

        lblStatus.setText("Status:");

        lblPosition.setText("Position:");

        lblImmediateSup.setText("Immediate Supervisor:");

        lblBasicSalary.setText("Basic Salary:");

        lblRiceSubsidy.setText("Rice Subsidy:");

        lblPhoneAllowance.setText("Phone Allowance:");

        lblClothingAllowance.setText("Clothing Allowance:");

        lblgrossSemiMonthlyRate.setText("Gross Semi Monthly Rate:");

        lblHourlyRate.setText("Hourly Rate:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaveEmployee)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmployeeNo)
                                    .addComponent(lblLastName)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblBirthday)
                                    .addComponent(lblAddress))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmployeeNo)
                                    .addComponent(txtLastName)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtBirthday)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSSSNo)
                                    .addComponent(lblPhealthNo)
                                    .addComponent(lblTinNo)
                                    .addComponent(lblPagibigNo))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTinNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(txtPhealthNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPagibigNo)
                                    .addComponent(txtSSSNo, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStatus)
                                    .addComponent(lblPosition)
                                    .addComponent(lblImmediateSup)
                                    .addComponent(lblBasicSalary)
                                    .addComponent(lblRiceSubsidy)
                                    .addComponent(lblPhoneAllowance)
                                    .addComponent(lblClothingAllowance))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPosition)
                                    .addComponent(txtStatus)
                                    .addComponent(txtImmediateSup)
                                    .addComponent(txtBasicSalary)
                                    .addComponent(txtRiceSubsidy)
                                    .addComponent(txtPhoneAllowance)
                                    .addComponent(txtClothingAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblgrossSemiMonthlyRate)
                                    .addComponent(lblHourlyRate))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGrossSemiMonthlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeNo)
                            .addComponent(txtEmployeeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBirthday))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSSSNo)
                            .addComponent(txtSSSNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhealthNo)
                            .addComponent(txtPhealthNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTinNo)
                            .addComponent(txtTinNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPagibigNo)
                            .addComponent(txtPagibigNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblStatus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPosition)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImmediateSup)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblBasicSalary))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtImmediateSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRiceSubsidy)
                                        .addGap(34, 34, 34))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(txtRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPhoneAllowance)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtClothingAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblClothingAllowance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblgrossSemiMonthlyRate)
                                    .addComponent(txtGrossSemiMonthlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHourlyRate)
                                    .addComponent(txtHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveEmployee)
                    .addComponent(btnClose))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //event handler method for close button
    private void FrameClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameClose
        this.dispose();
    }//GEN-LAST:event_FrameClose

    //event handler method for save employee record button
    private void SaveEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveEmployee
        Employee _employee = new Employee();
        _employee.SetEmployeeNo(txtEmployeeNo.getText());
        _employee.SetLastName(txtLastName.getText());
        _employee.SetFirstName(txtFirstName.getText());
        _employee.SetBirthday(txtBirthday.getText());
        _employee.SetAddress(txtAddress.getText());
        _employee.SetSSSNo(txtSSSNo.getText());
        _employee.SetPhealthNo(txtPhealthNo.getText());
        _employee.SetTinNo(txtTinNo.getText());
        _employee.SetPagibigNo(txtPagibigNo.getText());
        _employee.SetStatus(txtStatus.getText());
        _employee.SetPosition(txtPosition.getText());
        _employee.SetImmediateSup(txtImmediateSup.getText());
        _employee.SetBasicSalary(txtBasicSalary.getText());
        _employee.SetRiceSubsidy(txtRiceSubsidy.getText());
        _employee.SetPhoneAllowance(txtPhoneAllowance.getText());
        _employee.SetClothingAllowance(txtClothingAllowance.getText());
        _employee.SetGrossSemiMonthlyRate(txtGrossSemiMonthlyRate.getText());
        _employee.SetHourlyRate(txtHourlyRate.getText());
        
        //to check whether the file 'Employees.csv' exists
        String _csvFilename = "Employees.csv";
        File _csvFile = new File (_csvFilename);
        if(!_csvFile.exists()) {
            var dialogResult = JOptionPane.showConfirmDialog(null, "File does not exist! Would you like to create it first?", "WARNING", JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                try {
                    _employee.CreateEmployeeFile(_csvFilename);
                } catch (IOException ex) {
                    Logger.getLogger(FrmNewEmployee.class.getName()).log(Level.SEVERE, "An unexpected error has occured.", ex);
                }
                JOptionPane.showConfirmDialog(null, "File is created!", "SUCCESS", JOptionPane.OK_OPTION);
            }
        }
        
        //Adding Employee Record
        try {
            _employee.AddEmployee(_csvFilename);
            JOptionPane.showConfirmDialog(null, "Employee Record is saved!", "SAVED", JOptionPane.OK_OPTION);
            txtEmployeeNo.setText("");
            txtLastName.setText("");
            txtFirstName.setText("");
            txtBirthday.setText("");
            txtAddress.setText("");
            txtSSSNo.setText("");
            txtPhealthNo.setText("");
            txtTinNo.setText("");
            txtPagibigNo.setText("");
            txtStatus.setText("");
            txtPosition.setText("");
            txtImmediateSup.setText("");
            txtBasicSalary.setText("");
            txtRiceSubsidy.setText("");
            txtPhoneAllowance.setText("");
            txtClothingAllowance.setText("");
            txtGrossSemiMonthlyRate.setText("");
            txtHourlyRate.setText("");
            
        } catch (IOException ex) {
            Logger.getLogger(FrmNewEmployee.class.getName()).log(Level.SEVERE, "An unexpected error has occured.", ex);
        }
    }//GEN-LAST:event_SaveEmployee

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
            java.util.logging.Logger.getLogger(FrmNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSaveEmployee;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBasicSalary;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblClothingAllowance;
    private javax.swing.JLabel lblEmployeeNo;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHourlyRate;
    private javax.swing.JLabel lblImmediateSup;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPagibigNo;
    private javax.swing.JLabel lblPhealthNo;
    private javax.swing.JLabel lblPhoneAllowance;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblRiceSubsidy;
    private javax.swing.JLabel lblSSSNo;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTinNo;
    private javax.swing.JLabel lblgrossSemiMonthlyRate;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBasicSalary;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtClothingAllowance;
    private javax.swing.JTextField txtEmployeeNo;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGrossSemiMonthlyRate;
    private javax.swing.JTextField txtHourlyRate;
    private javax.swing.JTextField txtImmediateSup;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPagibigNo;
    private javax.swing.JTextField txtPhealthNo;
    private javax.swing.JTextField txtPhoneAllowance;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtRiceSubsidy;
    private javax.swing.JTextField txtSSSNo;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTinNo;
    // End of variables declaration//GEN-END:variables
}
