<%if(request.getSession().getAttribute("user")==null)
	response.sendRedirect("login.jsp");%>
<%@page import="entities.User"%>
<div class="sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures">
    <div class="nano">
      <div class="nano-content">
        <div class="logo">
          <a href="dashboard.jsp">
           
            <span>Location Voitures</span>
          </a>
        </div>
        <ul>
        
        <li>
            <a href="dashboard.jsp">
              <i class="ti-layout-grid2"></i> Acceuil </a>
          </li>
          <% if(request.getSession().getAttribute("user") != null){
                    	User u = (User) request.getSession().getAttribute("user");
                		if (u.isAdmin())
                			out.print("<li><a href='users.jsp'><i class='ti-user'></i> Gestion Utilisateurs</a></li> " );
                    }
                    		%>
          <li>
            <a href="Societes.jsp">
              <i class="ti-user"></i> Gestion Sociétés </a>
          </li>
          <li>
            <a href="Conducteurs.jsp">
              <i class="ti-user"></i> Gestion Conducteurs </a>
          </li>
          <li>
            <a href="Voitures.jsp">
              <i class="ti-email"></i> Gestion Voitures </a>
          </li>
          <li>
            <a href="models.jsp">
              <i class="ti-list"></i> Gestion Modéles</a>
          </li>
           <li>
            <a href="marques.jsp">
              <i class="ti-target"></i> Gestion Marques</a>
          </li>
          <li>
            <a href="maisons.jsp">
              <i class="ti-home"></i> Gestion Maisons </a>
          </li>
          <li>
            <a href="Contrats.jsp">
              <i class="ti-write"></i> Gestion Contrats</a>
          </li>
          
          
           <% if(request.getSession().getAttribute("user") != null){
                    	User u = (User) request.getSession().getAttribute("user");
                		if (!u.isAdmin())
                			out.print("<li><a href='modifierPassword.jsp'><i class='ti-settings'></i> Changer mot de Passe </a></li> " );
                    }
                    		%>
          
          
        
        
        </ul>
      </div>
    </div>
  </div>