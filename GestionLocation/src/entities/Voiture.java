package entities;

import java.util.Date;

public class Voiture {
	private static final long serialVersionUID = 1L;
	private int CodeV;
	private String mat;
	private String numCarteGrise;
	private String kilo;
	private Date dateCir;
	private int codeM;
	private int codeMq;
	private int codeMs;
	public Voiture() {
		super();
	}
	
	public Voiture(String mat, String numCarteGrise, String kilo, Date dateCir, int codeM, int codeMq, int codeMs) {
		super();
		this.mat = mat;
		this.numCarteGrise = numCarteGrise;
		this.kilo = kilo;
		this.dateCir = dateCir;
		this.codeM = codeM;
		this.codeMq = codeMq;
		this.codeMs = codeMs;
	}

	public int getCodeV() {
		return CodeV;
	}
	public void setCodeV(int codeV) {
		CodeV = codeV;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getNumCarteGrise() {
		return numCarteGrise;
	}
	public void setNumCarteGrise(String numCarteGrise) {
		this.numCarteGrise = numCarteGrise;
	}
	public String getKilo() {
		return kilo;
	}
	public void setKilo(String kilo) {
		this.kilo = kilo;
	}
	public Date getDateCir() {
		return dateCir;
	}
	public void setDateCir(Date dateCir) {
		this.dateCir = dateCir;
	}
	public int getCodeM() {
		return codeM;
	}
	public void setCodeM(int codeM) {
		this.codeM = codeM;
	}
	public int getCodeMq() {
		return codeMq;
	}
	public void setCodeMq(int codeMq) {
		this.codeMq = codeMq;
	}
	public int getCodeMs() {
		return codeMs;
	}
	public void setCodeMs(int codeMs) {
		this.codeMs = codeMs;
	}
	
	

}
