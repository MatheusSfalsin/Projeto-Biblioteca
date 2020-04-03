
package Modelo;

import Negocio.Aluno;
import Negocio.Emprestimo;
import Negocio.Itens;
import Negocio.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicos.DataBase.ConnectionMysql;
import servicos.controlador.ControleCadastro;


public class LivroDAO {
    private Livro livro  = new Livro();
    private ControleCadastro controle = new ControleCadastro();
    
     public Livro controleCadastroDeLivro(String titulo, int ano, String tipo, String autor, String editora, String categoria, String prateleira){
        
         setLivro(null);
        
        if(controle.controleNome(titulo) && controle.controleString(tipo) && controle.controleString(autor) && controle.controleString(editora) &&
                controle.controleString(categoria) && controle.controleString(prateleira)){  
            
            Connection con = ConnectionMysql.getConnection();
            setLivro(new Livro());
            getLivro().setTitulo(titulo);
            getLivro().setIdLivro(lastId(con));
            getLivro().setAno(ano);
            getLivro().setTipo(tipo);
            getLivro().setAutor(autor);
            getLivro().setEditora(editora);
            getLivro().setCategoria(categoria);
            getLivro().setPrateleira(prateleira);
            getLivro().setSituacao(true);
            create(livro,con);
            
        }

        return getLivro();
     }

    
     public void create(Livro livro,Connection con) {
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO livros(idLivro,titulo,ano,tipo,autor,editora,"
                    + "categoria,prateleira,situacao)VALUES(?,?,?,?,?,?,?,?,?)");
            
            stmt.setInt(1, livro.getIdLivro());
            stmt.setString(2, livro.getTitulo());
            stmt.setInt(3, livro.getAno());
            stmt.setString(4, livro.getTipo());
            stmt.setString(5, livro.getAutor());
            stmt.setString(6, livro.getEditora());
            stmt.setString(7, livro.getCategoria());
            stmt.setString(8, livro.getPrateleira());
            stmt.setBoolean(9, livro.getSituacao());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionMysql.closeConnection(con, stmt);
        }
     }
     
    
      public Livro buscaExistenciaLivro(String titulo,int codLivro) {

        Connection con = ConnectionMysql.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
         
        try {
            stmt = con.prepareStatement("SELECT *FROM livros where idLivro = ? and titulo = ?");
            stmt.setInt(1, codLivro);
            stmt.setString(2, titulo);
           
            rs = stmt.executeQuery();
            
            if(rs.next() != false){

                Livro livro = new Livro();

                livro.setIdLivro(rs.getInt("idLivro")-1);
                livro.setTitulo(rs.getString("titulo"));
                livro.setAno(rs.getInt("ano"));
                livro.setTipo(rs.getString("tipo"));
                livro.setAutor(rs.getString("autor"));
                livro.setSituacao(rs.getBoolean("situacao"));
                livro.setEditora(rs.getString("Editora"));
                livro.setCategoria(rs.getString("categoria"));
                livro.setPrateleira(rs.getString("prateleira"));
           
                return livro;
                
            }else{
                return  null;
            }

        } catch (SQLException ex) {
            return null;
        } finally {
            ConnectionMysql.closeConnection(con, stmt, rs);
        }
    }
   
    
    public Livro consultaLivro(String titulo,int codLivro){
        Livro livro = buscaExistenciaLivro(titulo,codLivro);
        return livro;
    } 
      
    // sobreCarga - atualiza a sitação do livro para indisponivel
    public void updateSituatiomBook(Emprestimo emprestimo, Connection con) {
        PreparedStatement stmt = null;
        
        try {
            for(Itens item: emprestimo.getListaDeItens()){
                stmt = con.prepareStatement("UPDATE livros SET situacao = false where idLivro = ?");
                stmt.setInt(1,item.getItemLivro().getIdLivro());
                
                stmt.executeUpdate();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar estado do Livro: " + ex);
        }
    }       
    
    // sobreCarga - atualiza a sitação do Livro para disponível
    public void updateSituatiomBook(ArrayList<Itens> itens){
        Connection con = ConnectionMysql.getConnection();
        PreparedStatement stmt = null;

        try {
            for(Itens item: itens ){
            stmt = con.prepareStatement("UPDATE livros SET situacao = true where idLivro = ?");
            stmt.setInt(1,item.getItemLivro().getIdLivro() );
            
            stmt.executeUpdate();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar estado do Livro: " + ex);
        }
        
    }

    
    
    
    
    
     public ArrayList<Livro> buscaPorLivro(String desc) {

        Connection con = ConnectionMysql.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Livro> livros = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM livros WHERE titulo LIKE ?");
            stmt.setString(1, desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro livro = new Livro();

                livro.setIdLivro(rs.getInt("idLivro"));
                livro.setTitulo(rs.getString("titulo"));
                
                livros.add(livro);
            }

        } catch (SQLException ex) {
            
        } finally {
            ConnectionMysql.closeConnection(con, stmt, rs);
            return livros;
        }
    }        
    
    
    
      
    public int lastId(Connection con){
        PreparedStatement stmt;
        ResultSet result;
        
        try{
            stmt = con.prepareStatement("select max(livros.idLivro) as id from livros");
            result = stmt.executeQuery();
            
            int id = 0;
            if(result.next()){
                id = result.getInt(1);
                System.out.println("id aqui:" +id);
             }
            return id;
        }catch (SQLException erro){
            System.out.println("erro:"+ erro);
            return 0;
        } 
    }
     
 
    public Livro getLivro() {
        return livro;
    }

    
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
