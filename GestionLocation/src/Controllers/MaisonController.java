package Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MaisonDAO;
import entities.Maison;



/**
 * Servlet implementation class MaisonController
 */
@WebServlet(urlPatterns ={"/AjouterMaison","/ModifierMaison","/DeleteMaison"})
public class MaisonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaisonController() {
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
		MaisonDAO marquedao = new MaisonDAO();
	
		 if(path.equals("/DeleteMarque")) {
			if(request.getParameter("code") !=null) {
				int code =Integer.parseInt(request.getParameter("code"));
				marquedao.supprimer(code);
				response.sendRedirect("maisons.jsp");
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
		MaisonDAO maisondao = new MaisonDAO();
		if(path.equals("/AjouterMaison")) {
			if (request.getParameter("nom") != null ) {
				Maison ms =new Maison();
				ms.setNom(request.getParameter("nom"));
				maisondao.ajouter(ms);
				response.sendRedirect("maisons.jsp");
				
				
			}
	}else if(path.equals("/ModifierMaison")) {
		
		if (request.getParameter("nom") != null) {
				Maison ms =new Maison();
				ms.setCodeMs(Integer.parseInt(request.getParameter("codeMs")));
				ms.setNom(request.getParameter("nom"));
				maisondao.modifier(ms);
				response.sendRedirect("maisons.jsp");
				
	}
	}
	}

}
