/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.ejb.Local;
import modelsDb.Proveedor;
import modelsDb.Reserva;
import modelsDb.Servicio;
import modelsDb.TipoIns;

/**
 *
 * @author pixuuh
 */
@Local
public interface administradorBeanLocal {
 boolean agregarAdministrador(String rutEmp, String nomEmp, String apeEmp,String usuarioEmp,String passwordEmp);
 boolean agregarProveedor(BigDecimal idProv, String nomProv, String fonoProv, String rubroProv);
 List<Proveedor> ListarProveedor();
 List<Reserva> ListarReserva();
 boolean ingresarServicio(BigDecimal idServ, String nombre, String descripcion, BigInteger valor);
 List<Servicio> ListarServicio();
 boolean ingresarInsumo(BigDecimal idTipoIns, String nomIns, String descripcion, String fechaVenc, BigInteger precioCompra, BigInteger precioVenta, BigInteger stock, BigInteger stockCritico );
List<TipoIns> ListarInsumo();

}
