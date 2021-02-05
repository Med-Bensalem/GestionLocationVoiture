package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Societe;


public class SocieteDAO {
	public void ajouter (Societe s) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("INSERT INTO societe(nomS,adresse,telS, email, personne, dateCreation, nomR,prenomR, telR) VALUES (?,?,?,?,?,?,?,?,?) ");
			
			ps.setString(1, s.getNom());
			ps.setString(2, s.getAdresse());
			ps.setString(3, s.getTel());
			ps.setString(4, s.getEmail());
			ps.setBoolean(5, s.isPersonne());
			ps.setDate(6,  new java.sql.Date(s.getDateCreation().getTime()));
			ps.setString(7, s.getNomRep());
			ps.setString(8, s.getPrenomRep());
			ps.setString(9, s.getTelRep());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	
	
	}
	public void modifier (Societe s) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("update societe set nomS = ?, adresse = ?,telS = ? , email = ? , personne = ?,dateCreation = ?,nomR = ?,prenomR = ?,telR = ? where codeS = ? ");
			ps.setString(1, s.getNom());
			ps.setString(2, s.getAdresse());
			ps.setString(3, s.getTel());
			ps.setString(4, s.getEmail());
			ps.setBoolean(5, s.isPersonne());
			ps.setDate(6,  new java.sql.Date(s.getDateCreation().getTime()));
			ps.setString(7, s.getNomRep());
			ps.setString(8, s.getPrenomRep());
			ps.setString(9, s.getTelRep());
			ps.setInt(10, s.getCodeSociete());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
	public List<Societe> getAllSocietes() {
		Connection connection = ConnectionBD.getConnection();
	
		List<Societe> socs = new ArrayList<Societe>();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from Societe  ");
			 
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				Societe s =new Societe();
				s.setCodeSociete(rs.getInt("codeS"));
				s.setNom(rs.getString("nomS"));
				s.setTel(rs.getString("telS"));
				s.setAdresse(rs.getString("adresse"));
				s.setEmail(rs.getString("email"));
				s.setPersonne(rs.getBoolean("personne"));
				s.setDateCreation(rs.getDate("dateCreation"));
				s.setNomRep(rs.getString("nomR"));
				s.setPrenomRep(rs.getString("prenomR"));
				s.setTelRep(rs.getString("telR"));
				
				 socs.add(s);
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return socs;
		
	}
	public void supprimer (int code) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("delete from societe where codeS = ? ");
			ps.setInt(1, code);
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
	public Societe getSocieteById(int code) {
		Connection connection = ConnectionBD.getConnection();
		Societe s =new Societe();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from societe Where codeS= ? ");
			 ps.setInt(1, code);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 s.setCodeSociete(rs.getInt("codeS"));
					s.setNom(rs.getString("nomS"));
					s.setTel(rs.getString("telS"));
					s.setAdresse(rs.getString("adresse"));
					s.setEmail(rs.getString("email"));
					s.setPersonne(rs.getBoolean("personne"));
					s.setDateCreation(rs.getDate("dateCreation"));
					s.setNomRep(rs.getString("nomR"));
					s.setPrenomRep(rs.getString("prenomR"));
					s.setTelRep(rs.getString("telR"));
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return s;
		
	}
	
	
}
