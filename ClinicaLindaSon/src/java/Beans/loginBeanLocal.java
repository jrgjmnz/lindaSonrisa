/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.ejb.Local;
import modelsDb.Cliente;
import modelsDb.Empleado;

/**
 *
 * @author pixuuh
 */
@Local
public interface loginBeanLocal {
    public boolean login(String usuarioCli, String passwordCli);
    public boolean loginEmpleado(String usuarioEmp, String passwordEmp);
    Empleado obtenerEmpleado(String usuarioEmp);
}