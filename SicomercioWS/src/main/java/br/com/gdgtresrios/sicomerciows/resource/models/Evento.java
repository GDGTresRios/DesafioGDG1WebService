package br.com.gdgtresrios.sicomerciows.resource.models;

import java.util.Date;

/**
 * 
 * Revisão Fernando 11/07/2015
 * @author Wanderlei
 */
public class Evento {

    private Long id;
    private String nome;
    private String descricao;
    private String descricaoDetalhada;
    private Date dataHora;
    private Date duracao;
    private String local;
    private CategoriaEvento categoriaEvento;
    private Colaborador colaborador;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the descricaoDetalhada
     */
    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    /**
     * @param descricaoDetalhada the descricaoDetalhada to set
     */
    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    /**
     * @return the dataHora
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the duracao
     */
    public Date getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(Date duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the categoriaEvento
     */
    public CategoriaEvento getCategoriaEvento() {
        return categoriaEvento;
    }

    /**
     * @param categoriaEvento the categoriaEvento to set
     */
    public void setCategoriaEvento(CategoriaEvento categoriaEvento) {
        this.categoriaEvento = categoriaEvento;
    }

    /**
     * @return the colaborador
     */
    public Colaborador getColaborador() {
        return colaborador;
    }

    /**
     * @param colaborador the colaborador to set
     */
    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }


}
