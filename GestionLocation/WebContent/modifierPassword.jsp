<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@ include file="styles.jsp" %>
<%@ include file="scripts.jsp" %>

<div class="content-wrap">
        <div class="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 p-r-0 title-margin-right">
                        <div class="page-header">
                            <div class="page-title">
                                <h1> Modifier Mot de Passe</h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Acceuil</a></li>
                                    <li class="breadcrumb-item active">Modifier Mot de Passe</li>
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
                                    <% if(request.getParameter("erreur") != null){%>
                                    <div class="alert alert-danger">
                                     
    	<%  if(request.getParameter("erreur").equals("ancien"))
    		 out.print("Ancien mot de passe est Incorrecte");
    	 else if(request.getParameter("erreur").equals("confirmer"))
    		 out.print("Confirmer mot de passe"); %>
    
                                            </div> 
                                            <% }
    	 %>
                                        <form class="form-valide" method ="post" action="ModifierPassword">
                                            <div class="form-group row">
                                            
                                             
                                                <label class="col-lg-4 col-form-label" for="val-username">Ancien Mot de Passe </label>
                                                <div class="col-lg-8">
                                                    <input type="password" class="form-control" id="ancien" name="ancien" placeholder="Saisie Ancien Mot de Passe" required>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-email">Nouveau Mot de Passe</label>
                                                <div class="col-lg-8">
                                                    <input type="password" class="form-control" id="nouveau" name="nouveau" placeholder="Saisie Nouveau Mot de Passe" required>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-password">Confirmer Mot de Passe </label>
                                                <div class="col-lg-8">
                                                    <input type="password" class="form-control" id="login" name="confirmer" placeholder="Confirmer Mot de Passe" required>
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
        </div>
    </div>
    