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
package br.com.posunipe.agendaContatos.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.posunipe.agendaContatos.model.util.ConnectorJdbc;
import br.com.posunipe.agendaContatos.model.vo.Contato;

public class ContatoDao {

	public Contato findById(int id) throws Exception {
		Connection con = ConnectorJdbc.getConnection();
		try {
			String sql = "select * from contato where id=" + id;
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			Contato c = new Contato();
			while (rs.next()) {
				c.setId(rs.getInt(0));
				c.setDataCriacao(rs.getDate(1));
				c.setDataAtualizacao(rs.getDate(2));
				c.setNome(rs.getString(3));
				c.setTelefone(rs.getString(4));
				c.setCpf(rs.getString(5));
				c.setRg(rs.getString(6));
				c.setOrgaoExp(rs.getString(7));
				c.setEmail(rs.getString(8));
			}

			rs.close();
			stmt.close();
			con.close();
			return c;
		} finally {
			con.close();
		}
	}

	public List<Contato> list() throws Exception {
		Connection con = ConnectorJdbc.getConnection();
		try {
			String sql = "select * from contato";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();
			List<Contato> list = new ArrayList<Contato>();
			while (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getInt(0));
				c.setDataCriacao(rs.getDate(1));
				c.setDataAtualizacao(rs.getDate(2));
				c.setNome(rs.getString(3));
				c.setTelefone(rs.getString(4));
				c.setCpf(rs.getString(5));
				c.setRg(rs.getString(6));
				c.setOrgaoExp(rs.getString(7));
				c.setEmail(rs.getString(8));
				list.add(c);
			}

			rs.close();
			stmt.close();
			con.close();
			return list;
		} finally {
			con.close();
		}
	}

	public void cadastrar(Contato contato) throws Exception {
		Connection con = ConnectorJdbc.getConnection();
		try {
			String sql = "insert into contato(dataCriacao, dataAtualizacao, "
					+ "nome, telefone,cpf,rg,orgaoExp,email) values(?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setDate(1, new java.sql.Date(contato.getDataCriacao()
					.getTime()));
			stmt.setDate(2, new java.sql.Date(contato.getDataAtualizacao()
					.getTime()));
			stmt.setString(3, contato.getNome());
			stmt.setString(4, contato.getTelefone());
			stmt.setString(5, contato.getCpf());
			stmt.setString(6, contato.getRg());
			stmt.setString(7, contato.getOrgaoExp());
			stmt.setString(8, contato.getEmail());
			stmt.close();
			con.close();
		} finally {
			con.close();
		}
	}

	public void update(Contato contato) throws Exception {
		Connection con = ConnectorJdbc.getConnection();
		try {
			String sql = "update contato set dataAtualizacao=?, "
					+ "nome=?, telefone=?,cpf=?,rg=?,orgaoExp=?,email=? "
					+ "where id=	" + contato.getId();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setDate(1, new java.sql.Date(contato.getDataAtualizacao()
					.getTime()));
			stmt.setString(2, contato.getNome());
			stmt.setString(3, contato.getTelefone());
			stmt.setString(4, contato.getCpf());
			stmt.setString(5, contato.getRg());
			stmt.setString(6, contato.getOrgaoExp());
			stmt.setString(7, contato.getEmail());
			stmt.close();
			con.close();
		} finally {
			con.close();
		}
	}

	public void delete(int id) throws Exception {
		Connection con = ConnectorJdbc.getConnection();
		try {
			String sql = "delete from contato where id=" + id;
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.execute();
			stmt.close();
			con.close();
		} finally {
			con.close();
		}
	}
}
