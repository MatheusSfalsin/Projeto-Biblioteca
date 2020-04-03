package Negocio;


public class Pessoa {
    private String nome;
    private String telefone;
    private String matricula;
    //private Date dataNascimento;
    private String email;
    private String endereco;
    
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
       public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void buscaDinamicaNomeTomador(String nome,int tipoTomador){
        //buscara nomes no banco de dados relacionado ao que é digitado
        System.out.println(nome);// Delay
    }

   
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
   
    
    
     
}
