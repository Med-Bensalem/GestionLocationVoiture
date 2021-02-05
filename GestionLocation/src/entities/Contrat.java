package entities;

import java.util.Date;

public class Contrat {
	private static final long serialVersionUID = 1L;
	private int codeCon;
	private Date dateContrat;
	private int codeSoc;
	private int codeCond1;
	private int codeCond2;
	private Date datedeb;
	private Date datefin;
	private float prixUni;
	private float tot;
	private float avance;
	private Date dateCrea;
	
	
	public Contrat() {
		super();
	}
	
	public Contrat(Date dateContrat, int codeSoc, int codeCond1, int codeCond2, Date datedeb, Date datefin,
			float prixUni, float tot, float avance, Date dateCrea) {
		super();
		this.dateContrat = dateContrat;
		this.codeSoc = codeSoc;
		this.codeCond1 = codeCond1;
		this.codeCond2 = codeCond2;
		this.datedeb = datedeb;
		this.datefin = datefin;
		this.prixUni = prixUni;
		this.tot = tot;
		this.avance = avance;
		this.dateCrea = dateCrea;
	}


	public int getCodeCon() {
		return codeCon;
	}
	public void setCodeCon(int codeCon) {
		this.codeCon = codeCon;
	}
	public Date getDateContrat() {
		return dateContrat;
	}
	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}
	public int getCodeSoc() {
		return codeSoc;
	}
	public void setCodeSoc(int codeSoc) {
		this.codeSoc = codeSoc;
	}
	public int getCodeCond1() {
		return codeCond1;
	}
	public void setCodeCond1(int codeCond1) {
		this.codeCond1 = codeCond1;
	}
	public int getCodeCond2() {
		return codeCond2;
	}
	public void setCodeCond2(int codeCond2) {
		this.codeCond2 = codeCond2;
	}
	public Date getDatedeb() {
		return datedeb;
	}
	public void setDatedeb(Date datedeb) {
		this.datedeb = datedeb;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	public float getPrixUni() {
		return prixUni;
	}
	public void setPrixUni(float prixUni) {
		this.prixUni = prixUni;
	}
	public float getTot() {
		return tot;
	}
	public void setTot(float tot) {
		this.tot = tot;
	}
	public float getAvance() {
		return avance;
	}
	public void setAvance(float avance) {
		this.avance = avance;
	}
	public Date getDateCrea() {
		return dateCrea;
	}
	public void setDateCrea(Date dateCrea) {
		this.dateCrea = dateCrea;
	}
	
	
	
	

}
