package com.example.myfinance.model;

import java.util.ArrayList;
import java.util.List;

public class TransacaoRepo {
    private List<Transacao> transacoes;

    public TransacaoRepo(){
        this.transacoes = new ArrayList<>();

    }

    public List<Transacao> getTrasacao(){
        return transacoes;
    }

    public void inserir(Transacao t){
        transacoes.add(t);
    }
}
