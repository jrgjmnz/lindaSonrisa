/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.List;
import javax.ejb.Local;
import modelsDb.Boleta;

/**
 *
 * @author pixuuh
 */
@Local
public interface EmpleadoBeanLocal {
   List<Boleta> ListarBoleta();
}
