<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@ include file="styles.jsp" %>
<%@ include file="scripts.jsp" %>
<%@page import="java.util.List"%>
<%@page import="dao.SocieteDAO"%>
<%@page import="entities.Societe"%>
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
                                <h1> Ajouter un Contrat</h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Acceuil</a></li>
                                    <li class="breadcrumb-item active">Ajouter un Contrat</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                <!-- /# row -->
                <% SocieteDAO socdao = new SocieteDAO();
                   List<Societe> socs = socdao.getAllSocietes();
                   ConducteurDAO condao= new ConducteurDAO();
                   List<Conducteur> cons = condao.getAllConducteurs();

                 %>
                <section id="main-content">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="form-validation">
                                        <form method="post" action="AjouterContrat">
                                            <div class="row">
                                                <div class="col-lg-6">
                                                <div class="form-group">
                                                        <label>Date Contrat</label>
                                                        <input class="form-control" type="date" value="2011-08-19" id="example-date-input" name="dateContrat">
                                                    </div>
                                                    <div class="form-group ">
										              <label >Société</label><br>
										              <div >
										              <select class="form-control selectpicker" id="select-country" data-live-search="true" name="societe">
										                 <%
                                       for(Societe ms:socs){%>
                                    	   <option data-tokens="china" value =<%out.println(ms.getCodeSociete()); %>><%out.println(ms.getNom()); %></option> 
                                    	   
                                     <%} %>             
										                </select>
										
										              </div>
										            </div>
                                                    <div class="form-group ">
										              <label >Conducteur 1</label><br>
										              <div >
										                <select class="form-control selectpicker" id="select-country" data-live-search="true" name="cond1">
										             <%   for(Conducteur c:cons){%>
                                    	   <option data-tokens="china" value =<%out.println(c.getCodeCond()); %>><%out.println(c.getNom()+" "+c.getPrenom()); %></option> 
                                    	   
                                     <%} %> 
										                </select>
										
										              </div>
										            </div>
                                                    
                                                    <div class="form-group ">
										              <label >Conducteur 2</label><br>
										              <div >
										              <select class="form-control selectpicker" id="select-country" data-live-search="true" name="cond2">
										                 <%
                                       for(Conducteur c:cons){%>
                                    	   <option data-tokens="china" value =<%out.println(c.getCodeCond()); %>><%out.println(c.getNom()+" "+c.getPrenom()); %></option> 
                                    	   
                                     <%} %>             
										                </select>
										
										              </div>
										            </div>
                                                    <div class="form-group">
                                                        <label>Date Début Location</label>
                                                        <input class="form-control" type="date" value="2011-08-19" id="datedeb" name="datedeb" onchange="calcul()" >
                                                    </div>
                                                   
                                                </div>
                                                <div class="col-lg-6">
                                                 <div class="form-group">
                                                        <label>Date Fin Location</label>
                                                       <input class="form-control" type="date" value="2011-08-19" id="datefin" name="datefin" onchange="calcul()">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Prix Unitaire Jour</label>
                                                         <input class="form-control" type="text" id ="prixuni" name="prixuni" placeholder="Saisie Prix Unitaire Jour"  autocomplete="off" onblur="calcul()" >
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Prix Total</label>
                                                         <input class="form-control" type="text" name="prixtot" id="prixtot" placeholder="Saisie Prix Total"  autocomplete="off" readonly="readonly">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Montant Avance</label>
                                                         <input class="form-control" type="text" name="montant" placeholder="Saisie Montant Avance" autocomplete="off">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Date Création Contrat</label>
                                                        <input class="form-control" type="date" name="datecrea" value="2011-08-19" id="example-date-input">
                                                    </div>
                                                    
                                                   
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-lg-8 ml-auto">
                                                    <button type="submit" class="btn btn-primary">Enregistrer</button>
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
        </div>
    </div>
    <script type="text/javascript">
    function calcul() {  	
    	    var d1=document.getElementById("datedeb").value;
    	    var d2 =document.getElementById("datefin").value;
			day1 = d1.substring(8,10);
			day2 = d2.substring(8,10);
			
			if(day2 > day1){
				diff= day2 - day1;
	    	    var prix = document.getElementById("prixuni").value;
	    	    document.getElementById("prixtot").value = diff *prix;
			}else{
				alert('Date incorrecte');
			}   
    	
    }
    </script>
 