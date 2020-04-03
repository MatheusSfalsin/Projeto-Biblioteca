 
package Negocio;


import java.util.ArrayList;
import java.sql.Date;

public class Emprestimo {
    
     public Emprestimo(){//Contruir construtor
       // tomadorEmprestimo = new Aluno();
    
    //double x = tomadorEmprestimo.calculaNota();
        listaDeItens = new ArrayList();
    }
    
    private int idEmprestimo = 0;
    private Pessoa tomadorEmprestimo = null;
    //private String nomeDoBibliotecario;///Necessita de ser ter  
    private ArrayList <Itens> listaDeItens = null;
    private Date dataEmprestimo;
    
     //public void adicionaLivro(Itens itemLivro){
        
      //  getListaDeLivros().add(itemLivro);//adiciona no ArrayList
    //}
    


 
    public Pessoa getTomadorEmprestimo() {
        return tomadorEmprestimo;
    }


    public void setTomadorEmprestimo(Pessoa tomadorEmprestimo) {
        this.tomadorEmprestimo = tomadorEmprestimo;
  
    }


  
    //public ArrayList <Itens> getListaDeLivros() {
     //   return listaDeLivros;
    //}
    
    
    public void setListaDeLivros(Itens itemLivro) {
        this.listaDeItens.add(itemLivro);
    }
    
    public ArrayList <Itens> getListaDeItens(){
        return this.listaDeItens;
    }

    
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo+1;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    
    
}
