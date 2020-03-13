/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;
import java.math.BigDecimal;
import modelsDb.Cliente;
import modelsDb.Reserva;
import modelsDb.Servicio;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pixuuh
 *
 */
@Stateless
public class clienteBean implements clienteBeanLocal {

    @PersistenceContext(unitName = "ClinicaLindaSonPU")
    private EntityManager em;
    
     public void persist(Object object) {
        em.persist(object);
    }
    @Override
    public boolean agregarCliente(String rutCli, String nomCli, String apeCli, String direCli, String fonoCli, String usuarioCli, String passwordCli) {
        em.createNativeQuery("INSERT INTO cliente (rut_cliente, nom_cli, ape_cli,dire_cli,fono_cli,usuario_cli,password_cli) VALUES (?,?,?,?,?,?,?)")
                .setParameter(1, rutCli)
                .setParameter(2, nomCli)
                .setParameter(3, apeCli)
                .setParameter(4, direCli)
                .setParameter(5, fonoCli)
                .setParameter(6, usuarioCli)
                .setParameter(7, passwordCli)
                .executeUpdate();

        return true;
    }
    
    public boolean agregarReserva(BigDecimal idRes, String fechaRes, String horaRes,BigDecimal idServ){
        em.createNamedQuery("insert into reserva(id_res,fecha_res,hora_res,id_serv) VALUES (?,?,?,?)")
                .setParameter(1, idRes)
                .setParameter(2, fechaRes)
                .setParameter(3, fechaRes)
                .setParameter(4, horaRes)
                .setParameter(5, idServ)
                .executeUpdate();
        return true;
    }
    
//    public boolean agregarSituacionEco();
    
}
