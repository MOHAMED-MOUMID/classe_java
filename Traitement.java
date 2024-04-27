package classes_projet;

import java.util.Date;

public class Traitement {
	
	private int code_TRT;
	private Date date_TRT;
	private String medecin;
	private double prix_TRT;
	
	public Traitement(int code_TRT, Date date_TRT, String medecin, double prix_TRT) {
		this.code_TRT = code_TRT;
		this.date_TRT = date_TRT;
		this.medecin = medecin;
		this.prix_TRT = prix_TRT;
	}

	public int getCode_TRT() {
		return code_TRT;
	}

	public void setCode_TRT(int code_TRT) {
		this.code_TRT = code_TRT;
	}

	public Date getDate_TRT() {
		return date_TRT;
	}

	public void setDate_TRT(Date date_TRT) {
		this.date_TRT = date_TRT;
	}

	public String getMedecin() {
		return medecin;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	public double getPrix_TRT() {
		return prix_TRT;
	}

	public void setPrix_TRT(double prix_TRT) {
		this.prix_TRT = prix_TRT;
	}

}
