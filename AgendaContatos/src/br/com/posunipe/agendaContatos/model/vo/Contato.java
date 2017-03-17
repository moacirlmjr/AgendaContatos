/*
 * Copyright (c) 2015 by Avaty! Tecnologia.
 * Avaty! Tecnologia Confidential Proprietary
 * This document and the information contained in it is
 * CONFIDENTIAL INFORMATION of Avaty! Tecnologia, and shall not
 * be used, or published, or disclosed, or disseminated
 * outside of Avaty! Tecnologia in whole or in part without
 * Avaty! Tecnologia's consent. This document contains trade
 * secrets of Avaty! Tecnologia. Reverse engineering of any or
 * all of the information in this document is prohibited.
 * The copyright notice does not imply publication of
 * this document.
 */
package br.com.posunipe.agendaContatos.model.vo;

import java.io.Serializable;
import java.util.Date;

public class Contato implements Serializable {

	private int id;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private String nome;
	private String telefone;
	private String cpf;
	private String rg;
	private String orgaoExp;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoExp() {
		return orgaoExp;
	}

	public void setOrgaoExp(String orgaoExp) {
		this.orgaoExp = orgaoExp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
