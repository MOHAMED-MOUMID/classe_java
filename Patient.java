package classes_projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Patient {
	
	 private static List<Patient> listePatients = new ArrayList<>();
	 private int id_patient;
	 private String nom_patient;
	 private String prenom_patient; 
	 private String CIN_patient;
	 private Date date_naissance_patient;
	 private String adresse_patient; 
	 private String email_patient;
	 private String sexe_patient;
	 private String assurance_medicale;

	 public Patient(int id_patient, String nom_patient, String prenom_patient, String CIN_patient, Date date_naissance_patient, String adresse_patient, String email_patient, String sexe_patient, String assurance_medicale) {
		 
		 this.id_patient = id_patient;  
		 this.nom_patient = nom_patient;  
		 this.prenom_patient = prenom_patient; 
		 this.CIN_patient = CIN_patient;  
		 this.date_naissance_patient = date_naissance_patient;  
		 this.adresse_patient = adresse_patient;  
		 this.email_patient = email_patient;  
		 this.sexe_patient = sexe_patient;  
		 this.assurance_medicale = assurance_medicale;
	 }

	public int getId_patient() {
		return id_patient;
	}

	public void setId_patient(int id_patient) {
		this.id_patient = id_patient;
	}

	public String getNom_patient() {
		return nom_patient;
	}

	public void setNom_patient(String nom_patient) {
		this.nom_patient = nom_patient;
	}

	public String getPrenom_patient() {
		return prenom_patient;
	}

	public void setPrenom_patient(String prenom_patient) {
		this.prenom_patient = prenom_patient;
	}

	public String getCIN_patient() {
		return CIN_patient;
	}

	public void setCIN_patient(String cIN_patient) {
		CIN_patient = cIN_patient;
	}

	public Date getDate_naissance_patient() {
		return date_naissance_patient;
	}

	public void setDate_naissance_patient(Date date_naissance_patient) {
		this.date_naissance_patient = date_naissance_patient;
	}

	public String getAdresse_patient() {
		return adresse_patient;
	}

	public void setAdresse_patient(String adresse_patient) {
		this.adresse_patient = adresse_patient;
	}

	public String getEmail_patient() {
		return email_patient;
	}

	public void setEmail_patient(String email_patient) {
		this.email_patient = email_patient;
	}

	public String getSexe_patient() {
		return sexe_patient;
	}

	public void setSexe_patient(String sexe_patient) {
		this.sexe_patient = sexe_patient;
	}

	public String getAssurance_medicale() {
		return assurance_medicale;
	}

	public void setAssurance_medicale(String assurance_medicale) {
		this.assurance_medicale = assurance_medicale;
	}
	
	public void ajouter_Patient(Patient patient) {
		listePatients.add(patient);
        System.out.println("Le patient ajouté avec succès.");
    }
	public void modifier_Patient(Patient patient) {
        for (Patient p : listePatients) {
            if (p.getId_patient() == patient.getId_patient()) {
                p.setNom_patient(patient.getNom_patient());
                p.setPrenom_patient(patient.getPrenom_patient());
                p.setCIN_patient(patient.getCIN_patient());
                p.setDate_naissance_patient(patient.getDate_naissance_patient());
                p.setAdresse_patient(patient.getAdresse_patient());
                p.setEmail_patient(patient.getEmail_patient());
                p.setSexe_patient(patient.getSexe_patient());
                p.setAssurance_medicale(patient.getAssurance_medicale());
                System.out.println("Les informations du patient ont été mises à jour avec succès.");
                return;
            }
        }
        System.out.println("Patient non trouvé pour la modification.");
    }
	public void supprimer_Patient(int id_patient) {
        for (Patient patient : listePatients) {
            if (patient.getId_patient() == id_patient) {
            	listePatients.remove(patient);
                System.out.println("Le patient supprimé avec succès.");
                return;
            }
        }
        System.out.println("Patient n'exist pas.");
    }
	

    public static List<Patient> getListePatients() {
        return listePatients;
    }
	
	//public DossierMedical getDossierMedical() {
	//        return dossierMedical;
	//}

    
}
