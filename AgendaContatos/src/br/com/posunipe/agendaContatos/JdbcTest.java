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
package br.com.posunipe.agendaContatos;

import java.util.Date;

import br.com.posunipe.agendaContatos.model.dao.ContatoDao;
import br.com.posunipe.agendaContatos.model.vo.Contato;

public class JdbcTest {
	public static void main(String[] args) {
		Contato c = new Contato();
		c.setCpf("0000");
		c.setRg("11111");
		c.setDataAtualizacao(new Date());
		c.setDataCriacao(new Date());
		c.setEmail("asdhaklsdasd");
		c.setNome("asdfladfsad");
		c.setOrgaoExp("sadfkljasdfjk");
		c.setTelefone("fksadjfkasdf");
		
		ContatoDao cdao = new ContatoDao();
		try {
			cdao.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
