package com.equipecao.model;

import lombok.Data;

import java.util.List;

@Data
public class Programa {

    private String 	tipoInter;
    private int faixaEtariaDe;
    private int faixaEtariaAte;
    private String escolaridade;
    private String destinos;
    private List nivel;
    private int duracaoDe;
    private int duracaoAte;
    private List acomodacao;
    private String curso;
}
