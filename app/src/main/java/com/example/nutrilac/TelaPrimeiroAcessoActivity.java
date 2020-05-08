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

        TextView entrar = findViewById(R.id.login_botao_entrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrimeiroAcessoActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        TextView criarConta = findViewById(R.id.login_botao_criar_conta);
        criarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrimeiroAcessoActivity.this,CadastroUsuarioActivity.class);
                startActivity(intent);
            }
        });

    }
}
