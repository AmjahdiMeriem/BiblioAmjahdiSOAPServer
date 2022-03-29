package Server;

import javax.xml.ws.Endpoint;

import DAO.LivreDAOImpl;

public class MainLivre {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:1917/ws/LivreDAOImpl", new LivreDAOImpl());
			System.out.println("Fait...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
