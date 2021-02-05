package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ConducteurDAO;

import entities.Conducteur;
import entities.Societe;


/**
 * Servlet implementation class ConducteurController
 */
@WebServlet(urlPatterns ={"/AjouterConducteur","/ModifierConducteur","/DeleteConducteur"})
public class ConducteurController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConducteurController() {
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
		ConducteurDAO condao = new ConducteurDAO();
	
		 if(path.equals("/DeleteConducteur")) {
			if(request.getParameter("code") !=null) {
				int code =Integer.parseInt(request.getParameter("code"));
				condao.supprimer(code);
				response.sendRedirect("Conducteurs.jsp");
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
		ConducteurDAO condao = new ConducteurDAO();
		if(path.equals("/AjouterConducteur")) {
			 
				Conducteur c =new Conducteur();
				
				try {
					c.setNom(request.getParameter("nom"));
					c.setPrenom(request.getParameter("prenom"));
					String d1=request.getParameter("dtn");
					Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d1);
					c.setDateNaissance(date1);
					c.setAdresse(request.getParameter("adresse"));
					c.setTel(request.getParameter("tel"));
					c.setEmail(request.getParameter("email"));
					c.setCin(request.getParameter("cin"));
					String d2=request.getParameter("dtcin");
					Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(d2);
					c.setDatecin(date2);
					c.setPermis(request.getParameter("permis"));
					String d3=request.getParameter("dtl");
					Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(d3);
					c.setLivraisonPermis(date3);
					String d4=request.getParameter("dtc");
					Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse(d4);
					c.setDateCreation(date4);
					
					
				} catch (ParseException e) {
					e.printStackTrace();
				}
				condao.ajouter(c);
				response.sendRedirect("Conducteurs.jsp");
				
				
			
		}else if(path.equals("/ModifierConducteur")) {
			
			Conducteur c =new Conducteur();
			
			try {
				c.setCodeCond(Integer.parseInt(request.getParameter("codeC")));
				c.setNom(request.getParameter("nom"));
				c.setPrenom(request.getParameter("prenom"));
				String d1=request.getParameter("dtn");
				Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d1);
				c.setDateNaissance(date1);
				c.setAdresse(request.getParameter("adresse"));
				c.setTel(request.getParameter("tel"));
				c.setEmail(request.getParameter("email"));
				c.setCin(request.getParameter("cin"));
				String d2=request.getParameter("dtcin");
				Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(d2);
				c.setDatecin(date2);
				c.setPermis(request.getParameter("permis"));
				String d3=request.getParameter("dtl");
				Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(d3);
				c.setLivraisonPermis(date3);
				String d4=request.getParameter("dtc");
				Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse(d4);
				c.setDateCreation(date4);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			condao.modifier(c);
			response.sendRedirect("Conducteurs.jsp");
					
		
		}
		}
		

	

}
