package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Modele;



public class ModeleDAO {
	public void ajouter (Modele m) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("insert into modele Values (null,?) ");
			ps.setString(1, m.getNom());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	
	
	}
	public void modifier (Modele m) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("update modele set nom = ? where codeM = ? ");
			ps.setString(1, m.getNom());
			ps.setInt(2, m.getCodeM());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
	public List<Modele> getAllModels() {
		Connection connection = ConnectionBD.getConnection();
	
		List<Modele> users = new ArrayList<Modele>();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from modele  ");
			 
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				Modele m =new Modele();
				 m.setCodeM(rs.getInt("codeM"));
				 m.setNom(rs.getString("nom"));
				 users.add(m);
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return users;
		
	}
	public Modele getModelById(int code) {
		Connection connection = ConnectionBD.getConnection();
		Modele m =new Modele();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from modele Where codeM = ? ");
			 ps.setInt(1, code);
			
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 m.setCodeM(rs.getInt("codeM"));
				 m.setNom(rs.getString("nom"));
				
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return m;
		
	}
	
	public void supprimer (int code) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("delete from modele where codeM = ? ");
			ps.setInt(1, code);
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
}
