package com.itb.inf2dm.comercio.model;

 

public class Produto {

    private Long id;
    private String descricao;
    private String nome;
    private String CodigoBarras;
    private double preco;
    private boolean cod_status;

    //public : Modificador de acesso livre para todas as classes.
    //private : Modificador de acesso restrito apenas para membros da
    // da própria classe. Entende-se por "membros"

    // Métodos Setter' s e Getter's : Adicionar e recuperar dados do atributo "RESPECTIVAMENTE

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.CodigoBarras = codigoBarras; 
    }

    public String getCodigoBarras() {
        return CodigoBarras;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setCod_Status(boolean cod_status) {
        this.cod_status = cod_status;
    }

    public boolean getCod_Status() {
        return cod_status;
    }

 

}