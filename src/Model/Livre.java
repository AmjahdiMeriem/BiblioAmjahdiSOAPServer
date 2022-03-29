package Model;

public class Livre {
//------------------------------------------------------------------------------------------//	
	private Long ISBN;
	private String titre;
	private String auteur;
	private String editeur;
	private int annee;
	private Long idGenreLivre;
	private Long idLangueLivre;
	private int prix;
	private String description;
	private String urlImage;
//------------------------------------------------------------------------------------------//	
	public Livre() {}
//------------------------------------------------------------------------------------------//	
	public Long getISBN() {
		return ISBN;
	}
	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public Long getIdGenreLivre() {
		return idGenreLivre;
	}
	public void setIdGenreLivre(Long idGenreLivre) {
		this.idGenreLivre = idGenreLivre;
	}
	public Long getIdLangueLivre() {
		return idLangueLivre;
	}
	public void setIdLangueLivre(Long idLangueLivre) {
		this.idLangueLivre = idLangueLivre;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
