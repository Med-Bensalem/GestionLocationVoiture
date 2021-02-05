<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@ include file="styles.jsp" %>
<%@ include file="scripts.jsp" %>
<%@page import="java.util.List"%>
<%@page import="dao.MarqueDAO"%>
<%@page import="entities.Marque"%>
<%@page import="dao.MaisonDAO"%>
<%@page import="entities.Maison"%>
<%@page import="dao.ModeleDAO"%>
<%@page import="entities.Modele"%>
<%@page import="dao.VoitureDAO"%>
<%@page import="entities.Voiture"%>
<div class="content-wrap">
        <div class="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 p-r-0 title-margin-right">
                        <div class="page-header">
                            <div class="page-title">
                                <h1> Modifier une Voiture</h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Acceuil</a></li>
                                    <li class="breadcrumb-item active">Modifier une Voiture</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                <!-- /# row -->
                <section id="main-content">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="form-validation">
                                    <% if (request.getParameter("code") != null)
									    	 {
									    	 VoitureDAO voidao = new VoitureDAO();
									    	 Voiture v =new Voiture();
									    	 v = voidao.getVoitureById(Integer.parseInt(request.getParameter("code")));
									    	  %>
                                        <form method ="post" action="ModifierVoiture">
                                         <input type="hidden" name ="codeV" value ="<% out.print(v.getCodeV()); %>">
                                            <div class="row">
                                                <div class="col-lg-6">
                                                    <div class="form-group">
                                                        <label>Matricule</label>
                                                        <input type="text" class="form-control" name="matricule" placeholder="Saisie Matricule" autocomplete="off" required value="<% out.print(v.getMat()); %>">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Numéro carte Grise</label>
                                                        <input  class="form-control" type="text" placeholder="Saisie Numéro carte Grise" name="cartegrise"autocomplete="off" required value="<% out.print(v.getNumCarteGrise()); %>">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Kilométrage</label>
                                                        <input type="text" class="form-control" name="kilo" placeholder="Saisie Kilométrage " autocomplete="off" value="<% out.print(v.getKilo()); %>">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Date mise Circulation</label>
                                                         <input class="form-control" type="date" name ="dmc" value="<% out.print(v.getDateCir()); %>" id="example-date-input">
                                                    </div>
                                                    
                                                    
                                                </div>
                                                <% MarqueDAO marquedao = new MarqueDAO();
                                                    List<Marque> marques = marquedao.getAllMarques();
                                                    MaisonDAO maisondao= new MaisonDAO();
                                                    List<Maison> maisons = maisondao.getAllMaisons();
                                                    ModeleDAO modeldao = new ModeleDAO();
                                                    List<Modele> models = modeldao.getAllModels();
                                                    
                                                    %>
                                                <div >
                                                    <div class ="col-sm-12" >
										              <label >Modéle</label>
										               
										              <div >
										                <select class="form-control selectpicker" name="modele" id="select-country" data-live-search="true">
										                <%
                                       for(Modele m:models){%>
                                    	   <option data-tokens="china" value =<%out.println(m.getCodeM()); %>><%out.println(m.getNom()); %></option> 
                                    	   
                                     <%} %>             
										               
										                </select>
										
										              </div>
										              
										            </div>
                                                    <div class ="col-sm-12">
										              <label >Marque</label>
										              <div >
										                <select class="form-control selectpicker" name ="marque" id="select-country" data-live-search="true">
										                <%
                                       for(Marque mq:marques){%>
                                    	   <option data-tokens='china' value =<%out.println(mq.getCodeMq()); %>><%out.println(mq.getNom()); %></option> 
                                    	   
                                     <%} %>             
										               
										                </select>
										
										
										              </div>
										              
										            </div>
                                                    <div class ="col-sm-12">
										              <label >Maison</label><br>
										            
										               <select class="form-control selectpicker" name="maison" id="select-country" data-live-search="true">
										                <%
                                       for(Maison ms:maisons){%>
                                    	   <option data-tokens='china' value =<%out.println(ms.getCodeMs()); %>><%out.println(ms.getNom()); %></option> 
                                    	   
                                     <%} %>             
										               
										                </select>
										
										               
										                
										              </div>
										             

										              
										            </div>
                                                   
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-lg-8 ml-auto">
                                                    <button type="submit" class="btn btn-primary">Modifier</button>
                                                </div>
                                            </div>
                                        </form>
                                        
                                    </div>
                                </div>
                                
                            </div>
                        </div>
                    </div>
         
    
                </section>
            </div>
            <%  }else out.print("Quelque chose");
    	 
    	 %>
        </div>
    </div>
    
    