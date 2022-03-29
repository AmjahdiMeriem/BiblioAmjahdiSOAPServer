package Model;

public class User {
//-----------------------------------------------------------------------------------------//	
	private Long idUser;
	private String nameUser;
	private String emailUser;
	private String passwordUser;
	private Long idRoleUser;
//-----------------------------------------------------------------------------------------//
	public User() {}
//-----------------------------------------------------------------------------------------//
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public Long getIdRoleUser() {
		return idRoleUser;
	}
	public void setIdRoleUser(Long idRoleUser) {
		this.idRoleUser = idRoleUser;
	}
//-----------------------------------------------------------------------------------------//
}
