<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Situacion Economica Cliente</title>
    <link rel="icon" type="image/jpg" href="img/iconoclinica.png">
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">


    <style>
         .insumos {
            margin-top: 100px;
        }

        .insumos .card {
            background: rgba(0, 0, 0, .6)
        }

        .insumos label {
            font-size: 16px;
            color: #ccc;
        }

        .insumos input {
            font-size: 20px;
            color: #fff;
        }
        table,
        td {
            border: 1px solid white;
            border-collapse: collapse;


        }

        th,
        td {
            padding: 15px;
            text-align: center;
        }

        table#t01 th {
            background-color: rgba(120, 120, 120, 0.8);
        }

        table#t01 tr {
            background-color: rgba(120, 120, 120, 0.8);
        }

        table#t01 {
            margin-left: auto;
            margin-right: auto;
            margin-top: 50px;
            margin-bottom: auto;

        }

        body {
            background-image: url(img/situacioneconomica.png);
            background-size: 100% 100%;
            background-attachment: fixed;
        }

        footer p {
            text-align: left;
            color: #fff;
        }

        fieldset {
            border: 1px;
            margin-left: 30px;
            margin-right: 30px;
            margin-top: auto;
            margin-bottom: auto;
            text-align: center;
        }

        footer {
            clear: both;
            background-color: rgb(101, 101, 100, 0.3);
            text-align: right;
            padding: 20px;
            margin-top: 50px;
        }
        .caja-2 .card {
            width: 80px;
            height: 100px;
            margin: 20px 20px;
            padding: 10px;
            font-size: 14px;
            
            
        }
    </style>


</head>

<body>

    <div class="navbar-fixed">
        <nav class="nav-wrapper" style="background-color:rgb(101, 101, 100 ,0.3);">

            <div class="">


                <img src="img/iconoclinica.png" alt="icono" style="width:42px;height:42px;border:2;">
                <a href="#" class="brand-logo white-text">Clinica Linda Sonrisa</a>

                <a href="#" data-target="menu-responsive" class="sidenav-trigger">
                    <i class="material-icons blue-text">menu</i>
                </a>


                <ul class="right hide-on-med-and-down">
                        <li><a href="solicitudCitaC.jsp" class="White-text">Solicitud</a></li>
                        <li><a href="situacionEconomicaC.jsp" class="White-text">Situación</a></li>
                        <li><a href="inicioSesion.jsp" class="White-text">Cerrar</a></li>


                </ul>

            </div>
        </nav>

    </div>

    <ul class="sidenav white" id="menu-responsive">
            <li><a href="solicitudCitaC.jsp" class="White-text">Solicitud</a></li>
            <li><a href="situacionEconomicaC.jsp" class="White-text">Situación</a></li>
            <li><a href="inicioSesion.jsp" class="White-text">Cerrar</a></li>

    </ul>



    <form action="">
            <fieldset>
              <h2 class="black-text">Situacion Economica Cliente:</h2><br>
            </fieldset>
          </form>

<div class="container">
    <div class="row insumos">
        
        <form class="col s8 offset-s2">
                
            <div class="card">
                    
                <div class="row">
                        <div class="input-field col s8">
                                <form action="#">
                                    <h5 class="white-text">Afiliación:</h5>
                                        <div class="file-field input-field">
                                          <div class="btn-small">
                                            <span>Adjuntar</span>
                                            <input type="file">
                                          </div>
                                          <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                          </div>
                                        </div>
                                      </form>
                              </div>

                </div>
                <div class="row">
                        <div class="input-field col s8">
                                <form action="#">
                                    <h5 class="white-text">Fonasa o Isapre:</h5>
                                        <div class="file-field input-field">
                                          <div class="btn-small">
                                            <span>Adjuntar</span>
                                            <input type="file">
                                          </div>
                                          <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                          </div>
                                        </div>
                                      </form>
                              </div>

                </div>
                <div class="row">
                        <div class="input-field col s8">
                                <form action="#">
                                    <h5 class="white-text">Liquidación de Sueldo:</h5>
                                        <div class="file-field input-field">
                                          <div class="btn-small">
                                            <span>Adjuntar</span>
                                            <input type="file">
                                          </div>
                                          <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                          </div>
                                        </div>
                                      </form>
                              </div>

                </div>
                <div class="row">
                        <div class="input-field col s8">
                                <form action="#">
                                    <h5 class="white-text">Finiquito:</h5>
                                        <div class="file-field input-field">
                                          <div class="btn-small">
                                            <span>Adjuntar</span>
                                            <input type="file">
                                          </div>
                                          <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                          </div>
                                        </div>
                                      </form>
                              </div>

                </div>
               
                <div class="form-field">
                        <button class="btn modal-trigger teal darken-3" data-target="idModal">Guardar</button>
                       
                      </div>
            </div>
            </div>
    </div>
</div>


    
        
        
          <footer>
            <div>
              <p>info@clinicalindasonrisa.cl</p>
              <p>Edificio Coracero depto.403 Benidorm, Viña del Mar</p>
              <p>+56 22881192</p>
        
        
              <a href="https://es-es.facebook.com/">
                <img src="img/facebook.png" alt="facebook" style="width:42px;height:42px;border:2;">
              </a>
        
              <a href="https://twitter.com/">
                <img src="img/twitter.png" alt="twitter" style="width:42px;height:42px;border:2;">
              </a>
              <a href="https://www.instagram.com/">
                <img src="img/instagram icono.png" alt="instagram" style="width:42px;height:42px;border:2;">
              </a>
            </div>
          </footer>
        
        
        
        
        

        
          <!-- Compiled and minified JavaScript -->
          <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
          <script>
            document.addEventListener('DOMContentLoaded', function () {
              M.AutoInit();
            });
        
          </script>
        </body>
        
        </html>