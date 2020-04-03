
package visao;

import com.sun.glass.events.KeyEvent;
import servicos.controlador.ControleLogin;

public class AutenticacaoSistema extends javax.swing.JFrame {

    ControleLogin control = new ControleLogin(); 
    public AutenticacaoSistema() {
        initComponents();
        setSize(748, 481);

    }
    
    public void logon(){

        if(control.verificaUsuario(usuario.getText(),senha.getText())){
            this.dispose();
            new PrincipalBiblioteca().setVisible(true);
        }else{
            usuario.grabFocus();
            info.setText("Usuário ou senha incorreto.");
            senha.selectAll();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        painel2 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 565));
        getContentPane().setLayout(null);

        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioFocusGained(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });
        getContentPane().add(usuario);
        usuario.setBounds(310, 170, 150, 30);

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(245, 175, 50, 20);

        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 220, 50, 14);

        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(info);
        info.setBounds(280, 290, 187, 24);

        senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaKeyPressed(evt);
            }
        });
        getContentPane().add(senha);
        senha.setBounds(310, 210, 150, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_go.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 170, 20, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/key_go.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 210, 30, 30);

        confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        confirm.setText("Entrar");
        confirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmFocusGained(evt);
            }
        });
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        confirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmKeyPressed(evt);
            }
        });
        getContentPane().add(confirm);
        confirm.setBounds(340, 245, 100, 30);

        painel2.setEditable(false);
        painel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                painel2FocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(painel2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(230, 160, 270, 120);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 150, 310, 140);

        setSize(new java.awt.Dimension(764, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        logon();
    }//GEN-LAST:event_confirmActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

    }//GEN-LAST:event_usuarioActionPerformed

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        info.setText("");
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            senha.grabFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            senha.grabFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            confirm.grabFocus();
        }
    }//GEN-LAST:event_usuarioKeyPressed

    private void confirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            logon();
        }else if(evt.getKeyCode() == KeyEvent.VK_UP){
            senha.grabFocus();
        }
    }//GEN-LAST:event_confirmKeyPressed

    private void usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusGained
       
    }//GEN-LAST:event_usuarioFocusGained

    private void senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            confirm.grabFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            usuario.grabFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            confirm.grabFocus();
        }
    }//GEN-LAST:event_senhaKeyPressed

    private void confirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFocusGained
       
    }//GEN-LAST:event_confirmFocusGained

    private void painel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_painel2FocusGained
        usuario.grabFocus();
    }//GEN-LAST:event_painel2FocusGained

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
            java.util.logging.Logger.getLogger(AutenticacaoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutenticacaoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutenticacaoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutenticacaoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutenticacaoSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JEditorPane painel2;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
