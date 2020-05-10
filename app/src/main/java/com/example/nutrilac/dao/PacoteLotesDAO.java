package com.example.nutrilac.dao;

import com.example.nutrilac.model.PacoteLotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacoteLotesDAO {
    public List<PacoteLotes> lista() {
        List<PacoteLotes> pacotes = new ArrayList<>(Arrays.asList(
                new PacoteLotes("Filhas da Mimosa", 20, 20),
                new PacoteLotes("Filhas da Estrela", 10, 15)));
        return pacotes;
    }
}
