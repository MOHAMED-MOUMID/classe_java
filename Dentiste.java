package classes_projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Dentiste extends Admin {
	
	private static List<Personnel> listePersonnel = new ArrayList<>();
	
	private int num_dentiste;
	
	public Dentiste(int id_pers, String nom_pers, String prenom_pers, String cIN_pers, Date date_naissance_pers,int tele_pers, String email_pers, String adresse_pers, String position_pers, double salaire, int id_user,String login, String password, int num_dentiste) {
		super(id_pers, nom_pers, prenom_pers, cIN_pers, date_naissance_pers, tele_pers, email_pers, adresse_pers,position_pers, salaire, id_user, login, password);
		this.num_dentiste = num_dentiste;
	}
	
	
	public int getNum_dentiste() {
		return num_dentiste;
	}

	public void setNum_dentiste(int num_dentiste) {
		this.num_dentiste = num_dentiste;
	}
	
	public void ajouter_Pers(Personnel personnel) {
		listePersonnel.add(personnel);
        System.out.println("Le membre du personnel ajouté avec succès.");
    }
	
	public void modifier_Pers(Personnel personnel) {
        for (Personnel p : listePersonnel) {
            if (p.getId_pers() == personnel.getId_pers()) {
                p.setNom_pers(personnel.getNom_pers());
                p.setPrenom_pers(personnel.getPrenom_pers());
                p.setCIN_pers(personnel.getCIN_pers());
                p.setDate_naissance_pers(personnel.getDate_naissance_pers());
                p.setTele_pers(personnel.getTele_pers());
                p.setEmail_pers(personnel.getEmail_pers());
                p.setAdresse_pers(personnel.getAdresse_pers());
                p.setPosition_pers(personnel.getPosition_pers());
                p.setSalaire(personnel.getSalaire());
                System.out.println("Les informations du membre du personnel ont été mises à jour avec succès.");
                return;
            }
        }
        System.out.println("Membre du personnel non trouvé pour la modification.");
    }
	
	public void supprimer_Pers(int id_pers) {
        for (Personnel personnel : listePersonnel) {
            if (personnel.getId_pers() == id_pers) {
            	listePersonnel.remove(personnel);
                System.out.println("Le membre du personnel supprimé avec succès.");
                return;
            }
        }
        System.out.println("Membre du personnel non trouvé pour la suppression.");
    }

	
}
