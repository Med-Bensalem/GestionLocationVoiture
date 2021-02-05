package entities;

import java.util.Date;

public class Conducteur {
	private static final long serialVersionUID = 1L;
	private int CodeCond;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String adresse;
	private String tel;
	private String email;
	private String cin;
	private Date datecin;
	private String permis ;
	private Date livraisonPermis;
	private Date dateCreation;
	
	
	
	public Conducteur() {
		super();
	}



	public Conducteur(String nom, String prenom, Date dateNaissance, String adresse, String tel, String email,
			String cin, Date datecin, String permis, Date livraisonPermis, Date dateCreation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.cin = cin;
		this.datecin = datecin;
		this.permis = permis;
		this.livraisonPermis = livraisonPermis;
		this.dateCreation = dateCreation;
	}



	public int getCodeCond() {
		return CodeCond;
	}



	public void setCodeCond(int codeCond) {
		CodeCond = codeCond;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Date getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCin() {
		return cin;
	}



	public void setCin(String cin) {
		this.cin = cin;
	}



	public Date getDatecin() {
		return datecin;
	}



	public void setDatecin(Date datecin) {
		this.datecin = datecin;
	}



	public String getPermis() {
		return permis;
	}



	public void setPermis(String permis) {
		this.permis = permis;
	}



	public Date getLivraisonPermis() {
		return livraisonPermis;
	}



	public void setLivraisonPermis(Date livraisonPermis) {
		this.livraisonPermis = livraisonPermis;
	}



	public Date getDateCreation() {
		return dateCreation;
	}



	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	

}
