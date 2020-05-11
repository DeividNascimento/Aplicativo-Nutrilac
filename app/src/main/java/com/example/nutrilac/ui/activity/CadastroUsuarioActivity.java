package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.nutrilac.R;

public class CadastroUsuarioActivity extends AppCompatActivity {

    public static final String CADASTRO_DE_USUÁRIO = "Cadastrar usuário";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
        setTitle(CADASTRO_DE_USUÁRIO);
        TextView textCancelar = findViewById(R.id.cadastro_botao_cancelar);
        textCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CadastroUsuarioActivity.this, TelaPrimeiroAcessoActivity.class);
                startActivity(intent);
            }
        });

        TextView textCriarConta = findViewById(R.id.cadastro_botao_confirmar);
        textCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CadastroUsuarioActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
