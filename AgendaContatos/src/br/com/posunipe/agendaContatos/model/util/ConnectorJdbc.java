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
package br.com.posunipe.agendaContatos.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorJdbc {
	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/agendaContatos",
					"postgres", "mv13wavaty");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
