package com.example.myfinance.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfinance.R;
import com.example.myfinance.databinding.TransacaoItemBinding;
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
    }

    @NonNull
    @Override
    public TransacaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        TransacaoItemBinding  transacaoItem = DataBindingUtil.inflate(inflador, R.layout.transacao_item, parent, false);
        transacaoItem.setLifecycleOwner(lifecycleOwner);
        return new TransacaoViewHolder(transacaoItem);
    }

    @Override
    public void onBindViewHolder(@NonNull TransacaoAdapter.TransacaoViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onViewAttachedToWindow(@NonNull TransacaoViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.binding.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    public void onViewDetachedFromWindow(@NonNull TransacaoViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.binding.setLifecycleOwner(null);
    }


    static class TransacaoViewHolder extends RecyclerView.ViewHolder{
        private TransacaoItemBinding binding;
        public TransacaoViewHolder(@NonNull TransacaoItemBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(Transacao r){
            binding.setTransacao(r);
            binding.executePendingBindings();
        }
    }
}
