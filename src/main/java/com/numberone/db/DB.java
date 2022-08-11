package com.numberone.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	public static Connection getConnection() {
		if(conn == null) {
			try {
				Properties p = loadProperties();
				String url = p.getProperty("spring.datasource.url");
				conn = DriverManager.getConnection(url);
			}
			catch(SQLException e) {
					throw new DbException(e.getMessage());
			}
		}
		return conn;		
	}
	
	public static void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	private static Properties loadProperties() {

		// Carregar as propriedades de conex�o com o MySQL
		try (FileInputStream fs = new FileInputStream("application-dev.properties")) {
			Properties p = new Properties();
			p.load(fs);
			return p;
		}
		// tratar a excess�o de filenotfound e a IOException... usa o IO que trata as
		// duas e lan�a uma excess�o personalizada pra ganhar tempo
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}

	}

}
