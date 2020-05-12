package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.nutrilac.R;
import com.example.nutrilac.dao.PacoteLotesDAO;
import com.example.nutrilac.model.PacoteLotes;
import com.example.nutrilac.ui.adapter.ListaPacotesLotesAdapter;

import java.util.List;

public class ListaLotesActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Lista de lotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_lotes);
        setTitle(TITLE_APPBAR);

        TextView botaoCriarLote = findViewById(R.id.lista_lotes_button_criar_lote);
        botaoCriarLote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaLotesActivity.this,CriarLoteActivity.class);
                startActivity(intent);
            }
        });

        ListView listaDePacotesLotes = findViewById(R.id.lista_lotes_listview);
        final List<PacoteLotes> pacotes = new PacoteLotesDAO().lista();
        listaDePacotesLotes.setAdapter(new ListaPacotesLotesAdapter(pacotes,this));
    }
}
