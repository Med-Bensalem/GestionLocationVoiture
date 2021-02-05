<%@ include file="styles.jsp" %>
<%@ include file="sidebar.jsp" %>
<%@ include file="navbar.jsp" %>
<%@page import="dao.UserDAO"%>
<%@page import="dao.SocieteDAO"%>
<%@page import="dao.ConducteurDAO"%>
<%@page import="dao.ModeleDAO"%>
<%@page import="dao.MarqueDAO"%>
<%@page import="dao.MaisonDAO"%>
<%@page import="dao.VoitureDAO"%>
<%@page import="dao.ContratDAO" %>


   <div class="content-wrap">
        <div class="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 p-r-0 title-margin-right">
                        <div class="page-header">
                            <div class="page-title">
                                <h1>Bienvenue  <span>
                                <%out.print(session.getAttribute("nom"));%>
                                <%out.print(session.getAttribute("prenom")); %>          
                            </span></h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    
                                    <li class="breadcrumb-item active">Acceuil</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                <%User u = (User) request.getSession().getAttribute("user"); %>
                <!-- /# row -->
                <section id="main-content">
                <%  if (u.isAdmin()){%>
                    <div class="row">
                        <div class="col-lg-3">
                            <div class="card">
                                <div class="stat-widget-one">
                                    <div class="stat-icon dib"><i class="ti-user color-primary border-primary"></i>
                                    </div>
                                    <div class="stat-content dib">
                                        <div class="stat-text">Utilisateurs</div>
                                        <div class="stat-digit"><%UserDAO userdao = new UserDAO();
                                        
								out.print(userdao.getAllUsers().size());%></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                       
                        <div class="col-lg-3">
                            <div class="card">
                                <div class="stat-widget-one">
                                    <div class="stat-icon dib"><i class="ti-home color-primary border-primary"></i>
                                    </div>
                                    <div class="stat-content dib">
                                        <div class="stat-text">Sociétés</div>
                                        <div class="stat-digit"><%SocieteDAO socdao = new SocieteDAO();
								out.print(socdao.getAllSocietes().size());%></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="card">
                                <div class="stat-widget-one">
                                    <div class="stat-icon dib"><i class="ti-user color-primary border-primary"></i>
                                    </div>
                                    <div class="stat-content dib">
                                        <div class="stat-text">Conducteurs</div>
                                        <div class="stat-digit"><%ConducteurDAO condao = new ConducteurDAO();
								out.print(condao.getAllConducteurs().size());%></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="card">
                                <div class="stat-widget-one">
                                    <div class="stat-icon dib"><i class="ti-list color-danger border-danger"></i>
                                    </div>
                                    <div class="stat-content dib">
                                        <div class="stat-text">Modéles</div>
                                        <div class="stat-digit"><%ModeleDAO moddao = new ModeleDAO();
								out.print(moddao.getAllModels().size());%></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="card">
                                <div class="stat-widget-one">
                                    <div class="stat-icon dib"><i class="ti-target color-danger border-danger"></i>
                                    </div>
                                    <div class="stat-content dib">
                                        <div class="stat-text">Marques</div>
                                        <div class="stat-digit"><%MarqueDAO mqdao = new MarqueDAO();
								out.print(mqdao.getAllMarques().size());%></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="card">
                                <div class="stat-widget-one">
                                    <div class="stat-icon dib"><i class="ti-home color-danger border-danger"></i>
                                    </div>
                                    <div class="stat-content dib">
                                        <div class="stat-text">Maisons</div>
                                        <div class="stat-digit"><%MaisonDAO msdao = new MaisonDAO();
								out.print(msdao.getAllMaisons().size());%></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="card">
                                <div class="stat-widget-one">
                                    <div class="stat-icon dib"><i class="ti-car color-pink border-pink"></i>
                                    </div>
                                    <div class="stat-content dib">
                                        <div class="stat-text">Voitures</div>
                                        <div class="stat-digit"><%VoitureDAO voidao = new VoitureDAO();
								out.print(voidao.getAll().size());%></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="card">
                                <div class="stat-widget-one">
                                    <div class="stat-icon dib"><i class="ti-write color-success border-success"></i></div>
                                    <div class="stat-content dib">
                                        <div class="stat-text">Contrats</div>
                                        <div class="stat-digit"><%ContratDAO contdao = new ContratDAO();
								out.print(contdao.getAll().size());%></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                    <%} %>
                    <%  if (!u.isAdmin()){%> 
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-title">
                                    <h4>Calender</h4>
                                    
                                </div>
                                <div class="card-body">
                                    <div class="year-calendar"></div>
                                </div>
                            </div>
                            <!-- /# card -->
                        </div>
                        <!-- /# column -->
                    </div>
                    <%} %>
                    </section>
                    </div>
                    </div>
                     
                    </div>
                    
                    <%@ include file="scripts.jsp" %>
                    