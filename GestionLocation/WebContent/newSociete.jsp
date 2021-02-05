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
                                <h1> Ajouter une Soci�t�</h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Acceuil</a></li>
                                    <li class="breadcrumb-item active">Ajouter une Soci�t�</li>
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
                                        <form method="post" action="AjouterSociete">
                                            <div class="row">
                                                <div class="col-lg-6">
                                                    <div class="form-group">
                                                        <label>Nom </label>
                                                        <input type="text" name="nom"class="form-control"  placeholder="Saisie Nom Soci�t�" required autocomplete="off">
                                                    </div>
                                                     <div class="form-group">
                                                        <label>Adresse</label>
                                                        <input type="text" name ="adresse" class="form-control"  placeholder="Saisie Adresse Soci�t�" required autocomplete="off">
                                                    </div>
                                                     <div class="form-group">
                                                        <label>T�l�phone</label>
                                                        <input type="text" name="telS" class="form-control"  placeholder="Saisie T�l�phone Soci�t�" required autocomplete="off">
                                                    </div>
                                                     <div class="form-group">
                                                        <label>Email</label>
                                                        <input type="email" name="email"class="form-control"  placeholder="Saisie Email Soci�t�" required autocomplete="off">
                                                    </div>
                                                    <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-confirm-password">Personne Physique </label>
                                                <div class="col-lg-8">
                                                   <div >
                                                <input type="radio" name="personne" id="radio1" value="true" checked>
                                                <label for="radio1">
                                                  Oui
                                                </label>
                                                 <input type="radio" name="personne" id="radio2" value ="false">
                                                <label for="radio2">
                                                  Non
                                                </label>
                                              </div>
                                                </div>
                                            </div>
                                                    
                                                </div>
                                                <div class="col-lg-6">
                                                 <div class="form-group">
                                                        <label>Date Cr�ation</label>
                                                         <input class="form-control" name="dtc" type="date" value="2011-08-19" id="example-date-input">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Nom Repr�sentant Soci�t�</label>
                                                        <input type="text" class="form-control"name="nomR"  placeholder="Saisie Nom Repr�sentant Societe" required autocomplete="off">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Pr�nom Repr�sentant Soci�t�</label>
                                                        <input type="text" class="form-control" name="prenomR"  placeholder=" Saisie Pr�nom Repr�sentant Soci�t�"required autocomplete="off">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>T�l�phone Repr�sentant Soci�t� </label>
                                                        <input type="text" class="form-control"  name="telR" placeholder="Saisie T�l�phone Repr�sentant Soci�t�" required autocomplete="off">
                                                        
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
    