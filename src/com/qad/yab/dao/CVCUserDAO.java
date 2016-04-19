package com.qad.yab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.qad.yab.dto.User;

public class CVCUserDAO {
	private Connection conn;

	public ArrayList<User> getUsers() throws Exception {
		conn = new CVCJDBC().getConn();
		String sql = "select * from user;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet result = stmt.executeQuery();
		ArrayList<User> datas = new ArrayList<User>();
		while (result.next()) {

			User data = new User();
			data.setId(result.getInt("id"));
			data.setLoginID(result.getString("LoginID"));
			data.setName(result.getString("name"));
			data.setEmail(result.getString("email"));
			datas.add(data);
		}
		stmt.close();
		return datas;
	}

	public ArrayList<User> getUsers(String loginID) throws Exception {
		conn = new CVCJDBC().getConn();
		String sql = "select * from user where LoginID = '" + loginID + "';";
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet result = stmt.executeQuery();
		ArrayList<User> datas = new ArrayList<User>();
		while (result.next()) {

			User data = new User();
			data.setId(result.getInt("id"));
			data.setLoginID(result.getString("LoginID"));
			data.setName(result.getString("name"));
			data.setEmail(result.getString("email"));
			datas.add(data);
		}
		stmt.close();
		return datas;
	}

	public void createUser(String loginId, String name, String email) {
		try {
			conn = new CVCJDBC().getConn();
			String sql = "insert into user (LoginID, name, email) values(?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, loginId);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			System.err.println("ERROR: Exception in create User");

		}
	}
}
