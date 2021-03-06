<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ingresar Proveedores Administrador</title>
    <link rel="icon" type="image/jpg" href="img/iconoclinica.png">
<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<!-- Compiled and minified CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>


<style>
    .proveedores {
        margin-top: 100px;
    }

    .proveedores .card {
        background: rgba(0, 0, 0, .6)
    }

    .proveedores label {
        font-size: 16px;
        color: #ccc;
    }

    .proveedores input {
        font-size: 20px;
        color: #fff;
    }
    body {
  background-image: url(img/proveedoresfondo.png);
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



<form method="POST" id="formdata">
<div id="formulario" class="row proveedores">
    <div class="col s4 offset-s4">
        <div class="card">
            <div class="card-action teal lighten-1 white-text">
                <h3>Ingrese datos del Proveedor</h3>
            </div>
            <div class="card-content">
                <div class="form-field">
                    <input type="text" placeholder="Nombre Proveedor" id="nombreProveedor" class="validate" required>

                </div><br>
                <div class="form-field">
                    <input type="text" placeholder="Rubro" id="rubro" class="validate" required>

                </div><br>
                <div class="form-field">
                    <input type="text" placeholder="Rut" id="rut" class="validate" required>

                </div><br>
                <div class="form-field">
                    <input type="text" placeholder="Direcci�n" id="direccion" class="validate" required>

                </div><br>
                <div class="form-field">
                    <input type="text" placeholder="Fono" id="fono" class="validate" required>

                </div><br>
                <div class="form-field">
                    <input type="text" placeholder="Correo Elctronico" id="correoElectronico" class="validate"
                        required>

                </div><br>
                
                <div class="form-field">
                    <button type="button" id="botonregistrar" class="btn modal-trigger teal darken-3" data-target="idModal">Registrar</button>
                    <div id="idModal" class="modal">

                        <div id="exitoso" class="modal-content teal lighten-1 white-text">
                            <h4>Registro Exitoso!</h4>
                            <p>El proveedor fue registrado exitosamente</p>

                        </div>
                        <div class="modal-footer teal lighten-1">
                            <a href="" class="btn modal-close teal darken-3">Cerrar</a>
                        </div>

                    </div>

                </div>
            </div>


        </div>





    </div>



</div>

</form>




<footer>
    <div>
        <p>info@clinicalindasonrisa.cl</p>
        <p>Edificio Coracero depto.403 Benidorm, Vi�a del Mar</p>
        <p>+56 22881192</p>


        <a href="https://es-es.facebook.com/">
            <img src="img/facebook.png" alt="facebook" style="width:42px;height:42px;border:2;">
        </a>

        <a href="https://twitter.com/">
            <img src="img/twitter.png" alt="twitter" style="width:42px;height:42px;border:2;">
        </a>
        <a href="https://www.instagram.com/"> 
            <img src="img/instagram icono.png" alt="instagram"
                style="width:42px;height:42px;border:2;">
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