package br.com.gdgtresrios.sicomerciows.v1.model;



import javax.persistence.*;

/**
 * Created by Wanderlei on 28/06/2015.
 */

@Entity
@Table(name = "categorias_eventos")
@NamedQueries({
        @NamedQuery(name ="CategoriaEvento.findAll", query = "select c from CategoriaEvento c"),
        @NamedQuery(name ="CategoriaEvento.findById", query = "select c from CategoriaEvento c where c.id = :id"),
        @NamedQuery(name = "CategoriaEvento.findByNome", query = "select c from CategoriaEvento c where c.nome like :nome")
})
public class CategoriaEvento  {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

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
}
