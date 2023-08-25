package com.example.myfinance.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfinance.R;
import com.example.myfinance.model.Transacao;
import com.example.myfinance.viewmodel.TransacaoViewModel;

import java.util.Collections;
import java.util.List;


public class TransacaoAdapter extends RecyclerView.Adapter<TransacaoAdapter.TransacaoViewHolder>{

    private List<Transacao> transacoes;
    private LifecycleOwner lifecycleOwner;

    private TransacaoViewModel transacaoViewModel;

    public TransacaoAdapter(LifecycleOwner lifecycleOwner, TransacaoViewModel vm){
        this.transacoes = Collections.emptyList();
        this.lifecycleOwner = lifecycleOwner;
        transacaoViewModel = vm;
    }
    public void atualizarLista(List<Transacao> transacoes){
        this.transacoes = transacoes;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TransacaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        View transacaoItem = inflador.inflate(R.layout.transacao_item, parent, false);
        return new TransacaoViewHolder(transacaoItem);
    }

    @Override
    public void onBindViewHolder(@NonNull TransacaoViewHolder holder, int position) {
        Transacao t = transacoes.get(position);
        holder.bind(t);
    }

    @Override
    public int getItemCount() {
        return 0;
    }



    static class TransacaoViewHolder extends RecyclerView.ViewHolder{
        private TextView nomeTransacao;
        private TextView valorTransacao;
        public TransacaoViewHolder(@NonNull View view){
            super(view);
            nomeTransacao = view.findViewById(R.id.nome_transacao);
            valorTransacao = view.findViewById(R.id.valor_transacao);
        }
        public void bind(Transacao r){
            nomeTransacao.setText(r.getNome());
            valorTransacao.setText(Double.toString(r.getValor()));
        }
    }
}
