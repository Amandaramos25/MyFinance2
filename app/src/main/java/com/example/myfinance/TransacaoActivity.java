package com.example.myfinance;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TransacaoActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_transacao);
        Button button = findViewById(R.id.bt_salvar);
        button.setOnClickListener(view -> {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
