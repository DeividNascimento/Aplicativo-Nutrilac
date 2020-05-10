package com.example.nutrilac.model;

import java.io.Serializable;

public class PacoteLotes implements Serializable {
    private final String nome;
    private final int nAnimais;
    private final double producao;

    public PacoteLotes(String nome, int nAnimais, double producao) {
        this.nome = nome;
        this.nAnimais = nAnimais;
        this.producao = producao;
    }

    public String getNome() {
        return nome;
    }

    public int getNAnimais() {
        return nAnimais;
    }

    public double getProducao() {
        return producao;
    }
}
