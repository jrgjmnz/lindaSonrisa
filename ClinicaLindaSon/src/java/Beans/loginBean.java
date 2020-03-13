/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;
import modelsDb.Cliente;
import modelsDb.Empleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
/**
 *
 * @author pixuuh
 */
@Stateless
public class loginBean implements loginBeanLocal{
    
        @PersistenceContext(unitName = "ClinicaLindaSonPU")
    private EntityManager em;

     @Override
    public boolean login(String usuarioCli, String passwordCli) {
        boolean ve = false;
        Cliente u = null;
        try {
            u = em.createNamedQuery("Cliente.findByUsuarioCli", Cliente.class).setParameter("usuarioCli", usuarioCli).getSingleResult();
            if (u.getUsuarioCli().equals(usuarioCli) && u.getPasswordCli().equals(passwordCli)) {
                ve = true;
            } else {
                ve = false;
            }
        } catch (Exception ex) {
        }
        return ve;
    }
    
    @Override
    public boolean loginEmpleado(String usuarioEmp, String passwordEmp) {
        boolean ve= false;
       Empleado u =null;
       try{
           u =em.createNamedQuery("Empleado.findByUsuarioEmp", Empleado.class).setParameter("usuarioEmp", usuarioEmp).getSingleResult();
           if(u.getUsuarioEmp().equals(usuarioEmp) && u.getPasswordEmp().equals(passwordEmp)){
               ve=true;
           }else{
               ve = false;
           }
       }catch (Exception ex){
       } 
       return ve;
    }

    @Override
    public Empleado obtenerEmpleado(String usuarioEmp) {
        Empleado u = null;
        try {
            u = em.createNamedQuery("Empleado.findByUsuarioEmp", Empleado.class)
                    .setParameter("usuarioEmp", usuarioEmp)
                    .getSingleResult();
        } catch (NoResultException ex) {
            u = null;
        }
        return u;
    }

}
