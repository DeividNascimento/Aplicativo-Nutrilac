package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.nutrilac.R;
import com.example.nutrilac.dao.PacoteAnimaisDAO;
import com.example.nutrilac.dao.PacoteLotesDAO;
import com.example.nutrilac.model.PacoteAnimais;
import com.example.nutrilac.model.PacoteLotes;
import com.example.nutrilac.ui.adapter.ListaPacotesAnimaisAdapter;
import com.example.nutrilac.ui.adapter.ListaPacotesLotesAdapter;

import java.util.List;

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

        ListView listaDePacotesAnimais = findViewById(R.id.lista_animais_listview);
        final List<PacoteAnimais> pacotes = new PacoteAnimaisDAO().lista();
        listaDePacotesAnimais.setAdapter(new ListaPacotesAnimaisAdapter(pacotes,this));
    }
}
