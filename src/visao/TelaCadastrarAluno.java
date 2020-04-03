package visao;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Modelo.AlunoDAO;


public class TelaCadastrarAluno extends javax.swing.JPanel {
    
    boolean verifica;
     
    
    private PrincipalBiblioteca refPrincipal;
   AlunoDAO objVerificador = new AlunoDAO();
    
    
    
    public TelaCadastrarAluno(PrincipalBiblioteca refPrincipal) {
        initComponents();
        this.refPrincipal = refPrincipal;  
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoAno = new javax.swing.JTextField();
        campoMatriculaAluno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoTurno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoNomeAluno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        infoCadastroAluno = new javax.swing.JLabel();
        layoutTela = new javax.swing.JLabel();

        setLayout(null);

        campoAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoAnoKeyPressed(evt);
            }
        });
        add(campoAno);
        campoAno.setBounds(180, 210, 350, 30);

        campoMatriculaAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoMatriculaAlunoFocusGained(evt);
            }
        });
        campoMatriculaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMatriculaAlunoActionPerformed(evt);
            }
        });
        campoMatriculaAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoMatriculaAlunoKeyPressed(evt);
            }
        });
        add(campoMatriculaAluno);
        campoMatriculaAluno.setBounds(180, 130, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Matricula:");
        add(jLabel1);
        jLabel1.setBounds(100, 135, 67, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ano:");
        add(jLabel2);
        jLabel2.setBounds(100, 215, 40, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Curso:");
        add(jLabel3);
        jLabel3.setBounds(100, 175, 46, 20);

        campoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCursoActionPerformed(evt);
            }
        });
        campoCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoCursoKeyPressed(evt);
            }
        });
        add(campoCurso);
        campoCurso.setBounds(180, 170, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Turno:");
        add(jLabel4);
        jLabel4.setBounds(100, 255, 47, 17);

        campoTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTurnoActionPerformed(evt);
            }
        });
        campoTurno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTurnoKeyPressed(evt);
            }
        });
        add(campoTurno);
        campoTurno.setBounds(180, 250, 350, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefone:");
        add(jLabel5);
        jLabel5.setBounds(100, 335, 70, 17);

        campoEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoEnderecoKeyPressed(evt);
            }
        });
        add(campoEndereco);
        campoEndereco.setBounds(180, 290, 350, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("E-mail:");
        add(jLabel6);
        jLabel6.setBounds(100, 375, 47, 17);

        campoTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTelefoneKeyPressed(evt);
            }
        });
        add(campoTelefone);
        campoTelefone.setBounds(180, 330, 350, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Endereço:");
        add(jLabel7);
        jLabel7.setBounds(100, 295, 80, 20);

        campoEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoEmailKeyPressed(evt);
            }
        });
        add(campoEmail);
        campoEmail.setBounds(180, 370, 350, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(110, 300, 0, 0);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nome:");
        add(jLabel9);
        jLabel9.setBounds(100, 95, 50, 17);

        campoNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeAlunoActionPerformed(evt);
            }
        });
        campoNomeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeAlunoKeyPressed(evt);
            }
        });
        add(campoNomeAluno);
        campoNomeAluno.setBounds(180, 90, 350, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setText("Cadastro De Aluno");
        add(jLabel10);
        jLabel10.setBounds(270, 50, 230, 30);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user1.png"))); // NOI18N
        add(jLabel14);
        jLabel14.setBounds(560, 150, 100, 110);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        btCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btCancelarKeyPressed(evt);
            }
        });
        add(btCancelar);
        btCancelar.setBounds(420, 410, 110, 30);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        btCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btCadastrarKeyPressed(evt);
            }
        });
        add(btCadastrar);
        btCadastrar.setBounds(190, 410, 100, 30);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        btLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btLimparKeyPressed(evt);
            }
        });
        add(btLimpar);
        btLimpar.setBounds(300, 410, 110, 30);
        add(infoCadastroAluno);
        infoCadastroAluno.setBounds(570, 250, 110, 30);

        layoutTela.setBackground(new java.awt.Color(255, 255, 255));
        layoutTela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layoutTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Inter2.png"))); // NOI18N
        add(layoutTela);
        layoutTela.setBounds(-20, 0, 790, 480);
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpaCampos(){
        campoNomeAluno.setText("");
        campoMatriculaAluno.setText("");
        campoCurso.setText("");
        campoAno.setText("");
        campoTurno.setText("");
        campoEndereco.setText("");
        campoTelefone.setText("");
        campoEmail.setText("");
    }
    
    
    public void criaAluno(){
        
        try{
      
            objVerificador.controleCadastroDeAluno(campoNomeAluno.getText(),
                campoMatriculaAluno.getText(), campoCurso.getText(),
                Integer.parseInt(campoAno.getText()), campoTurno.getText(),
                campoEndereco.getText(), campoTelefone.getText(),
                campoEmail.getText());

       
            
            
            
            if(objVerificador.getAluno() != null){
                infoCadastroAluno.setText("Aluno cadastrado");
                
                //DEVERA SER CHAMADO UM METODO PARA IMPORTAR ALUNO E ESVAZIAR A VARIAVEL ATUAL 
                objVerificador.setAluno(null);
                limpaCampos();   
            }else{
                 
                infoCadastroAluno.setText("Dados Inválidos.");
            }
        
        
        
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Existe informações invalidas.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            infoCadastroAluno.setText("Dados Inválidos.");
        }finally{
               
        }
    }
    
    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
       criaAluno();

                
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limpaCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void campoMatriculaAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoMatriculaAlunoFocusGained
     
       
    }//GEN-LAST:event_campoMatriculaAlunoFocusGained

    private void campoNomeAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeAlunoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoMatriculaAluno.grabFocus();
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            campoMatriculaAluno.grabFocus();
        }
        
       
        
    }//GEN-LAST:event_campoNomeAlunoKeyPressed

    private void campoTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTurnoActionPerformed

    private void campoMatriculaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMatriculaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMatriculaAlunoActionPerformed

    private void campoMatriculaAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMatriculaAlunoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoCurso.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            campoCurso.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoNomeAluno.grabFocus();
        }
        

    }//GEN-LAST:event_campoMatriculaAlunoKeyPressed

    private void campoNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeAlunoActionPerformed

    private void campoCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCursoKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoAno.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            campoAno.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoMatriculaAluno.grabFocus();
        }
    }//GEN-LAST:event_campoCursoKeyPressed

    private void campoAnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoAnoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoTurno.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            campoTurno.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoCurso.grabFocus();
        }
    }//GEN-LAST:event_campoAnoKeyPressed

    private void campoTurnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTurnoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoEndereco.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            campoEndereco.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoAno.grabFocus();
        }
    }//GEN-LAST:event_campoTurnoKeyPressed

    private void campoEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEnderecoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoTelefone.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            campoTelefone.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoTurno.grabFocus();
        }
    }//GEN-LAST:event_campoEnderecoKeyPressed

    private void campoTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTelefoneKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoEmail.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            campoEmail.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoEndereco.grabFocus();
        }
    }//GEN-LAST:event_campoTelefoneKeyPressed

    private void campoEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEmailKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             btCadastrar.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btCadastrar.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoTelefone.grabFocus();
        }
    }//GEN-LAST:event_campoEmailKeyPressed

    private void btCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btCadastrarKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             criaAluno();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            btLimpar.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoEmail.grabFocus();
        }
    }//GEN-LAST:event_btCadastrarKeyPressed

    private void btLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btLimparKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              //
        }
        
       else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            btCadastrar.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            btCancelar.grabFocus();
        }
    }//GEN-LAST:event_btLimparKeyPressed

    private void btCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btCancelarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              //
        }
        
       else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            btLimpar.grabFocus();
        }
    }//GEN-LAST:event_btCancelarKeyPressed

    private void campoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JTextField campoAno;
    private javax.swing.JTextField campoCurso;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoMatriculaAluno;
    private javax.swing.JTextField campoNomeAluno;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JTextField campoTurno;
    private javax.swing.JLabel infoCadastroAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel layoutTela;
    // End of variables declaration//GEN-END:variables
}
