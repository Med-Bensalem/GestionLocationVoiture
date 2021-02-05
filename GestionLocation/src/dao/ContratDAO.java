package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Conducteur;
import entities.Contrat;



public class ContratDAO {
	public void ajouter (Contrat c) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("insert into contrat Values (null,?,?,?,?,?,?,?,?,?,?) ");
			ps.setDate(1,  new java.sql.Date(c.getDateContrat().getTime()));
			ps.setInt(2, c.getCodeSoc());
			ps.setInt(3,c.getCodeCond1());
			ps.setInt(4,c.getCodeCond2());
			ps.setDate(5,  new java.sql.Date(c.getDatedeb().getTime()));
			ps.setDate(6,  new java.sql.Date(c.getDatefin().getTime()));
			ps.setFloat(7, c.getPrixUni());
			ps.setFloat(8,c.getTot());
			ps.setFloat(9, c.getAvance());
			ps.setDate(10,  new java.sql.Date(c.getDateCrea().getTime()));
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	
	
	}
	
	public void modifier (Contrat c) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("update contrat set dateContrat= ?, codSoc = ?,codCon1 = ? , codCon2 = ? ,datedeb =?,datefin=?,prixU=?,prixTot=?,avance=?,dateCrea=? where idC = ? ");
			ps.setDate(1,  new java.sql.Date(c.getDateContrat().getTime()));
			ps.setInt(2, c.getCodeSoc());
			ps.setInt(3,c.getCodeCond1());
			ps.setInt(4,c.getCodeCond2());
			ps.setDate(5,  new java.sql.Date(c.getDatedeb().getTime()));
			ps.setDate(6,  new java.sql.Date(c.getDatefin().getTime()));
			ps.setFloat(7, c.getPrixUni());
			ps.setFloat(8,c.getTot());
			ps.setFloat(9, c.getAvance());
			ps.setDate(10,  new java.sql.Date(c.getDateCrea().getTime()));
			ps.setInt(11,c.getCodeCon());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
	public List<Contrat> getAll() {
		Connection connection = ConnectionBD.getConnection();
	
		List<Contrat> cons = new ArrayList<Contrat>();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from contrat  ");
			 
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				Contrat c =new Contrat();
				 c.setCodeCon(rs.getInt("idC"));
				 c.setDateContrat(rs.getDate("dateContrat"));
				 c.setCodeSoc(rs.getInt("codSoc"));
				 c.setCodeCond1(rs.getInt("codCon1"));
				 c.setCodeCond2(rs.getInt("codCon2"));
				 c.setDatedeb(rs.getDate("datedeb"));
				 c.setDatefin(rs.getDate("datefin"));
				 c.setPrixUni(rs.getFloat("prixU"));
				 c.setTot(rs.getFloat("prixTot"));
				 c.setAvance(rs.getFloat("avance"));
				 c.setDateCrea(rs.getDate("dateCrea"));
				 
				 cons.add(c);
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cons;
		
	}
	public Contrat getContratById(int code) {
		Connection connection = ConnectionBD.getConnection();
		Contrat c = new Contrat();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from contrat Where idC= ? ");
			 ps.setInt(1, code);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 c.setCodeCon(rs.getInt("idC"));
				 c.setDateContrat(rs.getDate("dateContrat"));
				 c.setCodeSoc(rs.getInt("codSoc"));
				 c.setCodeCond1(rs.getInt("codCon1"));
				 c.setCodeCond2(rs.getInt("codCon2"));
				 c.setDatedeb(rs.getDate("datedeb"));
				 c.setDatefin(rs.getDate("datefin"));
				 c.setPrixUni(rs.getFloat("prixU"));
				 c.setTot(rs.getFloat("prixTot"));
				 c.setAvance(rs.getFloat("avance"));
				 c.setDateCrea(rs.getDate("dateCrea"));
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return c;
		
	}
	public void supprimer (int code) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("delete from contrat where idC = ? ");
			ps.setInt(1, code);
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}	
	}
	
	
	public String getConducteur(int id) {        
		String sr = null;      
		Connection cnx = ConnectionBD.getConnection();      
		try {             
			PreparedStatement ps = cnx.prepareStatement("select * from conducteur where codeC=? ");          
			ps.setInt(1, id);             
			ResultSet rs=ps.executeQuery();            
			while(rs.next()){                 
				sr = rs.getString("nom") +" "+ rs.getString("prenom")  ;        
				}         
			} catch (Exception e)
		{ e.printStackTrace(); }           
		return sr;     
		}
	
	public String getSociete(int id) {        
		String sr = null;      
		Connection cnx = ConnectionBD.getConnection();      
		try {             
			PreparedStatement ps = cnx.prepareStatement("select * from societe where codeS=? ");          
			ps.setInt(1, id);             
			ResultSet rs=ps.executeQuery();            
			while(rs.next()){                 
				sr = rs.getString("nomS")   ;        
				}         
			} catch (Exception e)
		{ e.printStackTrace(); }           
		return sr;     
		}

}
