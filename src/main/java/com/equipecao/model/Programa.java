package com.equipecao.model;

import lombok.Data;

import java.util.List;


public class Programa {

    private String 	tipoInter;
    private int faixaEtaria;
    private List<String> escolaridade;
    private List<String> destinos;
    private List<String> nivel;
    private int duracao;
    private List<String> acomodacao;
    private String curso;
    private String sexo;
    private Boolean gostaCrianca;

    public String getTipoInter() {
        return tipoInter;
    }

    public void setTipoInter(String tipoInter) {
        this.tipoInter = tipoInter;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public List<String> getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(List<String> escolaridade) {
        this.escolaridade = escolaridade;
    }

    public List<String> getDestinos() {
        return destinos;
    }

    public void setDestinos(List<String> destinos) {
        this.destinos = destinos;
    }

    public List<String> getNivel() {
        return nivel;
    }

    public void setNivel(List<String> nivel) {
        this.nivel = nivel;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<String> getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(List<String> acomodacao) {
        this.acomodacao = acomodacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Boolean getGostaCrianca() {
        return gostaCrianca;
    }

    public void setGostaCrianca(Boolean gostaCrianca) {
        this.gostaCrianca = gostaCrianca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
