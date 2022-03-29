package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import Model.LangueLivre;
@WebService
public class LangueLivreDAOImpl{
//--------------------------------------------------------------------------------------------------------------------//
	@WebMethod(operationName = "findLangueAll")
	public List<LangueLivre> findLangueAll() {
		LangueLivre langue = new LangueLivre();
		List<LangueLivre> langues = new ArrayList<LangueLivre>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/AchatLivres ?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC",
					"root", "");
			PreparedStatement pr = cn.prepareStatement("SELECT * FROM languelivre");
			ResultSet r = pr.executeQuery();
			while (r.next()) {
				langue.setIdLangueLivre(r.getLong(1));
				langue.setNomLangueLivre(r.getString(2));

				langues.add(langue);
				langue = new LangueLivre();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return langues;
	}

//--------------------------------------------------------------------------------------------------------------------//
	@WebMethod(operationName = "addLangueLivre")
	public void addLangueLivre(@WebParam(name = "langue") LangueLivre langue) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/AchatLivres ?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC",
					"root", "");
			PreparedStatement pr = cn.prepareStatement("INSERT INTO langueLivre VALUES(NULL,?)");
			pr.setString(1, langue.getNomLangueLivre());
			pr.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//--------------------------------------------------------------------------------------------------------------------//
	@WebMethod(operationName = "removeLangueLivre")
	public void removeLangueLivre(@WebParam(name = "idLangue") Long idLangue) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/AchatLivres ?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC",
					"root", "");

			PreparedStatement pr = cn.prepareStatement("DELETE FROM languelivre WHERE idLangueLivre=?");

			pr.setLong(1, idLangue);
			pr.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//--------------------------------------------------------------------------------------------------------------------//
}
