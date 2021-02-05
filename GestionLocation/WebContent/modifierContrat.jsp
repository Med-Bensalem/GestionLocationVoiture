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
<%@page import="dao.ContratDAO"%>
<%@page import="entities.Contrat"%>
<div class="content-wrap">
        <div class="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 p-r-0 title-margin-right">
                        <div class="page-header">
                            <div class="page-title">
                                <h1> Modifier un Contrat</h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Acceuil</a></li>
                                    <li class="breadcrumb-item active">Modifier un Contrat</li>
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
									    	 ContratDAO contdao = new ContratDAO();
									    	 Contrat c =new Contrat();
									    	 c = contdao.getContratById(Integer.parseInt(request.getParameter("code")));
									    	  %>
                                        <form method="post" action="ModifierContrat">
                                        <input type="hidden" name ="codeCon" value ="<% out.print(c.getCodeCon()); %>">
                                            <div class="row">
                                                <div class="col-lg-6">
                                                <div class="form-group">
                                                        <label>Date Contrat</label>
                                                        <input class="form-control" type="date" value="2011-08-19" id="example-date-input" name="dateContrat" value="<% out.print(c.getDateContrat()); %>">
                                                    </div>
                                                     <% SocieteDAO socdao = new SocieteDAO();
									                   List<Societe> socs = socdao.getAllSocietes();
									                   ConducteurDAO condao= new ConducteurDAO();
									                   List<Conducteur> cons = condao.getAllConducteurs();
									
									                 %>
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
										             <%   for(Conducteur cd:cons){%>
                                    	   <option data-tokens="china" value =<%out.println(cd.getCodeCond()); %>><%out.println(cd.getNom()+" "+cd.getPrenom()); %></option> 
                                    	   
                                     <%} %> 
										                </select>
										
										              </div>
										            </div>
                                                    
                                                    <div class="form-group ">
										              <label >Conducteur 2</label><br>
										              <div >
										              <select class="form-control selectpicker" id="select-country" data-live-search="true" name="cond2">
										                 <%
                                       for(Conducteur cd:cons){%>
                                    	   <option data-tokens="china" value =<%out.println(cd.getCodeCond()); %>><%out.println(cd.getNom()+" "+cd.getPrenom()); %></option> 
                                    	   
                                     <%} %>             
										                </select>
										
										              </div>
										            </div>
                                                    <div class="form-group">
                                                        <label>Date Début Location</label>
                                                        <input class="form-control" type="date" value="2011-08-19" id="datedeb" name="datedeb" onchange="calcul()" value="<% out.print(c.getDatedeb()); %>">
                                                    </div>
                                                   
                                                </div>
                                                <div class="col-lg-6">
                                                 <div class="form-group">
                                                        <label>Date Fin Location</label>
                                                       <input class="form-control" type="date" value="2011-08-19" id="datefin" name="datefin" onchange="calcul()" value="<% out.print(c.getDatefin()); %>">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Prix Unitaire Jour</label>
                                                         <input class="form-control" type="text" id ="prixuni" name="prixuni" placeholder="Saisie Prix Unitaire Jour"  autocomplete="off" onblur="calcul()" value="<% out.print(c.getPrixUni()); %>">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Prix Total</label>
                                                         <input class="form-control" type="text" name="prixtot" id="prixtot" placeholder="Saisie Prix Total"  autocomplete="off" readonly="readonly" value="<% out.print(c.getTot()); %>">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Montant Avance</label>
                                                         <input class="form-control" type="text" name="montant" placeholder="Saisie Montant Avance" autocomplete="off" value="<% out.print(c.getAvance()); %>">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Date Création Contrat</label>
                                                        <input class="form-control" type="date" name="datecrea" value="2011-08-19" id="example-date-input" value="<% out.print(c.getDateCrea()); %>">
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
 