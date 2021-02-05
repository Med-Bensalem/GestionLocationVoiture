
<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@ include file="styles.jsp" %>
<%@page import="java.util.List"%>
<%@page import="dao.ContratDAO"%>
<%@page import="entities.Contrat"%>

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
                                    <li class="breadcrumb-item active">Liste Contrats</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                 <div class=" col-4">
                   <a href="newContrat.jsp"><button type="button" class="btn btn-primary btn-outline btn-rounded ">Ajouter Un Contrat  </button></a> 
                 </div>
                <!-- /# row -->
                <% ContratDAO condao = new ContratDAO();
                        List<Contrat> cons = condao.getAll();%>
                <section id="main-content">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="bootstrap-data-table-panel">
                                    <div class="table-responsive">
                                        <table id="exemple" class="table table-striped table-bordered">
                                            <thead class="text-center">
                                                <tr>
                                                   
                                                    <th>Date Contrat</th>
                                                    <th>Société</th>
                                                    <th>Cond 1</th>
                                                    <th>Cond 2</th>
                                                    <th>Date Début </th>
                                                    <th>Date Fin</th>
                                                    <th>Prix Unitaire</th>
                                                    <th>Prix Total</th>
                                                    <th> Montant Avance</th>
                                                    <th>Date Création</th>
                                                    <th class="text-center">Actions</th>
                                                </tr>
                                            </thead>
                                            <tbody class="text-center">
                                                
                                                <%
                                       for(Contrat c:cons){
                                    	   out.print("<tr> ");
                                    	   
                                    	   out.print("<td> "+ c.getDateContrat()+ " </td>");
                                    	   out.print("<td> "+ condao.getSociete(c.getCodeSoc())+ " </td>");
                                    	   out.print("<td> "+ condao.getConducteur(c.getCodeCond1())+ " </td>");
                                    	   out.print("<td> "+ condao.getConducteur(c.getCodeCond2())+ " </td>");
                                    	   out.print("<td> "+ c.getDatedeb()+ " </td>");
                                    	   out.print("<td> "+ c.getDatefin()+ " </td>");
                                    	   out.print("<td> "+ c.getPrixUni()+ " </td>");
                                    	   out.print("<td> "+ c.getTot()+ " </td>");
                                    	   out.print("<td> "+ c.getAvance()+ " </td>");
                                    	   out.print("<td> "+ c.getDateCrea()+ " </td>");
                                    	   out.print("<td style='text-align: center'> <a href ='modifierContrat.jsp?code="+c.getCodeCon()+"'><button type='button' class='btn btn-warning btn-outline btn-rounded '>Modifier</button></a><a href ='DeleteContrat?code="+c.getCodeCon()+"'> <button type='button' class='btn btn-danger btn-outline btn-rounded '>Supprimer</button><a></td>");
                                    	  
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
    
                    