package classes_projet;

import java.util.Date;

public class Rapport {
	private int num_rap;
	private Date date_rap;
	private int nbr_pat;
	private int stock_entrer;
	private int stock_sortie;
	private int nbr_pers;
	
	public Rapport(int num_rap, Date date_rap, int nbr_pat, int stock_entrer, int stock_sortie, int nbr_pers) {
		this.num_rap = num_rap;
		this.date_rap = date_rap;
		this.nbr_pat = nbr_pat;
		this.stock_entrer = stock_entrer;
		this.stock_sortie = stock_sortie;
		this.nbr_pers = nbr_pers;
	}

	public int getNum_rap() {
		return num_rap;
	}

	public void setNum_rap(int num_rap) {
		this.num_rap = num_rap;
	}

	public Date getDate_rap() {
		return date_rap;
	}

	public void setDate_rap(Date date_rap) {
		this.date_rap = date_rap;
	}

	public int getNbr_pat() {
		return nbr_pat;
	}

	public void setNbr_pat(int nbr_pat) {
		this.nbr_pat = nbr_pat;
	}

	public int getStock_entrer() {
		return stock_entrer;
	}

	public void setStock_entrer(int stock_entrer) {
		this.stock_entrer = stock_entrer;
	}

	public int getStock_sortie() {
		return stock_sortie;
	}

	public void setStock_sortie(int stock_sortie) {
		this.stock_sortie = stock_sortie;
	}

	public int getNbr_pers() {
		return nbr_pers;
	}

	public void setNbr_pers(int nbr_pers) {
		this.nbr_pers = nbr_pers;
	}
	
	public void afficher_rap() {
        System.out.println("Numéro de rapport : " + num_rap);
        System.out.println("Date du rapport : " + date_rap);
        System.out.println("Nombre de patients : " + nbr_pat);
        System.out.println("Stock initial : " + stock_entrer);
        System.out.println("Stock final : " + stock_sortie);
        System.out.println("Nombre de personnes présentes : " + nbr_pers);
    }
}
