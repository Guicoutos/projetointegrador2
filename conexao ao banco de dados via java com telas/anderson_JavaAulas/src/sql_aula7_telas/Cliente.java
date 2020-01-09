/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql_aula7_telas;
import java.sql.*;
import sql_aula7_conexao.Conexao;
import javax.swing.*;
/**
 *
 * @author 42121742018.1
 */
public class Cliente extends javax.swing.JFrame {
    protected int idCliente;
    public String nome;
    public String cpf;
    private String email;
    private String telefone;
    
    Connection conexao=null;
    PreparedStatement linguagem=null;//linguagem sql dentro do java
    ResultSet linha=null;//linha de procura dentro do banco de dados
    
    void limpacampo(){
        jnome.setText("");
        jcpf.setText("");
        jtelefone.setText("");
        jemail.setText("");
        jcodigo.setText("");
        jnome.requestFocus();
    }
    
    void novo(){
        jnome.setEnabled(true);
        jcpf.setEnabled(true);
        jemail.setEnabled(true);
        jtelefone.setEnabled(true);
        jsalvar.setEnabled(true);
        jconsultar.setEnabled(true);
        jeditar.setEnabled(true);
        jexcluir.setEnabled(true);
        japarelho.setEnabled(true);
        jnome.requestFocus();
    }
    
    void salvar(){
        nome=jnome.getText();
        cpf=jcpf.getText();
        email=jemail.getText();
        telefone=jtelefone.getText();
        String inserir="insert into cliente(nomeCliente,cpfCliente,telefoneCliente,emailCliente) values (?,?,?,?)";
        
        try{
            linguagem=conexao.prepareStatement(inserir);
            linguagem.setString(1, nome);
            linguagem.setString(2, cpf);
            linguagem.setString(3, telefone);
            linguagem.setString(4, email);
            linguagem.executeUpdate();
            limpacampo();
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro "+e.getMessage());
        }
        
    }
    
    void excluir(){//variavel local pode usar nomes iguais atribucoes poliformicas
        int resp=JOptionPane.showConfirmDialog(null, "Tem certeza de excluir?");
        if(resp==JOptionPane.YES_OPTION){
        //idCliente=Integer.parseInt(jcodigo.getText());
        String excluir="delete from cliente where idCliente=?";
        try{
            linguagem=conexao.prepareStatement(excluir);
            linguagem.setString(1, jcodigo.getText());
            int apagado=linguagem.executeUpdate();
            if(apagado>0){
                JOptionPane.showMessageDialog(null, "Excluido");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao excluir");
            }
            limpacampo();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro "+e.getMessage());
            }
        }
    }
    //em verde sao as variaveis q vc pode por qualquer nome
    
    void consultar(){
        //cpf=jcpf.getText();
        String consultar="select * from cliente where cpfCliente=?";
        try{
            linguagem=conexao.prepareStatement(consultar);
            linguagem.setString(1,jcpf.getText());
            linha=linguagem.executeQuery();
            if(linha.next()){
                jcodigo.setText(linha.getString("idCliente"));
                jnome.setText(linha.getString("nomeCliente"));
                jcpf.setText(linha.getString("cpfCliente"));
                jemail.setText(linha.getString("emailCliente"));
                jtelefone.setText(linha.getString("telefoneCliente"));
            }else{
                JOptionPane.showMessageDialog(this,"CPF não encontrado");
                jcpf.requestFocus();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro"+e.getMessage());
        }
    }
    
    void editar(){
        String editar="update cliente set nomeCliente=?,cpfCliente=?,emailCliente=?,telefoneCliente=? where idCliente=?";
        try{
            linguagem=conexao.prepareStatement(editar);
            linguagem.setString(1, jnome.getText());
            linguagem.setString(2, jcpf.getText());
            linguagem.setString(3, jemail.getText());
            linguagem.setString(4, jtelefone.getText());
            linguagem.setString(5, jcodigo.getText());
            int resp=linguagem.executeUpdate();
            if(resp>0){
                JOptionPane.showMessageDialog(this, "Atualizado com sucesso");
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao atualizar");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro "+e.getMessage());
        }
        limpacampo();
    }
    
    public Cliente() {
        initComponents();
        conexao=Conexao.conexao();
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
        jemail = new javax.swing.JTextField();
        jcodigo = new javax.swing.JTextField();
        jnome = new javax.swing.JTextField();
        jcpf = new javax.swing.JTextField();
        jtelefone = new javax.swing.JTextField();
        jsair = new javax.swing.JButton();
        jnovo = new javax.swing.JButton();
        jexcluir = new javax.swing.JButton();
        jeditar = new javax.swing.JButton();
        japarelho = new javax.swing.JButton();
        jconsultar = new javax.swing.JButton();
        jsalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Código");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 60, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 60, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 130, 60, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 170, 60, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("E-mail");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 210, 60, 15);

        jemail.setEnabled(false);
        getContentPane().add(jemail);
        jemail.setBounds(100, 200, 120, 30);

        jcodigo.setEditable(false);
        getContentPane().add(jcodigo);
        jcodigo.setBounds(100, 40, 120, 30);

        jnome.setEnabled(false);
        getContentPane().add(jnome);
        jnome.setBounds(100, 80, 120, 30);

        jcpf.setEnabled(false);
        getContentPane().add(jcpf);
        jcpf.setBounds(100, 120, 120, 30);

        jtelefone.setEnabled(false);
        getContentPane().add(jtelefone);
        jtelefone.setBounds(100, 160, 120, 30);

        jsair.setText("Sair");
        jsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsairActionPerformed(evt);
            }
        });
        getContentPane().add(jsair);
        jsair.setBounds(340, 270, 51, 23);

        jnovo.setText("Novo");
        jnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnovoActionPerformed(evt);
            }
        });
        getContentPane().add(jnovo);
        jnovo.setBounds(290, 50, 90, 23);

        jexcluir.setText("Excluir");
        jexcluir.setEnabled(false);
        jexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jexcluir);
        jexcluir.setBounds(290, 210, 90, 23);

        jeditar.setText("Editar");
        jeditar.setEnabled(false);
        jeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeditarActionPerformed(evt);
            }
        });
        getContentPane().add(jeditar);
        jeditar.setBounds(290, 170, 90, 23);

        japarelho.setText("Aparelho");
        japarelho.setEnabled(false);
        getContentPane().add(japarelho);
        japarelho.setBounds(240, 270, 80, 23);

        jconsultar.setText("Consultar");
        jconsultar.setEnabled(false);
        jconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jconsultar);
        jconsultar.setBounds(290, 130, 90, 23);

        jsalvar.setText("Salvar");
        jsalvar.setEnabled(false);
        jsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jsalvar);
        jsalvar.setBounds(290, 90, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnovoActionPerformed
        // TODO add your handling code here:
        novo();
    }//GEN-LAST:event_jnovoActionPerformed

    private void jsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsalvarActionPerformed
        // TODO add your handling code here:
        salvar();
    }//GEN-LAST:event_jsalvarActionPerformed

    private void jsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jsairActionPerformed

    private void jconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconsultarActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_jconsultarActionPerformed

    private void jeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditarActionPerformed
        // TODO add your handling code here:
        editar();
    }//GEN-LAST:event_jeditarActionPerformed

    private void jexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexcluirActionPerformed
        // TODO add your handling code here:
        excluir();
    }//GEN-LAST:event_jexcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton japarelho;
    private javax.swing.JTextField jcodigo;
    private javax.swing.JButton jconsultar;
    private javax.swing.JTextField jcpf;
    private javax.swing.JButton jeditar;
    private javax.swing.JTextField jemail;
    private javax.swing.JButton jexcluir;
    private javax.swing.JTextField jnome;
    private javax.swing.JButton jnovo;
    private javax.swing.JButton jsair;
    private javax.swing.JButton jsalvar;
    private javax.swing.JTextField jtelefone;
    // End of variables declaration//GEN-END:variables
}
