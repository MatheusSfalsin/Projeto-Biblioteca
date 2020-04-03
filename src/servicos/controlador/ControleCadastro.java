package servicos.controlador;

import Negocio.Aluno;
import Negocio.Livro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleCadastro {
    public ControleCadastro(){
  
    }
    
    
    
    
    public boolean controleCod(String codigo){ //Controle de Curso
        if(!codigo.equals("")){
            return true;
        }else{
            OptionPane.showMessageDialog(null,"A Matricula esta vazia.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            return false;
        }   
    }
    public boolean controleCod(int codigo){ //Controle de Curso
        if(!Integer.toString(codigo).equals("")){
            return true;
        }else{
            
            OptionPane.showMessageDialog(null,"A Matricula esta vazia.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            return false;
        }   
    }
    
      
    JOptionPane OptionPane;
    public  Aluno aluno;
    public  Livro livro;
    
    public ArrayList<Livro> bdLivro = new ArrayList();
    public ArrayList<Aluno> bdAluno = new ArrayList();
    
  
    
    public boolean controleNome(String nome){ //Controle de nome
        if(!nome.equals("")){
            return true;
        }else{
            OptionPane.showMessageDialog(null,"Nome esta vazio.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            return false;
        }
    }
    
    public boolean controleCurso(String curso){ //Controle de Curso
        if(!curso.equals("")){
            return true;
        }else{
            OptionPane.showMessageDialog(null,"Curso esta vazio.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            
            return false;
        }
        
    }
    public boolean controleTurno(String turno){ //Controle de Curso
        if(!turno.equals("")){
            return true;
        }else{
            OptionPane.showMessageDialog(null,"Turno esta vazio.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            
            return false;
        }
       
    }
    
    public boolean controleEndereco(String endereco){ //Controle de Curso
        if(!endereco.equals("")){
            return true;
        }else{
            OptionPane.showMessageDialog(null,"Endereco esta vazio.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            return false;
        }
        
    }
    
    public boolean controleTelefone(String telefone){ //Controle de Curso
        if(telefone.length()>=8 && telefone.length()<=9){
            return true;
        }else{
            OptionPane.showMessageDialog(null,"Telefone deve possuir 8 ou 9 números.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            
            return false;
        }
    }
    
    public boolean controleEmail(String email){ //Controle de Curso
        if(!email.equals("")){
            return true;
        }else{
            
            OptionPane.showMessageDialog(null,"Email esta vazio.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            return false;
        }   
    }
    
    public boolean controleTipo(String tipo){ //Controle de Curso
        if(!tipo.equals("")){
            return true;
        }else{
            
            OptionPane.showMessageDialog(null,"O Tipo esta vazio.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            return false;
        }   
    }
    
    
    public boolean controleAno(int ano){ //Controle de Curso
        if(!Integer.toString(ano).equals("")){
            return true;
        }else{
            
            OptionPane.showMessageDialog(null,"A Matricula esta vazia.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            return false;
        }   
    }
    public boolean controleString(String texto){ //Controle de Curso
        if(!texto.equals("")){
            return true;
        }else{
            
            OptionPane.showMessageDialog(null,"Existe um campo vazio.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
            return false;
        }   
    }
   
    
   
    
}
