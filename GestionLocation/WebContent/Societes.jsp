<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@ include file="styles.jsp" %>
<%@page import="java.util.List"%>
<%@page import="dao.SocieteDAO"%>
<%@page import="entities.Societe"%>

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
                                    <li class="breadcrumb-item active">Liste Sociétés</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                 <div class=" col-4">
                         <a href="newSociete.jsp"><button type="button" class="btn btn-primary btn-outline btn-rounded ">Ajouter une société</button></a>
                 </div>
                <!-- /# row -->
                 <% SocieteDAO socdao = new SocieteDAO();
                        List<Societe> socs = socdao.getAllSocietes();%>
                <section id="main-content">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="bootstrap-data-table-panel">
                                    <div class="table-responsive">
                                        <table id="bootstrap-data-table-export" class="table table-striped table-bordered">
                                            <thead class="text-center">
                                                <tr>
                                                  
                                                    <th>Nom </th>
                                                    <th>Adresse </th>
                                                    <th>Téléphone </th>
                                                    <th>Email </th>
                                                    <th>Nom Représentant </th>
                                                    <th>Prénom Représentant</th>
                                                    <th>Téléphone Représentant</th>
                                                    <th>Date Création</th>
                                                    <th class="text-center">Actions</th>
                                                </tr>
                                            </thead>
                                            <tbody class="text-center">
                                                <%
                                       for(Societe s:socs){
                                    	   out.print("<tr> ");
                                    	   
                                    	   out.print("<td> "+ s.getNom()+ " </td>");
                                    	   out.print("<td> "+ s.getAdresse()+ " </td>");
                                    	   out.print("<td> "+ s.getTel()+ " </td>");
                                    	   out.print("<td> "+ s.getEmail()+ " </td>");
                                    	   out.print("<td> "+ s.getNomRep()+ " </td>");
                                    	   out.print("<td> "+ s.getPrenomRep()+ " </td>");
                                    	   out.print("<td> "+ s.getTelRep()+ " </td>");
                                    	   out.print("<td> "+ s.getDateCreation()+ " </td>");
                                    	   out.print("<td style='text-align: center'> <a href ='modifierSociete.jsp?code="+s.getCodeSociete()+"'><button type='button' class='btn btn-warning btn-outline btn-rounded '>Modifier</button></a><a href ='DeleteSociete?code="+s.getCodeSociete()+"'> <button type='button' class='btn btn-danger btn-outline btn-rounded '>Supprimer</button><a></td>");
                                    	  
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
                    