package Model;

public class Pannier {
	//------------------------------------------------------------------------------------------//
	private Long id;
	private Long idUser;
	private Long ISBN;
	//------------------------------------------------------------------------------------------//
	public Pannier() {}
	//------------------------------------------------------------------------------------------//
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	//------------------------------------------------------------------------------------------//
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	//------------------------------------------------------------------------------------------//
	public Long getISBN() {
		return ISBN;
	}
	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}
	//------------------------------------------------------------------------------------------//
}
