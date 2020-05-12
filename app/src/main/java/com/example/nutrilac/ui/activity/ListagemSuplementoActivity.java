package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.nutrilac.R;

public class ListagemSuplementoActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Suplementos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_suplemento);
        setTitle(TITLE_APPBAR);
    }
}
