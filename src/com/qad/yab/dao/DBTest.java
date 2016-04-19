package com.qad.yab.dao;

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
		CVCUserDAO dao = new CVCUserDAO();
		dao.createUser("ccccccc", "b", "c");
		//dao.getUsers();
	}

}
