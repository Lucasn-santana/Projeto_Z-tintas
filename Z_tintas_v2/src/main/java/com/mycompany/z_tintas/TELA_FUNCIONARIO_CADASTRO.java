/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.z_tintas;

import static com.mycompany.z_tintas.Classe_funcionario.inserirFuncionario;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class TELA_FUNCIONARIO_CADASTRO extends javax.swing.JFrame {

    /**
     * Creates new form TELA_FUNCIONARIO_CADASTRO
     */
    public TELA_FUNCIONARIO_CADASTRO() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NomeFuncionario = new javax.swing.JTextField();
        CargoFuncionario = new javax.swing.JTextField();
        SenhaFuncionario = new javax.swing.JTextField();
        ConfSenhaFuncionario = new javax.swing.JTextField();
        CadastroFuncionario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(7, 25, 82));
        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 244, 246));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo cadastrar novo funcionario.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(25, 25, 721, 77);

        voltar.setBackground(new java.awt.Color(7, 25, 82));
        voltar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        voltar.setForeground(new java.awt.Color(235, 244, 246));
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltarr.png"))); // NOI18N
        voltar.setBorder(null);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar);
        voltar.setBounds(25, 900, 75, 75);

        jPanel2.setBackground(new java.awt.Color(235, 244, 246));
        jPanel2.setMaximumSize(new java.awt.Dimension(1138, 593));
        jPanel2.setMinimumSize(new java.awt.Dimension(1138, 593));
        jPanel2.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Microsoft Tai Le", 1, 25)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(7, 25, 82));
        jLabel16.setText("NOME:");
        jLabel16.setToolTipText("");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(30, 20, 100, 30);

        jLabel15.setFont(new java.awt.Font("Microsoft Tai Le", 1, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(7, 25, 82));
        jLabel15.setText("CARGO:");
        jLabel15.setToolTipText("");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(440, 20, 100, 30);

        jLabel14.setFont(new java.awt.Font("Microsoft Tai Le", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(7, 25, 82));
        jLabel14.setText("SENHA:");
        jLabel14.setToolTipText("");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 140, 140, 30);

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(7, 25, 82));
        jLabel13.setText("CONFIRMAR SENHA:");
        jLabel13.setToolTipText("");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(440, 140, 250, 30);

        NomeFuncionario.setBackground(new java.awt.Color(7, 25, 82));
        NomeFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        NomeFuncionario.setForeground(new java.awt.Color(235, 244, 246));
        NomeFuncionario.setMaximumSize(new java.awt.Dimension(400, 60));
        NomeFuncionario.setMinimumSize(new java.awt.Dimension(400, 60));
        NomeFuncionario.setPreferredSize(new java.awt.Dimension(250, 60));
        NomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeFuncionarioActionPerformed(evt);
            }
        });
        jPanel2.add(NomeFuncionario);
        NomeFuncionario.setBounds(30, 60, 360, 60);

        CargoFuncionario.setBackground(new java.awt.Color(7, 25, 82));
        CargoFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        CargoFuncionario.setForeground(new java.awt.Color(235, 244, 246));
        CargoFuncionario.setMaximumSize(new java.awt.Dimension(400, 60));
        CargoFuncionario.setMinimumSize(new java.awt.Dimension(400, 60));
        CargoFuncionario.setPreferredSize(new java.awt.Dimension(250, 60));
        CargoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargoFuncionarioActionPerformed(evt);
            }
        });
        jPanel2.add(CargoFuncionario);
        CargoFuncionario.setBounds(440, 60, 360, 60);

        SenhaFuncionario.setBackground(new java.awt.Color(7, 25, 82));
        SenhaFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        SenhaFuncionario.setForeground(new java.awt.Color(235, 244, 246));
        SenhaFuncionario.setMaximumSize(new java.awt.Dimension(400, 60));
        SenhaFuncionario.setMinimumSize(new java.awt.Dimension(400, 60));
        SenhaFuncionario.setPreferredSize(new java.awt.Dimension(400, 60));
        SenhaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaFuncionarioActionPerformed(evt);
            }
        });
        jPanel2.add(SenhaFuncionario);
        SenhaFuncionario.setBounds(30, 180, 360, 60);

        ConfSenhaFuncionario.setBackground(new java.awt.Color(7, 25, 82));
        ConfSenhaFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        ConfSenhaFuncionario.setForeground(new java.awt.Color(235, 244, 246));
        ConfSenhaFuncionario.setMaximumSize(new java.awt.Dimension(400, 60));
        ConfSenhaFuncionario.setMinimumSize(new java.awt.Dimension(400, 60));
        ConfSenhaFuncionario.setPreferredSize(new java.awt.Dimension(400, 60));
        ConfSenhaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfSenhaFuncionarioActionPerformed(evt);
            }
        });
        jPanel2.add(ConfSenhaFuncionario);
        ConfSenhaFuncionario.setBounds(440, 180, 360, 60);

        CadastroFuncionario.setBackground(new java.awt.Color(7, 25, 82));
        CadastroFuncionario.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        CadastroFuncionario.setForeground(new java.awt.Color(235, 244, 246));
        CadastroFuncionario.setText("CADASTRAR FUNCIONARIO");
        CadastroFuncionario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroFuncionarioActionPerformed(evt);
            }
        });
        jPanel2.add(CadastroFuncionario);
        CadastroFuncionario.setBounds(400, 490, 340, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(151, 151, 1138, 593);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO ZTINTAS.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1265, 25, 150, 150);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        TELA_FUNCIONARIO_MENU func_menu = new TELA_FUNCIONARIO_MENU();
        func_menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void NomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeFuncionarioActionPerformed

    private void CargoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargoFuncionarioActionPerformed

    private void SenhaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaFuncionarioActionPerformed

    private void ConfSenhaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfSenhaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfSenhaFuncionarioActionPerformed

    private void CadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFuncionarioActionPerformed
        boolean x = false;
        boolean y = false;
        boolean z = false;
        
        try{
            if(NomeFuncionario.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "O NOME É OBRIGATÓRIO!!!");
            }else{
                x = true;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha na Inserção do nome!!!");
            e.printStackTrace();
            }
        
        try{
            if(CargoFuncionario.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "O CAMPO CARGO É OBRIGATÓRIO!!!");
            }else{
                y = true;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha na Inserção de cargo!!!");
            e.printStackTrace();
        }
        
        try{
            if(SenhaFuncionario.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "O CAMPO DE SENHA É OBRIGATÓRIO!!!");
            }else if (SenhaFuncionario.getText().equals(ConfSenhaFuncionario.getText())){
                z = true;
            }else{
                JOptionPane.showMessageDialog(null, "AS SENHAS DEVEM SER IGUAIS!!!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha na Verificação de senhas!");
            e.printStackTrace();
        }
        
        Classe_funcionario funcionario_01 = new Classe_funcionario(NomeFuncionario.getText(),CargoFuncionario.getText(),SenhaFuncionario.getText());
        
        if(x && y && z){
            
            inserirFuncionario(funcionario_01);
            
        }
        
        
    }//GEN-LAST:event_CadastroFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TELA_FUNCIONARIO_CADASTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TELA_FUNCIONARIO_CADASTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TELA_FUNCIONARIO_CADASTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TELA_FUNCIONARIO_CADASTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TELA_FUNCIONARIO_CADASTRO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroFuncionario;
    private javax.swing.JTextField CargoFuncionario;
    private javax.swing.JTextField ConfSenhaFuncionario;
    private javax.swing.JTextField NomeFuncionario;
    private javax.swing.JTextField SenhaFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
