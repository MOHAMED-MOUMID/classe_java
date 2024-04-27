package classes_projet;

import java.util.Date;

public class Admin extends Personnel {

	private int id_user;
    private String login;
    private String password;
	
    public Admin(int id_pers, String nom_pers, String prenom_pers, String cIN_pers, Date date_naissance_pers,int tele_pers, String email_pers, String adresse_pers, String position_pers, double salaire, int id_user,String login, String password) {
		super(id_pers, nom_pers, prenom_pers, cIN_pers, date_naissance_pers, tele_pers, email_pers, adresse_pers,position_pers, salaire);
		this.id_user = id_user;
		this.login = login;
		this.password = password;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void authentification(String login, String motDePasse) {
        if (this.login.equals(login) && this.password.equals(motDePasse)) {
            System.out.println("Authentification réussie pour l'utilisateur avec l'ID : " + id_user);
        } else {
            System.out.println("Échec de l'authentification pour l'utilisateur avec l'ID : " + id_user);
        }
    }
	
	

}
