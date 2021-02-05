package entities;

public class User {
	private static final long serialVersionUID = 1L;
	private int CodeU;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private boolean admin;
	
	public User() {
		super();
	}

	public User(String nom, String prenom, String login, String password, boolean admin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.admin = admin;
	}

	public int getCodeU() {
		return CodeU;
	}

	public void setCodeU(int codeU) {
		CodeU = codeU;
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

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public boolean isValid() {
        return true;
	}
	
	
	

}
