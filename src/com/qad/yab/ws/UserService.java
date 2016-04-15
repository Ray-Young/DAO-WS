package com.qad.yab.ws;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.qad.yab.dao.CVCUserDAO;
import com.qad.yab.dto.User;

@Path("/webService")
public class UserService {

	@GET
	@Path("/cvcuser")
	@Produces("application/json")
	public String user() throws Exception {
		String users = null;
		CVCUserDAO dao = new CVCUserDAO();
		ArrayList<User> datas = dao.getUsers();
		Gson gson = new Gson();
		users = gson.toJson(datas);

		return users;
	}
}
