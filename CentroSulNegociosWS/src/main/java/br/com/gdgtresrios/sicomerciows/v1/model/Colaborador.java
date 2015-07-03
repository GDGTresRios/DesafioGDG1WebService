package br.com.gdgtresrios.sicomerciows.v1.model;

import javax.persistence.*;

/**
 * Created by Wanderlei on 01/07/2015.
 */
@Entity
@Table(name = "colaboradores")
@NamedQueries({
        @NamedQuery(name = "Colaborador.findAll", query = "select c from Colaborador c"),
        @NamedQuery(name = "Colaborador.findById", query = "select c from Colaborador c where c.id = :id"),
        @NamedQuery(name = "Colaborador.findByNome", query = "select c from Colaborador c where c.nome like :nome")
})
public class Colaborador {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String descricao;

    private String logo;

    private String descricao_detalhada;

    private String endereco_virtual;

    private String email;

    private String telefone;

    private String endereco;

    private Boolean patrocinador;

    private Boolean palestrante;

    private Boolean expositor;

    @ManyToOne
    @JoinColumn(name = "fk_categoria")
    private CategoriaColaborador categoriaColaborador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescricao_detalhada() {
        return descricao_detalhada;
    }

    public void setDescricao_detalhada(String descricao_detalhada) {
        this.descricao_detalhada = descricao_detalhada;
    }

    public String getEndereco_virtual() {
        return endereco_virtual;
    }

    public void setEndereco_virtual(String endereco_virtual) {
        this.endereco_virtual = endereco_virtual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean isPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Boolean patrocinador) {
        this.patrocinador = patrocinador;
    }

    public Boolean isPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Boolean palestrante) {
        this.palestrante = palestrante;
    }

    public Boolean isExpositor() {
        return expositor;
    }

    public void setExpositor(Boolean expositor) {
        this.expositor = expositor;
    }


    public CategoriaColaborador getCategoriaColaborador() {
        return categoriaColaborador;
    }

    public void setCategoriaColaborador(CategoriaColaborador categoriaColaborador) {
        this.categoriaColaborador = categoriaColaborador;
    }
}
