package entities;

public class Modele {
	private static final long serialVersionUID = 1L;
	private int CodeM;
	private String nom;
	
	
	
	public Modele() {
		super();
	}

	public Modele(String nom) {
		super();
		this.nom = nom;
	}

	public int getCodeM() {
		return CodeM;
	}

	public void setCodeM(int codeM) {
		CodeM = codeM;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
