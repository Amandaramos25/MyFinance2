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
    private MutableLiveData<Boolean> tipo;
    private MutableLiveData<Double> valor;
    private MutableLiveData<String> categoria;
    private MutableLiveData<Date> data;
    private MutableLiveData<String> comentario;
    private MutableLiveData<Integer> foto;
    private MutableLiveData<List<Transacao>> transacoes;

    public TransacaoViewModel() {
        repo = new TransacaoRepo();

        tipo = new MutableLiveData<>();
        valor = new MutableLiveData<>();
        categoria = new MutableLiveData<>();
        data = new MutableLiveData<>();
        comentario = new MutableLiveData<>();
        foto = new MutableLiveData<>();
        transacoes = new MutableLiveData<>(repo.getTrasacao());
    }
    public void adicionar(){
        Transacao t = new Transacao(tipo.getValue(),valor.getValue(),categoria.getValue(),data.getValue(),comentario.getValue(),foto.getValue());
    }
    public MutableLiveData<Boolean> getTipo(){
        return tipo;
    }
    public LiveData<List<Transacao>> getTransacao(){
        return transacoes;
    }

    public MutableLiveData<Double> getValor() {
        return valor;
    }

    public MutableLiveData<String> getCategoria() {
        return categoria;
    }

    public MutableLiveData<Date> getData() {
        return data;
    }

    public MutableLiveData<String> getComentario() {
        return comentario;
    }

    public MutableLiveData<Integer> getFoto() {
        return foto;
    }

}
