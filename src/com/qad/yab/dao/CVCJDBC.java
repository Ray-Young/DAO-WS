package com.qad.yab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CVCJDBC {
	private Connection conn;

	public Connection getConn() throws ClassNotFoundException, SQLException {
		if (null != conn) {
			return conn;
		} else {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "cvc", "");
			System.out.println("connect success");
			return conn;
		}
	}
}