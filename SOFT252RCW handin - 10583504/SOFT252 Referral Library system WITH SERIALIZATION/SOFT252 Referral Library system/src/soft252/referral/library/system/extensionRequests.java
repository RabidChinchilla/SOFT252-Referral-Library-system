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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static soft252.referral.library.system.accountCreator.dueDateExtenstions;
import static soft252.referral.library.system.accountCreator.resourceList;
import static soft252.referral.library.system.accountCreator.userList;

/**
 *
 * @author Gearing
 */
public class extensionRequests extends javax.swing.JFrame {

    /**
     * Creates new form extensionRequests
     */
    public extensionRequests() throws ClassNotFoundException {
        initComponents();
        showExtensionRequests();
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
        extensionTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        extensionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Resource", "Days until return"
            }
        ));
        jScrollPane1.setViewportView(extensionTable);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Approve Extension");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Deny Extension");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = extensionTable.getSelectedRow();
        String selectedResource = extensionTable.getValueAt(row, 1).toString();
        String currentUser = extensionTable.getValueAt(row, 0).toString();
        System.out.println(selectedResource);
        
        String removeFromExtensionRequest;
        
        for (resources resource : resourceList){
            if (resource.title.equals(selectedResource)){
                System.out.println("Resource Match");
                for (Client user : userList){
                    if (user.ID.equals(currentUser)){
                        System.out.println("Client Match");
                        resource.daysBorrowed = resource.daysBorrowed + 14;
                        removeFromExtensionRequest = (user.ID + ":" + resource.title);
                        accountCreator.dueDateExtenstions.remove(removeFromExtensionRequest);
                    }
                }
            }
        }
        DefaultTableModel tableModel = (DefaultTableModel) extensionTable.getModel();
        tableModel.setRowCount(0);
        try {
            showExtensionRequests();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(extensionRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Extension request denied");
        int row = extensionTable.getSelectedRow();
        String selectedResource = extensionTable.getValueAt(row, 1).toString();
        String currentUser = extensionTable.getValueAt(row, 0).toString();
        String removeFromExtensionRequest;
        for (Client user : userList){
            if (user.ID.equals(currentUser)){
                for (resources resource : resourceList){
                    if (resource.title.equals(selectedResource)){
                        user.Reminders.add("Your extension request for " + selectedResource + " was denied");
                        removeFromExtensionRequest = (user.ID + ":" + resource.title);
                        accountCreator.dueDateExtenstions.remove(removeFromExtensionRequest);
                    }
                }
            }
        }
        try {
         FileOutputStream fileOut = new FileOutputStream("dueDateExtensions.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(accountCreator.dueDateExtenstions);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\dueDateExtensions.ser");
        } 
        catch (IOException i) {
         i.printStackTrace();
        }
        try {
         FileOutputStream fileOut = new FileOutputStream("users.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(accountCreator.userList);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\users.ser");
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
         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\resources.ser");
        } 
        catch (IOException i) {
         i.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(extensionRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(extensionRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(extensionRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(extensionRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new extensionRequests().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(extensionRequests.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void showExtensionRequests() throws ClassNotFoundException{
        
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
        try {
            FileInputStream fileIn = new FileInputStream("dueDateExtensions.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accountCreator.dueDateExtenstions = (List<String>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("loaded dueDateExtensions");
        } 
        catch (IOException i) {
            i.printStackTrace();
            return;
        }
        
        String userID;
        String resourceTitle;
        int listSize = dueDateExtenstions.size();
        
        DefaultTableModel tableModel = (DefaultTableModel) extensionTable.getModel();
        
        Object rowData[] = new Object[3];
        
        //System.out.println("showExtensionRequests called successfully");
        //System.out.println(dueDateExtenstions.size());
        
        if (listSize == 0){
            JOptionPane.showMessageDialog(rootPane, "There are no extension requests currently");
        }
        else{
            for (int i = 0; i < dueDateExtenstions.size(); i++){
            userID = dueDateExtenstions.get(i).substring(0, dueDateExtenstions.get(i).indexOf(':'));
            resourceTitle = dueDateExtenstions.get(i).substring(dueDateExtenstions.get(i).indexOf(':') + 1);
            //System.out.println(userID + " " + resourceTitle + " are now 2 strings");
                for (Client user : userList){
                    if (userID.equals(user.ID)){
                        for (resources resource : resourceList){
                            if (resourceTitle.equals(resource.title)){
                            rowData[0] = user.ID;
                            rowData[1] = resource.title;
                            rowData[2] = resource.daysBorrowed;
                            tableModel.addRow(rowData);
                            }
                        }
                    }
                }
            }   
        }    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable extensionTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}