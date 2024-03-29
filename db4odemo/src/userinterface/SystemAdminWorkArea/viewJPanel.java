/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.User;
import Business.UserAccount.User.Role;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kalyanijohare
 */
public class viewJPanel extends javax.swing.JPanel {

    Role role;

    public viewJPanel(Role role) {
        initComponents();
        setPreferredSize( new Dimension(100, 100) );
        this.role = role;
        populateList();
    }
    
    void populateList(){
        if(role==null){
            List<Restaurant> list = EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList();
            for(Restaurant r : list){
                resultText.append("ID: "+r.getId()+" Name: "+r.getName()+"\n");
            }
        }
        else if(role==Role.Customer){
            ArrayList<UserAccount> list = EcoSystem.getInstance().getUserAccountDirectory().getUserAccountList();
            for(UserAccount u : list){
                if(u.getRole()==role.Customer)
                    resultText.append("ID: "+u.getAccountId()+"Username: "+u.getUsername()+" Password: "+u.getPassword()+"\n");
            }
        }
        else if(role==Role.Manager){
            ArrayList<UserAccount> list = EcoSystem.getInstance().getUserAccountDirectory().getUserAccountList();
            for(UserAccount u : list){
                if(u.getRole()==role.Manager)
                    resultText.append("ID: "+u.getAccountId()+"Username: "+u.getUsername()+" Password: "+u.getPassword()+"\n");
            }
        }
        else if(role==Role.DeliveryMan){
            ArrayList<UserAccount> list = EcoSystem.getInstance().getUserAccountDirectory().getUserAccountList();
            for(UserAccount u : list){
                if(u.getRole()==role.DeliveryMan)
                    resultText.append("ID: "+u.getAccountId()+"Username: "+u.getUsername()+" Password: "+u.getPassword()+"\n");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resultText = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 153, 153));

        resultText.setEditable(false);
        resultText.setColumns(20);
        resultText.setRows(5);
        jScrollPane1.setViewportView(resultText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultText;
    // End of variables declaration//GEN-END:variables
}
