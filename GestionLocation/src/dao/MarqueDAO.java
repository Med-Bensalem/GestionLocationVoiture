package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Marque;



public class MarqueDAO {
	public void ajouter (Marque mq) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("insert into marque Values (null,?) ");
			ps.setString(1, mq.getNom());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	
	
	}
	public void modifier (Marque mq) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("update marque set nom = ? where codeMq = ? ");
			ps.setString(1, mq.getNom());
			ps.setInt(2, mq.getCodeMq());
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
	public List<Marque> getAllMarques() {
		Connection connection = ConnectionBD.getConnection();
	
		List<Marque> marques = new ArrayList<Marque>();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from marque  ");
			 
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				Marque mq =new Marque();
				 mq.setCodeMq(rs.getInt("codeMq"));
				 mq.setNom(rs.getString("nom"));
				 marques.add(mq);
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return marques;
		
	}
	public Marque getMarqueById(int code) {
		Connection connection = ConnectionBD.getConnection();
		Marque mq =new Marque();
		try {
			 PreparedStatement ps= connection.prepareStatement("Select * from marque Where codeMq = ? ");
			 ps.setInt(1, code);
			
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 mq.setCodeMq(rs.getInt("codeMq"));
				 mq.setNom(rs.getString("nom"));
				
			 }
			 ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return mq;
		
	}
	
	public void supprimer (int code) {
		Connection cnx = ConnectionBD.getConnection();
		try {
			PreparedStatement ps = cnx.prepareStatement("delete from marque where codeMq = ? ");
			ps.setInt(1, code);
			ps.executeUpdate();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
			
	}
}
