package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.nutrilac.R;

public class CriarLoteActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Criar lote";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_lote);
        setTitle(TITLE_APPBAR);
    }
}
