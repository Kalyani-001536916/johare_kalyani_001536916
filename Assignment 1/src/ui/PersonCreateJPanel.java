/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author kalyanijohare
 */
public class PersonCreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonCreateJPanel
     */
    Person person;
    public PersonCreateJPanel(Person person) {
        initComponents();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPersonTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        btnSavePerson = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        lblPersonTitle.setFont(new java.awt.Font("Bodoni 72 Smallcaps", 1, 24)); // NOI18N
        lblPersonTitle.setText("Person Information");

        lblFirstName.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblFirstName.setText("FirstName:");

        lblLastName.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblLastName.setText("LastName:");

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblPhoneNumber.setText("PhoneNumber:");

        lblDateOfBirth.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblDateOfBirth.setText("Date of Birth:");

        lblAge.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblAge.setText("Age:");

        lblHeight.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblHeight.setText("Height:");

        lblWeight.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblWeight.setText("Weight:");

        lblSSN.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblSSN.setText("SSN:");

        txtFirstName.setBackground(new java.awt.Color(204, 204, 204));
        txtFirstName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtLastName.setBackground(new java.awt.Color(204, 204, 204));
        txtLastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtPhoneNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        txtDateOfBirth.setBackground(new java.awt.Color(204, 204, 204));
        txtDateOfBirth.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtAge.setBackground(new java.awt.Color(204, 204, 204));
        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtHeight.setBackground(new java.awt.Color(204, 204, 204));
        txtHeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        txtWeight.setBackground(new java.awt.Color(204, 204, 204));
        txtWeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtSSN.setBackground(new java.awt.Color(204, 204, 204));
        txtSSN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSavePerson.setBackground(new java.awt.Color(0, 102, 102));
        btnSavePerson.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnSavePerson.setText("Save");
        btnSavePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLastName)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblFirstName)
                            .addComponent(lblDateOfBirth)
                            .addComponent(lblAge)
                            .addComponent(lblHeight)
                            .addComponent(lblWeight)
                            .addComponent(lblSSN))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWeight)
                            .addComponent(txtHeight, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnSavePerson))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblPersonTitle)))
                .addContainerGap(692, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblPersonTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfBirth)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSavePerson)
                .addContainerGap(341, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void btnSavePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePersonActionPerformed
        // TODO add your handling code here:
        person.setFirstName(txtFirstName.getText());
        person.setLastName(txtLastName.getText());
        person.setPhoneNumber(txtPhoneNumber.getText());
        person.setDateOfBirth(txtDateOfBirth.getText());
        person.setAge(txtAge.getText());
        person.setHeight(txtHeight.getText());
        person.setWeight(txtWeight.getText());
        person.setSsn(txtSSN.getText());
        
        JOptionPane.showMessageDialog(this, "Person Information Saved Successfully");
    }//GEN-LAST:event_btnSavePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePerson;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPersonTitle;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
