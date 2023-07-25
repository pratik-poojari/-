/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PharmacyAdminRole;

import Business.SupplierOrders.SupplierOrders;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pratik Poojari
 */
public class PharmacyRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierOrders so;

    public PharmacyRequestJPanel(JPanel userProcessContainer, SupplierOrders so) {
        initComponents();
        this.userProcessContainer = userProcessContainer;

        this.so = so;
        lblEnterprise.setText("OrderID: " + so);
        txtMessage.setText(so.getMessage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblEnterprise = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setLayout(null);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(310, 420, 160, 50);

        lblMessage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMessage.setText("Message: ");
        add(lblMessage);
        lblMessage.setBounds(110, 150, 80, 40);

        txtMessage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMessage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtMessage);
        txtMessage.setBounds(240, 150, 410, 190);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back Button.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(810, 50, 150, 60);

        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblEnterprise.setText("<>");
        add(lblEnterprise);
        lblEnterprise.setBounds(60, 50, 480, 50);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Medomand-online-Pharmacy-supply-1024x759.png"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1030, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (txtMessage.getText() != "") {
            so.setMessage(txtMessage.getText());
            JOptionPane.showMessageDialog(null, "Message updated successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Message cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacySummaryJPanel dwjp = (PharmacySummaryJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}