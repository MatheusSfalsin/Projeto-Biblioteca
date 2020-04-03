package Modelo;

import Negocio.Aluno;
import Negocio.Emprestimo;
import Negocio.Itens;
import Negocio.Livro;
import Negocio.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import servicos.DataBase.ConnectionMysql;
import servicos.controlador.ControleData;

public class EmprestimoDAO {

    private Emprestimo emprestimo;
    private LivroDAO controleLivro = new LivroDAO();
    private Itens item;
    private AlunoDAO controleAluno = new AlunoDAO();
    private ItemDAO controleItem = new ItemDAO();
    
    
    
    public Aluno selecionaAluno(String nome,String codPessoa,int tipoTomador){
            
         
                 Aluno aluno;
                 
                    
                 //verifica se existe
                 aluno = controleAluno.buscaExistenciaAluno(nome,codPessoa);
                 if(aluno != null){
                     if(aluno.getSituacao()){
                        emprestimo = new Emprestimo();
                        emprestimo.setIdEmprestimo(lastId());
                        emprestimo.setTomadorEmprestimo(aluno);
                     } 
                 }
            
            return aluno;
    }
    
    public void selecionaProfessor(String nome,String codPessoa){
            Pessoa retorno = null;
            
    }
     
    // verifica se o codigo do livro selecionado ja foi escolhido anteriormente
    public boolean impedeLivroRepetido(int codLivro){
        boolean verificador = true;  //Variável de controle
        for(Itens item: emprestimo.getListaDeItens()){  // For que pecorre a lista de itens do emprestimo
            if(item.getItemLivro().getIdLivro() == codLivro){ // verifica se ja existe um codigo igual ja selecionado
                verificador = false; // caso ja tenha ele retornara false;
                break;
            }   
        }
        return verificador; // Retorna o boolean de controle
    }

    public Livro selecionaLivro(String nomeLivro,int codLivro){
        Livro retornoLivro = null;// declara objeto livro
        
        try{
            if(impedeLivroRepetido(codLivro)){ // verifica se o livro ja foi selecionado anteriormente
                //irá buscar o livro no banco, retornando ou o livro ou nulo caso não exista
                retornoLivro = controleLivro.buscaExistenciaLivro(nomeLivro, codLivro);
                if(retornoLivro != null){
                    //Verifica se situação do livro é true que significa que esta apto para empréstimo
                    if(retornoLivro.getSituacao()){
                        ControleData controlData = new ControleData();
                        Date dataAtual = new Date();
                        item = new Itens();
                        item.setItemLivro(retornoLivro);

                        if(emprestimo.getListaDeItens().size() >0){
                            int i = emprestimo.getListaDeItens().size();
                            int id = emprestimo.getListaDeItens().get(i-1).getIdItem();
                            item.setIdItem(id);
                        }else{
                            item.setIdItem(controleItem.lastId());
                        }

                        item.setDataEmprestimo(controlData.converteDataSQL(dataAtual));
                        item.setDataPrevistaDevolucao(controlData.registraDataDevolucao(dataAtual));

                        emprestimo.setListaDeLivros(item);
                    }
                }
            }

        }catch(Exception erro){

        }
        
        return retornoLivro;
   
    }
    
    
    public Emprestimo solicitaEmprestimo(){
        ControleData controlData = new ControleData();
        Connection con = ConnectionMysql.getConnection();
        Emprestimo retornoEmprestimo = null;
        
        if(emprestimo.getTomadorEmprestimo() != null && 
                emprestimo.getListaDeItens().size() > 0){
            
            Date dataAtual = new Date();
            emprestimo.setDataEmprestimo(controlData.converteDataSQL(dataAtual));
            create(emprestimo,con);
            controleLivro.updateSituatiomBook(emprestimo,con);
            controleItem.create(emprestimo, con);
            retornoEmprestimo = this.emprestimo;
            emprestimo = null; 
        }
        
        return retornoEmprestimo;
       
    }
    
    public void cancelaEmprestimo(){
        emprestimo = null;
        item = null;
        
    }
    
    
    public void create(Emprestimo emprestimo,Connection con) {
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(
                    "INSERT INTO emprestimos(idEmprestimo,Matricula,"
                    + "dataemprestimo,idFuncionario) VALUES(?,?,?,?)");
            
           
            stmt.setInt(1,emprestimo.getIdEmprestimo() );
            stmt.setString(2, emprestimo.getTomadorEmprestimo().getMatricula());
            stmt.setDate(3, emprestimo.getDataEmprestimo());
            stmt.setString(4,"1");

            stmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
     }
    
    
    public int lastId(){
        Connection con = ConnectionMysql.getConnection();
        PreparedStatement stmt;
        ResultSet result;
        
        try{
            stmt = con.prepareStatement("select max(emprestimos.idEmprestimo) as id from emprestimos");
            result = stmt.executeQuery();
            
            int id = 0;
            if(result.next()){
                id = result.getInt(1);
             }
            return id;
        }catch (SQLException erro){
            System.out.println("erro:"+ erro);
            return 0;
        } 
    }
 
    
}
