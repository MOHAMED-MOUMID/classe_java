package classes_projet;

public class Produit {
	
	private int id_produit;
    private int qte;
    private double prix_unitaire;
    private String nom_produit;
    
    public Produit(int id_produit, int qte, double prix_unitaire, String nom_produit) {
		this.id_produit = id_produit;
		this.qte = qte;
		this.prix_unitaire = prix_unitaire;
		this.nom_produit = nom_produit;
	}

	public int getId_produit() {
		return id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public double getPrix_unitaire() {
		return prix_unitaire;
	}

	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}
	
	
	public void ajouter_produit(int qteAjoutee) {
        this.qte += qteAjoutee;
    }
	
	public void modifier_produit(double nouveauPrix, String nouveauNom) {
        this.prix_unitaire = nouveauPrix;
        this.nom_produit = nouveauNom;
    }
	
	public void supprimer_produit() {
		//on initialise tout les valeurs
        this.qte = 0;
        this.prix_unitaire = 0.0;
        this.nom_produit = "";
    }
    
}
