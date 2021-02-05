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

import dao.ContratDAO;
import entities.Contrat;


/**
 * Servlet implementation class ContratController
 */
@WebServlet(urlPatterns ={"/AjouterContrat","/ModifierContrat","/DeleteContrat"})
public class ContratController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContratController() {
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
		ContratDAO voidao = new ContratDAO();
	
		 if(path.equals("/DeleteContrat")) {
			if(request.getParameter("code") !=null) {
				int code =Integer.parseInt(request.getParameter("code"));
				voidao.supprimer(code);
				response.sendRedirect("Contrats.jsp");
			}
		
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath() ;
		PrintWriter out = response.getWriter();
		ContratDAO contdao = new ContratDAO();
		if(path.equals("/AjouterContrat")) {
			 
				Contrat c =new Contrat();
				
				try {
					String d1=request.getParameter("dateContrat");
					Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d1);
					c.setDateContrat(date1);
					c.setCodeSoc(Integer.parseInt(request.getParameter("societe")));
					c.setCodeCond1(Integer.parseInt(request.getParameter("cond1")));
					c.setCodeCond2(Integer.parseInt(request.getParameter("cond2")));
					String d2= request.getParameter("datedeb");
					Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(d2);
					c.setDatedeb(date2);
					String d3=request.getParameter("datefin");
					Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(d3);
					c.setDatefin(date3);
					c.setPrixUni(Float.parseFloat(request.getParameter("prixuni")));
					c.setTot(Float.parseFloat(request.getParameter("prixtot")));
					c.setAvance(Float.parseFloat(request.getParameter("montant")));
					String d4=request.getParameter("datecrea");
					Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse(d4);
					c.setDateCrea(date4);
					
				} catch (ParseException e) {
					e.printStackTrace();
				}
				contdao.ajouter(c);
				response.sendRedirect("Contrats.jsp");
				
				
			
		}else if(path.equals("/ModifierContrat")) {
			
			Contrat c =new Contrat();
			
			try {
				c.setCodeCon(Integer.parseInt(request.getParameter("codeCon")));
				String d1=request.getParameter("dateContrat");
				Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d1);
				c.setDateContrat(date1);
				c.setCodeSoc(Integer.parseInt(request.getParameter("societe")));
				c.setCodeCond1(Integer.parseInt(request.getParameter("cond1")));
				c.setCodeCond2(Integer.parseInt(request.getParameter("cond2")));
				String d2= request.getParameter("datedeb");
				Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(d2);
				c.setDatedeb(date2);
				String d3=request.getParameter("datefin");
				Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(d3);
				c.setDatefin(date3);
				c.setPrixUni(Float.parseFloat(request.getParameter("prixuni")));
				c.setTot(Float.parseFloat(request.getParameter("prixtot")));
				c.setAvance(Float.parseFloat(request.getParameter("montant")));
				String d4=request.getParameter("datecrea");
				Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse(d4);
				c.setDateCrea(date4);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			contdao.modifier(c);
			response.sendRedirect("Contrats.jsp");
		}
	}

}
