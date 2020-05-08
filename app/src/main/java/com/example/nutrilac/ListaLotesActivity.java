package com.example.nutrilac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListaLotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_lotes);

        TextView botaoCriarLote = findViewById(R.id.lista_lotes_button_criar_lote);
        botaoCriarLote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaLotesActivity.this,CriarLoteActivity.class);
                startActivity(intent);
            }
        });
    }
}
