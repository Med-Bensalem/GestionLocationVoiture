package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entities.Voiture;

public class VoitureDAO {
	public void ajouter (Voiture v) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("insert into voiture Values (null,?,?,?,?,?,?,?) ");
			ps.setString(1, v.getMat());
			ps.setString(2, v.getNumCarteGrise());
			ps.setString(3, v.getKilo());
			ps.setDate(4,  new java.sql.Date(v.getDateCir().getTime()));
			ps.setInt(5, v.getCodeM());
			ps.setInt(6, v.getCodeMq());
			ps.setInt(7, v.getCodeMs());
			
			
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	
	
	}
	public void modifier (Voiture v) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("update voiture set mat = ?, numCarte = ?,kilo = ? , dateCir = ? , codeM = ?,codeMq = ?,codeMs = ? where codeV = ? ");
			ps.setString(1, v.getMat());
			ps.setString(2, v.getNumCarteGrise());
			ps.setString(3, v.getKilo());
			ps.setDate(4,  new java.sql.Date(v.getDateCir().getTime()));
			ps.setInt(5, v.getCodeM());
			ps.setInt(6, v.getCodeMq());
			ps.setInt(7, v.getCodeMs());
			ps.setInt(8, v.getCodeV());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
	public List<Voiture> getAll(){
		Connection cnx = ConnectionBD.getConnection();
		List<Voiture> voitures = new ArrayList<Voiture>();
		try {
			 PreparedStatement ps= cnx.prepareStatement("select * from voiture ");
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()){
				 Voiture v =new Voiture();
				 v.setCodeV(rs.getInt("codeV"));
				 v.setMat(rs.getString("mat"));
				 v.setNumCarteGrise(rs.getString("numCarte"));
				 v.setKilo(rs.getString("kilo"));
				 v.setDateCir(rs.getDate("dateCir"));
				 v.setCodeM(rs.getInt("codeM"));
				 v.setCodeMq(rs.getInt("codeMq"));
				 v.setCodeMs(rs.getInt("codeMs"));
				 voitures.add(v);
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return voitures;
	}
	
	public void supprimer (int code) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("delete from voiture where codeV = ? ");
			ps.setInt(1, code);
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
	public String getModel(int id) {        
		String sr = null;      
		Connection cnx = ConnectionBD.getConnection();      
		try {             
			PreparedStatement ps = cnx.prepareStatement("select * from modele where codeM=? ");          
			ps.setInt(1, id);             
			ResultSet rs=ps.executeQuery();            
			while(rs.next()){                 
				sr = rs.getString("nom");            
				}         
			} catch (Exception e)
		{ e.printStackTrace(); }           
		return sr;     
		}
	
	public String getMarque(int id) {        
		String sr = null;      
		Connection cnx = ConnectionBD.getConnection();      
		try {             
			PreparedStatement ps = cnx.prepareStatement("select * from marque where codeMq=? ");          
			ps.setInt(1, id);             
			ResultSet rs=ps.executeQuery();            
			while(rs.next()){                 
				sr = rs.getString("nom");            
				}         
			} catch (Exception e)
		{ e.printStackTrace(); }           
		return sr;     
		}
	
	public String getMaison(int id) {        
		String sr = null;      
		Connection cnx = ConnectionBD.getConnection();      
		try {             
			PreparedStatement ps = cnx.prepareStatement("select * from maison where codeMs=? ");          
			ps.setInt(1, id);             
			ResultSet rs=ps.executeQuery();            
			while(rs.next()){                 
				sr = rs.getString("nom");            
				}         
			} catch (Exception e)
		{ e.printStackTrace(); }           
		return sr;     
		}
			
			
	
	public Voiture getVoitureById(int code) {
		Connection connection = ConnectionBD.getConnection();
		Voiture v =new Voiture();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from voiture Where codeV= ? ");
			 ps.setInt(1, code);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 v.setCodeV(rs.getInt("codeV"));
				 v.setMat(rs.getString("mat"));
				 v.setNumCarteGrise(rs.getString("numCarte"));
				 v.setKilo(rs.getString("kilo"));
				 v.setDateCir(rs.getDate("dateCir"));
				 v.setCodeM(rs.getInt("codeM"));
				 v.setCodeMq(rs.getInt("codeMq"));
				 v.setCodeMs(rs.getInt("codeMs"));
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return v;
		
	}

}
