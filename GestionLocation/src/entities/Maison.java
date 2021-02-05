package entities;

public class Maison {
	private static final long serialVersionUID = 1L;
	private int CodeMs;
	private String nom;
	
	public Maison(String nom) {
		super();
		this.nom = nom;
	}

	public Maison() {
		super();
	}

	public int getCodeMs() {
		return CodeMs;
	}

	public void setCodeMs(int codeMs) {
		CodeMs = codeMs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
