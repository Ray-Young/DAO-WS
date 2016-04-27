package client;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class PostUser {

	public void createUser(String loginID, String name, String email) {
		try {
			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:8080/YAB-CVC-WS/REST/user/createUser?");
			MultivaluedMap<String, String> postBody = new MultivaluedMapImpl();
			postBody.add("loginID", loginID);
			postBody.add("name", name);
			postBody.add("email", email);

			ClientResponse response = webResource.type("application/x-www-form-urlencoded").post(ClientResponse.class,
					postBody);

			if (response.getStatus() != 200 && response.getEntity(String.class) == "Success") {
				throw new RuntimeException("Failed: HTTP error code: " + response.getStatus());

			}

			System.out.println("User created Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
