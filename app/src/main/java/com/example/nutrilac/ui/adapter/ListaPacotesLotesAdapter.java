package com.example.nutrilac.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nutrilac.R;
import com.example.nutrilac.model.PacoteLotes;

import java.util.List;

public class ListaPacotesLotesAdapter extends BaseAdapter {
    private final List<PacoteLotes> pacotes;
    private final Context context;

    public ListaPacotesLotesAdapter(List<PacoteLotes> pacotes, Context context) {
        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public PacoteLotes getItem(int posicao) {
        return pacotes.get(posicao);
    }

    @Override
    public long getItemId(int posicao) {
        return 0;
    }

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_lote, parent, false);
        PacoteLotes pacote = pacotes.get(posicao);

        TextView nome = viewCriada.findViewById(R.id.item_lote_nome_resposta);
        nome.setText(pacote.getNome());

        TextView nAnimais = viewCriada.findViewById(R.id.item_lote_quantidade_resposta);
        String formataEmTexto = String.valueOf(pacote.getNAnimais());
        nAnimais.setText(formataEmTexto);

        TextView producao = viewCriada.findViewById(R.id.item_lote_producao_resposta);
        String formataProducaoEmTexto = pacote.getNAnimais() + " L";
        producao.setText(formataProducaoEmTexto);

        return viewCriada;
    }
}
