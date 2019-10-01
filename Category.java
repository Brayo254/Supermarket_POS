/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brian
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        table_update();
        }
    Connection conn;
    PreparedStatement pst;
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        category_label = new javax.swing.JLabel();
        brand_label = new javax.swing.JLabel();
        product_label = new javax.swing.JLabel();
        pos_label = new javax.swing.JLabel();
        cashier_label = new javax.swing.JLabel();
        exit_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        category_textfield = new javax.swing.JTextField();
        status_combobox = new javax.swing.JComboBox<>();
        update_category_btn = new javax.swing.JButton();
        delete_category_btn = new javax.swing.JButton();
        add_category_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        category_jtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        category_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        category_label.setForeground(new java.awt.Color(204, 204, 204));
        category_label.setText("Category");

        brand_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        brand_label.setForeground(new java.awt.Color(204, 204, 204));
        brand_label.setText("Brand");
        brand_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brand_labelMouseClicked(evt);
            }
        });

        product_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        product_label.setForeground(new java.awt.Color(204, 204, 204));
        product_label.setText("Product");
        product_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_labelMouseClicked(evt);
            }
        });

        pos_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pos_label.setForeground(new java.awt.Color(204, 204, 204));
        pos_label.setText("POS");
        pos_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos_labelMouseClicked(evt);
            }
        });

        cashier_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cashier_label.setForeground(new java.awt.Color(204, 204, 204));
        cashier_label.setText("Cashier");
        cashier_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashier_labelMouseClicked(evt);
            }
        });

        exit_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exit_label.setForeground(new java.awt.Color(204, 204, 204));
        exit_label.setText("Exit");
        exit_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_label)
                    .addComponent(brand_label)
                    .addComponent(product_label)
                    .addComponent(pos_label)
                    .addComponent(cashier_label)
                    .addComponent(category_label))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(category_label)
                .addGap(35, 35, 35)
                .addComponent(brand_label)
                .addGap(29, 29, 29)
                .addComponent(product_label)
                .addGap(41, 41, 41)
                .addComponent(pos_label)
                .addGap(34, 34, 34)
                .addComponent(cashier_label)
                .addGap(27, 27, 27)
                .addComponent(exit_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("SuperMarket");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Category");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Status");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Category");

        category_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        category_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_textfieldActionPerformed(evt);
            }
        });

        status_combobox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        status_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        update_category_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update_category_btn.setText("Update");
        update_category_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_category_btnActionPerformed(evt);
            }
        });

        delete_category_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete_category_btn.setText("Delete");
        delete_category_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_category_btnActionPerformed(evt);
            }
        });

        add_category_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add_category_btn.setText("ADD");
        add_category_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_category_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(status_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
                            .addComponent(category_textfield)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(add_category_btn)
                        .addGap(18, 18, 18)
                        .addComponent(update_category_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_category_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(category_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(status_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_category_btn)
                    .addComponent(add_category_btn)
                    .addComponent(update_category_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        category_jtable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        category_jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        category_jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category_jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(category_jtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void table_update(){
        try {
            int c;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
                pst = conn.prepareStatement("select * from category");
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                c = rsmd.getColumnCount();
                
                DefaultTableModel dtm = (DefaultTableModel)category_jtable.getModel();
                dtm.setRowCount(0);
                
                while (rs.next()) {                    
                Vector v2 = new Vector();
                for(int i =1; i<c; i++)
                {
                v2.add(rs.getString("category_id"));
                 v2.add(rs.getString("category_type"));
                  v2.add(rs.getString("status"));
                }
                dtm.addRow(v2);
                
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            
            
            
     
            
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private void category_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_textfieldActionPerformed

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
       System.exit(1);
    }//GEN-LAST:event_exit_labelMouseClicked

    
    
    
    private void add_category_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_category_btnActionPerformed
     String catname = category_textfield.getText();
     String status = status_combobox.getSelectedItem().toString();
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
   pst = conn.prepareStatement("insert into category (category_type, status) values(?,?) ");
   pst.setString(1, catname);
   pst.setString(2, status);
   pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Category Inserted Sucessfully!!!!");
            table_update();
            category_textfield.setText("");
            status_combobox.setSelectedIndex(-1);
    category_textfield.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_add_category_btnActionPerformed

    private void update_category_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_category_btnActionPerformed
     DefaultTableModel dtm2 = (DefaultTableModel)category_jtable.getModel();
      int selectIndex = category_jtable.getSelectedRow();  
      int id = Integer.parseInt(dtm2.getValueAt(selectIndex, 0).toString());
      String catname = category_textfield.getText();
     String status = status_combobox.getSelectedItem().toString();
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
   pst = conn.prepareStatement("update category set category_type = ?, status = ? where category_id =?");
   pst.setString(1, catname);
   pst.setString(2, status);
     pst.setInt(3, id);
     add_category_btn.setEnabled(true);
   pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            JOptionPane.showMessageDialog(null, "Category Updated Sucessfully!!!!");
            table_update();
            category_textfield.setText("");
            status_combobox.setSelectedIndex(-1);
    category_textfield.requestFocus();
    
     
        
        
        
    }//GEN-LAST:event_update_category_btnActionPerformed

    private void category_jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category_jtableMouseClicked
      DefaultTableModel dtm2 = (DefaultTableModel)category_jtable.getModel();
      int selectIndex = category_jtable.getSelectedRow();
      category_textfield.setText(dtm2.getValueAt(selectIndex, 1).toString());
      status_combobox.setSelectedItem(dtm2.getValueAt(selectIndex, 2).toString());  
    }//GEN-LAST:event_category_jtableMouseClicked

    private void delete_category_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_category_btnActionPerformed
    
        DefaultTableModel dtm2 = (DefaultTableModel)category_jtable.getModel();
      int selectIndex = category_jtable.getSelectedRow();  
      
      int id = Integer.parseInt(dtm2.getValueAt(selectIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are You sure You Want To Delete This Record", "Warning",JOptionPane.YES_NO_OPTION);
     
            if(dialogResult == JOptionPane.YES_NO_OPTION){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
            pst = conn.prepareStatement("delete from category where category_id =?");
            pst.setInt(1, id);
            pst.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Category Deleted!!!!");
            table_update();
            category_textfield.setText("");
            status_combobox.setSelectedIndex(-1);
    category_textfield.requestFocus();
    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      }
      

        
    }//GEN-LAST:event_delete_category_btnActionPerformed

    private void brand_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brand_labelMouseClicked
       Brand b = new Brand();
       this.hide();
       b.setVisible(true);
    }//GEN-LAST:event_brand_labelMouseClicked

    private void product_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_labelMouseClicked
        
       
       
       Product p = new Product();
       this.hide();
       p.setVisible(true);
    }//GEN-LAST:event_product_labelMouseClicked

    private void pos_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos_labelMouseClicked
         Login l = new Login();
        this.hide();
        l.setVisible(true);
    }//GEN-LAST:event_pos_labelMouseClicked

    private void cashier_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashier_labelMouseClicked
      Cashier c = new Cashier();
       this.hide();
       c.setVisible(true);
    }//GEN-LAST:event_cashier_labelMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_category_btn;
    private javax.swing.JLabel brand_label;
    private javax.swing.JLabel cashier_label;
    private javax.swing.JTable category_jtable;
    private javax.swing.JLabel category_label;
    private javax.swing.JTextField category_textfield;
    private javax.swing.JButton delete_category_btn;
    private javax.swing.JLabel exit_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pos_label;
    private javax.swing.JLabel product_label;
    private javax.swing.JComboBox<String> status_combobox;
    private javax.swing.JButton update_category_btn;
    // End of variables declaration//GEN-END:variables
}
