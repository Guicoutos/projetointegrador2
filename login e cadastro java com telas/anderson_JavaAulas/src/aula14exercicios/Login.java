/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author 42121742018.1
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        sair = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        fieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 240));
        getContentPane().setLayout(null);

        labelLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLogin.setText("Login");
        getContentPane().add(labelLogin);
        labelLogin.setBounds(170, 20, 50, 30);

        labelSenha.setText("Senha: ");
        getContentPane().add(labelSenha);
        labelSenha.setBounds(130, 100, 50, 14);

        labelNome.setText("Nome: ");
        getContentPane().add(labelNome);
        labelNome.setBounds(130, 70, 50, 14);

        fieldNome.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        getContentPane().add(fieldNome);
        fieldNome.setBounds(170, 70, 90, 20);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(70, 150, 51, 23);

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar);
        enviar.setBounds(240, 150, 63, 23);

        fieldSenha.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        getContentPane().add(fieldSenha);
        fieldSenha.setBounds(170, 100, 90, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        Cadastro CAD=new Cadastro();
        if ( (fieldNome.getText().equals("admin")) & (fieldSenha.getText().equals("123")) ){
            JOptionPane.showMessageDialog(null, "Acesso permitido");
            CAD.setVisible(true);
            fieldNome.setText("");
            fieldSenha.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }  
    }//GEN-LAST:event_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviar;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
