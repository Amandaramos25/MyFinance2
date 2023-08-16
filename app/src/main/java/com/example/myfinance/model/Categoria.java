package com.example.myfinance.model;

public class Categoria {
    private String nomeCategoria;
    private boolean tipoCtegoria;
    private Integer corCategoria;

    public Categoria(String nomeCategoria, boolean tipoCtegoria, Integer corCategoria) {
        this.nomeCategoria = nomeCategoria;
        this.tipoCtegoria = tipoCtegoria;
        this.corCategoria = corCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public boolean isTipoCtegoria() {
        return tipoCtegoria;
    }

    public void setTipoCtegoria(boolean tipoCtegoria) {
        this.tipoCtegoria = tipoCtegoria;
    }

    public Integer getCorCategoria() {
        return corCategoria;
    }

    public void setCorCategoria(Integer corCategoria) {
        this.corCategoria = corCategoria;
    }
}
