
package Modelo;

import Negocio.Emprestimo;
import Negocio.Itens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import servicos.DataBase.ConnectionMysql;


public class ItemDAO {
    
    
    
    
    
    public void create(Emprestimo emprestimo,Connection con) {
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO itens(idItem,idLivro,idEmprestimo,"
                    + "dataemprestimo,dataprevdevolucao,devolvido,multa) VALUES(?,?,?,?,?,?,?)");
            
            for(Itens item :emprestimo.getListaDeItens()){
                stmt.setInt(1,item.getIdItem() );
                stmt.setInt(2, item.getItemLivro().getIdLivro());
                stmt.setInt(3, emprestimo.getIdEmprestimo());
                stmt.setDate(4, item.getDataEmprestimo());
                stmt.setDate(5, item.getDataPrevistaDevolucao());
                stmt.setBoolean(6, false);
                stmt.setBoolean(7, item.isMulta());

                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionMysql.closeConnection(con, stmt);
        }
     }
    
    
    public void updateSituacao(Itens item){
        Connection con = ConnectionMysql.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("update itens SET devolvido = true where idItem = ? ");
            stmt.setInt(1, item.getIdItem());
            
            stmt.executeUpdate();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar comando de update em item!");
        }
        ConnectionMysql.closeConnection(con, stmt);
        
    } 
    
    
    public int lastId(){
        Connection con = ConnectionMysql.getConnection();
        PreparedStatement stmt;
        ResultSet result;
        
        try{
            stmt = con.prepareStatement("select max(itens.idItem) as id from itens");
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
