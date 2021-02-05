package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Conducteur;



public class ConducteurDAO {
	public void ajouter (Conducteur c) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("insert into conducteur Values (null,?,?,?,?,?,?,?,?,?,?,?) ");
			
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setDate(3, new java.sql.Date(c.getDateNaissance().getTime()));
			ps.setString(4, c.getAdresse());
			ps.setString(5, c.getTel());
			ps.setString(6, c.getEmail() );
			ps.setString(7, c.getCin());
			ps.setDate(8, new java.sql.Date(c.getDatecin().getTime()));
			ps.setString(9, c.getPermis());
			ps.setDate(10,new java.sql.Date(c.getLivraisonPermis().getTime()));
			ps.setDate(11,new java.sql.Date(c.getDateCreation().getTime()));
			
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	
	
	}
	public void modifier (Conducteur c) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("update conducteur set nom = ?, prenom = ?,dateNaissance = ? , adresse = ? , tel= ?,email = ?,cin = ?,dateCin = ?,numPermis = ?, dlp= ? , dtc= ? where codeC = ? ");
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setDate(3, new java.sql.Date(c.getDateNaissance().getTime()));
			ps.setString(4, c.getAdresse());
			ps.setString(5, c.getTel());
			ps.setString(6, c.getEmail() );
			ps.setString(7, c.getCin());
			ps.setDate(8, new java.sql.Date(c.getDatecin().getTime()));
			ps.setString(9, c.getPermis());
			ps.setDate(10,new java.sql.Date(c.getLivraisonPermis().getTime()));
			ps.setDate(11,new java.sql.Date(c.getDateCreation().getTime()));
			ps.setInt(12,c.getCodeCond());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
	public List<Conducteur> getAllConducteurs() {
		Connection connection = ConnectionBD.getConnection();
	
		List<Conducteur> cons = new ArrayList<Conducteur>();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from conducteur  ");
			 
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				Conducteur c =new Conducteur();
				c.setCodeCond(rs.getInt("codeC"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				c.setDateNaissance(rs.getDate("dateNaissance"));
				c.setAdresse(rs.getString("adresse"));
				c.setTel(rs.getString("tel"));
				c.setEmail(rs.getString("email"));
				c.setCin(rs.getString("cin"));
				c.setDatecin(rs.getDate("dateCin"));
				c.setPermis(rs.getString("numPermis"));
				c.setLivraisonPermis(rs.getDate("dlp"));
				c.setDateCreation(rs.getDate("dtc"));
				
				 cons.add(c);
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cons;
		
	}
	
	public void supprimer (int code) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("delete from conducteur where codeC = ? ");
			ps.setInt(1, code);
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
	public Conducteur getConducteurById(int code) {
		Connection connection = ConnectionBD.getConnection();
		Conducteur c = new Conducteur();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from conducteur Where codeC= ? ");
			 ps.setInt(1, code);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				c.setCodeCond(rs.getInt("codeC"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				c.setDateNaissance(rs.getDate("dateNaissance"));
				c.setAdresse(rs.getString("adresse"));
				c.setTel(rs.getString("tel"));
				c.setEmail(rs.getString("email"));
				c.setCin(rs.getString("cin"));
				c.setDatecin(rs.getDate("dateCin"));
				c.setPermis(rs.getString("numPermis"));
				c.setLivraisonPermis(rs.getDate("dlp"));
				c.setDateCreation(rs.getDate("dtc"));
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return c;
		
	}
	
	
}
