/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Orders.Orders;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pratik Poojari
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Orders o;

    public RequestLabTestJPanel(JPanel userProcessContainer, Orders o) {
        initComponents();

        this.userProcessContainer = userProcessContainer;

        this.o = o;
        lblEnterprise.setText("OrderID: " + o);
        txtMessage.setText(o.getMessage());

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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(730, 460, 120, 40);

        lblMessage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMessage.setText("Message: ");
        add(lblMessage);
        lblMessage.setBounds(470, 230, 90, 50);

        txtMessage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtMessage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtMessage);
        txtMessage.setBounds(600, 240, 370, 150);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back Button.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(830, 60, 120, 40);

        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblEnterprise.setText("<>");
        add(lblEnterprise);
        lblEnterprise.setBounds(60, 40, 540, 60);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Medications02_Yellow@2x.png"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1120, 840);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if (txtMessage.getText() != "") {
            o.setMessage(txtMessage.getText());
            JOptionPane.showMessageDialog(null, "Message updated successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Message cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerSummaryJPanell dwjp = (CustomerSummaryJPanell) component;
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
