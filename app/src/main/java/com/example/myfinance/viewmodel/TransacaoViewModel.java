package com.example.myfinance.viewmodel;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myfinance.model.Transacao;
import com.example.myfinance.model.TransacaoRepo;

import java.util.Date;
import java.util.List;

public class TransacaoViewModel extends ViewModel {
    private final TransacaoRepo repo;
    private MutableLiveData<String> nome;
    private MutableLiveData<Double> valor;
    private MutableLiveData<List<Transacao>> transacoes;

    public TransacaoViewModel() {
        repo = new TransacaoRepo();

        nome = new MutableLiveData<>();
        valor = new MutableLiveData<>();

        transacoes = new MutableLiveData<>(repo.getTrasacao());
    }
    public void adicionar() {
        Transacao t = new Transacao(nome.getValue(), valor.getValue());
        nome.setValue("");
        valor.setValue(Double.valueOf(""));
        repo.inserir(t);
        transacoes.postValue(repo.getTrasacao());
    }

    public LiveData<List<Transacao>> getTransacao(){
        return transacoes;
    }

    public MutableLiveData<Double> getValor() {
        return valor;
    }

}
