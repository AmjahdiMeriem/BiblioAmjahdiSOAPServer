package Server;

import javax.xml.ws.Endpoint;

import DAO.GenreLivreDAOImpl;

public class MainGenre {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:1921/ws/GenreLivreDAOImpl", new GenreLivreDAOImpl());
			System.out.println("Fait...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
