package Server;

import javax.xml.ws.Endpoint;

import DAO.PannierDAOImpl;

public class MainPannier {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:1920/ws/PannierDAOImpl", new PannierDAOImpl());
			System.out.println("Fait...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
