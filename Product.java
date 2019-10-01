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
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Product() {
        initComponents();
        table_update();
        categoryID();
        brandID();
        }
    Connection conn;
    PreparedStatement pst;
    
    public class CategoryItem{
    int categoryID;
    String name;
    
    
    public CategoryItem(int categoryID, String name){
    this.categoryID = categoryID;
    this.name = name;
    
    }
    public String toString(){
    return name;
    }
    
     }
    
    public class BrandItem{
    int brandID;
    String name;
    
    
    public BrandItem(int brandID, String name){
    this.brandID = brandID;
    this.name = name;
    
    }
    public String toString(){
    return name;
    }
    
    
    }
    
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
        product_name_textfield = new javax.swing.JTextField();
        brand_combobox = new javax.swing.JComboBox();
        update_product_btn = new javax.swing.JButton();
        delete_product_btn = new javax.swing.JButton();
        add_product_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description_textarea = new javax.swing.JTextArea();
        barcode_textfield = new javax.swing.JTextField();
        quantity_textfield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        category_combobox = new javax.swing.JComboBox();
        product_status_combobox = new javax.swing.JComboBox<>();
        cost_price_textfield = new javax.swing.JTextField();
        retail_price_textfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_jtable = new javax.swing.JTable();

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
                .addGap(65, 65, 65)
                .addComponent(cashier_label)
                .addGap(78, 78, 78)
                .addComponent(exit_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("SuperMarket");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Product");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Status");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Product Name");

        product_name_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        product_name_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_textfieldActionPerformed(evt);
            }
        });

        brand_combobox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        update_product_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update_product_btn.setText("Update");
        update_product_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_product_btnActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Category ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Description");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Retail Price");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Cost Price");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Barcode");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Quantity");

        description_textarea.setColumns(20);
        description_textarea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        description_textarea.setRows(5);
        jScrollPane2.setViewportView(description_textarea);

        barcode_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        barcode_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcode_textfieldActionPerformed(evt);
            }
        });

        quantity_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        quantity_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_textfieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Brand ");

        category_combobox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        product_status_combobox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        product_status_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        cost_price_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cost_price_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_price_textfieldActionPerformed(evt);
            }
        });

        retail_price_textfield.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        retail_price_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retail_price_textfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cost_price_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(product_name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(category_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(quantity_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brand_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barcode_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_status_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(add_product_btn))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(update_product_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(delete_product_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(retail_price_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(brand_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(retail_price_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(barcode_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(product_name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_status_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cost_price_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(quantity_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add_product_btn)
                        .addComponent(update_product_btn)
                        .addComponent(delete_product_btn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(category_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(114, 114, 114))
        );

        product_jtable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        product_jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Description", "Category Type", "Brand Name", "Cost Price", "Retail Price", "Quantity ", "Barcode", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        product_jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(product_jtable);

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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(155, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
   private void categoryID(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
    pst = conn.prepareStatement("select * from category");
              ResultSet rs = pst.executeQuery();
              category_combobox.removeAllItems();
              
              while (rs.next()) {                
                category_combobox.addItem(new CategoryItem(rs.getInt(1), rs.getString(2)));
                
            }
              
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
    
    private void brandID(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
    pst = conn.prepareStatement("select * from brand");
              ResultSet rs = pst.executeQuery();
              brand_combobox.removeAllItems();
              
              while (rs.next()) {                
                brand_combobox.addItem(new BrandItem(rs.getInt(1), rs.getString(2)));
                
            }
              
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
    
    
    private void table_update(){
        try {
            int c;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
         pst = conn.prepareStatement("select p.product_id, p.product_name, p.description, c.category_type, b.brand_name, "
         + "p.cost_price,p.retail_price, p.quantity,p.barcode,p.status from product p, "
         + "category c, brand b where p.category_id = c.category_id and p.brand_id = b.brand_id");
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                c = rsmd.getColumnCount();
                
                DefaultTableModel dtm = (DefaultTableModel)product_jtable.getModel();
                dtm.setRowCount(0);
                
                while (rs.next()) {                    
                Vector v2 = new Vector();
                for(int i =1; i<c; i++)
                {
                v2.add(rs.getString("product_id"));
                v2.add(rs.getString("product_name"));
                v2.add(rs.getString("description"));
                v2.add(rs.getString("category_type"));
                v2.add(rs.getString("brand_name"));
                v2.add(rs.getString("cost_price"));
                v2.add(rs.getString("retail_price"));
                v2.add(rs.getString("quantity"));
                v2.add(rs.getString("barcode"));
                v2.add(rs.getString("status"));
                }
                dtm.addRow(v2);
                
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            
            
            
     
            
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private void product_name_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_name_textfieldActionPerformed

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
       System.exit(1);
    }//GEN-LAST:event_exit_labelMouseClicked

    
    
    
    private void add_product_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_btnActionPerformed
     String productname = product_name_textfield.getText();
     String desc= description_textarea.getText();
     CategoryItem categoryitem = (CategoryItem)category_combobox.getSelectedItem();
      BrandItem branditem = (BrandItem)brand_combobox.getSelectedItem();
      String costprice = cost_price_textfield.getText();
      String retail_price = retail_price_textfield.getText();
      String quantity= quantity_textfield.getText();
       String barcode= barcode_textfield.getText();
       
     
     String status = product_status_combobox.getSelectedItem().toString();
//     String status2 = brand_combobox.getSelectedItem().toString();
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
   pst = conn.prepareStatement("insert into product (product_name,description,category_id, brand_id, cost_price,retail_price,quantity,barcode, status) values(?,?,?,?,?,?,?,?,?) ");
   pst.setString(1, productname);
   pst.setString(2, desc);
   pst.setInt(3, categoryitem.categoryID);
   pst.setInt(4, branditem.brandID);
   pst.setString(5, costprice);
   pst.setString(6, retail_price);
   pst.setString(7, quantity);
   pst.setString(8, barcode);
    pst.setString(9, status);
          
    

   pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product Added  Sucessfully!!!!");
            table_update();
            product_name_textfield.setText("");
            description_textarea.setText("");
            brand_combobox.setSelectedIndex(-1);
            category_combobox.setSelectedIndex(-1);
            cost_price_textfield.setText("");
            retail_price_textfield.setText("");
            quantity_textfield.setText("");
            barcode_textfield.setText("");
            
        
            
    product_name_textfield.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_add_product_btnActionPerformed

    private void update_product_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_product_btnActionPerformed
     DefaultTableModel dtm2 = (DefaultTableModel)product_jtable.getModel();
     int selectIndex = product_jtable.getSelectedRow();  
     int id = Integer.parseInt(dtm2.getValueAt(selectIndex, 0).toString());
     String productname = product_name_textfield.getText();
     String desc= description_textarea.getText();
     CategoryItem categoryitem = (CategoryItem)category_combobox.getSelectedItem();
      
     BrandItem branditem= (BrandItem)brand_combobox.getSelectedItem();
      String costprice = cost_price_textfield.getText();
      String retail_price = retail_price_textfield.getText();
      String quantity= quantity_textfield.getText();
       String barcode= barcode_textfield.getText();
       
     
     String status = product_status_combobox.getSelectedItem().toString();
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
          pst = conn.prepareStatement("update product set product_name = ?, description = ?, category_id=?, brand_id=?, cost_price=? , retail_price = ? , quantity=? , barcode=?, status = ? where product_id =?");
           pst.setString(1, productname);
           pst.setString(2, desc);
           pst.setInt(3, categoryitem.categoryID);
           pst.setInt(4, branditem.brandID);
           pst.setString(5, costprice);
           pst.setString(6, retail_price);
           pst.setString(7, quantity);
           pst.setString(8, barcode);
           pst.setString(9, status);
     pst.setInt(10, id);
   pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            JOptionPane.showMessageDialog(null, "Product Updated Sucessfully!!!!");
            table_update();
             product_name_textfield.setText("");
            description_textarea.setText("");
            brand_combobox.setSelectedIndex(-1);
            category_combobox.setSelectedIndex(-1);
            cost_price_textfield.setText("");
            retail_price_textfield.setText("");
            quantity_textfield.setText("");
            barcode_textfield.setText("");
     
         product_name_textfield.requestFocus();
        
        
    }//GEN-LAST:event_update_product_btnActionPerformed

    private void product_jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_jtableMouseClicked
      DefaultTableModel dtm2 = (DefaultTableModel)product_jtable.getModel();
     
      int selectIndex = product_jtable.getSelectedRow();
      product_name_textfield.setText(dtm2.getValueAt(selectIndex, 1).toString());
      description_textarea.setText(dtm2.getValueAt(selectIndex, 2).toString());
        category_combobox.setSelectedItem(dtm2.getValueAt(selectIndex, 3).toString());
        
        brand_combobox.setSelectedItem(dtm2.getValueAt(selectIndex, 4).toString());
        
        cost_price_textfield.setText(dtm2.getValueAt(selectIndex, 5).toString());
        
        
       retail_price_textfield.setText(dtm2.getValueAt(selectIndex, 6).toString());
      quantity_textfield.setText(dtm2.getValueAt(selectIndex, 7).toString());
      barcode_textfield.setText(dtm2.getValueAt(selectIndex, 8).toString());
       product_status_combobox.setSelectedItem(dtm2.getValueAt(selectIndex, 9).toString());
       
    }//GEN-LAST:event_product_jtableMouseClicked

    private void delete_product_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_product_btnActionPerformed
    
        DefaultTableModel dtm2 = (DefaultTableModel)product_jtable.getModel();
      int selectIndex = product_jtable.getSelectedRow();  
      
            int id = Integer.parseInt(dtm2.getValueAt(selectIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are You sure You Want To Delete This Product", "Warning",JOptionPane.YES_NO_OPTION);
     
            if(dialogResult == JOptionPane.YES_NO_OPTION){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermarket", "root","");
            pst = conn.prepareStatement("delete from product where product_id =?");
            pst.setInt(1, id);
            pst.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Product Deleted!!!!");
            table_update();
             product_name_textfield.setText("");
            description_textarea.setText("");
            brand_combobox.setSelectedIndex(-1);
            category_combobox.setSelectedIndex(-1);
            cost_price_textfield.setText("");
            retail_price_textfield.setText("");
            quantity_textfield.setText("");
            barcode_textfield.setText("");
     product_status_combobox.setSelectedIndex(-1);
         product_name_textfield.requestFocus();
    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      }
      

        
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
       Brand b = new Brand();
       this.hide();
       b.setVisible(true);
    }//GEN-LAST:event_product_labelMouseClicked

    private void barcode_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcode_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcode_textfieldActionPerformed

    private void quantity_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity_textfieldActionPerformed

    private void cost_price_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_price_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cost_price_textfieldActionPerformed

    private void retail_price_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retail_price_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retail_price_textfieldActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_product_btn;
    private javax.swing.JTextField barcode_textfield;
    private javax.swing.JComboBox brand_combobox;
    private javax.swing.JLabel brand_label;
    private javax.swing.JLabel cashier_label;
    private javax.swing.JComboBox category_combobox;
    private javax.swing.JLabel category_label;
    private javax.swing.JTextField cost_price_textfield;
    private javax.swing.JButton delete_product_btn;
    private javax.swing.JTextArea description_textarea;
    private javax.swing.JLabel exit_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pos_label;
    private javax.swing.JTable product_jtable;
    private javax.swing.JLabel product_label;
    private javax.swing.JTextField product_name_textfield;
    private javax.swing.JComboBox<String> product_status_combobox;
    private javax.swing.JTextField quantity_textfield;
    private javax.swing.JTextField retail_price_textfield;
    private javax.swing.JButton update_product_btn;
    // End of variables declaration//GEN-END:variables
}
