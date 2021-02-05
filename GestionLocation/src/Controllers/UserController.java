package Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import entities.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet(urlPatterns ={"/AjouterUser","/ModifierUser","/DeleteUser","/Login","/Decon","/ModifierPassword"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
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
		UserDAO userdao = new UserDAO();
		HttpSession session = request.getSession();
		RequestDispatcher pageWeb;

			if(path.equals("/Decon"))
			{
				session.invalidate();
				pageWeb=request.getRequestDispatcher("login.jsp");
				pageWeb.forward(request, response);				
				}else if(path.equals("/DeleteUser")) {
			if(request.getParameter("code") !=null) {
				int code =Integer.parseInt(request.getParameter("code"));
				userdao.supprimer(code);
				response.sendRedirect("users.jsp");
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
		HttpSession session = request.getSession();
		UserDAO userdao = new UserDAO();
		
		if (path.equals("/Login")) {
			if (request.getParameter("username") != null && request.getParameter("password") != null) {
    			String username = request.getParameter("username");
    	        String password = request.getParameter("password");
    	        if (userdao.isValid(username, password)){
     	    	   User u = userdao.Connexion(username, password);
     	    	response.sendRedirect("dashboard.jsp");
     	    	session.setAttribute("user", u);
     	    	session.setAttribute("nom", u.getNom());
     	    	session.setAttribute("prenom", u.getPrenom());
     	    	  
			}else {
 	    	   response.sendRedirect("login.jsp");
 	       }
			}
			
		}else if(path.equals("/AjouterUser")) {
			if (request.getParameter("nom") != null && request.getParameter("prenom") != null && 
				request.getParameter("login") != null && request.getParameter("password") != null && 
				request.getParameter("admin") != null) {
				User u =new User();
				u.setNom(request.getParameter("nom"));
				u.setPrenom(request.getParameter("prenom"));
				u.setLogin(request.getParameter("login"));
				u.setPassword(request.getParameter("password"));
				u.setAdmin(Boolean.parseBoolean(request.getParameter("admin")));
				userdao.ajouter(u);
				response.sendRedirect("users.jsp");
				
				
			}
	}else if(path.equals("/ModifierUser")) {
		
		if (request.getParameter("nom") != null  && request.getParameter("codeU") != null &&
				request.getParameter("login") != null && request.getParameter("password") != null && 
				request.getParameter("admin") != null) {
				User u =new User();
				u.setCodeU(Integer.parseInt(request.getParameter("codeU")));
				u.setNom(request.getParameter("nom"));
				u.setPrenom(request.getParameter("prenom") );
				u.setLogin(request.getParameter("login"));
				u.setPassword(request.getParameter("password"));
				u.setAdmin(Boolean.parseBoolean(request.getParameter("admin")));
				userdao.modifier(u);
				response.sendRedirect("users.jsp");
				
	}
	}else if (path.equals("/ModifierPassword")) {
    	
    	if (request.getParameter("ancien") != null && request.getParameter("nouveau") != null && request.getParameter("confirmer") != null) {
    		
    		User u =(User)session.getAttribute("user");
    		if(!request.getParameter("ancien").equals(u.getPassword()) ) 
    			response.sendRedirect("modifierPassword.jsp?erreur=ancien");   		
    		else if( !request.getParameter("nouveau").equals(request.getParameter("confirmer")))
    			response.sendRedirect("modifierPassword.jsp?erreur=confirmer");
    		else {
    			u.setPassword(request.getParameter("nouveau"));
    			userdao.modifier(u);
    			session.setAttribute("user", u);
    			response.sendRedirect("dashboard.jsp");
    		}
    	}
    }

}
	}
	
