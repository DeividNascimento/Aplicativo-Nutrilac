package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.nutrilac.R;

public class EscolheAlimentosActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Alimentos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolhe_alimentos);
        setTitle(TITULO_APPBAR);

        TextView botaoVolumoso = findViewById(R.id.alimentos_botao_volumoso);
        botaoVolumoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolheAlimentosActivity.this,ListagemVolumososActivity.class);
                startActivity(intent);
            }
        });

        TextView botaoConcentrado = findViewById(R.id.alimentos_botao_concentrado);
        botaoConcentrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolheAlimentosActivity.this,ListagemConcentradosActivity.class);
                startActivity(intent);
            }
        });

        TextView botaoSuplemento = findViewById(R.id.alimentos_botao_suplemento);
        botaoSuplemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolheAlimentosActivity.this,ListagemSuplementoActivity.class);
                startActivity(intent);
            }
        });
    }
}
