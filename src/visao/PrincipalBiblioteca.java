package visao;


public class PrincipalBiblioteca extends javax.swing.JFrame {
    
    private void setVisibilidadeDeTelas(){ // Fução para deixar visivel as telas
        if (emprestimoLivro != null){
            emprestimoLivro.setVisible(false);
        }
        
        if (cadastrarLivro != null){
            cadastrarLivro.setVisible(false);
        }
        
        if (cadastrarAluno != null){
            cadastrarAluno.setVisible(false);
        }  
        
        if(editarLivro != null){
            editarLivro.setVisible(false);
        }
        if(devolucao != null){
            devolucao.setVisible(false);
        }
            
    }
    
    private void telaDeEmprestimo(){
         if (emprestimoLivro == null) {
            emprestimoLivro = new TelaEmprestimo (this);
            this.add(emprestimoLivro);
            
            emprestimoLivro.setVisible (true);
            emprestimoLivro.setBounds(0,0,750,550);
            
        }else {
           emprestimoLivro.setVisible (true);
          
        }
        emprestimoLivro.grabFocus();
    }
    
    public void TelaLogin(){
        
        if(login == null){
            login = new AutenticacaoSistema();
            login.setVisible (true);
            System.out.println("oi1");
        }else{
            login.setVisible(false);
            System.out.println("oi2");
        }
        
    }
    
    //Declaração das Telas anexas a tela principal
    private TelaCadastrarLivro cadastrarLivro = null;
    private TelaEmprestimo emprestimoLivro = null;
    private TelaCadastrarAluno cadastrarAluno = null;
    private TelaEditarLivro editarLivro = null;
    private AutenticacaoSistema login = null; 
    private TelaDevolucao devolucao = null;
    
    //Construtor da tela Principal
    public PrincipalBiblioteca() {
        initComponents();
        setSize(754,535);
        telaDeEmprestimo();
        //TelaLogin();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        btEmprestimo = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        btCadastrarAluno = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 565));
        getContentPane().setLayout(null);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(426, 25));

        btEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        btEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_go.png"))); // NOI18N
        btEmprestimo.setText("Empréstimo");
        btEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEmprestimoMouseClicked(evt);
            }
        });
        jMenuBar1.add(btEmprestimo);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_next.png"))); // NOI18N
        jMenu3.setText("Devolução");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        jMenu1.setText("Alunos");

        btCadastrarAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        btCadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        btCadastrarAluno.setText("Cadastrar Aluno");
        btCadastrarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarAlunoMouseClicked(evt);
            }
        });
        btCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(btCadastrarAluno);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_edit.png"))); // NOI18N
        jMenuItem2.setText("Editar Aluno");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N
        jMenu2.setText("Livros");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_add.png"))); // NOI18N
        jMenuItem3.setText("Cadastrar Livro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_edit.png"))); // NOI18N
        jMenuItem5.setText("Editar Livro");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group.png"))); // NOI18N
        jMenu4.setText("Funcionários");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_add.png"))); // NOI18N
        jMenuItem4.setText("Cadastrar Funcionário");
        jMenu4.add(jMenuItem4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_edit.png"))); // NOI18N
        jMenuItem6.setText("Editar Funcionário");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(764, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        setVisibilidadeDeTelas(); // Deixa invisivel as telas que não estão sendo usadas
        
        if(cadastrarLivro == null){
            cadastrarLivro = new TelaCadastrarLivro(this);
            this.add(cadastrarLivro);
            
            cadastrarLivro.setVisible(true);
            cadastrarLivro.setBounds(0,0,750,550);
        }else{
            cadastrarLivro.setVisible(true);
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEmprestimoMouseClicked
        setVisibilidadeDeTelas(); // Deixa invisivel as telas que não estão sendo usadas
         telaDeEmprestimo();
       
    }//GEN-LAST:event_btEmprestimoMouseClicked

    private void btCadastrarAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarAlunoMouseClicked

    }//GEN-LAST:event_btCadastrarAlunoMouseClicked

    private void btCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarAlunoActionPerformed
        setVisibilidadeDeTelas(); // Deixa invisivel as telas que não estão sendo usadas
        
        if(cadastrarAluno == null){
            cadastrarAluno = new TelaCadastrarAluno(this);
            this.add(cadastrarAluno);
            cadastrarAluno.setVisible(true);
            cadastrarAluno.setBounds(0,0,750,550);
        }else{
            cadastrarAluno.setVisible (true);
        }
    }//GEN-LAST:event_btCadastrarAlunoActionPerformed

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked

    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        setVisibilidadeDeTelas();
        
        if(editarLivro == null){
           editarLivro = new TelaEditarLivro(this);
            this.add(editarLivro);
            editarLivro.setVisible(true);
            editarLivro.setBounds(0,0,750,550);  
        }else{
            editarLivro.setVisible (true);
        }
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
       
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
         
        setVisibilidadeDeTelas();
        if(devolucao == null){
           devolucao = new TelaDevolucao();
           this.add(devolucao);
           
           devolucao.setBounds(0, 0, 750, 480);
           
           devolucao.setVisible(true);
        }else{
            devolucao.setVisible(true);
        }
        
        devolucao.grabFocus();
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutenticacaoSistema().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btCadastrarAluno;
    private javax.swing.JMenu btEmprestimo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
