package Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MarqueDAO;
import entities.Marque;



/**
 * Servlet implementation class MarqueController
 */
@WebServlet(urlPatterns ={"/AjouterMarque","/ModifierMarque","/DeleteMarque"})
public class MarqueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarqueController() {
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
		MarqueDAO marquedao = new MarqueDAO();
	
		 if(path.equals("/DeleteMarque")) {
			if(request.getParameter("code") !=null) {
				int code =Integer.parseInt(request.getParameter("code"));
				marquedao.supprimer(code);
				response.sendRedirect("marques.jsp");
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
		MarqueDAO marquedao = new MarqueDAO();
		if(path.equals("/AjouterMarque")) {
			if (request.getParameter("nom") != null ) {
				Marque mq =new Marque();
				mq.setNom(request.getParameter("nom"));
				marquedao.ajouter(mq);
				response.sendRedirect("marques.jsp");
				
				
			}
	}else if(path.equals("/ModifierMarque")) {
		
		if (request.getParameter("nom") != null) {
				Marque mq =new Marque();
				mq.setCodeMq(Integer.parseInt(request.getParameter("codeMq")));
				mq.setNom(request.getParameter("nom"));
				marquedao.modifier(mq);
				response.sendRedirect("marques.jsp");
				
	}
	}
	}
	

}
