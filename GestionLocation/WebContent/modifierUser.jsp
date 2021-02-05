<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@ include file="styles.jsp" %>
<%@ include file="scripts.jsp" %>
<%@page import="dao.UserDAO"%>
<%@page import="entities.User"%>
<div class="content-wrap">
        <div class="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 p-r-0 title-margin-right">
                        <div class="page-header">
                            <div class="page-title">
                                <h1>Modifier un Utilisateur</h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Acceuil</a></li>
                                    <li class="breadcrumb-item active">Modifier un Utilisateur</li>
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
									    	 UserDAO userdao = new UserDAO();
									    	 User u =new User();
									    	 u = userdao.getUserById(Integer.parseInt(request.getParameter("code")));
									    	  %>
                                        <form class="form-valide" action="ModifierUser" method="post">
                                         <input type="hidden" name ="codeU" value ="<% out.print(u.getCodeU()); %>">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-username">Nom </label>
                                                <div class="col-lg-8">
                                                    <input type="text" class="form-control" id="nom" name="nom" placeholder="Saisie nom" autocomplete="off" value="<% out.print(u.getNom()); %>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-email">Prénom</label>
                                                <div class="col-lg-8">
                                                    <input type="text" class="form-control" id="prenom" name="prenom" placeholder="Saisie Prénom" autocomplete="off" value="<% out.print(u.getPrenom()); %>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-password">Login </label>
                                                <div class="col-lg-8">
                                                    <input type="text" class="form-control" id="login" name="login" placeholder="Saisie Login" autocomplete="off"value="<% out.print(u.getLogin()); %>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-confirm-password">Mot de passe </label>
                                                <div class="col-lg-8">
                                                    <input type="password" class="form-control" id="password" name="password" placeholder="Saisie Mot de passe"value="<% out.print(u.getPassword()); %>">
                                                </div>
                                            </div>
                                             <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-confirm-password">Admin </label>
                                                <div class="col-lg-8">
                                                   <div >
                                                <input type="radio" name="admin" id="radio1" value="true" value="true" <% if(u.isAdmin()) out.print("checked"); %>>
                                                <label for="radio1">
                                                  Oui
                                                </label>
                                                 <input type="radio" name="admin" id="radio2" value ="false" <% if(!u.isAdmin()) out.print("checked"); %>>
                                                <label for="radio2">
                                                  Non
                                                </label>
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
    