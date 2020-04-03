
package Negocio;

import java.sql.Date;
import servicos.controlador.ControleData;


public class Itens {
    private int idItem = 0;// fazer lastId
    private Livro itemLivro = null;
    private Date dataEmprestimo;
    private Date dataPrevistaDevolucao;
    private boolean multa;
    private ControleData controleData = new ControleData();
    

    public Itens(){// sera criado na seleção de livros      
        this.itemLivro = new Livro();
    }
    
    
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }


    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
   
    
    public Date getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }
    
     

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {/// idItem ira ser o maior codigo que estiver no banco
        this.idItem = idItem+1;
    }

  
    public boolean isMulta() {
        return multa;
    }

   
    public void setMulta(boolean multa) {
        this.multa = multa;
    }

    /**
     * @return the itemLivro
     */
    public Livro getItemLivro() {
        return itemLivro;
    }

    /**
     * @param itemLivro the itemLivro to set
     */
    public void setItemLivro(Livro itemLivro) {
        this.itemLivro = itemLivro;
    }
    
}
