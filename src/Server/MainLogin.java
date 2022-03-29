package Server;

import javax.xml.ws.Endpoint;

import DAO.LoginDAOImpl;

public class MainLogin {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:1919/ws/LoginDAOImpl", new LoginDAOImpl());
			System.out.println("Fait...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
