/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;


import java.math.BigDecimal;
import javax.ejb.Local;
import modelsDb.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigInteger;


/**
 *
 * @author pixuuh
 */
@Local
public interface clienteBeanLocal {
    
   boolean agregarCliente(String rutCli, String nomCli, String apeCli, String direCli, String fonoCli, String usuarioCli, String passwordCli);
   boolean agregarReserva(BigDecimal idRes, String fechaRes, String horaRes,BigDecimal idServ);
}
