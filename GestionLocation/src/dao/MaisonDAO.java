package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Maison;



public class MaisonDAO {
	public void ajouter (Maison ms) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("insert into maison Values (null,?) ");
			ps.setString(1, ms.getNom());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	
	
	}
	public void modifier (Maison ms) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("update maison set nom = ? where codeMs = ? ");
			ps.setString(1, ms.getNom());
			ps.setInt(2, ms.getCodeMs());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
	public List<Maison> getAllMaisons() {
		Connection connection = ConnectionBD.getConnection();
	
		List<Maison> maisons = new ArrayList<Maison>();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from maison  ");
			 
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				Maison m =new Maison();
				 m.setCodeMs(rs.getInt("codeMs"));
				 m.setNom(rs.getString("nom"));
				 maisons.add(m);
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return maisons;
		
	}
	public Maison getMaisonById(int code) {
		Connection connection = ConnectionBD.getConnection();
		Maison ms =new Maison();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from maison Where codeMs= ? ");
			 ps.setInt(1, code);
			
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 ms.setCodeMs(rs.getInt("codeMs"));
				 ms.setNom(rs.getString("nom"));
				
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ms;
		
	}
	
	public void supprimer (int code) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("delete from maison where codeMs = ? ");
			ps.setInt(1, code);
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
}
