package classes_projet;

import java.util.Date;

public class Facture {
	
	private int num_facture;
	private Date date_facture;
	private double total;
	
	public Facture(int num_facture, Date date_facture, double total) {
		this.num_facture = num_facture;
		this.date_facture = date_facture;
		this.total = total;
	}

	public int getNum_facture() {
		return num_facture;
	}

	public void setNum_facture(int num_facture) {
		this.num_facture = num_facture;
	}

	public Date getDate_facture() {
		return date_facture;
	}

	public void setDate_facture(Date date_facture) {
		this.date_facture = date_facture;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void afficherFacture() {
        System.out.println("Numéro de facture : " + num_facture);
        System.out.println("Date de facture : " + date_facture);
        System.out.println("Total : " + total);
    }

}
