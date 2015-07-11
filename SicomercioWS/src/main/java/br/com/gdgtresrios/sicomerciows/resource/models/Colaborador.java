package br.com.gdgtresrios.sicomerciows.resource.models;

/**
 * E-mail: luciano.sfjtci@gmail.com
 *
 * @author Luciano Junior
 */
public class Colaborador {

    private Long id;
    private String nome;
    private String descricao;
    private String logo;
    private String descricao_detalhada;
    private String endereco_virtual;
    private String email;
    private String telefone;
    private String endereco;
    private Long patrocinador; 
    private Long palestrante;
    private Long expositor;
    private CategoriaColaborador categoriaColaboradores;

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

    public Long getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Long patrocinador) {
        this.patrocinador = patrocinador;
    }

    public Long getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Long palestrante) {
        this.palestrante = palestrante;
    }

    public Long getExpositor() {
        return expositor;
    }

    public void setExpositor(Long expositor) {
        this.expositor = expositor;
    }

    public CategoriaColaborador getCategoriaColaboradores() {
        return categoriaColaboradores;
    }

    public void setCategoriaColaboradores(CategoriaColaborador categoriaColaboradores) {
        this.categoriaColaboradores = categoriaColaboradores;
    }

}
