<!DOCTYPE html>
<html lang="en">

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Menu Empleado</title>
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
            background-image: url(img/menuempleados.jpg);
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
        <nav class="nav-wrapper" style="background-color:rgb(101, 101, 100 ,0.3);">

            <div class="">


                <img src="img/iconoclinica.png" alt="icono" style="width:42px;height:42px;border:2;">
                <a href="#" class="brand-logo white-text">Clinica Linda Sonrisa</a>

                <a href="#" data-target="menu-responsive" class="sidenav-trigger">
                    <i class="material-icons blue-text">menu</i>
                </a>


                <ul class="right  hide-on-med-and-down">
                    <li><a href="menuEmpleadosA.jsp" class="White-text">Menu Empleado</a></li>
                    <li><a href="inicioSesion.jsp" class="White-text">Cerrar</a></li>


                </ul>

            </div>


        </nav>

    </div>

    <ul class="sidenav white" id="menu-responsive">
        <li><a href="menuEmpleadosA.jsp" class="White-text">Menu Empleado</a></li>
        <li><a href="inicioSesion.jsp" class="White-text">Cerrar</a></li>

    </ul>

    <p class="center">
        <a href="ingresarProveedoresA.jsp"><img src="img/ingresarproveedor.png"></a>
        <a href="ingresarEmpleadosA.jsp"><img src="img/IngresarEmpleado.png"></a>
        <a href="ingresarServiciosA.jsp"><img src="img/IngresarServicios.png"></a>

    </p>
    <p class="center">
        <a href="ingresarInsumosNuevosA.jsp"><img src="img/IngresarInsumos.png"></a>
        <a href="ingresarHorarioA.jsp"><img src="img/IngresarHorarioDispo.png"></a>
        <a href="administrarPrivilegiosA.jsp"><img src="img/AdministrarPrivilegios.png"></a>
    </p>
    <p class="center">
        <a href="solicitudCitasA.jsp"><img src="img/solicitudCitas.png"></a>
        <a href="pacientesAtendidosA.jsp"><img src="img/PacientesAtendidos.png"></a>
        <a href="situacionEconomicaA.jsp"><img src="img/SituacionEconomicaClie.png"></a>
    </p>
    <p class="center">
        <a href="recepcionDeInsumosA.jsp"><img src="img/RecepcionInsumos.png"></a>
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