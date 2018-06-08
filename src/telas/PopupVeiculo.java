/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dominio.Veiculo;

/**
 *
 * @author riqui
 */
public class PopupVeiculo extends javax.swing.JPanel {
 private Veiculo carroSwap = null;

    /**
     * Creates new form PopupVeiculo
     */
    public PopupVeiculo() {
        initComponents();
        carroSwap = new Veiculo();
        int combustivel = 0;
    }
    
     public void Teste(){
        
        this.setVisible(true);}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtfPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bttGasolina = new javax.swing.JRadioButton();
        bttAlcool = new javax.swing.JRadioButton();
        cbxCombustivel = new javax.swing.JComboBox<>();
        bttDiesel = new javax.swing.JRadioButton();
        bttGas = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtfLitros = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("NOVO VEICULO");

        txtfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfPlacaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PLACA:");

        bttGasolina.setText("Gasolina");
        bttGasolina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGasolinaActionPerformed(evt);
            }
        });

        bttAlcool.setText("Alcool");
        bttAlcool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAlcoolActionPerformed(evt);
            }
        });

        cbxCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Alcool", "Diesel", "Gas" }));
        cbxCombustivel.setToolTipText("");
        cbxCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCombustivelActionPerformed(evt);
            }
        });

        bttDiesel.setText("Diesel");
        bttDiesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDieselActionPerformed(evt);
            }
        });

        bttGas.setText("Gas");
        bttGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("LITROS:");

        txtfLitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfLitrosActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bttDiesel)
                            .addComponent(bttGas)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIncluir)
                                    .addComponent(txtfLitros)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bttGasolina)
                                    .addComponent(bttAlcool))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttGasolina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAlcool)
                    .addComponent(cbxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttDiesel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttGas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIncluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPlacaActionPerformed

    private void bttGasolinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGasolinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttGasolinaActionPerformed

    private void bttAlcoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAlcoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttAlcoolActionPerformed

    private void cbxCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCombustivelActionPerformed

    private void bttDieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDieselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttDieselActionPerformed

    private void bttGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttGasActionPerformed

    private void txtfLitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfLitrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfLitrosActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:

        carroSwap.setPlaca(txtfPlaca.getText());
        carroSwap.setLitros(Float.parseFloat(txtfLitros.getText()));
        carroSwap.setTipoCombustivel(cbxCombustivel.getSelectedIndex());
    }//GEN-LAST:event_btnIncluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluir;
    private javax.swing.JRadioButton bttAlcool;
    private javax.swing.JRadioButton bttDiesel;
    private javax.swing.JRadioButton bttGas;
    private javax.swing.JRadioButton bttGasolina;
    private javax.swing.JComboBox<String> cbxCombustivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtfLitros;
    private javax.swing.JTextField txtfPlaca;
    // End of variables declaration//GEN-END:variables
}
