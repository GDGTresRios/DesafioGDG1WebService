package br.com.gdgtresrios.sicomerciows.v1.model;

import javax.persistence.*;

/**
 * Created by Wanderlei on 30/06/2015.
 */
@Entity
@Table(name = "categorias_colaboradores")
@NamedQueries({
        @NamedQuery(name = "CategoriaColaborador.findAll", query = "select c from CategoriaColaborador c"),
        @NamedQuery(name = "CategoriaColaborador.findById", query = "select c from CategoriaColaborador c where c.id = :id"),
        @NamedQuery(name = "CategoriaColaborador.findByNome", query = "select c from CategoriaColaborador c where c.nome like :nome")
})
public class CategoriaColaborador {

    @Id
    @GeneratedValue
    private long id;

    private String nome;

    private String logo;

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
