/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.z_tintas;

/**
 *
 * @author Gabriel
 */
public class FUNCIONARIO_MENU extends javax.swing.JFrame {

    /**
     * Creates new form FUNCIONARIO_MENU
     */
    public FUNCIONARIO_MENU() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(7, 25, 82));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/funcionarios titulo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(25, 25, 380, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO_MENU.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1265, 25, 140, 140);

        jButton1.setBackground(new java.awt.Color(7, 25, 82));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt_Voltar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(25, 900, 80, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagem_mulher_telafuncionario.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(847, 254, 490, 496);

        jButton2.setBackground(new java.awt.Color(7, 25, 82));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastro de funcionario.png"))); // NOI18N
        jButton2.setBorder(null);
        jPanel1.add(jButton2);
        jButton2.setBounds(97, 222, 700, 160);

        jButton3.setBackground(new java.awt.Color(7, 25, 82));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta de funcionario.png"))); // NOI18N
        jButton3.setBorder(null);
        jPanel1.add(jButton3);
        jButton3.setBounds(97, 432, 710, 160);

        jButton4.setBackground(new java.awt.Color(7, 25, 82));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/funcionarios.png"))); // NOI18N
        jButton4.setBorder(null);
        jPanel1.add(jButton4);
        jButton4.setBounds(97, 642, 700, 160);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FUNCIONARIO_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FUNCIONARIO_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FUNCIONARIO_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FUNCIONARIO_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FUNCIONARIO_MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
