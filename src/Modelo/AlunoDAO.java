
package Modelo;

import Negocio.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import servicos.DataBase.ConnectionMysql;
import servicos.controlador.ControleCadastro;


public class AlunoDAO {
    
    private Aluno aluno;
    ControleCadastro controle = new ControleCadastro();
    
    
    
     //metodo que verifica campos pa ser criado um aluno
    public Aluno controleCadastroDeAluno(String nome,String matricula,String curso,
                                        int ano,String turno,String endereco,
                                        String telefone, String email){
        
        
        setAluno(null);
        
        
        if(controle.controleNome(nome) && controle.controleCurso(curso) 
            && controle.controleTurno(turno) && controle.controleEndereco(endereco) 
            && controle.controleTelefone(telefone) && controle.controleEmail(email)){
                // irá criar aluno pois campos esta preenchidos
                
                setAluno(new Aluno());
                getAluno().setNome(nome);
                getAluno().setMatricula(matricula);
                getAluno().setCurso(curso);
                getAluno().setAno(ano);
                getAluno().setTurno(turno);
                getAluno().setEndereco(endereco);
                getAluno().setTelefone(telefone);
                getAluno().setEmail(email);
                
                boolean retorno = create(aluno);
                if(!retorno){
                    setAluno(null);
                    JOptionPane.showMessageDialog(null,"Matricula ja Existe.","Dado invalido",
                    JOptionPane.ERROR_MESSAGE, null);
                }
               
        }
    
        return getAluno();
        
    } 

    
     public boolean create(Aluno aluno) {
        
        Connection con = ConnectionMysql.getConnection();
        boolean retorno = false;
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO alunos(nome,telefone,Matricula,email,endereco,curso,"
                    + "ano,turno,situacao)VALUES(?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getTelefone());
            stmt.setString(3, aluno.getMatricula());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getEndereco());
            stmt.setString(6, aluno.getCurso());
            stmt.setInt(7, aluno.getAno());
            stmt.setString(8, aluno.getTurno());
            stmt.setBoolean(9, aluno.getSituacao());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            retorno = true;
        } catch (SQLException ex) {
            System.out.println(ex);
            retorno = false;
        } finally {
            ConnectionMysql.closeConnection(con, stmt);
        }
        return retorno;
     }
    
    
   
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
     public Aluno buscaExistenciaAluno(String nome,String matricula) {

        Connection con = ConnectionMysql.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //List<Produto> produtos = new ArrayList<>();
         
        try {
            stmt = con.prepareStatement("SELECT *FROM alunos where Matricula = ? and nome = ?");
            stmt.setString(1, matricula);
            stmt.setString(2, nome);
            System.out.println("n"+nome);
            rs = stmt.executeQuery();
            
            if(rs.next() != false){
            
                

                Aluno aluno = new Aluno();

                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setAno(rs.getInt("ano"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setSituacao(rs.getBoolean("situacao"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setTurno(rs.getString("turno"));
           
                return aluno;
                
            }else{
                return  null;
            }

        } catch (SQLException ex) {
            return null;
        } finally {
            ConnectionMysql.closeConnection(con, stmt, rs);
        }

       

    }
     
    public ArrayList<Aluno> buscaPorAluno(String desc) {

        Connection con = ConnectionMysql.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM alunos WHERE nome LIKE ?");
            stmt.setString(1, desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Aluno aluno = new Aluno();

                aluno.setMatricula(rs.getString("Matricula"));
                aluno.setNome(rs.getString("nome"));
                
                alunos.add(aluno);
            }

        } catch (SQLException ex) {
            
        } finally {
            ConnectionMysql.closeConnection(con, stmt, rs);
            return alunos;
        }
    }        
     
    
     
   
   
    
    
}
