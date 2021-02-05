<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@ include file="styles.jsp" %>
<%@ include file="scripts.jsp" %>
<%@page import="dao.MarqueDAO"%>
<%@page import="entities.Marque"%>
<div class="content-wrap">
        <div class="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 p-r-0 title-margin-right">
                        <div class="page-header">
                            <div class="page-title">
                                <h1>Modifier un Marque</h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Acceuil</a></li>
                                    <li class="breadcrumb-item active">Modifier un Marque</li>
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
									    	 MarqueDAO marquedao = new MarqueDAO();
									    	 Marque mq =new Marque();
									    	 mq = marquedao.getMarqueById(Integer.parseInt(request.getParameter("code")));
									    	  %>
                                        <form class="form-valide" action="ModifierMarque" method="post">
                                        <input type="hidden" name ="codeMq" value ="<% out.print(mq.getCodeMq()); %>">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-username">Nom </label>
                                                <div class="col-lg-8">
                                                    <input type="text" class="form-control" id="nom" name="nom" placeholder="Saisie nom" autocomplete="off" value="<% out.print(mq.getNom()); %>">
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
    