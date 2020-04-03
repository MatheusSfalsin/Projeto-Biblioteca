
package Negocio;


public class Aluno extends Pessoa{
    
    public Aluno(){
        this.situacao = true; // Situação inicial do aluno
    }
    
    private String curso;
    private int ano;
    private String turno;
    private boolean situacao;
    

    
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
        
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

     
}
