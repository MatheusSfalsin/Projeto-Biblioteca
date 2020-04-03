
package servicos.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import servicos.DataBase.ConnectionMysql;


public class ControleLogin {
    
    private Connection con = null;

    public ControleLogin() {
        con = ConnectionMysql.getConnection();
    }
    
    public boolean verificaUsuario(String matricula,String senha){
        String sql = "select *from funcionarios where matricula = (?) and senha = md5((?))";
        
        PreparedStatement stmt = null;
        ResultSet result = null;
        boolean exists = false;
        
        
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, matricula);
            stmt.setString(2, senha);
            result = stmt.executeQuery();
            
            if(result.next()){
                exists = true;
                ConnectionMysql.closeConnection(con, stmt,result);
            }
            return exists;
            
        } catch (SQLException ex) {
            System.out.println("erro:" + ex);
           return exists;
        }finally{
           
        }
    }
    
}
