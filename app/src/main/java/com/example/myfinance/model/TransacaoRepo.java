package com.example.myfinance.model;

import java.util.ArrayList;
import java.util.List;

public class TransacaoRepo {
    private List<Transacao> transacoes;

    public TransacaoRepo(){
        this.transacoes = new ArrayList<>();
        transacoes.add(new Transacao("Compra do mês", 500));
    }

    public List<Transacao> getTrasacao(){
        return transacoes;
    }

    public void inserir(Transacao t){
        transacoes.add(t);
    }
}
