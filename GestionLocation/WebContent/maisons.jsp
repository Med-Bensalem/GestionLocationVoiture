
<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@ include file="styles.jsp" %>
<%@page import="java.util.List"%>
<%@page import="dao.MaisonDAO"%>
<%@page import="entities.Maison"%>

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
                                    <li class="breadcrumb-item active">Liste Maisons</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                 <div class=" col-4">
                  <a href="newMaison.jsp"><button type="button" class="btn btn-primary btn-outline btn-rounded ">Ajouter une Maison </button></a>
                 </div>
                <!-- /# row -->
                 <% MaisonDAO maisondao = new MaisonDAO();
                        List<Maison> maisons = maisondao.getAllMaisons();%>
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
                                                    
                                                    <th class="text-center">Actions</th>
                                                </tr>
                                            </thead>
                                            <tbody class="text-center">
                                                
                                               <%
                                       for(Maison ms:maisons){
                                    	   out.print("<tr> ");
                                    	   
                                    	   out.print("<td> "+ ms.getNom()+ " </td>");
                                    	   out.print("<td style='text-align: center'> <a href ='modifierMaison.jsp?code="+ms.getCodeMs()+"'><button type='button' class='btn btn-warning btn-outline btn-rounded '>Modifier</button></a><a href ='DeleteMaison?code="+ms.getCodeMs()+"'> <button type='button' class='btn btn-danger btn-outline btn-rounded '>Supprimer</button><a></td>");
                                    	  
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
                    