package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.nutrilac.R;

public class ListaAnimaisActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Lista de animais";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_animais);
        setTitle(TITLE_APPBAR);

        TextView botaoCadastrarAnimal = findViewById(R.id.lista_lotes_button_cadastrar_animal);
        botaoCadastrarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaAnimaisActivity.this,CadastrarAnimalActivity.class);
                startActivity(intent);
            }
        });
    }
}
