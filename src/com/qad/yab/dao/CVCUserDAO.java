package com.qad.yab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.qad.yab.dto.User;


public class CVCUserDAO {
	private Connection conn;
//	public ArrayList<User> getusers(Connection connection) throws Exception {
//		ArrayList<User> userData = new ArrayList<User>();
//			PreparedStatement stmt = connection.prepareStatement("Select * from user");
//			ResultSet result = stmt.executeQuery();
//			ArrayList<HashMap<String, String>> datas = new ArrayList<HashMap<String, String>>();
//			while (result.next()) {
//				String status;
//				if (result.getInt("active") == 1)
//					status = "active";
//				else
//					status = "inactive";
//
//				HashMap<String, String> data = new HashMap<String, String>();
//				data.put("login_id", "" + result.getString("login_id"));
//				data.put("full_name", "" + result.getString("full_name"));
//				data.put("email", "" + result.getString("email"));
//				data.put("status", status);
//				datas.add(data);
//			}
//			stmt.close();
//			return datas;
//		}
//	}
	public ArrayList<User> getUsers() throws Exception {
		conn = new CVCJDBC().getConn();
		String sql = "select * from user;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet result = stmt.executeQuery();
		ArrayList<User> datas = new ArrayList<User>();
		while (result.next()) {
//			String status;
//			if (result.getInt("active") == 1)
//				status = "active";
//			else
//				status = "inactive";

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

}
