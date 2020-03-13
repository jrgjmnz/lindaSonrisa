<!DOCTYPE html>
<html lang="en">

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Servicios</title>
    <link rel="icon" type="image/jpg" href="img/iconoclinica.png">
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <style>
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
            background-image: url(img/Servicios.jpg);
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

        p img {
            height: 200px;
            width: 350px;
            object-fit: contain;
            padding: 15px;
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
        <li><a href="contacto.jsp">Contacto</a></li>
        <li><a class="dropdown-trigger" href="#!" data-target="dropdown2">Inicio Sesión</a></li>
        <li><a href="registrateAqui.jsp">Registrate Aquí</a></li>

    </ul>

    <p class="center">
        <img src="img/Cirugias.png">
        <img src="img/Imageonologia.png">
        <img src="img/Laboratorio.png">

    </p>
    <p class="center">
        <img src="img/Endodoncia.png">
        <img src="img/ConsultasMedicas.png">
        <img src="img/Odontologia.png">
    </p>
    <p class="center">
        <img src="img/Ortodoncia.png">
    </p>





















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
    <script src=" https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"> </script>
    <script>
        document.addEventListener('DOMContentLoaded', function () {
            M.AutoInit();
        });
    </script>

</body>

</html>