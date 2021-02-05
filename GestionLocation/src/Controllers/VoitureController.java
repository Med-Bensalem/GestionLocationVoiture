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

import dao.SocieteDAO;
import dao.VoitureDAO;
import entities.Voiture;

/**
 * Servlet implementation class VoitureController
 */
@WebServlet(urlPatterns ={"/AjouterVoiture","/ModifierVoiture","/DeleteVoiture"})
public class VoitureController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoitureController() {
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
		VoitureDAO voidao = new VoitureDAO();
	
		 if(path.equals("/DeleteVoiture")) {
			if(request.getParameter("code") !=null) {
				int code =Integer.parseInt(request.getParameter("code"));
				voidao.supprimer(code);
				response.sendRedirect("Voitures.jsp");
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
		VoitureDAO voidao = new VoitureDAO();
		
		if(path.equals("/AjouterVoiture")) {
			 
				Voiture v =new Voiture();

				
				try {
					v.setMat(request.getParameter("matricule"));
					v.setNumCarteGrise(request.getParameter("cartegrise"));
					v.setKilo(request.getParameter("kilo"));
					String d=request.getParameter("dmc");
					Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d);
					v.setDateCir(date1);
					v.setCodeM(Integer.parseInt(request.getParameter("modele")));
					v.setCodeMq(Integer.parseInt(request.getParameter("marque")));
					v.setCodeMs(Integer.parseInt(request.getParameter("maison")));
					
				} catch (ParseException e) {
					e.printStackTrace();
				}
				voidao.ajouter(v);
				response.sendRedirect("Voitures.jsp");
				
				
			
		}else if(path.equals("/ModifierVoiture")){
			Voiture v =new Voiture();

			
			try {
				v.setCodeV(Integer.parseInt(request.getParameter("codeV")));
				v.setMat(request.getParameter("matricule"));
				v.setNumCarteGrise(request.getParameter("cartegrise"));
				v.setKilo(request.getParameter("kilo"));
				String d=request.getParameter("dmc");
				Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d);
				v.setDateCir(date1);
				v.setCodeM(Integer.parseInt(request.getParameter("modele")));
				v.setCodeMq(Integer.parseInt(request.getParameter("marque")));
				v.setCodeMs(Integer.parseInt(request.getParameter("maison")));
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			voidao.modifier(v);
			response.sendRedirect("Voitures.jsp");
			
				}
	}

}
