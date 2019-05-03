package com.equipecao.model;

import lombok.Data;

import java.util.List;

@Data
public class Programa {

    private String 	tipoInter;
    private int faixaEtaria;
    private List escolaridade;
    private List destinos;
    private List nivel;
    private int duracao;
    private List acomodacao;
    private String curso;
}
