<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@ include file="styles.jsp" %>
<%@page import="java.util.List"%>
<%@page import="dao.ConducteurDAO"%>
<%@page import="entities.Conducteur"%>

<div class="content-wrap">
        <div class="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 p-r-0 title-margin-right">
                        <div class="page-header">
                            <div class="page-title">
                                <h1>Bienvenue , <span><%out.print(session.getAttribute("nom"));%>
                                <%out.print(session.getAttribute("prenom")); %> </span></h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Acceuil</a></li>
                                    <li class="breadcrumb-item active">Liste Conducteurs</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                 <div class=" col-4">
                  <a href="newConducteur.jsp"><button type="button" class="btn btn-primary btn-outline btn-rounded ">Ajouter un Conducteur </button></a> 
                 </div>
                 <% ConducteurDAO condao = new ConducteurDAO();
                        List<Conducteur> cons = condao.getAllConducteurs();%>
                <!-- /# row -->
                <section id="main-content">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="bootstrap-data-table-panel">
                                    <div class="table-responsive">
                                        <table id="bootstrap-data-table-export" class="table table-striped table-bordered">
                                            <thead class="text-center">
                                                <tr>
                                                    
                                                    <th>Nom</th>
                                                    <th>Prénom</th>
                                                    <th>Date Naissance</th>
                                                    <th>Adresse</th>
                                                    <th>Téléphone</th>
                                                    <th>Email</th>
                                                    <th>Cin</th>
                                                    <th>Date Création</th>
                                                    <th class="text-center">Actions</th>
                                                </tr>
                                            </thead>
                                            <tbody class="text-center">
                                                
                                                <%
                                       for(Conducteur c:cons){
                                    	   out.print("<tr> ");
                                    	   
                                    	   out.print("<td> "+ c.getNom() +" </td>");
                                    	   out.print("<td> "+ c.getPrenom()+ " </td>");
                                    	   out.print("<td> "+ c.getDateNaissance()+ " </td>");
                                    	   out.print("<td> "+ c.getAdresse()+ " </td>");
                                    	   out.print("<td> "+ c.getTel()+ " </td>");
                                    	   out.print("<td> "+ c.getEmail()+ " </td>");
                                    	   out.print("<td> "+ c.getCin()+ " </td>");
                                    	   out.print("<td> "+ c.getDateCreation()+ " </td>");
                                    	   out.print("<td style='text-align: center'> <a href ='ModifierConducteur.jsp?code="+c.getCodeCond()+"'><button type='button' class='btn btn-warning btn-outline btn-rounded '>Modifier</button></a><a href ='DeleteConducteur?code="+c.getCodeCond()+"'> <button type='button' class='btn btn-danger btn-outline btn-rounded '>Supprimer</button><a></td>");
                                    	  
                                    	   out.print("</tr> ");
                                       }
                                    	   
                                       %>
                                               
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <!-- /# card -->
                        </div>
                        <!-- /# column -->
                    </div>
                    </section>
                    </div>
   
                    </div>
                    </div>
                    
                    
   <%@ include file="scripts.jsp" %>
   
                    