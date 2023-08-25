package com.example.myfinance;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TransacaoActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_transacao);
        Button buttonSalvar = findViewById(R.id.bt_salvar);
        buttonSalvar.setOnClickListener(view -> {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        //botão de voltar
        Button buttonVoltar = findViewById(R.id.bt_voltar);
        buttonVoltar.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
