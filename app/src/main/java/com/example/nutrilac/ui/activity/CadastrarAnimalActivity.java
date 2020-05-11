package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.nutrilac.R;

public class CadastrarAnimalActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Cadastrar animal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_animal);
        setTitle(TITLE_APPBAR);
    }
}
