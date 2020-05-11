package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.nutrilac.R;

public class ListagemVolumososActivity extends AppCompatActivity {

    public static final String TTILE_APPBAR = "Volumosos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_volumosos);
        setTitle(TTILE_APPBAR);

        TextView botaoConfirmar = findViewById(R.id.lista_volumoso_botao_confirmar);
        botaoConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListagemVolumososActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
