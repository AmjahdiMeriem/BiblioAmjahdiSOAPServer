package Server;

import javax.xml.ws.Endpoint;

import DAO.LangueLivreDAOImpl;

public class MainLangue {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:1922/ws/LangueLivreDAOImpl", new LangueLivreDAOImpl());
			System.out.println("Fait...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
