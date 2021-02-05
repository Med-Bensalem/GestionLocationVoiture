package Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.SocieteDAO;

import entities.Societe;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
/**
 * Servlet implementation class SocieteController
 */
@WebServlet(urlPatterns ={"/AjouterSociete","/ModifierSociete","/DeleteSociete"})
public class SocieteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SocieteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path=request.getServletPath() ;
		PrintWriter out = response.getWriter();
		SocieteDAO modeldao = new SocieteDAO();
	
		 if(path.equals("/DeleteSociete")) {
			if(request.getParameter("code") !=null) {
				int code =Integer.parseInt(request.getParameter("code"));
				modeldao.supprimer(code);
				response.sendRedirect("Societes.jsp");
			}
		
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path=request.getServletPath() ;
		PrintWriter out = response.getWriter();
		SocieteDAO socdao = new SocieteDAO();
		if(path.equals("/AjouterSociete")) {
			 
				Societe s =new Societe();
				
				try {
					s.setNom(request.getParameter("nom"));
					s.setAdresse(request.getParameter("adresse"));
					s.setTel(request.getParameter("telS"));
					s.setEmail(request.getParameter("email"));
					s.setPersonne(Boolean.parseBoolean(request.getParameter("personne")));
					String d=request.getParameter("dtc");
					Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d);
					s.setDateCreation(date1);
					s.setNomRep(request.getParameter("nomR"));
					s.setPrenomRep(request.getParameter("prenomR"));
					s.setTelRep(request.getParameter("telR"));
					
				} catch (ParseException e) {
					e.printStackTrace();
				}
				socdao.ajouter(s);
				response.sendRedirect("Societes.jsp");
				
				
			
		}else if(path.equals("/ModifierSociete")) {
			
			Societe s =new Societe();
			
			try {
				s.setCodeSociete(Integer.parseInt(request.getParameter("codeS")));
				s.setNom(request.getParameter("nom"));
				s.setAdresse(request.getParameter("adresse"));
				s.setTel(request.getParameter("telS"));
				s.setEmail(request.getParameter("email"));
				s.setPersonne(Boolean.parseBoolean(request.getParameter("personne")));
				String d=request.getParameter("dtc");
				Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d);
				s.setDateCreation(date1);
				s.setNomRep(request.getParameter("nomR"));
				s.setPrenomRep(request.getParameter("prenomR"));
				s.setTelRep(request.getParameter("telR"));
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			socdao.modifier(s);
			response.sendRedirect("Societes.jsp");
					
		
		}
		}

}
