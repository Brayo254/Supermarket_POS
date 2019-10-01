/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brian
 */
public class POS extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public POS() {
        initComponents();
//        table_update();
        }
     String lname;
     public POS(String name) {
        initComponents();
       this.lname = name;
       username_label.setText(lname);
        }
     
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel model = new DefaultTableModel();
    
    
    
    
    
    
    
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
        jLabel4 = new javax.swing.JLabel();
        barcode_textfield = new javax.swing.JTextField();
        delete_product_btn = new javax.swing.JButton();
        add_product_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        quantity_textfield = new javax.swing.JTextField();
        product_name_textfield = new javax.swing.JTextField();
        price_textfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pos_jtable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        subtotal_textfield = new javax.swing.JTextField();
        pay_textfield = new javax.swing.JTextField();
        balance_textfield = new javax.swing.JTextField();
        pay_invoice_btn = new javax.swing.JButton();
        username_label = new javax.swing.JLabel();

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
                    .addComponent(exit_label)
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
                .addGap(48, 48, 48)
                .addComponent(cashier_label)
                .addGap(28, 28, 28)
                .addComponent(exit_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("SuperMarket");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Point Of Sale");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Products", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Price");

        barcode_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        barcode_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcode_textfieldActionPerformed(evt);
            }
        });
        barcode_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcode_textfieldKeyPressed(evt);
            }
        });

        delete_product_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete_product_btn.setText("Delete");
        delete_product_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_product_btnActionPerformed(evt);
            }
        });

        add_product_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add_product_btn.setText("ADD");
        add_product_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_btnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Barcode");
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel5KeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Product Name");

        quantity_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        quantity_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_textfieldActionPerformed(evt);
            }
        });

        product_name_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        product_name_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_textfieldActionPerformed(evt);
            }
        });

        price_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        price_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_textfieldActionPerformed(evt);
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
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barcode_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(product_name_textfield)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(add_product_btn)
                        .addGap(47, 47, 47)
                        .addComponent(delete_product_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barcode_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(quantity_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(product_name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(price_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_product_btn)
                    .addComponent(delete_product_btn))
                .addGap(44, 44, 44))
        );

        pos_jtable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pos_jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Product Name", "Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        pos_jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos_jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pos_jtable);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Pay in Ksh");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Balance");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Sub Total");

        subtotal_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        subtotal_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotal_textfieldActionPerformed(evt);
            }
        });

        pay_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pay_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_textfieldActionPerformed(evt);
            }
        });

        balance_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        balance_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance_textfieldActionPerformed(evt);
            }
        });

        pay_invoice_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pay_invoice_btn.setText("Pay Invoice");
        pay_invoice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_invoice_btnActionPerformed(evt);
            }
        });

        username_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        username_label.setForeground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1)
                        .addGap(0, 423, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(36, 36, 36)
                                        .addComponent(subtotal_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(pay_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(balance_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pay_invoice_btn))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 72, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(username_label)
                        .addGap(153, 153, 153))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pay_invoice_btn)
                            .addComponent(balance_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(pay_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(subtotal_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(59, 59, 59))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void pos(){
     String name = barcode_textfield.getText();
           
        try {
             Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
            pst = conn.prepareStatement("select * from product where barcode = ?");
            pst.setString(1, name);
            rs = pst.executeQuery();
            
            
            while(rs.next()){
             int currentquantity;
             currentquantity =rs.getInt("quantity");
             
             int price = Integer.parseInt(price_textfield.getText());
              int newquantity = Integer.parseInt(quantity_textfield.getText());
              
              int total = price * newquantity;
              
              if(newquantity >= currentquantity){
                JOptionPane.showMessageDialog(this, "Available quantity is" +  +currentquantity);
                JOptionPane.showMessageDialog(this, "We do not enough quantity at the moment");
              }else{
               model =(DefaultTableModel)pos_jtable.getModel();
               model.addRow(new Object[]{
               barcode_textfield.getText(),
               product_name_textfield.getText(),
               price_textfield.getText(),
               quantity_textfield.getText(),
               total,
               
               
               });
               
              int sum = 0;
              for(int i=0; i<pos_jtable.getRowCount(); i++){
              sum=  sum+Integer.parseInt(pos_jtable.getValueAt(i, 4).toString());
              
              }
              subtotal_textfield.setText(Integer.toString(sum));
              
              barcode_textfield.setText("");
               product_name_textfield.setText("");
                price_textfield.setText("");
                 quantity_textfield.setText("");
              }
              
             }   
            
            
        } catch (SQLException ex) {
            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   
    
    
    private void barcode_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcode_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcode_textfieldActionPerformed

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
       System.exit(1);
    }//GEN-LAST:event_exit_labelMouseClicked

    
    
    
    private void add_product_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_btnActionPerformed
pos();    
             
        
                       
     
    }//GEN-LAST:event_add_product_btnActionPerformed

    private void delete_product_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_product_btnActionPerformed
    int sum = 0;
        model.removeRow(pos_jtable.getSelectedRow());
    
    for(int i=0; i<pos_jtable.getRowCount(); i++){
              sum=  sum+Integer.parseInt(pos_jtable.getValueAt(i, 4).toString());
              
              }
              subtotal_textfield.setText(Integer.toString(sum));
        
    }//GEN-LAST:event_delete_product_btnActionPerformed

    private void category_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_category_labelMouseClicked
   Category c = new Category();
       this.hide();
       c.setVisible(true);
      
    }//GEN-LAST:event_category_labelMouseClicked

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

    private void quantity_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity_textfieldActionPerformed

    private void product_name_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_name_textfieldActionPerformed

    private void price_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_textfieldActionPerformed

    private void subtotal_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotal_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotal_textfieldActionPerformed

    private void pay_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pay_textfieldActionPerformed

    private void balance_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balance_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balance_textfieldActionPerformed

    private void sales(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        
        String subT = subtotal_textfield.getText();
         String cashier = username_label.getText();
        String payinKsh = pay_textfield.getText();
        String bal = balance_textfield.getText();
        
        int lastinsertID = 0;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
            String query = "insert into sales(date,cashier,subtotal,pay,balance)values(?,?,?,?,?)";
            pst = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, date);
            pst.setString(2, cashier);
            pst.setString(3, subT);
            pst.setString(4, payinKsh);
            pst.setString(5, bal);
        
           
     
     pst.executeUpdate();
     
     ResultSet generatedKey = pst.getGeneratedKeys();
     
            if (generatedKey.next()) {
               lastinsertID = generatedKey.getInt(1);
            }
         int rows = pos_jtable.getRowCount();
            
  String query1 = "insert into sales_product(sales_id,product_id,sell_price,quantity,total)values(?,?,?,?,?)"; 
  pst = conn.prepareStatement(query1); 
         String product_id = "";
         String price = "";
         String quantity = "";
         int total = 0;
         for(int i= 0; i<pos_jtable.getRowCount(); i++){
          product_id = (String)pos_jtable.getValueAt(i, 0);
           price = (String)pos_jtable.getValueAt(i, 2);
             quantity= (String)pos_jtable.getValueAt(i, 3);
             total = (int)pos_jtable.getValueAt(i, 4);
             pst.setInt(1, lastinsertID);
             pst.setString(2, product_id);
             pst.setString(3, price);
             pst.setString(4, quantity);
             pst.setInt(5, total);
             pst.executeUpdate();
            }
      String query3 = "update product set quantity= quantity-? where barcode =?"; 
      pst = conn.prepareStatement(query3);    
      for(int i= 0; i<pos_jtable.getRowCount(); i++){
          product_id = (String)pos_jtable.getValueAt(i, 0);
          
             quantity= (String)pos_jtable.getValueAt(i, 3);
            
             pst.setString(1, quantity);
             pst.setString(2, product_id);
             pst.execute();
            }   
         
         
         pst.addBatch();
         JOptionPane.showMessageDialog(this, "Saved");
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
 public void print() {
 String sub = subtotal_textfield.getText();
 String pay = pay_textfield.getText();
 String bal = balance_textfield.getText();
        try {
            new Print(sub, pay, bal,pos_jtable.getModel()).setVisible(true);
        } catch (PrinterException ex) {
            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 }
    
    
    
    
    private void pay_invoice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_invoice_btnActionPerformed
     
        
     
        
      int payInvoice= Integer.parseInt(pay_textfield.getText());
      int subTotal= Integer.parseInt(subtotal_textfield.getText());
     int bal = payInvoice - subTotal;
      
    
    balance_textfield.setText(String.valueOf(bal));
     print();    
     sales();  
    }//GEN-LAST:event_pay_invoice_btnActionPerformed

    private void pos_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos_labelMouseClicked
       POS p = new POS();
       this.hide();
       p.setVisible(true);
    }//GEN-LAST:event_pos_labelMouseClicked

    private void barcode_textfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcode_textfieldKeyPressed
         if(evt.getKeyCode()== KeyEvent.VK_ENTER){
             String name = barcode_textfield.getText();
             try {
                 conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
                 pst = conn.prepareStatement("select * from product where barcode = ?");
                 pst.setString(1, name);
                 rs = pst.executeQuery();
                 if(rs.next()== false){
                 JOptionPane.showMessageDialog(this, "Barcode not found");
                 }else{
                 String productname = rs.getString("product_name");
                 String price = rs.getString("retail_price");
                 
                 product_name_textfield.setText(productname.trim());
                 price_textfield.setText(price.trim());
                 
                 
                 
                 }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
             }
             

    }//GEN-LAST:event_barcode_textfieldKeyPressed
    }
    private void jLabel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5KeyPressed

    private void pos_jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos_jtableMouseClicked
       
    }//GEN-LAST:event_pos_jtableMouseClicked

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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_product_btn;
    private javax.swing.JTextField balance_textfield;
    private javax.swing.JTextField barcode_textfield;
    private javax.swing.JLabel brand_label;
    private javax.swing.JLabel cashier_label;
    private javax.swing.JLabel category_label;
    private javax.swing.JButton delete_product_btn;
    private javax.swing.JLabel exit_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pay_invoice_btn;
    private javax.swing.JTextField pay_textfield;
    private javax.swing.JTable pos_jtable;
    private javax.swing.JLabel pos_label;
    private javax.swing.JTextField price_textfield;
    private javax.swing.JLabel product_label;
    private javax.swing.JTextField product_name_textfield;
    private javax.swing.JTextField quantity_textfield;
    private javax.swing.JTextField subtotal_textfield;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
