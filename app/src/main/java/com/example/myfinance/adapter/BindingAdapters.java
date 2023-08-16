package com.example.myfinance.adapter;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class BindingAdapters {
    @BindingAdapter("setAdapter")
    public static void setAdapter(RecyclerView recyclerView, RecyclerView.Adapter adapter){
        if (adapter!=null)
            recyclerView.setAdapter(adapter);

    }

    //public static void submitList(RecyclerView recyclerView, ){

    //}

}
