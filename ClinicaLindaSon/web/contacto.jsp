<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Contactos</title>
    <link rel="icon" type="image/jpg" href="img/iconoclinica.png">

    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>


    <style>
        .contacto {
            margin-top: 100px;
        }

        .contacto .card {
            background: rgba(0, 0, 0, .6)
        }

        .contacto label {
            font-size: 16px;
            color: #ccc;
        }

        .contacto input {
            font-size: 20px;
            color: #fff;
        }

        .contacto .card-action {
            background: #2cb4c3;
        }

        body {
            background-image: url(img/Contacto.jpg);
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
            width: 545px;
            height: 100px;
            margin: 20px 20px;
            padding: 10px;
            font-size: 14px;

        }
    </style>

</head>

<body>

    <div class="navbar-fixed">
         <ul id="dropdown1" class="dropdown-content">
  <li><a href="inicioSesion.jsp">Cliente</a></li>
    <li class="divider"></li>
  <li><a href="inicioSesionE.jsp">Empleado</a></li>
  </ul>
        <nav class="nav-wrapper" style="background-color:rgb(101, 101, 100 ,0.3);">

            <div class="">


                <img src="img/iconoclinica.png" alt="icono" style="width:42px;height:42px;border:2;">
                <a href="#" class="brand-logo white-text">Clinica Linda Sonrisa</a>

                <a href="#" data-target="menu-responsive" class="sidenav-trigger">
                    <i class="material-icons blue-text">menu</i>
                </a>


                <ul class="right  hide-on-med-and-down">
                    <li><a href="indexClinicaLindaS.jsp" class="White-text">Inicio</a></li>
                    <li><a href="tratamiento.jsp" class="White-text">Tratamientos</a></li>
                    <li><a href="servicios.jsp" class="White-text">Servicios</a></li>
                    <li><a href="conocenos.jsp" class="White-text">Conocenos</a></li>
                    <li><a href="contacto.jsp" class="White-text">Contacto</a></li>
                    <li><a class="dropdown-trigger" href="#!" data-target="dropdown1">Inicio Sesión</a></li>
                    <li><a href="registrateAqui.jsp" class="White-text">Registrate Aquí</a></li>


                </ul>

            </div>


        </nav>

    </div>

     <ul id="dropdown2" class="dropdown-content">
  <li><a href="inicioSesion.jsp">Cliente</a></li>
    <li class="divider"></li>
  <li><a href="inicioSesionE.jsp">Empleado</a></li>
  </ul>
    <ul class="sidenav white" id="menu-responsive">
        <li><a href="indexClinicaLindaS.jsp">Inicio</a></li>
        <li><a href="tratamiento.jsp">Tratamientos</a></li>
        <li><a href="servicios.jsp">Servicios</a></li>
        <li><a href="conocenos.jsp">Conocenos</a></li>
        <li><a href="contacto.jsp">Contacto</a></li>
        <li><a class="dropdown-trigger" href="#!" data-target="dropdown2">Inicio Sesión</a></li>
        <li><a href="registrateAqui.jsp">Registrate Aquí</a></li>

    </ul>




    <section class="wap">
        <section style="text-align: center" class="bienvenidos">
            <p>
                <h5>Contactenos</h5>
            </p>
            <p>
                <h5>Déjanos tus consultas</h5>
            </p>
            <p>
                <h5>Nuestro horario es de Lunes a Viernes de 09:00 am - 19:00 pm</h5>
            </p>




        </section>

        <form method="POST" id="formdata">
                <div id="formulario" class="row contacto">
                    <div class="col s4 offset-s4">
                        <div class="card">
                            <div class="card-action white-text" >
                                <h3>Contactenos</h3>
                            </div>
                            <div class="card-content">
                                <div class="form-field">
                                    <input type="text" placeholder="Nombre" id="nombre" class="validate" required>
                
                                </div><br>
                                <div class="form-field">
                                    <input type="text" placeholder="E-mail" id="email" class="validate" required>
                
                                </div><br>
                                <div class="form-field">
                                        <input type="text" placeholder="Telefono" id="telefono" class="validate" required>
                    
                                    </div><br>
                                <div class="form-field">
                                        <textarea name="descripcion" id="" cols="30" rows="10" class="caja-2 white-text"
                                        placeholder="Descripción"></textarea>
                
                                </div><br>
                               
                                
                                <div class="form-field">
                                    <button type="button" id="botonregistrar" class="btn modal-trigger teal darken-3" data-target="idModal">Enviar</button>
                                   
                
                                </div>
                            </div>
                
                
                        </div>



            <div class="mapa">
                <ul class="mapa-contacto">
                    <li>
                        <iframe
                            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3345.8450091276673!2d-71.55086278419353!3d-33.00786148232096!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9689ddc256d9f4e1%3A0x656d63a3f27f71c7!2sTorre+Coraceros!5e0!3m2!1ses-419!2scl!4v1557987222555!5m2!1ses-419!2scl"
                            width="425" height="425" frameborder="0" style="border:0" allowfullscreen></iframe>

                    </li>

                </ul>

            </div>
        </section>

    </section>
    <section class="limpia"></section>

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



</body>

</html>