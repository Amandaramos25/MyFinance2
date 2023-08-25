package com.example.myfinance.model;

import java.util.Date;

public class Transacao {
    private static int contadorDeTransacoes = 0;

    private String nome;
    private boolean tipo;
    private double valor;
    private String categoria;
    Date data = new Date();
    private String comentario;
    private Integer foto;

    public Transacao(String nome,boolean tipo, double valor, String categoria, Date data, String comentario, Integer foto) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.categoria = categoria;
        this.data = data;
        this.comentario = comentario;
        this.foto = foto;

        contadorDeTransacoes += 1;
    }

    public Transacao(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }



}
