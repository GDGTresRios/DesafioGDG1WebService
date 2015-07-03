package br.com.gdgtresrios.sicomerciows.v1.model;

import javax.persistence.*;

/**
 * Created by Wanderlei on 30/06/2015.
 */
@Entity
@Table(name = "configuracao")
@NamedQueries({
        @NamedQuery(name = "Configuracao.findAll", query = "select f from Configuracao f")
})
public class Configuracao {

    private int id;
    private String nome;
    private String descricao;
    private String logo;
    private String mapa;
    private String endereco;
    private String telefone;
    private String versao;

    @Id
    @Column(name = "id")
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "mapa")
    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    @Basic
    @Column(name = "endereco")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Basic
    @Column(name = "telefone")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Basic
    @Column(name = "versao")
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Configuracao that = (Configuracao) o;

        if (id != that.id) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;
        if (endereco != null ? !endereco.equals(that.endereco) : that.endereco != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (mapa != null ? !mapa.equals(that.mapa) : that.mapa != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (telefone != null ? !telefone.equals(that.telefone) : that.telefone != null) return false;
        if (versao != null ? !versao.equals(that.versao) : that.versao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (mapa != null ? mapa.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        result = 31 * result + (versao != null ? versao.hashCode() : 0);
        return result;
    }
}
