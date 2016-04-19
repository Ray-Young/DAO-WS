package com.qad.yab.ws;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.gson.Gson;
import com.qad.yab.dao.CVCUserDAO;
import com.qad.yab.dto.User;

@Path("/user")
public class UserService {

	@GET
	@Path("/getUser")
	@Produces("application/json")
	public String getUserById(@QueryParam("loginID") String loginID) throws Exception {
		String users = null;
		CVCUserDAO dao = new CVCUserDAO();
		ArrayList<User> datas = dao.getUsers(loginID);
		Gson gson = new Gson();
		users = gson.toJson(datas);

		return users;
		// return "Hello World";
	}

//	@GET
//	@Path("/createUser")
//	@Produces("application/json")
//	public String createUser(@QueryParam("loginID") String loginID, @QueryParam("name") String name,
//			@QueryParam("email") String email) throws Exception {
//		CVCUserDAO dao = new CVCUserDAO();
//		dao.createUser(loginID, name, email);
//		// Gson gson = new Gson();
//		// users = gson.toJson(datas);
//		//
//		return "Success";
//	}

//	 @POST
//	 @Path("/createUser")
//	 @Consumes("application/x-www-form-urlencoded")
//	 public void createUser(@FormParam("loginID") String loginID,
//	 @FormParam("name") String name,
//	 @FormParam("email") String email) throws Exception {
//	 CVCUserDAO dao = new CVCUserDAO();
//	 dao.createUser(loginID, name, email);
//	 // Gson gson = new Gson();
//	 // users = gson.toJson(datas);
//	 //
//	 }
}
