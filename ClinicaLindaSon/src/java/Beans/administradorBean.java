/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import modelsDb.Empleado;
import modelsDb.Proveedor;
import modelsDb.Servicio;
import modelsDb.SitEco;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelsDb.TipoIns;
import modelsDb.Reserva;

/**
 *
 * @author pixuuh
 */
@Stateless
public class administradorBean implements administradorBeanLocal {

    @PersistenceContext(unitName = "ClinicaLindaSonPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    //administrador
    @Override
    public boolean agregarAdministrador(String rutEmp, String nomEmp, String apeEmp, String usuarioEmp, String passwordEmp) {
        em.createNamedQuery("insert into empleado(rut_emp,nom_emp,ape_emp,usuario_emp,password_emp)VALUE(?,?,?,?,?)")
                .setParameter(1, rutEmp)
                .setParameter(2, nomEmp)
                .setParameter(3, apeEmp)
                .setParameter(4, usuarioEmp)
                .setParameter(5, passwordEmp)
                .executeUpdate();
        return true;
    }

    @Override
    public boolean agregarProveedor(BigDecimal idProv, String nomProv, String fonoProv, String rubroProv) {
        em.createNamedQuery("insert into Proveedor(id_prov,nom_prov,fono_prov,rubro_prov)VALUE(?,?,?,?)")
                .setParameter(1, idProv)
                .setParameter(2, nomProv)
                .setParameter(3, fonoProv)
                .setParameter(4, rubroProv)
                .executeUpdate();
        return true;
    }
    
//    public boolean administrarPrivilegio();
    
//    public listarPrivilegios();

//    public listarClienteAtendido();
    
    @Override
    public List<Proveedor> ListarProveedor() {
        return em.createNamedQuery("Proveedor.findAll").getResultList();
    }    
    
//    public listarInsumoUsadoCliente();
    
    
    @Override
    public List<Reserva> ListarReserva() {
        return em.createNamedQuery("Reserva.findAll").getResultList();
    }  
    
//    public confirmarReservaA();
    
//    public listarCitaMedico();
    
//    public imprimir citaMedico();
    
    
    @Override
    public boolean ingresarServicio(BigDecimal idServ, String nombre, String descripcion, BigInteger valor) {
        em.createNamedQuery("insert into Servicio(id_serv,nombre,descripcion,valor)VALUE(?,?,?,?)")
                .setParameter(1, idServ)
                .setParameter(2, nombre)
                .setParameter(3, descripcion)
                .setParameter(4, valor)
                .executeUpdate();
        return true;
    }
    
    @Override
    public List<Servicio> ListarServicio() {
        return em.createNamedQuery("Servicio.findAll").getResultList();
    }  
//    public generarBoletaA();//buscando por nombre//
    
//    public imprimir boleta();
    
//    public ingresarHorarioDisponible();
    
    
//    public buscarSitEco();//buscar por nombre
 
//    public listarOrdenPedido();
    
//    public confimarOrdenPedido();
    
//    public recepcionarInsumo();
    
   
     @Override
    public boolean ingresarInsumo(BigDecimal idTipoIns, String nomIns, String descripcion, String fechaVenc, BigInteger precioCompra, BigInteger precioVenta, BigInteger stock, BigInteger stockCritico ) {
        em.createNamedQuery("insert into TipoIns( id_tipo_ins, nom_ins, descripcion, fecha_venc, precio_compra,precio_venta, stock,  stock_critico )VALUE(?,?,?,?,?,?,?,?)")
                .setParameter(1, idTipoIns)
                .setParameter(2, nomIns)
                .setParameter(3, descripcion)
                .setParameter(4,fechaVenc)
                .setParameter(5,precioCompra)
                .setParameter(6,precioVenta)
                .setParameter(7,stock)
                .setParameter(8,stockCritico)
                .executeUpdate();
        return true;
    }

     @Override
    public List<TipoIns> ListarInsumo() {
        return em.createNamedQuery("TipoIns.findAll").getResultList();
    }  

//    public listarDetalleOp();



    
}
