package com.example.nutrilac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CadastroUsuarioActivity extends AppCompatActivity {

    public static final String CADASTRO_DE_USUÁRIO = "Cadastro de usuário";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
        setTitle(CADASTRO_DE_USUÁRIO);
        TextView textCancelar = findViewById(R.id.cadastro_botao_cancelar);
        textCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CadastroUsuarioActivity.this,TelaPrimeiroAcessoActivity.class);
                startActivity(intent);
            }
        });
    }
}
