/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelsDb.Boleta;
import java.util.List;

/**
 *
 * @author pixuuh
 */
@Stateless
public class EmpleadoBean {
    @PersistenceContext(unitName = "ClinicaLindaSonPU")
    private EntityManager em;
    
     public void persist(Object object) {
        em.persist(object);
    }
    
     //ULTIMO GENERADO
     public List <Boleta> ListarBoleta(int idBoleta){
         return  em.createNamedQuery("Boleta.findByIdBoleta").setParameter("id_boleta",idBoleta).getResultList();
     }
     
//    //recepcionista
//    public confimarReservaR();
     
//    public MostrarPacienteAtendido();
     
//    public listarDetalleatencion();
     
//    public listarBoleta();
//    public generarBoletaR();
//    public imprimirBoletaR();
//    public ingresarOrdenPedido();
//    //medico
//    public listarCitasMedico();//lista segun persona logeada
//    public ingresarInsumoUsado();
//    public ingresarPedidoInsumoM();
    
}
