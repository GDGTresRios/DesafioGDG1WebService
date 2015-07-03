package br.com.gdgtresrios.sicomerciows.v1.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Wanderlei on 02/07/2015.
 */
@Entity
@Table(name = "eventos")
@NamedQueries({
        @NamedQuery(name = "Evento.findAll", query = "select e from Evento e"),
        @NamedQuery(name = "Evento.findById", query = "select e from Evento e where e.id = :id"),
        @NamedQuery(name = "Evento.findByNome", query = "select e from Evento e where e.nome like :nome")
})
public class Evento {

    @Id
    @GeneratedValue
    private long id;

    private String nome;

    private String descricao;

    private String descricao_detalhada;

    private Date data_hora;

    @Temporal(TemporalType.TIME)
    private Date duracao;

    private String local;

    @ManyToOne
    @JoinColumn(name = "fk_categoria")
    private CategoriaEvento categoriaEvento;

    @ManyToOne
    @JoinColumn(name = "fk_colaborador")
    private Colaborador colaborador;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao_detalhada() {
        return descricao_detalhada;
    }

    public void setDescricao_detalhada(String descricao_detalhada) {
        this.descricao_detalhada = descricao_detalhada;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public Date getDuracao() {
        return duracao;
    }

    public void setDuracao(Date duracao) {
        this.duracao = duracao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public CategoriaEvento getCategoriaEvento() {
        return categoriaEvento;
    }

    public void setCategoriaEvento(CategoriaEvento categoriaEvento) {
        this.categoriaEvento = categoriaEvento;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }


}
