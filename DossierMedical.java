package classes_projet;

import java.util.Date;

public class DossierMedical {
	
	private int num_dossier;
    private Date date_creation;
    private String observation;
    
    public DossierMedical(int num_dossier, Date date_creation, String observation) {
		this.num_dossier = num_dossier;
		this.date_creation = date_creation;
		this.observation = observation;
	}
    
    public void résumé_de_paiement(double montantTotal) {
        String résumé = String.format("Dossier médical n° "+num_dossier+"Date de création : "+date_creation.toString()+"Observation : "+observation+"Montant total des paiements : "+montantTotal);
                System.out.println(résumé);
    }

	public int getNum_dossier() {
		return num_dossier;
	}

	public void setNum_dossier(int num_dossier) {
		this.num_dossier = num_dossier;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

}
