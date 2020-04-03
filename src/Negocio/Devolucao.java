
package Negocio;

import java.util.ArrayList;
import java.sql.Date;


public class Devolucao {
    private int idDevolucao = 0;
    private Date dataDevolucao;
    private Aluno tomador = new Aluno();
    private Funcionario funcionario =  new Funcionario();
    private int multa;
    private Itens itens = new Itens();

    /**
     * @return the idDevolucao
     */
    public int getIdDevolucao() {
        return idDevolucao;
    }

    /**
     * @param idDevolucao the idDevolucao to set
     */
    public void setIdDevolucao(int idDevolucao) {
        this.idDevolucao = idDevolucao +1;
    }

    /**
     * @return the dataDevolucao
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the tomador
     */
    public Pessoa getTomador() {
        return tomador;
    }

    /**
     * @param tomador the tomador to set
     */
    public void setTomador(Aluno tomador) {
        this.tomador = tomador;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

  
    public Itens getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(Itens itens) {
        this.itens = itens;
    }

    /**
     * @return the multa
     */
    public int getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(int multa) {
        this.multa = multa;
    }
}
