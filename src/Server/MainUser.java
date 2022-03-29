package Server;

import javax.xml.ws.Endpoint;

import DAO.UserDAOImpl;

public class MainUser {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:1918/ws/UserDAOImpl", new UserDAOImpl());
			System.out.println("Fait...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
