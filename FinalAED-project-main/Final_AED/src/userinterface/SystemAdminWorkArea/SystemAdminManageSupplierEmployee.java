/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.SupplierDeliveryManRole;
import Business.Role.SupplierAdminRole;
import Business.Supplier.Supplier;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.SupplierEmp.SupplierEmpDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pratik Poojari
 */
public class SystemAdminManageSupplierEmployee extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Supplier supplier;
    private String user;
    private EcoSystem ecosystem;

    public SystemAdminManageSupplierEmployee(JPanel userProcessContainer, Supplier supplier, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        this.ecosystem = ecosystem;
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
        txtConfirmPassword.setEnabled(false);
        txtName.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
        txtAddress.setEnabled(false);
        btnSubmit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnView.setEnabled(false);
        radioBtnDelivery.setEnabled(false);
        radioBtnManager.setEnabled(false);
        populateSupplierEmpTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageSupplierEmp = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        radioBtnDelivery = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        radioBtnManager = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back Button.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(30, 30, 130, 60);

        btnView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View Button.png"))); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView);
        btnView.setBounds(20, 130, 140, 54);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete Button.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(20, 210, 140, 60);

        btnCreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create Button.png"))); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate);
        btnCreate.setBounds(20, 290, 140, 60);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(490, 600, 220, 50);

        tblManageSupplierEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee NO", "Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManageSupplierEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManageSupplierEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManageSupplierEmp);

        add(jScrollPane1);
        jScrollPane1.setBounds(240, 140, 720, 170);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setText("Manage Employee");
        add(lblTitle);
        lblTitle.setBounds(470, 40, 191, 29);

        txtUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtUsername);
        txtUsername.setBounds(340, 340, 200, 27);

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtPhoneNumber);
        txtPhoneNumber.setBounds(690, 390, 300, 30);

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber);
        lblPhoneNumber.setBounds(550, 390, 130, 30);

        radioBtnDelivery.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioBtnDelivery.setText("Delivery Agent");
        radioBtnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnDeliveryActionPerformed(evt);
            }
        });
        add(radioBtnDelivery);
        radioBtnDelivery.setBounds(520, 500, 140, 30);

        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtPassword);
        txtPassword.setBounds(340, 390, 200, 30);

        txtConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtConfirmPassword);
        txtConfirmPassword.setBounds(340, 440, 200, 28);

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress);
        lblAddress.setBounds(610, 440, 70, 30);

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUsername.setText("Username: ");
        add(lblUsername);
        lblUsername.setBounds(240, 340, 90, 25);

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtAddress);
        txtAddress.setBounds(690, 440, 300, 30);

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPassword.setText("Password: ");
        add(lblPassword);
        lblPassword.setBounds(240, 390, 90, 25);

        lblRole.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole);
        lblRole.setBounds(260, 500, 50, 30);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(620, 340, 60, 30);

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblConfirmPassword.setText("Confirm Password:");
        add(lblConfirmPassword);
        lblConfirmPassword.setBounds(170, 440, 160, 27);

        radioBtnManager.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioBtnManager.setText("Supplier Manager");
        radioBtnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnManagerActionPerformed(evt);
            }
        });
        add(radioBtnManager);
        radioBtnManager.setBounds(340, 500, 170, 30);

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtName);
        txtName.setBounds(690, 340, 300, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/a2.v1.jpg"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(-50, -10, 1190, 850);
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnDeliveryActionPerformed
        // TODO add your handling code here:
        radioBtnManager.setSelected(false);
    }//GEN-LAST:event_radioBtnDeliveryActionPerformed

    private void radioBtnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnManagerActionPerformed
        // TODO add your handling code here:
        radioBtnDelivery.setSelected(false);
    }//GEN-LAST:event_radioBtnManagerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (validateThis()) {

            Employee e = supplier.getEmployeeDirectory().createEmployee(txtName.getText(), txtAddress.getText(), txtPhoneNumber.getText());
            if (e == null) {
                JOptionPane.showMessageDialog(null, "Employee " + txtName.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                if (radioBtnManager.isSelected()) {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), e, new SupplierAdminRole());
                    if (ua != null) {
                        JOptionPane.showMessageDialog(null, "Manager account created successfully for " + e.getName());
                    } else {
                        supplier.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null, "Username " + txtUsername.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } else {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), e, new SupplierDeliveryManRole());
                    if (ua != null) {
                        SupplierDeliveryMan sdm = supplier.getSupplierDeliveryManDirectory().createSupplierDeliveryMan(txtName.getText(), txtAddress.getText(), txtPhoneNumber.getText());
                        JOptionPane.showMessageDialog(null, "Delivery Man account created successfully for " + e.getName());
                    } else {
                        supplier.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null, "Username " + txtUsername.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                }
                btnCreate.setEnabled(true);
                txtUsername.setText("");
                txtUsername.setEnabled(false);
                txtPassword.setText("");
                txtPassword.setEnabled(false);
                txtConfirmPassword.setText("");
                txtConfirmPassword.setEnabled(false);
                txtName.setText("");
                txtName.setEnabled(false);
                txtPhoneNumber.setText("");
                txtPhoneNumber.setEnabled(false);
                txtAddress.setText("");
                txtAddress.setEnabled(false);
                btnSubmit.setEnabled(false);
                radioBtnDelivery.setSelected(false);
                radioBtnDelivery.setEnabled(false);
                radioBtnManager.setSelected(false);
                radioBtnManager.setEnabled(false);
            }
            populateSupplierEmpTable();
        } else {
            return;
        }


    }//GEN-LAST:event_btnSubmitActionPerformed

    private void tblManageSupplierEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManageSupplierEmpMouseClicked
        // TODO add your handling code here:

        int selectedRow = tblManageSupplierEmp.getSelectedRow();
        if (selectedRow >= 0) {
            btnDelete.setEnabled(true);
            btnView.setEnabled(true);
        }
    }//GEN-LAST:event_tblManageSupplierEmpMouseClicked

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageSupplierEmp.getSelectedRow();
        if (selectedRow >= 0) {
            Employee selectedEmployee = (Employee) tblManageSupplierEmp.getValueAt(selectedRow, 1);
            SystemUpdateSupplierEmployee fs = new SystemUpdateSupplierEmployee(userProcessContainer, selectedEmployee, ecosystem);
            userProcessContainer.add("SysUpdateSupplierEmployee", fs);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageSupplierEmp.getSelectedRow();
        if (selectedRow >= 0) {
            Employee selectedEmployee = (Employee) tblManageSupplierEmp.getValueAt(selectedRow, 1);
            supplier.getEmployeeDirectory().deleteEmployee(selectedEmployee);
            JOptionPane.showMessageDialog(null, "Employee " + selectedEmployee.getName() + " deleted successfully!");
            populateSupplierEmpTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        btnCreate.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        txtConfirmPassword.setEnabled(true);
        txtName.setEnabled(true);
        txtPhoneNumber.setEnabled(true);
        txtAddress.setEnabled(true);
        btnSubmit.setEnabled(true);
        radioBtnDelivery.setEnabled(true);
        radioBtnManager.setEnabled(true);
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton radioBtnDelivery;
    private javax.swing.JRadioButton radioBtnManager;
    private javax.swing.JTable tblManageSupplierEmp;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateSupplierEmpTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblManageSupplierEmp.getModel();
        dtm.setRowCount(0);
        if (supplier.getEmployeeDirectory().getEmployeeList() != null) {
            for (Employee e : supplier.getEmployeeDirectory().getEmployeeList()) {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = e.getId();
                row[1] = e;
                UserAccount ua = ecosystem.getUserAccountDirectory().findEmployee(e);
                row[2] = ua.getRole().toString().substring(14).replace("Role", "");
                dtm.addRow(row);
            }
        }
        if (dtm.getRowCount() == 0) {
            btnDelete.setEnabled(false);
            btnView.setEnabled(false);
        }
    }

    private boolean validateThis() {
        SupplierEmpDirectory ua = this.ecosystem.getSupplieryEmpDirectory();
        String regex = "\\d{10}";
        if (("".equals(txtUsername.getText())) || ("".equals(txtPassword.getText())) || ("".equals(txtConfirmPassword.getText()))
                || ("".equals(txtName.getText())) || ("".equals(txtPhoneNumber.getText())) || ("".equals(txtAddress.getText()))
                || ((radioBtnDelivery.isEnabled() == false) && (radioBtnManager.isEnabled() == false))) {
            JOptionPane.showMessageDialog(null, "Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!(txtPassword.getText().equals(txtConfirmPassword.getText()))) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (!(txtPhoneNumber.getText().matches(regex))) {
            JOptionPane.showMessageDialog(null, "Phone number must have only 10 digits!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
}
