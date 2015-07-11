package br.com.gdgtresrios.sicomerciows.resource.models;

/**
 * Categoria - Colaboradores Class
 * fernandosouzaconceicao@gmail.com
 * @author Fernando Souza
 */
public class CategoriaColaborador {
    
    private Long id;
    private String nome;
    private String logo;

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
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo the logo to set
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

}
