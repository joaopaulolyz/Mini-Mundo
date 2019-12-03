/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.minimundo.Presentation.Desktop;

import br.edu.ifnmg.minimundo.DomainModel.Usuario;
import br.edu.ifnmg.minimundo.Persistence.UsuarioRepositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao Paulo
 */
public class TelaLogin extends javax.swing.JFrame {
    
    
    UsuarioRepositorio repo;
    Usuario filtro;
   
    /**
     * Creates new form Loguin
     */
    public TelaLogin() {
        initComponents();
        repo = new UsuarioRepositorio();
        filtro = new Usuario();
        
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
        senha = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        btnsair = new javax.swing.JButton();
        btnentrar = new javax.swing.JButton();
        imagemcadeado = new javax.swing.JLabel();
        sejabemvindo = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        Fundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        senha.setText("Senha :");
        getContentPane().add(senha);
        senha.setBounds(240, 180, 60, 20);

        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usuario.setText("Usuario :");
        getContentPane().add(usuario);
        usuario.setBounds(230, 130, 70, 20);

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario);
        txtusuario.setBounds(310, 120, 100, 30);

        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair);
        btnsair.setBounds(350, 230, 51, 23);

        btnentrar.setText("Entrar");
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnentrar);
        btnentrar.setBounds(270, 230, 63, 23);

        imagemcadeado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/minimundo/Presentation/Imagens/Chave 2.png"))); // NOI18N
        getContentPane().add(imagemcadeado);
        imagemcadeado.setBounds(0, 20, 240, 320);

        sejabemvindo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sejabemvindo.setText("Seja Bem Vindo");
        sejabemvindo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(sejabemvindo);
        sejabemvindo.setBounds(270, 60, 140, 30);
        getContentPane().add(txtsenha);
        txtsenha.setBounds(310, 180, 100, 30);

        Fundo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/minimundo/Presentation/Imagens/FUNDO.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 450, 350);

        setSize(new java.awt.Dimension(452, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // Fechando a tela
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
              
        
        
        
       //verificar se o campo do Usuario não esta vazio
        if (txtusuario.getText().length() > 0) {
            filtro.setUsuario(txtusuario.getText());
            //verificar se o campo da senha não esta vazia
            if (txtsenha.getPassword().length > 0) {
                String password = new String(this.txtsenha.getPassword());
                filtro.setSenha(password);
                //Verificando se usuario existe
                if (repo.checkAdmin(filtro)) {
                    new CadastraUsuario().setVisible(true);
                    this.dispose();
                }else{
                if (repo.checkLogin(filtro)) {
                    new TelaPrincipal().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Dados Incorretos");
                }
                
                }

            } else {
                JOptionPane.showMessageDialog(null, "Senha invalida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario invalido");
        }


    }//GEN-LAST:event_btnentrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel imagemcadeado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel sejabemvindo;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
