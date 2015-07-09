package br.com.gdgtresrios.sicomerciows.resource.models;

/**
 * E-mail: luciano.sfjtci@gmail.com
 *
 * @author Luciano Junior
 */
public class Colaboradores {

    private int id;
    private String nome;
    private String descricao;
    private String logo;
    private String descricao_detalhada;
    private String endereco_virtual;
    private String email;
    private String telefone;
    private String endereco;
    private int patrocinador; 
    private int palestrante;
    private int expositor;
    private CategoriasColaboradores categoriaColaboradores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(int patrocinador) {
        this.patrocinador = patrocinador;
    }

    public int getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(int palestrante) {
        this.palestrante = palestrante;
    }

    public int getExpositor() {
        return expositor;
    }

    public void setExpositor(int expositor) {
        this.expositor = expositor;
    }

    public CategoriasColaboradores getCategoriaColaboradores() {
        return categoriaColaboradores;
    }

    public void setCategoriaColaboradores(CategoriasColaboradores categoriaColaboradores) {
        this.categoriaColaboradores = categoriaColaboradores;
    }

}
