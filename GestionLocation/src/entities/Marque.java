package entities;

public class Marque {
	private static final long serialVersionUID = 1L;
	private int CodeMq;
	private String nom;
	public Marque(String nom) {
		super();
		this.nom = nom;
	}
	public Marque() {
		super();
	}
	public int getCodeMq() {
		return CodeMq;
	}
	public void setCodeMq(int codeMq) {
		CodeMq = codeMq;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
