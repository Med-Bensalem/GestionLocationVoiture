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
                                <h1> Ajouter un Conducteur</h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Acceuil</a></li>
                                    <li class="breadcrumb-item active">Ajouter un Conducteur</li>
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
                                        <form method="post" action="AjouterConducteur">
                                            <div class="row">
                                                <div class="col-lg-6">
                                                    <div class="form-group">
                                                        <label>Nom</label>
                                                        <input type="text" class="form-control" name="nom" placeholder="Saisie Nom" autocomplete="off" required >
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Prénom</label>
                                                        <input id="example-email" class="form-control" type="text" placeholder="Saisie Prénom" name="prenom" autocomplete="off"required>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Date de Naissance</label>
                                                        <input class="form-control" type="date" name="dtn" value="2011-08-19" id="example-date-input">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Adresse</label>
                                                        <input class="form-control" type="text" name="adresse" placeholder ="Saisie Adresse" autocomplete="off" required>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Téléphone</label>
                                                        <input class="form-control" type="text" name="tel" placeholder="Saisie Téléphone" autocomplete="off" required>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Email</label>
                                                        <input class="form-control" type="email" name="email" placeholder="Saisie Email " autocomplete="off" required>
                                                    </div>
                                                    

                                                </div>
                                                <div class="col-lg-6">
                                                    <div class="form-group">
                                                        <label>Numéro CIN</label>
                                                         <input class="form-control" type="text" name="cin" placeholder="Saisie Numéro CIN" size="8" autocomplete="off" required>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Date CIN</label>
                                                         <input class="form-control" type="date" name="dtcin" value="2011-08-19" id="example-date-input">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Numéro Permis</label>
                                                         <input class="form-control" type="text" name="permis" placeholder="Saisie Numéro Permis" autocomplete="off" required>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Date Livraison Permis</label>
                                                        <input class="form-control" type="date" name ="dtl" value="2011-08-19" id="example-date-input">
                                                    </div>
                                                    
                                                    <div class="form-group">
                                                        <label>Date Création Conducteur</label>
                                                         <input class="form-control" type="date" name ="dtc" value="2011-08-19" id="example-date-input">
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
    