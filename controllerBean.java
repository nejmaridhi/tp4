package beans;

public class controllerBean {
	private String nom;
	private String pr�nom;
	private String adresse;
	private String telephone;
	private String email;
	
	
	public controllerBean() {
		setNom("");
		setPr�nom("");
		setAdresse("");
		setTelephone("");
		setEmail("");
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPr�nom() {
		return pr�nom;
	}


	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
