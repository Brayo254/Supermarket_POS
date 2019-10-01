/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.awt.print.PrinterException;
import javax.swing.table.TableModel;

/**
 *
 * @author Brian
 */
public class Print extends javax.swing.JFrame {

    /**
     * Creates new form Print
     */
    public Print() {
        initComponents();
    }
    
    String lsub;
    String lpay;
    String lbal;
    
    public Print(String sub, String pay, String bal, TableModel tableModel) throws PrinterException {
        initComponents();
        
        this.lsub=sub;
        this.lpay=pay;
        this.lbal=bal;
        
        print_textarea.setText(print_textarea.getText() + "******************\n");
        print_textarea.setText(print_textarea.getText() + "********** Brian Supermarket***********\n");
         print_textarea.setText(print_textarea.getText() + "\n");
         print_textarea.setText(print_textarea.getText() + "Product" + "\t"+"Price" + "\t" + "Total" + "\n");
         
         for(int i = 0; i< tableModel.getRowCount(); i++)
         {
         String product = (String)tableModel.getValueAt(i, 1);
         String price = (String)tableModel.getValueAt(i, 2);
         int total = (int)tableModel.getValueAt(i, 4);
             
        print_textarea.setText(print_textarea.getText() + product + "\t" +price +"\t" + total +"\n");   
             
         }
         print_textarea.setText(print_textarea.getText() + "\n");
         print_textarea.setText(print_textarea.getText() + "\n");
         print_textarea.setText(print_textarea.getText() + "        " +"SubTotal : " +sub +   "\n");
         print_textarea.setText(print_textarea.getText() + "        " +"Pay : " +pay +   "\n");
         print_textarea.setText(print_textarea.getText() + "        " +"Balance : " +bal +   "\n");
         
         print_textarea.setText(print_textarea.getText() + "******************\n");
         print_textarea.setText(print_textarea.getText() + "******************\n");
         print_textarea.setText(print_textarea.getText() + ".......Karibu Tena.......\n");
         
         print_textarea.print();
    }

  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        print_textarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        print_textarea.setColumns(20);
        print_textarea.setRows(5);
        jScrollPane1.setViewportView(print_textarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea print_textarea;
    // End of variables declaration//GEN-END:variables
}
