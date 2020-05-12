package com.example.nutrilac.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.nutrilac.R;

public class ListagemConcentradosActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Concentrados";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_concentrados);
        setTitle(TITLE_APPBAR);
    }
}
