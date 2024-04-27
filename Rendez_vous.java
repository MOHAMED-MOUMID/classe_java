package classes_projet;

import java.util.ArrayList;
import java.util.List;

public class Rendez_vous {
	
	private static List<Rendez_vous> listeRDV = new ArrayList<>();
	
	private int code_RDV;
    private int heure;
    private int jour;
    private int mois;
    private int annee;
    private String service;
    private String medecin;
    private boolean validation_RDV;
    
    public Rendez_vous(int code_RDV, int heure, int jour, int mois, int annee, String service, String medecin,boolean validation_RDV) {
		this.code_RDV = code_RDV;
		this.heure = heure;
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
		this.service = service;
		this.medecin = medecin;
		this.validation_RDV = validation_RDV;
	}

	public int getCode_RDV() {
		return code_RDV;
	}

	public void setCode_RDV(int code_RDV) {
		this.code_RDV = code_RDV;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMedecin() {
		return medecin;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	public boolean isValidation_RDV() {
		return validation_RDV;
	}

	public void setValidation_RDV(boolean validation_RDV) {
		this.validation_RDV = validation_RDV;
	}
	
	public boolean ajouter_RDV(List<Rendez_vous> listeRDV, Rendez_vous nouveauRDV) {
        for (Rendez_vous rdv : listeRDV) {
            if (rdv.getCode_RDV() == nouveauRDV.getCode_RDV()) {
                System.out.println("Erreur : Le rendez-vous existe déjà.");
                return false;
            }
        }
        
        listeRDV.add(nouveauRDV);
        System.out.println("Le rendez-vous ajouté avec succès.");
        return true;
    }
	
	public void modifier_RDV(List<Rendez_vous> listeRDV, int codeRDV, Rendez_vous nouveauRDV) {
        for (Rendez_vous rdv : listeRDV) {
            if (rdv.getCode_RDV() == codeRDV) {
            	
                rdv.setHeure(nouveauRDV.getHeure());
                rdv.setJour(nouveauRDV.getJour());
                rdv.setMois(nouveauRDV.getMois());
                rdv.setAnnee(nouveauRDV.getAnnee());
                rdv.setService(nouveauRDV.getService());
                rdv.setMedecin(nouveauRDV.getMedecin());
                rdv.setValidation_RDV(nouveauRDV.isValidation_RDV());
                System.out.println("Le rendez-vous modifié avec succès.");
                return;
            }
        }
        System.out.println("Erreur : Rendez-vous non trouvé pour la modification.");
    }
	
	public boolean annuler(List<Rendez_vous> listeRDV, int codeRDV) {
        for (Rendez_vous rdv : listeRDV) {
            if (rdv.getCode_RDV() == codeRDV) {
                listeRDV.remove(rdv);
                System.out.println("Le rendez-vous annulé avec succès.");
                return true;
            }
        }
        System.out.println("Erreur : Rendez-vous non trouvé pour l'annulation.");
        return false;
    }
	
	public void afficher(Rendez_vous rdv) {
        System.out.println("Code RDV : " + rdv.getCode_RDV());
        System.out.println("Heure : " + rdv.getHeure());
        System.out.println("Date : " + rdv.getJour() + "/" + rdv.getMois() + "/" + rdv.getAnnee());
        System.out.println("Service : " + rdv.getService());
        System.out.println("Médecin : " + rdv.getMedecin());
        System.out.println("Validation : " + (rdv.isValidation_RDV() ? "Validé" : "Non validé"));
    }

    

}
