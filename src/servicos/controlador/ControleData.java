
package servicos.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import servicos.DataBase.ConnectionMysql;



public class ControleData {
    public java.sql.Date converteDataSQL(java.util.Date dataAtual) { /// Pega data do sistema
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
         String StdataEmprestimo = formato.format(dataAtual);
        java.sql.Date dataEmprestimo;
        try {
            dataEmprestimo = new java.sql.Date(formato.parse(StdataEmprestimo).getTime());
        } catch (ParseException ex) {
            dataEmprestimo = null;
        }
        
        return dataEmprestimo;
    }
    
     

    
    public static Date somarData (int dias,Date data) { /// retorna Date 
       Calendar calendario = Calendar.getInstance();
       calendario.setTime(data);
       calendario.add(Calendar.DATE, dias);
       return calendario.getTime();
    }
    
    public int diasAtrasado(int idItem){
        Connection con = ConnectionMysql.getConnection();
        
         PreparedStatement stmt = null;
        ResultSet result = null;
        //List<Produto> produtos = new ArrayList<>();
        int dias = 0;
        try {
            stmt = con.prepareStatement("select timestampdiff(day,curdate(), dataprevdevolucao) as diasAtrasados from itens where idItem = ?");
            stmt.setInt(1, idItem);
            
            result = stmt.executeQuery();
            if(result.next()){
                dias = result.getInt("diasAtrasados");
            }
        }catch(SQLException e ){
            JOptionPane.showMessageDialog(null, "Erro: "+e);
            
        }
        
        
        return dias;
    }
    
    
    public String mostraData(Date dataReal){/// retorna String data
        SimpleDateFormat formato;
        formato = new SimpleDateFormat("dd/MM/yyyy");
        String data = formato.format(dataReal);
        
        return data;
    }
       
    public java.sql.Date registraDataDevolucao(Date dataEmprestimo){
        Date dataDev = (somarData(7,dataEmprestimo));
         java.sql.Date dataDevolucao = converteDataSQL(dataDev);
        
        return dataDevolucao;
    }
}
