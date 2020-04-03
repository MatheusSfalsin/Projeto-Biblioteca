/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Modelo.AlunoDAO;
import Modelo.DevolucaoDAO;
import Negocio.Aluno;
import Negocio.Devolucao;
import Negocio.Itens;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import servicos.controlador.ControleData;
import servicos.controlador.ControleDevolucao;

/**
 *
 * @author 20181TPMI0213
 */
public class TelaDevolucao extends javax.swing.JPanel {

  
    DefaultTableModel tableDev;//variavel que controla a tabela
    Vector info;//variavel que controla as informações da tabela
    ControleDevolucao controlDevolucao = new ControleDevolucao();
    DevolucaoDAO controlDevolucaoDAO = new DevolucaoDAO();
    ControleData controleData = new ControleData();
    DefaultListModel modeloListAluno;
    ArrayList<Aluno> resultPesquisaAluno = new ArrayList<>();
    private AlunoDAO controlAluno = new AlunoDAO();
    
    private Aluno alunoSelecionado = new Aluno();
    private ArrayList<Itens> itensSelecionado = new ArrayList<>();
    private ArrayList<Devolucao> devolucao = new ArrayList<>();
    
    
        
    public TelaDevolucao() {
        initComponents();
        //declara itens na tabela
        tabelaDevolucao.getColumnModel().getColumn(1). setPreferredWidth(100);
        tableDev = (DefaultTableModel) tabelaDevolucao.getModel();
        listaAluno.setVisible(false);
        modeloListAluno = new DefaultListModel();
        listaAluno.setModel(modeloListAluno);
        //tableDev.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       
        //tableDev.getColumnCount(1).setPreferredSize(500);
        //tabelaDevolucao.setEnabled(false);
        //fim itens na tabela
    }
    
    
    
    
    
    public void devolverItens(){
        ArrayList<Devolucao> listDevolucao;
        ArrayList<Itens> bkpItens = new ArrayList<>();
        
        for(int i=0; i <= itensSelecionado.size()-1;i++){
            
            if((boolean) tableDev.getValueAt(i,3) == true){
                bkpItens.add(itensSelecionado.get(i));
            }
        }
        itensSelecionado = bkpItens;
        listDevolucao = controlDevolucao.criaDevolucao(itensSelecionado,alunoSelecionado);
        controlDevolucao.confirmaDevolucao(listDevolucao,itensSelecionado);
        controlDevolucao.updateSituacaoLivro(itensSelecionado);
        
    }
    
    
    public void buscaEmprestimos(){
     
        itensSelecionado.removeAll(itensSelecionado);// Limpa itens que foram pesquisados antes
        
        itensSelecionado = controlDevolucao.selecionaTomador(campoNome.getText(), campoMatricula.getText());
        tableDev.setNumRows(0);
        
        if(itensSelecionado != null){
            
            for(Itens item : itensSelecionado){
                String dataDev = controleData.mostraData(item.getDataPrevistaDevolucao());
                System.out.println(item.getIdItem());
                Object[] dados = {item.getItemLivro().getTitulo(),
                    dataDev , controleData.diasAtrasado(item.getIdItem()), false};
                tableDev.addRow(dados);
                
                
            }
            
            
        }else{
            System.out.println("Itens estão nulos");
        }
    
    }
    
    
    public ArrayList<Aluno> pesquisaNomeAluno(){
        resultPesquisaAluno = new ArrayList<>(); // zera lista de alunos pesquisados
        
        modeloListAluno.removeAllElements(); // retira listagem de alunos anteriores
        ArrayList<Aluno> listaAluno; // lista qye recebera os alunos do resultado do sql e sera usado no FOR
        listaAluno =  controlAluno.buscaPorAluno(campoNome.getText());  /// Metódo que busca nome dos alunos de acordo com o que esta no campo
        for(Aluno aluno: listaAluno){   // ira pegar aluno por aluno na lista e ira adicionar na tela de listagem de alunos 
            modeloListAluno.addElement(aluno.getNome()); // adiona no elemento JList
            resultPesquisaAluno.add(aluno); /// Adiciona na lista de alunos encontrados com descriçãoa atual do campo
        //listaAluno.(listaAluno);
        }
        
        return resultPesquisaAluno;    // retorno do array com os alunos encontrado
        
    }
     public void selecionouBuscaAluno(ArrayList<Aluno> resultPesquisaAluno){   
        
         if(campoNome.getText().equals("") ){
            listaAluno.setVisible(false);
        }else if(resultPesquisaAluno.size() >0){
            listaAluno.setVisible(true);
            
            if(resultPesquisaAluno.get(0).getNome().equals(campoNome.getText())){
                campoMatricula.setText(resultPesquisaAluno.get(0).getMatricula());
                listaAluno.setVisible(false);
                btPesquisar.grabFocus();
            }
            
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaAluno = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDevolucao = new javax.swing.JTable();
        layoutTela = new javax.swing.JLabel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        setLayout(null);

        listaAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
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
        listaAluno.setBounds(135, 100, 270, 120);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");
        add(jLabel1);
        jLabel1.setBounds(90, 75, 50, 17);

        campoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMatriculaActionPerformed(evt);
            }
        });
        campoMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoMatriculaKeyPressed(evt);
            }
        });
        add(campoMatricula);
        campoMatricula.setBounds(470, 70, 100, 30);

        btPesquisar.setText("Pesquisa");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        btPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btPesquisarKeyPressed(evt);
            }
        });
        add(btPesquisar);
        btPesquisar.setBounds(580, 75, 90, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Matricula:");
        add(jLabel2);
        jLabel2.setBounds(410, 75, 60, 17);

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        campoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeKeyPressed(evt);
            }
        });
        add(campoNome);
        campoNome.setBounds(135, 70, 270, 30);

        jLabel3.setText("1000");
        add(jLabel3);
        jLabel3.setBounds(180, 410, 34, 14);

        jLabel4.setText("Total Multa: R$");
        add(jLabel4);
        jLabel4.setBounds(100, 410, 80, 14);

        jLabel5.setText("Data Atual:");
        add(jLabel5);
        jLabel5.setBounds(100, 370, 100, 14);

        jLabel6.setText("Hoje");
        add(jLabel6);
        jLabel6.setBounds(170, 370, 34, 14);

        jButton2.setText("Devolver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(250, 410, 110, 23);

        tabelaDevolucao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data devolução", "Multa", "Devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaDevolucao);

        add(jScrollPane1);
        jScrollPane1.setBounds(132, 120, 510, 210);

        layoutTela.setBackground(new java.awt.Color(255, 255, 255));
        layoutTela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layoutTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Inter2.png"))); // NOI18N
        add(layoutTela);
        layoutTela.setBounds(-20, 0, 790, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void campoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMatriculaActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
       buscaEmprestimos();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //System.out.println();
        int ops = JOptionPane.showConfirmDialog(null,
                                 "A pessoa efetuou o pagamento da multa?", "MULTA",
                                 JOptionPane.YES_NO_OPTION);
        
        System.out.println(ops);//retornar o valor da OPS(sim nao ou cancela)
        info = tableDev.getDataVector();//INFO recebe as informações da tabela
        devolverItens();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeKeyPressed
       
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            campoMatricula.grabFocus();
            //campoMatriculaAluno.setText(aluno.getMatricula());
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            if(listaAluno.isVisible()){
                listaAluno.setVisible(true);
                listaAluno.grabFocus();
            }else{
                campoMatricula.grabFocus();
            }
            
        }
        
        resultPesquisaAluno = pesquisaNomeAluno();// vai receber o resultado do metodo
       selecionouBuscaAluno(resultPesquisaAluno);
    }//GEN-LAST:event_campoNomeKeyPressed

    private void listaAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaAlunoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String nome = (String) modeloListAluno.getElementAt(listaAluno.getSelectedIndex());
            campoNome.setText(nome);
            listaAluno.setVisible(false);

            selecionouBuscaAluno(resultPesquisaAluno);

        }else if(evt.getKeyCode() == KeyEvent.VK_UP){
            if(listaAluno.getSelectedIndex() == 0){
                campoNome.grabFocus();
            }
        }
    }//GEN-LAST:event_listaAlunoKeyPressed

    private void listaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAlunoMouseClicked
        String nome = (String) modeloListAluno.getElementAt(listaAluno.getSelectedIndex());
        campoNome.setText(nome);
        listaAluno.setVisible(false);

        selecionouBuscaAluno(resultPesquisaAluno);
    }//GEN-LAST:event_listaAlunoMouseClicked

    private void listaAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaAlunoFocusGained
        listaAluno.setSelectedIndex(0);
    }//GEN-LAST:event_listaAlunoFocusGained

    private void campoMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMatriculaKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btPesquisar.grabFocus();
       }
    }//GEN-LAST:event_campoMatriculaKeyPressed

    private void btPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btPesquisarKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           buscaEmprestimos();
       }
    }//GEN-LAST:event_btPesquisarKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       campoNome.grabFocus();
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNome;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel layoutTela;
    private javax.swing.JList listaAluno;
    private javax.swing.JTable tabelaDevolucao;
    // End of variables declaration//GEN-END:variables
}
