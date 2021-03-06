/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Guilh
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
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

        desktopMenu = new javax.swing.JDesktopPane();
        buttonFuncionarios = new javax.swing.JButton();
        buttonClientes = new javax.swing.JButton();
        buttonEstoque = new javax.swing.JButton();
        buttonVendas = new javax.swing.JButton();
        buttonFornecedores = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        desktopMenu.setBackground(new java.awt.Color(153, 153, 255));

        buttonFuncionarios.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        buttonFuncionarios.setText("FUNCIONÁRIOS");
        buttonFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFuncionariosActionPerformed(evt);
            }
        });
        desktopMenu.add(buttonFuncionarios);
        buttonFuncionarios.setBounds(10, 190, 140, 40);

        buttonClientes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        buttonClientes.setText("CLIENTES");
        buttonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClientesActionPerformed(evt);
            }
        });
        desktopMenu.add(buttonClientes);
        buttonClientes.setBounds(10, 90, 140, 40);

        buttonEstoque.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        buttonEstoque.setText("ESTOQUE");
        buttonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstoqueActionPerformed(evt);
            }
        });
        desktopMenu.add(buttonEstoque);
        buttonEstoque.setBounds(10, 240, 140, 40);

        buttonVendas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buttonVendas.setText("VENDAS");
        buttonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVendasActionPerformed(evt);
            }
        });
        desktopMenu.add(buttonVendas);
        buttonVendas.setBounds(10, 140, 140, 40);

        buttonFornecedores.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        buttonFornecedores.setText("FORNECEDORES");
        buttonFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFornecedoresActionPerformed(evt);
            }
        });
        desktopMenu.add(buttonFornecedores);
        buttonFornecedores.setBounds(10, 290, 140, 40);

        buttonSair.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buttonSair.setText("SAIR");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        desktopMenu.add(buttonSair);
        buttonSair.setBounds(10, 420, 140, 40);

        buttonInicio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        buttonInicio.setText("INÍCIO");
        buttonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInicioActionPerformed(evt);
            }
        });
        desktopMenu.add(buttonInicio);
        buttonInicio.setBounds(10, 40, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 540, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desktopMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFuncionariosActionPerformed
        Funcionarios TFUNC = new Funcionarios();
    }//GEN-LAST:event_buttonFuncionariosActionPerformed

    private void buttonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClientesActionPerformed
        Clientes TCLI = new Clientes();
    }//GEN-LAST:event_buttonClientesActionPerformed

    private void buttonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstoqueActionPerformed
        Estoque TESTQ = new Estoque();
    }//GEN-LAST:event_buttonEstoqueActionPerformed

    private void buttonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVendasActionPerformed
        Vendas TVEN = new Vendas();
    }//GEN-LAST:event_buttonVendasActionPerformed

    private void buttonFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFornecedoresActionPerformed
        Fornecedores TFOR = new Fornecedores();
    }//GEN-LAST:event_buttonFornecedoresActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInicioActionPerformed
        Menu TMENU = new Menu();
    }//GEN-LAST:event_buttonInicioActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClientes;
    private javax.swing.JButton buttonEstoque;
    private javax.swing.JButton buttonFornecedores;
    private javax.swing.JButton buttonFuncionarios;
    private javax.swing.JButton buttonInicio;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonVendas;
    private javax.swing.JDesktopPane desktopMenu;
    // End of variables declaration//GEN-END:variables
}
