package servicos.DataBase;



import java.sql.*;


public class ConnectionMysql {
    
    private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String URL   = "jdbc:mysql://localhost:3306/bdBiblioteca?useSSL=true&useTimezone=true&serverTimezone=UTC";
    private static final String USER  = "root";
    private static final String PASS  = "serra";
    
    
    
    public static Connection getConnection(){
        
        try {
            
            Class.forName(DRIVE);
            
            return DriverManager.getConnection(URL, USER, PASS);
            

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Erro: " + ex);
            
            return null;
        } 
    }
    
    public static void closeConnection( Connection con ){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
    }
    
    public static void closeConnection( Connection con, PreparedStatement pst ){
        if(pst != null){
            try {
                pst.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closeConnection(con);
    }
    
    public static void closeConnection( Connection con, PreparedStatement pst, ResultSet rs ){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
            closeConnection(con, pst);
    }

}
