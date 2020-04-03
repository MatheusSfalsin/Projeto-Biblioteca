
package servicos.controlador;

import Modelo.EmprestimoDAO;
import Negocio.Aluno;
import Negocio.Emprestimo;
import Negocio.Livro;
import Negocio.Pessoa;
import java.util.ArrayList;


public class ControladorEmprestimo {
    
    ControleCadastro controleCampos = new ControleCadastro();
    EmprestimoDAO controleEmprestimoDAO = new EmprestimoDAO();
    Pessoa tomador = new Pessoa();
    ArrayList<Integer> listaCod = new ArrayList<>();
    //boolean retorno = false;
    
    public boolean verificaCampoTomador(String nomeTomador,String codPessoa){
       
        return controleCampos.controleNome(nomeTomador) 
                &&  controleCampos.controleCod(codPessoa); // campos preenchidos ---> Devera chamar metodo para vertificar se
          
    }
    
    public boolean verificaCampoLivro(String nomeLivro,int codLivro){
        return controleCampos.controleNome(nomeLivro)
            && controleCampos.controleCod(codLivro);
    }
    
    
    public void buscaTomador(String nome,int tipoTomador){
        tomador.buscaDinamicaNomeTomador(nome, tipoTomador);
    }
    
    
    public Aluno selecionaTomador(String nomeTomador,String codPessoa,int tipoTomador){
        Aluno retorno;
        retorno = null;
        if(verificaCampoTomador(nomeTomador, codPessoa)){
            //tomador.setNome(nomeTomador);
            //tomador.setMatricula(codPessoa);
           if(tipoTomador == 1){
             retorno = controleEmprestimoDAO.selecionaAluno(nomeTomador,codPessoa, tipoTomador);
               
           }else
            retorno = null;
        }
        
        return retorno;
    }
    
    public Livro selecionaLivro(String nomeLivro,int codLivro){
        Livro retorno = null;
        if(verificaCampoLivro(nomeLivro,codLivro)){
            retorno = controleEmprestimoDAO.selecionaLivro(nomeLivro,codLivro);
            System.out.println("re"+retorno);
        }
       
        return retorno;
    }
    
    
    public void cancelaEmprestimo(){
        controleEmprestimoDAO.cancelaEmprestimo();
    }
    public Emprestimo solicitaEmprestimo(){
        return controleEmprestimoDAO.solicitaEmprestimo();
    }
    
    
}
