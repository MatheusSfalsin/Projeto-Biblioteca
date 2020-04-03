/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos.controlador;
import Negocio.*;
import Modelo.DevolucaoDAO;
import Modelo.ItemDAO;
import Modelo.LivroDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControleDevolucao {
    ControleCadastro controleCadastro = new ControleCadastro();
    DevolucaoDAO devolucaoDAO = new DevolucaoDAO();
    ItemDAO itensDAO = new ItemDAO(); 
    LivroDAO livroDAO = new LivroDAO();
    
    
    public boolean verificaCampos(String nome, String matricula){
        return controleCadastro.controleNome(nome) && controleCadastro.controleCod(matricula);
    }
    
    
     public ArrayList<Devolucao> criaDevolucao(ArrayList<Itens> itens, Aluno aluno){
         ArrayList<Devolucao> listDevolucao = new ArrayList<>();
         
         for(Itens item: itens){
            listDevolucao.add(devolucaoDAO.criaDevolucao(item, aluno));
            
         }
         return listDevolucao;
     }
    
    
    
    
    public ArrayList<Itens> selecionaTomador(String nomeTomador,String matricula){
        Aluno retornoAluno = null;
        ArrayList<Itens> itens = null;
        
        if(verificaCampos(nomeTomador, matricula)){
            //tomador.setNome(nomeTomador);
            //tomador.setMatricula(codPessoa);
           retornoAluno = devolucaoDAO.selecionaAluno(nomeTomador,matricula);
        }
        System.out.println("Aluno "+retornoAluno);
        
        if(retornoAluno != null){
            itens = devolucaoDAO.verificaEmprestimo(retornoAluno);
             
        }
        return itens;
    }
    
    public void confirmaDevolucao(ArrayList<Devolucao> listDevolucao,ArrayList<Itens> listItens){
        if(listDevolucao.size() != 0){
            devolucaoDAO.create(listDevolucao);
            
            for(Itens item: listItens){
                itensDAO.updateSituacao(item);
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Não existe itens selecionados!");
        }
            
    }
    
    public void updateSituacaoLivro(ArrayList<Itens> listItens){
        livroDAO.updateSituatiomBook(listItens);
        
    }
    
    
   
}
