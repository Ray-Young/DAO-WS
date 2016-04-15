package com.qad.yab.dao;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.qad.yab.dto.User;

public class DBTest {
	public static void main(String[] args) throws Exception {
//		CVCUserDAO dao = new CVCUserDAO();
//		ArrayList<User> datas = dao.getUsers();
//		for (User data : datas) {
//			System.out.println(data.getId());
//			System.out.println(data.getName());
//			System.out.println(data.getLoginID());
//			System.out.println(data.getEmail());
//		} 		
		String users = null;
		CVCUserDAO dao = new CVCUserDAO();
		ArrayList<User> datas = dao.getUsers();
		Gson gson = new Gson();
		users = gson.toJson(datas); 

		System.out.println(users);
	}

}
