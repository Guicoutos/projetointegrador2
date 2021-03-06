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
public class Notas extends javax.swing.JFrame {

    /**
     * Creates new form Notas
     */
    public Notas() {
        initComponents();
    }
    public void exportarDados(ModeloEstudante model){
        labelMatrícula.setText(model.getMatrícula());
        labelNome.setText(model.getNome());
        labelTurma.setText(model.getTurma());
        labelTurno.setText(model.getTurno());
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
        labelTurno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelMatrícula = new javax.swing.JLabel();
        labelTurma = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fsegundaNota = new javax.swing.JTextField();
        fprimeiraNota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Notas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 60, 20);

        labelTurno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelTurno);
        labelTurno.setBounds(140, 110, 80, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Matrícula: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 70, 60, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Turma: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 90, 60, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nome: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 50, 60, 20);

        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelNome);
        labelNome.setBounds(140, 50, 80, 20);

        labelMatrícula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelMatrícula);
        labelMatrícula.setBounds(140, 70, 80, 20);

        labelTurma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelTurma);
        labelTurma.setBounds(140, 90, 80, 20);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(50, 210, 73, 23);

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar);
        enviar.setBounds(180, 210, 73, 23);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Turno: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 110, 60, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Digite sua segunda nota: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 160, 150, 20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Digite sua primeira nota: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 130, 150, 20);

        fsegundaNota.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fsegundaNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsegundaNotaActionPerformed(evt);
            }
        });
        getContentPane().add(fsegundaNota);
        fsegundaNota.setBounds(190, 160, 40, 20);

        fprimeiraNota.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fprimeiraNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fprimeiraNotaActionPerformed(evt);
            }
        });
        getContentPane().add(fprimeiraNota);
        fprimeiraNota.setBounds(190, 130, 40, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void fsegundaNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsegundaNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fsegundaNotaActionPerformed

    private void fprimeiraNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fprimeiraNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fprimeiraNotaActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        String situação=null;
        ModeloNotas model2=new ModeloNotas();
        MédiaSituação MED=new MédiaSituação();
        if((fprimeiraNota.getText().equals("")) && (fsegundaNota.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Preencher todos os campos");
        }
        else{
            model2.setPrimeiraNota(fprimeiraNota.getText());
            model2.setSegundaNota(fsegundaNota.getText());
            MED.exportarDados2(model2);
            MED.setVisible(true);
        }
        double n1=Double.parseDouble(fprimeiraNota.getText());
        double n2=Double.parseDouble(fsegundaNota.getText());
        double md=(n1+n2)/2;
        if((md>=7)){
            situação="Aprovado";
            String media=Double.toString(md);
            MED.setVisible(true);
            MED.exportarDados2(model2);
        }
        else{
            situação="Desaprovado";
            String media=Double.toString(md);
            MED.setVisible(true);
            MED.exportarDados2(model2);
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
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviar;
    private javax.swing.JTextField fprimeiraNota;
    private javax.swing.JTextField fsegundaNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelMatrícula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTurma;
    private javax.swing.JLabel labelTurno;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
