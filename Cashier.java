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
public class Cashier extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Cashier() {
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
        username_textfield = new javax.swing.JTextField();
        cashier_status_combobox = new javax.swing.JComboBox<>();
        update_cashier_btn = new javax.swing.JButton();
        delete_cashier_btn = new javax.swing.JButton();
        add_cashier_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        password_textfield = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cashier_jtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        category_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        category_label.setForeground(new java.awt.Color(204, 204, 204));
        category_label.setText("Category");
        category_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                category_labelMouseClicked(evt);
            }
        });

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
                    .addComponent(brand_label)
                    .addComponent(product_label)
                    .addComponent(pos_label)
                    .addComponent(category_label))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashier_label)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(exit_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(36, 36, 36)
                .addComponent(cashier_label)
                .addGap(46, 46, 46)
                .addComponent(exit_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("SuperMarket Cashier's Hub");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Cashier");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cashier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Status");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Username");

        username_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        username_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_textfieldActionPerformed(evt);
            }
        });

        cashier_status_combobox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cashier_status_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        update_cashier_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update_cashier_btn.setText("Update");
        update_cashier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_cashier_btnActionPerformed(evt);
            }
        });

        delete_cashier_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete_cashier_btn.setText("Delete");
        delete_cashier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_cashier_btnActionPerformed(evt);
            }
        });

        add_cashier_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add_cashier_btn.setText("ADD");
        add_cashier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cashier_btnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Password");

        password_textfield.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        password_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_textfieldActionPerformed(evt);
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
                            .addComponent(username_textfield)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cashier_status_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(add_cashier_btn)
                        .addGap(18, 18, 18)
                        .addComponent(update_cashier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(delete_cashier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(password_textfield)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(username_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cashier_status_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_cashier_btn)
                    .addComponent(add_cashier_btn)
                    .addComponent(update_cashier_btn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cashier_jtable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cashier_jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cashier_jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashier_jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cashier_jtable);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                pst = conn.prepareStatement("select * from cashier");
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                c = rsmd.getColumnCount();
                
                DefaultTableModel dtm = (DefaultTableModel)cashier_jtable.getModel();
                dtm.setRowCount(0);
                
                while (rs.next()) {                    
                Vector v2 = new Vector();
                for(int i =1; i<c; i++)
                {
                v2.add(rs.getString("cashier_id"));
                 v2.add(rs.getString("username"));
                  v2.add(rs.getString("status"));
                }
                dtm.addRow(v2);
                
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            
            
            
     
            
        } catch (SQLException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private void username_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_textfieldActionPerformed

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
       System.exit(1);
    }//GEN-LAST:event_exit_labelMouseClicked

    
    
    
    private void add_cashier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cashier_btnActionPerformed
     String uname = username_textfield.getText();
     String passwd = password_textfield.getText();
     String status = cashier_status_combobox.getSelectedItem().toString();
     
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
   pst = conn.prepareStatement("insert into cashier (username,password,status) values(?,?,?) ");
   pst.setString(1, uname);
  
   pst.setString(2, passwd);
    pst.setString(3, status);
   pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cashier Added  Sucessfully!!!!");
            table_update();
            username_textfield.setText("");
            password_textfield.setText("");
            cashier_status_combobox.setSelectedIndex(-1);
    username_textfield.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_add_cashier_btnActionPerformed

    private void update_cashier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_cashier_btnActionPerformed
     DefaultTableModel dtm2 = (DefaultTableModel)cashier_jtable.getModel();
      int selectIndex = cashier_jtable.getSelectedRow();  
      int id = Integer.parseInt(dtm2.getValueAt(selectIndex, 0).toString());
      String brandname = username_textfield.getText();
     String status = cashier_status_combobox.getSelectedItem().toString();
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
   pst = conn.prepareStatement("update cashier set username = ?, status = ? where cashier_id =?");
   pst.setString(1, brandname);
   pst.setString(2, status);
     pst.setInt(3, id);
   pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            JOptionPane.showMessageDialog(null, "Cashier Updated Sucessfully!!!!");
            table_update();
            username_textfield.setText("");
            cashier_status_combobox.setSelectedIndex(-1);
    username_textfield.requestFocus();
    
     
        
        
        
    }//GEN-LAST:event_update_cashier_btnActionPerformed

    private void cashier_jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashier_jtableMouseClicked
      DefaultTableModel dtm2 = (DefaultTableModel)cashier_jtable.getModel();
      int selectIndex = cashier_jtable.getSelectedRow();
      username_textfield.setText(dtm2.getValueAt(selectIndex, 1).toString());
      
      
      cashier_status_combobox.setSelectedItem(dtm2.getValueAt(selectIndex, 2).toString());  
    }//GEN-LAST:event_cashier_jtableMouseClicked

    private void delete_cashier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_cashier_btnActionPerformed
    
        DefaultTableModel dtm2 = (DefaultTableModel)cashier_jtable.getModel();
      int selectIndex = cashier_jtable.getSelectedRow();  
      
            int id = Integer.parseInt(dtm2.getValueAt(selectIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are You sure You Want To Delete This cashier", "Warning",JOptionPane.YES_NO_OPTION);
     
            if(dialogResult == JOptionPane.YES_NO_OPTION){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
            pst = conn.prepareStatement("delete from cashier where cashier_id =?");
            pst.setInt(1, id);
            pst.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Cashier Deleted!!!!");
            table_update();
            username_textfield.setText("");
            cashier_status_combobox.setSelectedIndex(-1);
    username_textfield.requestFocus();
    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      }
      

        
    }//GEN-LAST:event_delete_cashier_btnActionPerformed

    private void category_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category_labelMouseClicked
   Category c = new Category();
       this.hide();
       c.setVisible(true);
      
    }//GEN-LAST:event_category_labelMouseClicked

    private void brand_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brand_labelMouseClicked
//      Brand b = new Brand();
//       this.hide();
//       b.setVisible(true);
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

    private void password_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_textfieldActionPerformed

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
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_cashier_btn;
    private javax.swing.JLabel brand_label;
    private javax.swing.JTable cashier_jtable;
    private javax.swing.JLabel cashier_label;
    private javax.swing.JComboBox<String> cashier_status_combobox;
    private javax.swing.JLabel category_label;
    private javax.swing.JButton delete_cashier_btn;
    private javax.swing.JLabel exit_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password_textfield;
    private javax.swing.JLabel pos_label;
    private javax.swing.JLabel product_label;
    private javax.swing.JButton update_cashier_btn;
    private javax.swing.JTextField username_textfield;
    // End of variables declaration//GEN-END:variables
}
