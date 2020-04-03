
package Negocio;


public class Livro {
    
    public Livro(){
        this.situacao = true;
    }

    private int idLivro;
    private String titulo;
    private int ano;
    private String tipo;
    private String autor;
    private String editora;
    private String categoria;
    private String prateleira;
    private boolean situacao;

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }


    public void setEditora(String editora) {
        this.editora = editora;
    }


    public String getCategoria() {
        return categoria;
    }

 
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }


    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }


    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        
        this.idLivro = idLivro+1;
        
    }
    
    /////////////
    
    public void buscaDinamicaLivro(){
        
    }
    
    public Livro buscaExistenciaLivro(String nome,int codigo){
        Livro livro = new Livro();
        if(livro.getIdLivro() == codigo){
            return livro;
        }else{
            return null;
        }
    }
    
}
