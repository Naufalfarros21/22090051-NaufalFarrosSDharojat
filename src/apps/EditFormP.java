/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apps;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import main.mainClass;

/**
 *
 * @author asus
 */
public class EditFormP extends javax.swing.JFrame {
                                                                                                                                                    
    /**
     * Creates new form editFromP
     */
    public EditFormP(String id_produk, String kode_produk, String nama_produk, String kategori, String harga, String stok) {

        initComponents();

        // Set nilai awal data yang mau diedit
        txtIdEdit.setText(id_produk);
        txtKpEdit.setText(kode_produk);
        txtNpEdit.setText(nama_produk);
        cmbKatEdit.setSelectedItem(kategori);
        txtHrEdit.setText(harga);
        txtStEdit.setText(stok);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNpEdit = new javax.swing.JTextField();
        txtKpEdit = new javax.swing.JTextField();
        cmbKatEdit = new javax.swing.JComboBox<>();
        txtHrEdit = new javax.swing.JTextField();
        txtStEdit = new javax.swing.JTextField();
        btnSvEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdEdit = new javax.swing.JTextField();
        btnBtlEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Produk");

        jLabel2.setText("Nama Produk");

        jLabel3.setText("Kategori");

        jLabel4.setText("Harga");

        jLabel5.setText("Stok");

        cmbKatEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "K.Dapur", "K.Mandi", "Sembako" }));

        btnSvEdit.setBackground(new java.awt.Color(51, 102, 255));
        btnSvEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnSvEdit.setText("SIMPAN");
        btnSvEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSvEditActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        btnBtlEdit.setBackground(new java.awt.Color(255, 51, 51));
        btnBtlEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnBtlEdit.setText("BATAL");
        btnBtlEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBtlEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(btnBtlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSvEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtKpEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txtNpEdit)
                        .addComponent(txtStEdit)
                        .addComponent(txtHrEdit)
                        .addComponent(cmbKatEdit, 0, 150, Short.MAX_VALUE))
                    .addComponent(txtIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKpEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNpEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbKatEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHrEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSvEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBtlEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSvEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSvEditActionPerformed
        // TODO add your handling code here:
        saveChanges();
    }//GEN-LAST:event_btnSvEditActionPerformed

    private void btnBtlEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBtlEditActionPerformed
        // TODO add your handling code here:
        cancelChanges();
    }//GEN-LAST:event_btnBtlEditActionPerformed

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
            java.util.logging.Logger.getLogger(EditFormP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFormP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFormP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFormP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBtlEdit;
    private javax.swing.JButton btnSvEdit;
    private javax.swing.JComboBox<String> cmbKatEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtHrEdit;
    private javax.swing.JTextField txtIdEdit;
    private javax.swing.JTextField txtKpEdit;
    private javax.swing.JTextField txtNpEdit;
    private javax.swing.JTextField txtStEdit;
    // End of variables declaration//GEN-END:variables

    private void saveChanges() {
    // Ambil nilai yang sudah diubah komponen GUI
    String id_produk = txtIdEdit.getText();
    String kode_produk = txtKpEdit.getText();
    String nama_produk = txtNpEdit.getText();
    String kategori = cmbKatEdit.getSelectedItem().toString();
    String harga = txtHrEdit.getText();
    String stok = txtStEdit.getText();

    if (id_produk.isEmpty() || kode_produk.isEmpty() || nama_produk.isEmpty() || kategori.isEmpty() || harga.isEmpty() || stok.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Silahkan isi semua data produk.");
        return;
    }

    try (Connection c = mainClass.sambungkeDB(); 
         PreparedStatement preparedStatement = c.prepareStatement(
             "UPDATE data_produk SET kode_produk=?, nama_produk=?, kategori=?, harga=?, stok=? WHERE id_produk=?")) {

        // Set parameter pada PreparedStatement
        preparedStatement.setString(1, kode_produk);
        preparedStatement.setString(2, nama_produk);
        preparedStatement.setString(3, kategori);
        preparedStatement.setString(4, harga);
        preparedStatement.setString(5, stok);
        preparedStatement.setString(6, id_produk);

        int rowsAffected = preparedStatement.executeUpdate();
        
        newGudang.displayDataP("");
        JOptionPane.showMessageDialog(this, "Perubahan berhasil disimpan. Jumlah baris yang terpengaruh: " + rowsAffected);
        
        dispose();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Gagal menyimpan perubahan: " + e.getMessage());
    }
    
    }
    
    private void cancelChanges () {
        int result = JOptionPane.showConfirmDialog(this, "Anda yakin ingin membatalkan perubahan?", "Konfirmasi Pembatalan", JOptionPane.YES_NO_OPTION);
        
        if (result == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

}
