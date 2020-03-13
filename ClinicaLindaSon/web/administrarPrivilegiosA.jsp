<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Administrar Privilegios</title>
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
      background-image: url(img/Recepciondeinsumos.jpg);
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

  <form action="">
    <fieldset>
      <div class="input-field col s12">
        <select>
          <option value="" disabled selected>Selecciona</option>
          <option value="1"></option>
          <option value="2"></option>
          <option value="3"></option>
        </select>
        <label>Usuario:</label>
      </div>
      <div class="input-field col s12">
        <select>
          <option value="" disabled selected>Seleccionar</option>
          <option value="1">Cliente</option>
          <option value="2">Doctor</option>
          <option value="3">Recepcionista</option>
          <option value="3">Administrador</option>
        </select>
        <label>Nivel:</label>
      </div>
    </fieldset>
  </form>


  <div class="responsive-table">
    <div class="row">
      <div class="col s8 offset-s2">
        <table id="t01" style="width: 95%;" class=" white-text">
          <thead>
            <tr>
              <th>ID</th>
              <th>Nombre</th>
              <th>Nivel</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td></td>
              <td></td>
              <td>
                <p>
                    <i class="material-icons teal lighten-1">delete</i>
                  <label>
                    <input type="checkbox" class="filled-in" checked="checked" />
                    <span></span>
                  </label>
                </p>
              </td>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td>
                <p>
                    <i class="material-icons teal lighten-1">delete</i>
                  <label>
                      
                    <input type="checkbox" class="filled-in" checked="checked" />
                    <span></span>
                  </label>
                </p>
              </td>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td>
                <p>
                    <i class="material-icons teal lighten-1">delete</i>
                  <label>
                     
                    <input type="checkbox" class="filled-in" checked="checked" />
                    <span></span>
                  </label>
                </p>
              </td>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td>
                <p>
                    <i class="material-icons teal lighten-1">delete</i>
                  <label>
                      
                    <input type="checkbox" class="filled-in" checked="checked" />
                    <span></span>
                  </label>
                </p>
              </td>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td>
                <p>
                    <i class="material-icons teal lighten-1">delete</i>
                  <label>
                      
                    <input type="checkbox" class="filled-in" checked="checked" />
                    <span></span>
                  </label>
                </p>
              </td>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td>
                <p>
                  <i class="material-icons teal lighten-1">delete</i>
                  <label>
                    <input type="checkbox" class="filled-in" checked="checked" />
                    <span></span>
                  </label>
                </p>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>


  <div class="form-field">
    <button style="margin-top:20px; margin-left: 35px;" type="button" id="botonguardar" class="btn modal-trigger teal darken-3"
      data-target="idModal">Guardar</button>
    <div id="idModal" class="modal">

      <div id="exitoso" class="modal-content teal lighten-1 white-text">
        <h4>Guardado Exitoso!</h4>
        <p>El nivel fue designado exitosamente.</p>

      </div>
      <div class="modal-footer teal lighten-1">
        <a href="" class="btn modal-close teal darken-3">Cerrar</a>
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
