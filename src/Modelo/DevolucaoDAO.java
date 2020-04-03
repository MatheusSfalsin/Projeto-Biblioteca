
package Modelo;
import Negocio.*;
import java.sql.*;
import java.util.ArrayList;
import servicos.DataBase.ConnectionMysql;
import servicos.controlador.ControleData;
import java.util.Date;
public class DevolucaoDAO {
    
    AlunoDAO controleAluno = new AlunoDAO();
    ControleData controlData = new ControleData();
    
    
    
    public Devolucao criaDevolucao(Itens item, Aluno aluno){
        Devolucao devolucao = new Devolucao();
        
        devolucao.setIdDevolucao(lastId());
        Date dataAtual = new Date();
        devolucao.setDataDevolucao(controlData.converteDataSQL(dataAtual));
        //devolucao.setMulta(multa);
        devolucao.setItens(item);
        //devolucao.setFuncionario(funcionario);
        devolucao.setTomador(aluno);
        
        return devolucao;
    }
    
    
    
    
     public void create(ArrayList<Devolucao> listDevolucao) {
        Connection con = ConnectionMysql.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO devolucao(idDevolucao,datadevolucao,Matricula,"
                    + "idFuncionario,idItem) VALUES(?,?,?,?,?)");
            
            for(Devolucao devolucao :listDevolucao){
                stmt.setInt(1,devolucao.getIdDevolucao());
                stmt.setDate(2, devolucao.getDataDevolucao());
                stmt.setString(3, devolucao.getTomador().getMatricula());
                //stmt.setString(4, devolucao.getFuncionario().getMatricula());
                stmt.setString(4, "1");
                stmt.setInt(5, devolucao.getItens().getIdItem());
                //stmt.setInt(6, 0);
              
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionMysql.closeConnection(con, stmt);
        }
     }
    
    
    public Aluno selecionaAluno(String nome,String codPessoa){
                     
                 Aluno aluno;
                      
                 //verifica se existe
                 aluno = controleAluno.buscaExistenciaAluno(nome,codPessoa);
                 
            
            return aluno;
    }
    
    public ArrayList<Itens> verificaEmprestimo(Aluno aluno){
        ArrayList<Itens> itens = null;

        Connection con = ConnectionMysql.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet result = null;
        //List<Produto> produtos = new ArrayList<>();
         
        try {
            stmt = con.prepareStatement("select *from emprestimos,itens,livros where "
                    + "emprestimos.idEmprestimo = itens.IdEmprestimo and itens.idLivro = livros.idLivro and"
                    + " matricula = ? and devolvido = false;");
            stmt.setString(1, aluno.getMatricula());
            result = stmt.executeQuery();

        } catch (SQLException ex) {
            System.out.println("erro buscar");
        }
       
        try {
            itens = new ArrayList<>();
            Itens item;
            while(result.next()){
                item = new Itens();
                item.setIdItem(result.getInt("idItem")-1);
                item.setDataPrevistaDevolucao(result.getDate("dataprevdevolucao"));
                item.getItemLivro().setIdLivro(result.getInt("idLivro")-1);
                item.getItemLivro().setTitulo(result.getString("titulo"));
                
                itens.add(item);
            }
        } catch (SQLException ex) {
            
        }
       
         ConnectionMysql.closeConnection(con, stmt, result);
        return itens;
    }
    
    
    
     public int lastId(){
        Connection con = ConnectionMysql.getConnection();
        PreparedStatement stmt;
        ResultSet result;
        
        try{
            stmt = con.prepareStatement("select max(devolucao.idDevolucao) "
                    + "as id from devolucao");
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
