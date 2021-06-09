/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI GF75
 */
public class skedul extends javax.swing.JFrame {

    /**
     * Creates new form skedul
     */
    private DefaultTableModel model;
    public skedul() {
        initComponents();
        
        //membuat tableModel
        model = new DefaultTableModel();
        
        //menambahkan tablemodel ke tabel
        tabelSkedul.setModel(model);
        
        model.addColumn("No.");
        model.addColumn("Judul");
        model.addColumn("Tanggal");
        model.addColumn("Note");
        
        //panggil load data
        loadData();
    }

    public void loadData(){
        //menghapus seluruh data
        model.getDataVector().removeAllElements();
        
        //memberi tahu bahwa data telah kosong
        model.fireTableDataChanged();
        
        try{
            int no = 1;
            Connection c = KoneksiDatabase.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM skedul";
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                //lakukan penelusuran baris
                Object[] o = new Object[6];
                o[0] = no++;
                o[1] = r.getString("Judul");
                o[2] = r.getString("Tanggal");
                o[3] = r.getString("Note");

                
                model.addRow(o);
            }
            r.close();
            s.close();
            
        }
        catch(SQLException e){
            
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

        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        inputJudul = new javax.swing.JTextField();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputNote = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelSkedul = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        bgn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setPreferredSize(new java.awt.Dimension(1010, 670));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJudulActionPerformed(evt);
            }
        });

        inputNote.setColumns(20);
        inputNote.setRows(5);
        jScrollPane1.setViewportView(inputNote);

        tabelSkedul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelSkedul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSkedulMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelSkedul);

        jLabel1.setText("Judul      :");

        jLabel2.setText("Tanggal  :");

        jLabel3.setText("Note       :");

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.setPreferredSize(new java.awt.Dimension(71, 23));
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.setPreferredSize(new java.awt.Dimension(71, 23));
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Tambah)
                        .addGap(51, 51, 51)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tambah)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 670));

        bgn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bgn1.jpg"))); // NOI18N
        bgn.setText("jLabel1");
        jPanel5.add(bgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1050, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJudulActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        int i = tabelSkedul.getSelectedRow();
        if(i == -1){
            //tidak ada baris terseleksi
            return;
        }
        
        String judul = (String) model.getValueAt(i, 1);
        
         try{
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "DELETE FROM skedul WHERE judul = ? ";
            
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, judul);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            
        }catch(SQLException e){
            System.out.println("Terjadi error hapus");
        }finally{
            loadData();
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        
        String tampilan ="dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(inputTanggal.getDate()));
        String judul = inputJudul.getText();
        String note = inputNote.getText();

        
        try{
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = ("INSERT INTO skedul VALUES (?, ?, ?)");
            PreparedStatement p = c.prepareStatement(sql);
            
            
            p.setString(1, judul);
            p.setString(2, tanggal);
            p.setString(3, note);

            
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
            
        }catch(SQLException e){
            System.out.println("Terjadi error tambah");
        }finally{
            loadData();
        }
    }//GEN-LAST:event_TambahActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        int i = tabelSkedul.getSelectedRow();
        if(i == -1){
            //tidak ada baris terseleksi
            return;
        }
        
        //ambil nim yang terseleksi
        String judul = (String) model.getValueAt(i, 1);
        String tampilan = "dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(inputTanggal.getDate()));
        String note = inputNote.getText();
        
        try{
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "UPDATE skedul SET tanggal = ?, note = ? WHERE judul = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            

            p.setString(1, tanggal);
            p.setString(2, note);
            p.setString(3, judul);
            
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            
        }catch(SQLException e){
            System.out.println("Terjadi error ubah");
        }finally{
            loadData();
        }
    }//GEN-LAST:event_EditActionPerformed

    private void tabelSkedulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSkedulMouseClicked
        // TODO add your handling code here:
        int i = tabelSkedul.getSelectedRow();
         if(i == -1){
            //tidak ada baris terseleksi
            return;
        }
         
        String nim = (String) model.getValueAt(i, 1);
        inputJudul.setText(nim);
        
        String nama = (String) model.getValueAt(i, 3);
        inputNote.setText(nama);


    }//GEN-LAST:event_tabelSkedulMouseClicked

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
            java.util.logging.Logger.getLogger(skedul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(skedul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(skedul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(skedul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new skedul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel bgn;
    private javax.swing.JLabel edukasi;
    private javax.swing.JLabel edukasi1;
    private javax.swing.JLabel edukasi2;
    private javax.swing.JLabel edukasi3;
    private javax.swing.JLabel edukasi4;
    private javax.swing.JLabel edukasi5;
    private javax.swing.JLabel edukasi6;
    private javax.swing.JLabel edukasi7;
    private javax.swing.JLabel edukasi8;
    private javax.swing.JTextField inputJudul;
    private javax.swing.JTextArea inputNote;
    private com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JPanel jEdukasi;
    private javax.swing.JPanel jEdukasi1;
    private javax.swing.JPanel jEdukasi2;
    private javax.swing.JPanel jEdukasi3;
    private javax.swing.JPanel jEdukasi4;
    private javax.swing.JPanel jEdukasi5;
    private javax.swing.JPanel jEdukasi6;
    private javax.swing.JPanel jEdukasi7;
    private javax.swing.JPanel jEdukasi8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelSkedul;
    // End of variables declaration//GEN-END:variables
}
