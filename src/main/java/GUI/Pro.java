/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.mycompany.pharmacy.Container;
import com.mycompany.pharmacy.Inventory;
import com.mycompany.pharmacy.Product;
import static com.mycompany.pharmacy.fileManagement.*;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author skmr
 */

public class Pro extends javax.swing.JFrame {

    /**
     * Creates new form Pro
     */
    public Pro() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        serialNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        displayBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        deleteBtn1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 224, 212));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 48, 31));
        jLabel1.setText("product MANGEMENT");

        addBtn.setBackground(new java.awt.Color(71, 48, 31));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(245, 244, 239));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(71, 48, 31));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(245, 244, 239));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 48, 31));
        jLabel3.setText("product name:");

        productName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 48, 31));
        jLabel4.setText("serial number:");

        serialNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 48, 31));
        jLabel5.setText("price:");

        price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        displayBtn.setBackground(new java.awt.Color(71, 48, 31));
        displayBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        displayBtn.setForeground(new java.awt.Color(245, 244, 239));
        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 48, 31));
        jLabel6.setText("quantity:");

        quantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        deleteBtn1.setBackground(new java.awt.Color(71, 48, 31));
        deleteBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteBtn1.setForeground(new java.awt.Color(245, 244, 239));
        deleteBtn1.setText("Search");
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(71, 48, 31));
        back.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(245, 244, 239));
        back.setText("Back");
        back.setBorderPainted(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Serial No", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(productTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(serialNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantity))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(189, 189, 189))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String sno = serialNo.getText();
        if(!sno.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Enter a Valid Serial Number, Please.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else if(Container.productBySerial.containsKey(Integer.parseInt(sno))){
            Product deletePro = Container.productBySerial.get(Integer.parseInt(sno));
            Container.productBySerial.remove(Integer.parseInt(sno));
            deleteProdcutFromFile(deletePro);
            JOptionPane.showMessageDialog(this, "Product deleted successfully!", "Successful operation", JOptionPane.INFORMATION_MESSAGE);
            productName.setText("");
            serialNo.setText("");
            price.setText("");
            quantity.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this, "Product not found ", "Successful operation", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed

    DefaultTableModel inventoryModel = new DefaultTableModel(new String[]{"Product Name", "Serial Number", "Price", "Quantity"}, 0);
    Iterator<Integer> keySetIterator = Container.productBySerial.keySet().iterator();
    while (keySetIterator.hasNext()) {
        Integer key = keySetIterator.next();
        Product product = Container.productBySerial.get(key);
        inventoryModel.addRow(new Object[]{product.getProductName(), key, product.getPrice(), product.getQuantity()});
    }
    productTable.setModel(inventoryModel);

//        textArea.setText("");
//        Iterator<Integer> keySetIterator = Container.productBySerial.keySet().iterator();
//        while(keySetIterator.hasNext()) {
//            Integer key = keySetIterator.next();
//            textArea.append("Product Name: " + Container.productBySerial.get(key).getProductName());
//            textArea.append(", Serial number: " + key);
//            textArea.append(", Price: " + Container.productBySerial.get(key).getPrice());
//            textArea.append(", quantity: " + Container.productBySerial.get(key).getQuantity() + "\n");
//        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        String pname = productName.getText();
        String sno = serialNo.getText();
        String pr = price.getText();
        String q = quantity.getText();
        if(!pname.matches("[a-zA-Z\\s]+")){
            JOptionPane.showMessageDialog(this, "Enter a valid Product Name, Please.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else if(!sno.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Enter a Valid Serial Number, Please.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else if(pr.matches("([a-zA-Z]+)([@#$%^&-+=()]+)")){
            JOptionPane.showMessageDialog(this, "Enter a Valid Price, Please.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else if(!q.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Enter a Valid Quantity, Please.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else{
         Product tstProduct = Container.productBySerial.get(Integer.parseInt(sno));
        if (tstProduct != null){ 
            tstProduct.addQuantity(Integer.parseInt(q));
            JOptionPane.showMessageDialog(this, "The product has been modified.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Product newProduct = new Product(Integer.parseInt(sno), pname, Float.parseFloat(pr), Integer.parseInt(q));
            Container.productBySerial.put(Integer.parseInt(sno), newProduct);
            saveProductToFile(newProduct);
            JOptionPane.showMessageDialog(this, "New product added", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }   
        productName.setText("");
        serialNo.setText("");
        price.setText("");
        quantity.setText("");
        }        
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
//        textArea.setText("");
        String sno = serialNo.getText();
        DefaultTableModel productModel = new DefaultTableModel(new String[]{"Name", "SerialNo", "Price"}, 0);
        if(!sno.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Enter a Valid Serial Number, Please.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(Container.productBySerial.containsKey(Integer.parseInt(sno))){
                Product product = Container.productBySerial.get(Integer.parseInt(sno));
                productModel.addRow(new Object[]{product.getProductName(), product.getSerialNumber(), product.getPrice()});
            }
            productTable.setModel(productModel);
            if(productModel.getRowCount() == 0)
                JOptionPane.showMessageDialog(this, "Product not found", "WARNING", JOptionPane.WARNING_MESSAGE);
            
//            Product product = Container.productBySerial.get(Integer.parseInt(sno));
//        if (product != null) {
//            textArea.append("Product: " + product.getProductName() + ", Quantity: " + product.getQuantity() + "\n");
//            productName.setText("");
//            serialNo.setText("");
//            price.setText("");
//            quantity.setText("");
//        } else {
//            textArea.append("Product not found in inventory.");
//        }
        }
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        begin begin = new begin();
        begin.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    public static void start(){
        read_ProductFromTheFile();
    }
    
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
            java.util.logging.Logger.getLogger(Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pro().setVisible(true);
                start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton back;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField productName;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField serialNo;
    // End of variables declaration//GEN-END:variables
}
