package View;

import Controller.Controller_Nasabah;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class FrmNasabah extends javax.swing.JFrame {
    Controller.Controller_Nasabah controller;
    
    public FrmNasabah() {
        initComponents();
        setLocationRelativeTo(this);
        controller = new Controller_Nasabah(this);
        controller.reset();
    }

    public JComboBox<String> getCbojenisrekening() {
        return cboJenisRekening;
    }

    public JTextField getTxtNama_Nasabah() {
        return txtNama_Nasabah;
    }

    public JTextField getTxtNo_Rekening() {
        return txtNo_Rekening;
    }

    public JTextField getTxtSaldo() {
        return txtSaldo;
    }

    public JTable getTblNasabah() {
        return tblNasabah;
    }

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelNo_Rekening = new javax.swing.JLabel();
        jLabelNama_Nasabah = new javax.swing.JLabel();
        txtNo_Rekening = new javax.swing.JTextField();
        txtNama_Nasabah = new javax.swing.JTextField();
        cmdTambah = new javax.swing.JButton();
        cmdUbah = new javax.swing.JButton();
        cmdHapus = new javax.swing.JButton();
        cmdBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNasabah = new javax.swing.JTable();
        jLabelJenis_Rekening = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        cboJenisRekening = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:: Entri Data Mahasiswa ::.");
        setAlwaysOnTop(true);

        jLabelNo_Rekening.setText("No_Rekening");

        jLabelNama_Nasabah.setText("Nama Nasabah");

        txtNo_Rekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNo_RekeningActionPerformed(evt);
            }
        });
        txtNo_Rekening.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNo_RekeningKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNo_RekeningKeyReleased(evt);
            }
        });

        cmdTambah.setText("Tambah");
        cmdTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTambahActionPerformed(evt);
            }
        });

        cmdUbah.setText("Ubah");
        cmdUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUbahActionPerformed(evt);
            }
        });

        cmdHapus.setText("Hapus");
        cmdHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHapusActionPerformed(evt);
            }
        });

        cmdBatal.setText("Batal");
        cmdBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBatalActionPerformed(evt);
            }
        });

        tblNasabah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblNasabah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNasabahMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNasabah);

        jLabelJenis_Rekening.setText("Jenis Rekening");

        jLabelSaldo.setText("Saldo :");

        cboJenisRekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJenisRekeningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(cmdTambah)
                        .addGap(18, 18, 18)
                        .addComponent(cmdUbah)
                        .addGap(18, 18, 18)
                        .addComponent(cmdHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdBatal)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNama_Nasabah)
                            .addComponent(jLabelNo_Rekening)
                            .addComponent(jLabelJenis_Rekening)
                            .addComponent(jLabelSaldo))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNo_Rekening, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama_Nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboJenisRekening, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNo_Rekening)
                    .addComponent(txtNo_Rekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNama_Nasabah)
                    .addComponent(txtNama_Nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJenis_Rekening)
                    .addComponent(cboJenisRekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSaldo)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdTambah)
                    .addComponent(cmdUbah)
                    .addComponent(cmdHapus)
                    .addComponent(cmdBatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNo_RekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNo_RekeningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNo_RekeningActionPerformed

    private void cmdTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTambahActionPerformed
        controller.insert();
        controller.reset();
    }//GEN-LAST:event_cmdTambahActionPerformed

    private void cmdUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUbahActionPerformed
        controller.update();
        controller.reset();
    }//GEN-LAST:event_cmdUbahActionPerformed

    private void cmdHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHapusActionPerformed
        controller.delete();
        controller.reset();
    }//GEN-LAST:event_cmdHapusActionPerformed

    private void cmdBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBatalActionPerformed
        controller.reset();
    }//GEN-LAST:event_cmdBatalActionPerformed

    private void tblNasabahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNasabahMouseClicked
        controller.isiField(tblNasabah.getSelectedRow());
        this.txtNama_Nasabah.requestFocus();
    }//GEN-LAST:event_tblNasabahMouseClicked

    private void txtNo_RekeningKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNo_RekeningKeyReleased
        //controller.isiTabelCari();
    }//GEN-LAST:event_txtNo_RekeningKeyReleased

    private void txtNo_RekeningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNo_RekeningKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(txtNo_Rekening.getText().isEmpty()){
                controller.reset();
            }
            else{
                controller.isiTabelCari();
                this.txtNama_Nasabah.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNo_RekeningKeyPressed

    private void cboJenisRekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJenisRekeningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboJenisRekeningActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmNasabah().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboJenisRekening;
    private javax.swing.JButton cmdBatal;
    private javax.swing.JButton cmdHapus;
    private javax.swing.JButton cmdTambah;
    private javax.swing.JButton cmdUbah;
    private javax.swing.JLabel jLabelJenis_Rekening;
    private javax.swing.JLabel jLabelNama_Nasabah;
    private javax.swing.JLabel jLabelNo_Rekening;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblNasabah;
    private javax.swing.JTextField txtNama_Nasabah;
    private javax.swing.JTextField txtNo_Rekening;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
