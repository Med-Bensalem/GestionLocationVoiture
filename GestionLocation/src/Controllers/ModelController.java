package Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ModeleDAO;
import entities.Modele;


/**
 * Servlet implementation class ModelController
 */
@WebServlet(urlPatterns ={"/AjouterModel","/ModifierModel","/DeleteModel"})
public class ModelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModelController() {
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
		ModeleDAO modeldao = new ModeleDAO();
	
		 if(path.equals("/DeleteModel")) {
			if(request.getParameter("code") !=null) {
				int code =Integer.parseInt(request.getParameter("code"));
				modeldao.supprimer(code);
				response.sendRedirect("models.jsp");
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
		ModeleDAO modeldao = new ModeleDAO();
		if(path.equals("/AjouterModel")) {
			if (request.getParameter("nom") != null ) {
				Modele m =new Modele();
				m.setNom(request.getParameter("nom"));
				modeldao.ajouter(m);
				response.sendRedirect("models.jsp");
				
				
			}
	}else if(path.equals("/ModifierModel")) {
		
		if (request.getParameter("nom") != null) {
				Modele m =new Modele();
				m.setCodeM(Integer.parseInt(request.getParameter("codeM")));
				m.setNom(request.getParameter("nom"));
				modeldao.modifier(m);
				response.sendRedirect("models.jsp");
				
	}
	}
	}

}
