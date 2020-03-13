<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Inicio Sección</title>
    <link rel="icon" type="image/jpg" href="img/iconoclinica.png">
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">









    <style>
        .login {
            margin-top: 100px;
            width: 100%;
            height: auto;
        }

        .login .card {
            background: rgba(0, 0, 0, .6);
            width: 100%;
            height: auto;
        }

        .login label {
            font-size: 16px;
            color: #ccc;
            width: 100%;
            height: auto;
        }

        .login input {
            font-size: 20px;
            color: #fff;
            width: 100%;
            height: auto;
        }

        sc#01 {
            position: fixed;
            float: right;
        }

        footer {
            background-color: rgb(101, 101, 100, 0.3);
            padding: 0px;
            text-align: right;
            color: white;
            margin-top: 100px;
        }

        .right hide-on-med-and-down {
            text-align: right;
            padding: 100px;

        }

        footer {
            clear: both;
            background-color: rgb(101, 101, 100, 0.3);
            text-align: right;
            padding: 5px;
            margin-top: 10px;
        }

        footer p {
            text-align: left;
            color: #fff;
        }

        body {
            background-image: url(img/fondoiniciosesion.jpg);
            background-size: 100% 100%;
            background-attachment: fixed;
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
                <a href="#" class="brand-logo White-text" img="imagenes/iconoclinica.png">Clinica Linda Sonrisa</a>
                <a href="#" data-target="menu-responsive" class="sidenav-trigger">
                    <i class="material-icons blue-text">menu</i>
                </a>


                <ul class="right  hide-on-med-and-down">
                    <li><a href="indexClinicaLindaS.jsp" class="White-text">Inicio</a></li>
                    <li><a href="tratamiento.jsp" class="White-text">Tratamientos</a></li>
                    <li><a href="servicios.jsp" class="White-text">Servicios</a></li>
                    <li><a href="conocenos.jsp" class="White-text">Conócenos</a></li>
                    
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
        <li><a href="conocenos.jsp">Conócenos</a></li>
        
        <li><a class="dropdown-trigger" href="#!" data-target="dropdown2">Inicio Sesión</a></li>
        <li><a href="registrateAqui.jsp">Registrate Aquí</a></li>

    </ul>



    <div class="row login">
        <div class="col s4 offset-s4">
            <div class="card center">
                <div class="card-action teal darken-1 white-text">
                    <h3>Inicio Sesión Cliente</h3>
                </div>
                <div class="card-content">
                    <div class="form-field">
                        <label for="username">Nombre Usuario</label>
                        <input type="text" id="usuario_cli" name="usuario_cli" required="true">
                    </div><br>
                    <div class="form-field">
                        <label for="password">Contraseña de Usuario</label>
                        <input type="password" id="password_cli" name="password_cli" class="validate" required="true">
                        
                    </div><br>
                    <div class="form-field">
                        <button id="send-button" type="submit" class="btn-large teal darken-3">Ingresar</button>

                    </div>
                </div>


            </div>





        </div>



    </div>
    




























    <footer>
        <div>
            <p class="blue-text">info@clinicalindasonrisa.cl</p>
            <p>Edificio Coracero depto.403 Benidorm, Viña del Mar</p>
            <p>+56 22881192</p>
            <a href="https://es-es.facebook.com/">
                <img src="img/facebook.png" alt="facebook" style="width:42px;height:42px;border:2;">
            </a>

            <a href="https://twitter.com/">
                <img src="img/twitter.png" alt="twitter" style="width:42px;height:42px;border:2;">
            </a>
            <a href=" https://www.instagram.com/">
                <img src="img/instagram icono.png" alt="instagram" style="width:42px;height:42px;border:2;">
            </a>
        </div>
    </footer>







    <!-- Compiled and minified JavaScript -->
    <script src=" https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"> </script>
    <script>
        document.addEventListener('DOMContentLoaded', function () {
            M.AutoInit();
        });
    </script>
</body>

</html>