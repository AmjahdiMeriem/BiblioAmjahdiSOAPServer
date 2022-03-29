package DAO;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import Model.RoleUser;
import Model.User;
@WebService
public class UserDAOImpl {

	@WebMethod(operationName = "saveClient")
	public boolean saveClient(@WebParam(name = "user") User user) throws UnsupportedEncodingException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/AchatLivres ?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC",
					"root", "");
			PreparedStatement pr = cn.prepareStatement("INSERT INTO user VALUES(NULL,?,?,?,?)");
			pr.setString(1, user.getNameUser());
			pr.setString(2, user.getEmailUser());
			pr.setString(3, user.getPasswordUser());
			pr.setLong(4, user.getIdRoleUser());
			pr.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

//--------------------------------------------------------------------------------------------------------------------//
	@WebMethod(operationName = "deletClient")
	public void deletClient(@WebParam(name = "idUser") Long idUser) {
		// TODO Auto-generated method stub

	}

	// --------------------------------------------------------------------------------------------------------------------//
	@WebMethod(operationName = "findClientAll")
	public List<User> findClientAll() {
		// TODO Auto-generated method stub
		return null;
	}

	// --------------------------------------------------------------------------------------------------------------------//
	@WebMethod(operationName = "editColRole")
	public boolean editColRole(@WebParam(name = "idUser") Long idUser,@WebParam(name = "roleUser") RoleUser roleUser) {
		// TODO Auto-generated method stub
		return false;
	}
	// --------------------------------------------------------------------------------------------------------------------//
}
