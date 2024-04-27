package classes_projet;

import java.util.Date;

public class Secretaire extends Admin {
	
	public Secretaire(int id_pers, String nom_pers, String prenom_pers, String cIN_pers, Date date_naissance_pers,int tele_pers, String email_pers, String adresse_pers, String position_pers, double salaire, int id_user,String login, String password, int num_secrt) {
		super(id_pers, nom_pers, prenom_pers, cIN_pers, date_naissance_pers, tele_pers, email_pers, adresse_pers,position_pers, salaire, id_user, login, password);
		this.num_secrt = num_secrt;
	}
	private int num_secrt;
	
	public int getNum_secrt() {
		return num_secrt;
	}
	public void setNum_secrt(int num_secrt) {
		this.num_secrt = num_secrt;
	}
	
}
