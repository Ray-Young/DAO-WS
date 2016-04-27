package client;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class Test {
	public static void main(String[] args) {
//		GetUser getUser = new GetUser();
//		getUser.getUser("rfy");
//		getUser.getUser("l9s");

		PostUser postUser = new PostUser();
		postUser.createUser("aaa111111111111", "bbb", "ccc");
	}

}
