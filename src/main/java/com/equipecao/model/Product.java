package com.equipecao.model;

import java.util.List;

public class Product {

	private String 	tipoInter;
	private int faixaEtariaDe;
	private int faixaEtariaAte;
	private String escolaridade;
	private String destinos;
	private List nivel;
	//private String acomodacao;
	private int duracaoDe;
	private int duracaoAte;
	private List acomodacao;
	private String curso;



	public String getTipoInter() {
		return tipoInter;
	}

	public void setTipoInter(String tipoInter) {
		this.tipoInter = tipoInter;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getDuracaoDe() {
		return duracaoDe;
	}

	public void setDuracaoDe(int duracaoDe) {
		this.duracaoDe = duracaoDe;
	}

	public int getDuracaoAte() {
		return duracaoAte;
	}

	public void setDuracaoAte(int duracaoAte) {
		this.duracaoAte = duracaoAte;
	}

	public int getFaixaEtariaDe() {
		return faixaEtariaDe;
	}

	public void setFaixaEtariaDe(int faixaEtariaDe) {
		this.faixaEtariaDe = faixaEtariaDe;
	}

	public int getFaixaEtariaAte() {
		return faixaEtariaAte;
	}

	public void setFaixaEtariaAte(int faixaEtariaAte) {
		this.faixaEtariaAte = faixaEtariaAte;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getDestinos() {
		return destinos;
	}

	public void setDestinos(String destinos) {
		this.destinos = destinos;
	}

	public List getNivel() {
		return nivel;
	}

	public void setNivel(List nivel) {
		this.nivel = nivel;
	}

	public List getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(List acomodacao) {
		this.acomodacao = acomodacao;
	}
}