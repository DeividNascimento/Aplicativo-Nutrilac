package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.nutrilac.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView botaoVerAnimais = findViewById(R.id.home_botao_animais);
        botaoVerAnimais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ListaAnimaisActivity.class);
                startActivity(intent);
            }
        });

        TextView botaoVerLotes = findViewById(R.id.home_botao_lotes);
        botaoVerLotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ListaLotesActivity.class);
                startActivity(intent);
            }
        });

        TextView botaoVerDieta = findViewById(R.id.home_botao_dieta_animal);
        botaoVerDieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,EscolheAlimentosActivity.class);
                startActivity(intent);
            }
        });

    }
}
