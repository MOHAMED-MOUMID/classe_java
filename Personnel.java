package classes_projet;


import java.util.Date;

public class Personnel {
	
	private int id_pers;
	private String nom_pers;
	private String prenom_pers;
	private String CIN_pers;
	private Date date_naissance_pers;
	private int tele_pers;
	private String email_pers;
	private String adresse_pers;
	private String position_pers;
	private double salaire;
	
	public Personnel(int id_pers, String nom_pers, String prenom_pers,String cIN_pers, Date date_naissance_pers, int tele_pers, String email_pers, String adresse_pers,String position_pers, double salaire) {
		this.id_pers = id_pers;
		this.nom_pers = nom_pers;
		this.prenom_pers = prenom_pers;
		this.CIN_pers = cIN_pers;
		this.date_naissance_pers = date_naissance_pers;
		this.tele_pers = tele_pers;
		this.email_pers = email_pers;
		this.adresse_pers = adresse_pers;
		this.position_pers = position_pers;
		this.salaire = salaire;
	}

	public int getId_pers() {
		return id_pers;
	}

	public void setId_pers(int id_pers) {
		this.id_pers = id_pers;
	}

	public String getNom_pers() {
		return nom_pers;
	}

	public void setNom_pers(String nom_pers) {
		this.nom_pers = nom_pers;
	}

	public String getPrenom_pers() {
		return prenom_pers;
	}

	public void setPrenom_pers(String prenom_pers) {
		this.prenom_pers = prenom_pers;
	}

	public String getCIN_pers() {
		return CIN_pers;
	}

	public void setCIN_pers(String cIN_pers) {
		CIN_pers = cIN_pers;
	}

	public Date getDate_naissance_pers() {
		return date_naissance_pers;
	}

	public void setDate_naissance_pers(Date date_naissance_pers) {
		this.date_naissance_pers = date_naissance_pers;
	}

	public int getTele_pers() {
		return tele_pers;
	}

	public void setTele_pers(int tele_pers) {
		this.tele_pers = tele_pers;
	}

	public String getEmail_pers() {
		return email_pers;
	}

	public void setEmail_pers(String email_pers) {
		this.email_pers = email_pers;
	}

	public String getAdresse_pers() {
		return adresse_pers;
	}

	public void setAdresse_pers(String adresse_pers) {
		this.adresse_pers = adresse_pers;
	}

	public String getPosition_pers() {
		return position_pers;
	}

	public void setPosition_pers(String position_pers) {
		this.position_pers = position_pers;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	
}
