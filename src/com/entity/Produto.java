package com.entity;

import java.util.Date;

public class Produto {
	private Integer codigo;
	private String nome;
	private Date dataCadastro;

	public int getCodigo() {
		return this.codigo;
	}
	public String getNome() {
		return this.nome;
	}
	public Date getDataCadastro() {
		return this.dataCadastro;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
