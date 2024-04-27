package classes_projet;

import java.util.Date;

public class FichePaiment {
	
	private int code_paiement;
	private Date date_paiement;
	private double montant_paye;
	private boolean indicateur_paye;
	
	public FichePaiment(int code_paiement, Date date_paiement, double montant_paye, boolean indicateur_paye) {

		this.code_paiement = code_paiement;
		this.date_paiement = date_paiement;
		this.montant_paye = montant_paye;
		this.indicateur_paye = indicateur_paye;
	}

	public int getCode_paiement() {
		return code_paiement;
	}

	public void setCode_paiement(int code_paiement) {
		this.code_paiement = code_paiement;
	}

	public Date getDate_paiement() {
		return date_paiement;
	}

	public void setDate_paiement(Date date_paiement) {
		this.date_paiement = date_paiement;
	}

	public double getMontant_paye() {
		return montant_paye;
	}

	public void setMontant_paye(double montant_paye) {
		this.montant_paye = montant_paye;
	}

	public boolean isIndicateur_paye() {
		return indicateur_paye;
	}

	public void setIndicateur_paye(boolean indicateur_paye) {
		this.indicateur_paye = indicateur_paye;
	}

}
