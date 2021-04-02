/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.pojo.Item;
import Business.pojo.Order;
import Business.pojo.Order.Status;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalyanijohare
 */
public class OrderPanel extends javax.swing.JPanel {
    
    private Restaurant restaurant;
    /**
     * Creates new form OrderPanel
     */
    public OrderPanel(Restaurant restaurant) {
        initComponents();
        this.restaurant = restaurant;
        refreshOrders();
        refreshDeliveryMen();
    }
    
    private void refreshOrders(){
        List<Order> orders = restaurant.getOrders();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jComboBox1.removeAllItems();
        model.setRowCount(0);
        for(Order o :orders){
            model.addRow(new Object[]{o.getId(), o.getCustomer().getLastName(),o.getStatus()});
            if(o.getStatus()==Status.Pending)jComboBox1.addItem(o);
        }
    }
    
    private void refreshDeliveryMen(){
        List<DeliveryMan> deliveryMen = EcoSystem.getInstance().getDeliveryManDirectory().getDeliveryManList();
        DeliveryMenList.removeAllItems();
        for(DeliveryMan d : deliveryMen){
            if(d.getRestaurant().equals(restaurant) && d.isAvailable())DeliveryMenList.addItem(d);
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AssignButton = new javax.swing.JButton();
        DeliveryMenList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FullDetailsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("Available Delivery Men");

        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(407, 303));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 33, 364, 120));

        AssignButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        AssignButton.setText("Assign");
        AssignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignButtonActionPerformed(evt);
            }
        });
        add(AssignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));
        add(DeliveryMenList, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 130, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setText("Order ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("Assign Delivery Man to Order or Reject");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        FullDetailsButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        FullDetailsButton.setText("Full Order Details");
        FullDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullDetailsButtonActionPerformed(evt);
            }
        });
        add(FullDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 159, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("All Orders");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 12, -1, -1));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 60, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 400, 10));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton1.setText("Reject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 80, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel5.setText("Available Delivery Men");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void FullDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullDetailsButtonActionPerformed
        Order temp=null;
        for(Order o : restaurant.getOrders()){
            int column = 0;
            int row = jTable1.getSelectedRow();
            int selectedId = (Integer)jTable1.getModel().getValueAt(row, column);
            if(o.getId()==selectedId){
                temp = o;
                break;
            }
        }
        if (temp==null)return;
        OrderDetailsPopup popup = new OrderDetailsPopup(temp);
        popup.setBounds(500, 500, 347, 440);
        JOptionPane jop = new JOptionPane();
        JDialog dialog = jop.createDialog("Order Details");
        dialog.setSize(347, 440);
        dialog.setContentPane(popup);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_FullDetailsButtonActionPerformed

    private void AssignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignButtonActionPerformed
        Order temp = (Order)jComboBox1.getSelectedItem();
        if (temp==null)return;
        DeliveryMan deliveryMan = (DeliveryMan) DeliveryMenList.getSelectedItem();
        if (deliveryMan==null) return;
        temp.setDeliveryMan(deliveryMan);
        temp.setStatus(Order.Status.Assigned);
        refreshOrders();
        refreshDeliveryMen();
    }//GEN-LAST:event_AssignButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Order temp = (Order)jComboBox1.getSelectedItem();
        temp.setStatus(Status.Rejected);
        refreshOrders();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignButton;
    private javax.swing.JComboBox<DeliveryMan> DeliveryMenList;
    private javax.swing.JButton FullDetailsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Order> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
