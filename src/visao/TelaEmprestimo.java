package visao;


import Modelo.AlunoDAO;
import Modelo.LivroDAO;
import Negocio.Aluno;
import Negocio.Emprestimo;
import Negocio.Itens;
import Negocio.Livro;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import servicos.controlador.ControladorEmprestimo;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class TelaEmprestimo extends javax.swing.JPanel {
    private PrincipalBiblioteca refEmprestimo;
    private AlunoDAO controlAluno = new AlunoDAO(); 
    private LivroDAO controlLivro = new LivroDAO(); 
    DefaultListModel modeloListAluno;
    DefaultListModel modeloListLivro;
    ArrayList<Aluno> resultPesquisaAluno = new ArrayList<>(); // cria array que sera colocado os alunos que foi pesquisado
    ArrayList<Livro> resultPesquisaLivro = new ArrayList<>();
    int indice = 0;
    
    public TelaEmprestimo(PrincipalBiblioteca refEmprestimo) {
        initComponents();
        setSize(764,540);
        this.refEmprestimo = refEmprestimo;
        infoEmprestimo.setEditable(false);
        caixaAluno.setSelected(true);
        listaAluno.setVisible(false);
        listaLivro.setVisible(false);
        modeloListAluno = new DefaultListModel();
        modeloListLivro = new DefaultListModel();
        listaAluno.setModel(modeloListAluno);
        listaLivro.setModel(modeloListLivro);
        
        
     }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        listaAluno = new javax.swing.JList();
        listaLivro = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btLimparAluno = new javax.swing.JButton();
        btLimparLivro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoEmprestimo = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btConsultarLivro = new javax.swing.JButton();
        campoMatriculaAluno = new javax.swing.JTextField();
        btSelecionarAluno = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        campoNomeLivro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btCancelarPedido = new javax.swing.JButton();
        btAdicionarLivro = new javax.swing.JButton();
        infoPessoa = new javax.swing.JLabel();
        campoNomeAluno = new javax.swing.JTextField();
        btSolicitarEmprestimo = new javax.swing.JButton();
        infoDataDevolucao = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campoCodigoLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        caixaAluno = new javax.swing.JRadioButton();
        caixaProfessor = new javax.swing.JRadioButton();
        layoutTela = new javax.swing.JLabel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        setLayout(null);

        listaAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        listaAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listaAlunoFocusGained(evt);
            }
        });
        listaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAlunoMouseClicked(evt);
            }
        });
        listaAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaAlunoKeyPressed(evt);
            }
        });
        add(listaAluno);
        listaAluno.setBounds(150, 170, 190, 90);

        listaLivro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        listaLivro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listaLivroFocusGained(evt);
            }
        });
        listaLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaLivroMouseClicked(evt);
            }
        });
        listaLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaLivroKeyPressed(evt);
            }
        });
        add(listaLivro);
        listaLivro.setBounds(460, 170, 190, 90);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Matricula");
        add(jLabel9);
        jLabel9.setBounds(90, 180, 53, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Código");
        add(jLabel13);
        jLabel13.setBounds(400, 180, 43, 17);

        btLimparAluno.setText("Limpar");
        btLimparAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAlunoActionPerformed(evt);
            }
        });
        btLimparAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btLimparAlunoKeyPressed(evt);
            }
        });
        add(btLimparAluno);
        btLimparAluno.setBounds(200, 215, 100, 30);

        btLimparLivro.setText("Limpar");
        btLimparLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btLimparLivroKeyPressed(evt);
            }
        });
        add(btLimparLivro);
        btLimparLivro.setBounds(580, 215, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Nome");
        add(jLabel10);
        jLabel10.setBounds(90, 150, 36, 15);

        infoEmprestimo.setColumns(20);
        infoEmprestimo.setRows(5);
        jScrollPane1.setViewportView(infoEmprestimo);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 260, 550, 127);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Livro");
        add(jLabel6);
        jLabel6.setBounds(420, 90, 61, 22);

        btConsultarLivro.setText("Consultar");
        btConsultarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarLivroActionPerformed(evt);
            }
        });
        btConsultarLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btConsultarLivroKeyPressed(evt);
            }
        });
        add(btConsultarLivro);
        btConsultarLivro.setBounds(490, 215, 90, 30);

        campoMatriculaAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoMatriculaAlunoKeyPressed(evt);
            }
        });
        add(campoMatriculaAluno);
        campoMatriculaAluno.setBounds(150, 175, 86, 30);

        btSelecionarAluno.setText("Selecionar");
        btSelecionarAluno.setMinimumSize(new java.awt.Dimension(63, 23));
        btSelecionarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarAlunoActionPerformed(evt);
            }
        });
        btSelecionarAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btSelecionarAlunoKeyPressed(evt);
            }
        });
        add(btSelecionarAluno);
        btSelecionarAluno.setBounds(110, 215, 90, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nome");
        add(jLabel11);
        jLabel11.setBounds(400, 150, 43, 15);

        campoNomeLivro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        campoNomeLivro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeLivroFocusGained(evt);
            }
        });
        campoNomeLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeLivroKeyPressed(evt);
            }
        });
        add(campoNomeLivro);
        campoNomeLivro.setBounds(460, 140, 190, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user1.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(5, 14));
        add(jLabel5);
        jLabel5.setBounds(240, 50, 91, 84);

        btCancelarPedido.setText("Cancelar Pedido");
        btCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarPedidoActionPerformed(evt);
            }
        });
        btCancelarPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btCancelarPedidoKeyPressed(evt);
            }
        });
        add(btCancelarPedido);
        btCancelarPedido.setBounds(510, 400, 130, 30);

        btAdicionarLivro.setText("Adicionar");
        btAdicionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarLivroActionPerformed(evt);
            }
        });
        btAdicionarLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btAdicionarLivroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btAdicionarLivroKeyReleased(evt);
            }
        });
        add(btAdicionarLivro);
        btAdicionarLivro.setBounds(400, 215, 90, 30);

        infoPessoa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        infoPessoa.setText("Aluno");
        add(infoPessoa);
        infoPessoa.setBounds(100, 100, 120, 14);

        campoNomeAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        campoNomeAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNomeAlunoFocusLost(evt);
            }
        });
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
        campoNomeAluno.setBounds(150, 140, 190, 30);

        btSolicitarEmprestimo.setText("Solicitar Empréstimo");
        btSolicitarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSolicitarEmprestimoActionPerformed(evt);
            }
        });
        btSolicitarEmprestimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btSolicitarEmprestimoKeyPressed(evt);
            }
        });
        add(btSolicitarEmprestimo);
        btSolicitarEmprestimo.setBounds(340, 400, 150, 30);

        infoDataDevolucao.setBackground(new java.awt.Color(255, 255, 255));
        add(infoDataDevolucao);
        infoDataDevolucao.setBounds(180, 400, 70, 30);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/livro1.png"))); // NOI18N
        add(jLabel14);
        jLabel14.setBounds(510, 50, 83, 84);

        campoCodigoLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoCodigoLivroKeyPressed(evt);
            }
        });
        add(campoCodigoLivro);
        campoCodigoLivro.setBounds(460, 175, 84, 30);

        jLabel2.setText("Data Devolução:");
        add(jLabel2);
        jLabel2.setBounds(80, 400, 90, 30);

        jLabel4.setText("Professor");
        add(jLabel4);
        jLabel4.setBounds(130, 70, 60, 14);

        jLabel7.setText("Aluno");
        add(jLabel7);
        jLabel7.setBounds(80, 70, 40, 14);

        grupo1.add(caixaAluno);
        caixaAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        caixaAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caixaAlunoFocusGained(evt);
            }
        });
        caixaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaAlunoActionPerformed(evt);
            }
        });
        add(caixaAluno);
        caixaAluno.setBounds(80, 50, 20, 21);

        grupo1.add(caixaProfessor);
        caixaProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caixaProfessorFocusGained(evt);
            }
        });
        caixaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaProfessorActionPerformed(evt);
            }
        });
        add(caixaProfessor);
        caixaProfessor.setBounds(130, 50, 20, 21);

        layoutTela.setBackground(new java.awt.Color(255, 255, 255));
        layoutTela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layoutTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Inter2.png"))); // NOI18N
        add(layoutTela);
        layoutTela.setBounds(-20, 0, 790, 480);
    }// </editor-fold>//GEN-END:initComponents
    
    int tipoTomador;
    ControladorEmprestimo controleEmprestimo = new ControladorEmprestimo();
    LivroDAO controleLivro = new LivroDAO();
    
    public void selecionaPessoa(){ 
        //aluno = objControle.retornaAluno(campoNomeAluno.getText
        Aluno retornoAluno;
        tipoTomador = (caixaAluno.isSelected() == true? 1:2);
        
        retornoAluno =controleEmprestimo.selecionaTomador(campoNomeAluno.getText(),
                campoMatriculaAluno.getText(),tipoTomador);     

        if(retornoAluno != null){
            infoEmprestimo.setText("Aluno selecionado:\n");
            infoEmprestimo.setText(infoEmprestimo.getText()+"\nNome: "
                    + retornoAluno.getNome());            
            infoEmprestimo.setText(infoEmprestimo.getText()+"\nMatricula: "
                    + retornoAluno.getMatricula());

            if(retornoAluno.getSituacao()){
                infoEmprestimo.setText(infoEmprestimo.getText()
                        +"\nSituação regular, selecione os livros: ");
                campoNomeLivro.grabFocus();
                campoNomeAluno.setEnabled(false);
                campoMatriculaAluno.setEnabled(false);
                btLimparAluno.setEnabled(false);
                btSelecionarAluno.setEnabled(false);
            } else {
                infoEmprestimo.setText(infoEmprestimo.getText()
                        +"\nSituação Irregular, por favor "
                        + "peça ao tomador que devolva para efetuar um emprestimo.");
                JOptionPane.showMessageDialog(null,"Aluno em situação irregular, peça que o mesmo devolva livros em atraso.","Situação irregular!",
                    JOptionPane.ERROR_MESSAGE);
                campoNomeAluno.grabFocus();
                campoNomeAluno.selectAll();
            }
            
        }else{
            infoEmprestimo.setText(infoEmprestimo.getText()+"Aluno não existe");
            JOptionPane.showMessageDialog(null,"Aluno informado não existe.","Dado inválido!",
                    JOptionPane.ERROR_MESSAGE);
            campoNomeAluno.grabFocus();
            campoNomeAluno.selectAll();
        }
        
        
    }
    
    public void selecionaLivro(){
        Livro retornoLivro;
        try{
            retornoLivro =controleEmprestimo.selecionaLivro(campoNomeLivro.getText(),
                    Integer.parseInt(campoCodigoLivro.getText()));
            
            if(retornoLivro!= null){
            infoEmprestimo.setText(infoEmprestimo.getText()+"\nLivro selecionado:\n");
            infoEmprestimo.setText(infoEmprestimo.getText()+"\nTitulo: "+retornoLivro.getTitulo());
            infoEmprestimo.setText(infoEmprestimo.getText()+"\nCodigo Livro: "+retornoLivro.getIdLivro());

                if(retornoLivro.getSituacao()){
                    infoEmprestimo.setText(infoEmprestimo.getText()+"\nLivro Disponível, adicionado com sucesso. \n");
                    JOptionPane.showMessageDialog(null,"Livro selecionado: \nTitulo: " +retornoLivro.getTitulo()+"\n"
                        + "Codigo Livro: "+retornoLivro.getIdLivro()+".","Livro selecionado!",
                        JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    infoEmprestimo.setText(infoEmprestimo.getText()+"\nLivro Indisponível,"
                            + " selecione outro ou cancele o empréstimo.\n");
                    JOptionPane.showMessageDialog(null, "Livro Indisponível!Selecione outro ou cancele o empréstimo.",
                            "Livro Indisponível",JOptionPane.WARNING_MESSAGE);
                }

            }else{
                infoEmprestimo.setText(infoEmprestimo.getText()+"\nLivro já selecionado ou não cadastrado. Tente novamente:");
                JOptionPane.showMessageDialog(null, "Livro já selecionado ou não cadastrado. Tente novamente!.",
                            "Livro não cadastrado",JOptionPane.WARNING_MESSAGE);
            }

            campoNomeLivro.grabFocus();
            campoNomeLivro.selectAll();
        
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Código do livro deve ser numérico!");
        }   
        
       
    }
    
    
    public void solicitaEmprestimo(){
        
       Emprestimo retornoEmprestimo = controleEmprestimo.solicitaEmprestimo();
       if(retornoEmprestimo != null){
            String mensagem = "\n";
           for(Itens item : retornoEmprestimo.getListaDeItens()){
                mensagem = mensagem+item.getItemLivro().getTitulo()+"\n";
           }
           JOptionPane.showMessageDialog(null, "Empréstimo solicitado com sucesso!"
                   + " Livros Solicitados: "+mensagem,"Empréstimo Finalizado!",
                   JOptionPane.INFORMATION_MESSAGE);
           limpaCampos();
       }else{
            JOptionPane.showMessageDialog(null, "Erro ao solicitar empréstimo!"
                   ,"Erro!",
                   JOptionPane.ERROR_MESSAGE);
       }
    }
    
    public void consultaLivro(){
        
        try{
            Livro livro = controleLivro.consultaLivro(campoNomeLivro.getText(),
                            Integer.parseInt(campoCodigoLivro.getText()));
            if(livro != null){
                JOptionPane.showMessageDialog(null, "O Livro "+livro.getTitulo()
                        +" Encontra-se na prateleira: " +livro.getPrateleira(),
                        "Resultado Consulta",JOptionPane.INFORMATION_MESSAGE);
            }
         }catch(NumberFormatException | HeadlessException erro){
            JOptionPane.showMessageDialog(null, "Código do livro deve ser numérico!");
        }   
    }
    
    
    
    public void limpaCampos(){
        campoNomeAluno.setText("");
        campoMatriculaAluno.setText("");
        campoNomeLivro.setText("");
        campoCodigoLivro.setText("");
        infoEmprestimo.setText("");
        campoNomeAluno.setEnabled(true);
        campoNomeAluno.grabFocus();
        campoMatriculaAluno.setEnabled(true);
        btLimparAluno.setEnabled(true);
        btSelecionarAluno.setEnabled(true);
    }
    
    public ArrayList<Aluno> pesquisaNomeAluno(){
        resultPesquisaAluno = new ArrayList<>(); // zera lista de alunos pesquisados
        
        modeloListAluno.removeAllElements(); // retira listagem de alunos anteriores
        ArrayList<Aluno> listaAluno; // lista qye recebera os alunos do resultado do sql e sera usado no FOR
        listaAluno =  controlAluno.buscaPorAluno(campoNomeAluno.getText());  /// Metódo que busca nome dos alunos de acordo com o que esta no campo
        for(Aluno aluno: listaAluno){   // ira pegar aluno por aluno na lista e ira adicionar na tela de listagem de alunos 
            modeloListAluno.addElement(aluno.getNome()); // adiona no elemento JList
            resultPesquisaAluno.add(aluno); /// Adiciona na lista de alunos encontrados com descriçãoa atual do campo
        //listaAluno.(listaAluno);
        }
        
        return resultPesquisaAluno;    // retorno do array com os alunos encontrado
        
    }
    
    public void selecionouBuscaAluno(ArrayList<Aluno> resultPesquisaAluno){   
        
         if(campoNomeAluno.getText().equals("") ){
            listaAluno.setVisible(false);
        }else if(resultPesquisaAluno.size() >0){
            listaAluno.setVisible(true);
            
            if(resultPesquisaAluno.get(0).getNome().equals(campoNomeAluno.getText())){
                campoMatriculaAluno.setText(resultPesquisaAluno.get(0).getMatricula());
                listaAluno.setVisible(false);
            }
        }
    }
    
     public void selecionouBuscaLivro(ArrayList<Livro> resultPesquisaLivro){   
        
         if(campoNomeLivro.getText().equals("") ){
            listaLivro.setVisible(false);
        }else if(resultPesquisaLivro.size() >0){
            listaLivro.setVisible(true);
            
            if(resultPesquisaLivro.get(0).getTitulo().equals(campoNomeLivro.getText())){
                campoCodigoLivro.setText(Integer.toString(resultPesquisaLivro.get(0).getIdLivro()-1));
                listaLivro.setVisible(false);
                campoNomeLivro.grabFocus();
            }
        }
    }
     
     
    public ArrayList<Livro> pesquisaNomeLivro(){
        resultPesquisaLivro = new ArrayList<>(); // zera lista de alunos pesquisados
        
        modeloListLivro.removeAllElements(); // retira listagem de alunos anteriores
        ArrayList<Livro> listaLivro; // lista qye recebera os alunos do resultado do sql e sera usado no FOR
        listaLivro =  controlLivro.buscaPorLivro(campoNomeLivro.getText());  /// Metódo que busca nome dos alunos de acordo com o que esta no campo
        for(Livro livro: listaLivro){   // ira pegar aluno por aluno na lista e ira adicionar na tela de listagem de alunos 
            modeloListLivro.addElement(livro.getTitulo()); // adiona no elemento JList
            resultPesquisaLivro.add(livro); /// Adiciona na lista de alunos encontrados com descriçãoa atual do campo
        //listaAluno.(listaAluno);
        }
        
        return resultPesquisaLivro;    // retorno do array com os Livros encontrado
        
    }
     
    
    private void btSelecionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarAlunoActionPerformed
        selecionaPessoa();
        campoNomeLivro.grabFocus();
       
    }//GEN-LAST:event_btSelecionarAlunoActionPerformed

    private void campoNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeAlunoActionPerformed

    private void btSolicitarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSolicitarEmprestimoActionPerformed
        
        solicitaEmprestimo();
    }//GEN-LAST:event_btSolicitarEmprestimoActionPerformed

    private void btCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarPedidoActionPerformed
       controleEmprestimo.cancelaEmprestimo();
       limpaCampos();
       
        
    }//GEN-LAST:event_btCancelarPedidoActionPerformed
    
    
    
    
    //Ação do teclado
    private void campoNomeAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeAlunoKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoMatriculaAluno.grabFocus();
            //campoMatriculaAluno.setText(aluno.getMatricula());
        }
        
        else if(evt.getKeyCode() == 40){
            if(listaAluno.isVisible()){
                System.out.println("1");
                listaAluno.setVisible(true);
                listaAluno.grabFocus();
            }else{
                campoMatriculaAluno.grabFocus();
            }
            
        }
          
       //objControle.procuraPessoa();
        resultPesquisaAluno = pesquisaNomeAluno();// vai receber o resultado do metodo
        selecionouBuscaAluno(resultPesquisaAluno);
       
        
    }//GEN-LAST:event_campoNomeAlunoKeyPressed

    private void campoMatriculaAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMatriculaAlunoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btSelecionarAluno.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoNomeAluno.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btSelecionarAluno.grabFocus();
        }
    }//GEN-LAST:event_campoMatriculaAlunoKeyPressed

    private void btSelecionarAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btSelecionarAlunoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            // Ira charmar metodo de busca do aluno
            selecionaPessoa();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoMatriculaAluno.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            btLimparAluno.grabFocus();
        }
    }//GEN-LAST:event_btSelecionarAlunoKeyPressed

    private void btLimparAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btLimparAlunoKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            btSelecionarAluno.grabFocus();
        }
    }//GEN-LAST:event_btLimparAlunoKeyPressed

    private void campoNomeLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeLivroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoCodigoLivro.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            if(listaLivro.isVisible()){
                System.out.println("aqui");
                listaLivro.setVisible(true);
                listaLivro.grabFocus();
            }else{
                campoCodigoLivro.grabFocus();
            }
        }
        resultPesquisaLivro = pesquisaNomeLivro();
         selecionouBuscaLivro(resultPesquisaLivro);
        //objControle.procuraLivro();    
    }//GEN-LAST:event_campoNomeLivroKeyPressed

    private void campoCodigoLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCodigoLivroKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAdicionarLivro.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btAdicionarLivro.grabFocus();
            
        }else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoNomeLivro.grabFocus();
        }
            
    }//GEN-LAST:event_campoCodigoLivroKeyPressed

    private void btAdicionarLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btAdicionarLivroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoCodigoLivro.grabFocus();
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            btConsultarLivro.grabFocus();
            
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btSolicitarEmprestimo.grabFocus();
            
        }else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           selecionaLivro();
        }
    }//GEN-LAST:event_btAdicionarLivroKeyPressed

    private void btConsultarLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btConsultarLivroKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            btLimparLivro.grabFocus();
        }
        
         else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoCodigoLivro.grabFocus();
            
        }else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            btAdicionarLivro.grabFocus();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btSolicitarEmprestimo.grabFocus();
            
        }else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             consultaLivro();
        }
    }//GEN-LAST:event_btConsultarLivroKeyPressed

    private void btLimparLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btLimparLivroKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            btConsultarLivro.grabFocus();
        }
         else if(evt.getKeyCode() == KeyEvent.VK_UP){
            campoCodigoLivro.grabFocus();
        }
         else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btSolicitarEmprestimo.grabFocus();
        }
    }//GEN-LAST:event_btLimparLivroKeyPressed

    private void btSolicitarEmprestimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btSolicitarEmprestimoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            btCancelarPedido.grabFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            solicitaEmprestimo();
        
        }else if(evt.getKeyCode() == KeyEvent.VK_UP){
            btAdicionarLivro.grabFocus();
            
         }    }//GEN-LAST:event_btSolicitarEmprestimoKeyPressed

    private void btCancelarPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btCancelarPedidoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_LEFT){
             btSolicitarEmprestimo.grabFocus();
        }
         else if(evt.getKeyCode() == KeyEvent.VK_UP){
            btAdicionarLivro.grabFocus();
            
         }else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             controleEmprestimo.cancelaEmprestimo();
             limpaCampos();
         }
             
    }//GEN-LAST:event_btCancelarPedidoKeyPressed

    private void btAdicionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarLivroActionPerformed
        //Sera buscado o livro e adcionado em livro para ir como parametro
        //itens.adicionaLivro(livro);
        //Livro livro1 = objControle.retornaLivro(campoNomeLivro.getText());
        selecionaLivro();
        
        
    }//GEN-LAST:event_btAdicionarLivroActionPerformed

    private void caixaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaProfessorActionPerformed
        infoPessoa.setText("Professor");
    }//GEN-LAST:event_caixaProfessorActionPerformed

    private void caixaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaAlunoActionPerformed
        // TODO add your handling code here:
        infoPessoa.setText("Aluno");
    }//GEN-LAST:event_caixaAlunoActionPerformed

    private void caixaAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caixaAlunoFocusGained
        campoNomeAluno.grabFocus();
    }//GEN-LAST:event_caixaAlunoFocusGained

    private void caixaProfessorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caixaProfessorFocusGained
        campoNomeAluno.grabFocus();
    }//GEN-LAST:event_caixaProfessorFocusGained

    private void btAdicionarLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btAdicionarLivroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btAdicionarLivroKeyReleased

    private void btLimparAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAlunoActionPerformed
        
    }//GEN-LAST:event_btLimparAlunoActionPerformed

    private void btConsultarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarLivroActionPerformed
         consultaLivro();
    }//GEN-LAST:event_btConsultarLivroActionPerformed

    private void listaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAlunoMouseClicked
        System.out.println("teste");
        String nome = (String) modeloListAluno.getElementAt(listaAluno.getSelectedIndex());
        campoNomeAluno.setText(nome);
        listaAluno.setVisible(false);
        
        selecionouBuscaAluno(resultPesquisaAluno);
             
    }//GEN-LAST:event_listaAlunoMouseClicked

    private void listaAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaAlunoFocusGained
        listaAluno.setSelectedIndex(0);
    }//GEN-LAST:event_listaAlunoFocusGained

    private void listaAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaAlunoKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             String nome = (String) modeloListAluno.getElementAt(listaAluno.getSelectedIndex());
             campoNomeAluno.setText(nome);
             listaAluno.setVisible(false);
             
             selecionouBuscaAluno(resultPesquisaAluno);
             
         }else if(evt.getKeyCode() == KeyEvent.VK_UP){
            if(listaAluno.getSelectedIndex() == 0){
                campoNomeAluno.grabFocus();
            }
        }
    }//GEN-LAST:event_listaAlunoKeyPressed

    private void campoNomeAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeAlunoFocusGained
        pesquisaNomeAluno();
    }//GEN-LAST:event_campoNomeAlunoFocusGained

    private void campoNomeAlunoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeAlunoFocusLost

        //1
        //listaAluno.setVisible(false);
    }//GEN-LAST:event_campoNomeAlunoFocusLost

    private void listaLivroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaLivroFocusGained
       listaLivro.setSelectedIndex(0);
    }//GEN-LAST:event_listaLivroFocusGained

    private void listaLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaLivroMouseClicked

       String nome = (String) modeloListLivro.getElementAt(listaLivro.getSelectedIndex());
        campoNomeLivro.setText(nome);
        listaLivro.setVisible(false);
             
        selecionouBuscaLivro(resultPesquisaLivro);
    }//GEN-LAST:event_listaLivroMouseClicked

    private void listaLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaLivroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             String nome = (String) modeloListLivro.getElementAt(listaLivro.getSelectedIndex());
             campoNomeLivro.setText(nome);
             listaLivro.setVisible(false);
             System.out.println("fs");
             selecionouBuscaLivro(resultPesquisaLivro);
             
         }else if(evt.getKeyCode() == KeyEvent.VK_UP){
            if(listaLivro.getSelectedIndex() == 0){
                campoNomeLivro.grabFocus();
            }
        }
    }//GEN-LAST:event_listaLivroKeyPressed

    private void campoNomeLivroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeLivroFocusGained
         pesquisaNomeLivro();
    }//GEN-LAST:event_campoNomeLivroFocusGained

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        campoNomeAluno.grabFocus();
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarLivro;
    private javax.swing.JButton btCancelarPedido;
    private javax.swing.JButton btConsultarLivro;
    private javax.swing.JButton btLimparAluno;
    private javax.swing.JButton btLimparLivro;
    private javax.swing.JButton btSelecionarAluno;
    private javax.swing.JButton btSolicitarEmprestimo;
    private javax.swing.JRadioButton caixaAluno;
    private javax.swing.JRadioButton caixaProfessor;
    private javax.swing.JTextField campoCodigoLivro;
    private javax.swing.JTextField campoMatriculaAluno;
    private javax.swing.JTextField campoNomeAluno;
    private javax.swing.JTextField campoNomeLivro;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel infoDataDevolucao;
    private javax.swing.JTextArea infoEmprestimo;
    private javax.swing.JLabel infoPessoa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel layoutTela;
    private javax.swing.JList listaAluno;
    private javax.swing.JList listaLivro;
    // End of variables declaration//GEN-END:variables
}
