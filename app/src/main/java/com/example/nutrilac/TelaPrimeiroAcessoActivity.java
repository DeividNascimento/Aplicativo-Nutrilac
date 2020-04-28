package com.example.nutrilac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaPrimeiroAcessoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_primeiro_acesso);
        TextView textCriarConta = findViewById(R.id.login_criar_conta);
        textCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrimeiroAcessoActivity.this,CadastroUsuarioActivity.class);
                startActivity(intent);
            }
        });

    }
}
