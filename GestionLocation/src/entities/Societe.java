package entities;

import java.util.Date;

public class Societe {
	private static final long serialVersionUID = 1L;
	private int CodeSociete;
	private String nom;
	private String adresse;
	private String tel;
	private String email;
	private boolean personne;
	private Date dateCreation;
	private String nomRep;
	private String prenomRep;
	private String telRep;
	
	public Societe(String nom, String adresse, String tel, String email, boolean personne, Date dateCreation,
			String nomRep, String prenomRep, String telRep) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.personne = personne;
		this.dateCreation = dateCreation;
		this.nomRep = nomRep;
		this.prenomRep = prenomRep;
		this.telRep = telRep;
	}

	public Societe() {
		super();
	}

	public int getCodeSociete() {
		return CodeSociete;
	}

	public void setCodeSociete(int codeSociete) {
		CodeSociete = codeSociete;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public boolean isPersonne() {
		return personne;
	}

	public void setPersonne(boolean personne) {
		this.personne = personne;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getNomRep() {
		return nomRep;
	}

	public void setNomRep(String nomRep) {
		this.nomRep = nomRep;
	}

	public String getPrenomRep() {
		return prenomRep;
	}

	public void setPrenomRep(String prenomRep) {
		this.prenomRep = prenomRep;
	}

	public String getTelRep() {
		return telRep;
	}

	public void setTelRep(String telRep) {
		this.telRep = telRep;
	}


	
	
	
	

}
