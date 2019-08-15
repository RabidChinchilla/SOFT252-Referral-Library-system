/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.referral.library.system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.in;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static soft252.referral.library.system.accountCreator.resourceList;
import static soft252.referral.library.system.accountCreator.userList;

/**
 *
 * @author Gearing
 */
public class borrowResource extends javax.swing.JFrame {

    String currentUser;
    /**
     * Creates new form borrowResource
     */
    public borrowResource() throws ClassNotFoundException {
        initComponents();
        showResources();
        
//        String[] resources = {};
//        Integer i = 0;
//        for (resources resource : resourceList){
//            resources[i] = resource.catagorey + " " + resource.title + " " + resource.resourceType;
//            i = i + 1;
//        }
//        
//        resourceComboBox = new JComboBox(resources);
    }
    
    public borrowResource(String User) throws ClassNotFoundException {
        initComponents();
        showResources();
        currentUser = User;
    }
    
    resources selectedBook;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        availableResources = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        availableResources.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Title", "Resource Type", "Rating"
            }
        ));
        jScrollPane1.setViewportView(availableResources);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Borrow Resource");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Selected the Resource you would like to borrow");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            getSelected();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(borrowResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            showResources();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(borrowResource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
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
            java.util.logging.Logger.getLogger(borrowResource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borrowResource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borrowResource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borrowResource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new borrowResource().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(borrowResource.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void showResources() throws ClassNotFoundException{
        
        try {
            FileInputStream fileIn = new FileInputStream("resources.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accountCreator.resourceList = (List<resources>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("loaded resources");
        } 
        catch (IOException i) {
            i.printStackTrace();
            return;
        }
        try {
            FileInputStream fileIn = new FileInputStream("users.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accountCreator.userList = (List<Client>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("loaded resources");
        } 
        catch (IOException i) {
            i.printStackTrace();
            return;
        }
        
        DefaultTableModel tableModel = (DefaultTableModel) availableResources.getModel();
        tableModel.setRowCount(0);
        Object rowData[] = new Object[4];
        
        for (resources resource : resourceList){
            if (resource.borrowed == false){
                rowData[0] = resource.catagorey;
                rowData[1] = resource.title;
                rowData[2] = resource.resourceType;
                rowData[3] = resource.rating;
                tableModel.addRow(rowData);
            }
        }
    }
    
    protected void getSelected() throws ClassNotFoundException{
        int column = 1;
        int row = availableResources.getSelectedRow();
        String selectedResource = availableResources.getValueAt(row, column).toString();
        //System.out.println(selectedResource);
        boolean canBorrow = true;
        
        for (Client user : userList){
            if (user.ID.equals(currentUser)){
                for (Object resourceBorrowed : user.resourcesBorrowed){
                    for (resources resource : resourceList){
                        if (resourceBorrowed.equals(resource.title) && resource.daysBorrowed < -20){
                            canBorrow = false;
                        }
                    }
                }
            }
        }
        
        for (resources resource : resourceList){
            if (resource.title.equals(selectedResource)){
                //System.out.println("Resource Match");
                //System.out.println(currentUser);d
                for (Client user : userList){
                    if (user.ID.equals(currentUser) && canBorrow == true){
                        //System.out.println("Client Match");
                        if ("Short Term".equals(resource.borrowedType)){
                            resource.borrowed = true;
                            resource.daysBorrowed = 14;
                            user.resourcesBorrowed.add(resource.title);
                            System.out.println(user.resourcesBorrowed);
                        }
                        else if ("Long Term".equals(resource.borrowedType)){
                            resource.borrowed = true;
                            resource.daysBorrowed = 180;
                            user.resourcesBorrowed.add(resource.title);
                            System.out.println(user.resourcesBorrowed);
                        }
                        else if ("Reference".equals(resource.borrowedType)){
                            JOptionPane.showMessageDialog(rootPane, "That resource is a reference, it cannot be booked out");
                            System.out.println(user.resourcesBorrowed);
                        }
                        //user.resourcesBorrowed.add(resource.title);
                        //System.out.println(user.resourcesBorrowed);
                    }
                    else if (canBorrow == false){
                        JOptionPane.showMessageDialog(rootPane, "You have a resource overdue by 20 days or more, you cannot take out anymore resources");
                    }
                }
            }
        }
        try {
         FileOutputStream fileOut = new FileOutputStream("users.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(accountCreator.userList);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\users.ser");
        } 
        catch (IOException i) {
         i.printStackTrace();
        }
        try {
         FileOutputStream fileOut = new FileOutputStream("resources.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(accountCreator.resourceList);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\resources.ser");
        } 
        catch (IOException i) {
         i.printStackTrace();
        }
        DefaultTableModel tableModel = (DefaultTableModel) availableResources.getModel();
        tableModel.setRowCount(0);
        showResources();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableResources;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}