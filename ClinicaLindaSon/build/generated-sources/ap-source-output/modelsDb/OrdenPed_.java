package modelsDb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.DetalleOp;
import modelsDb.Empleado;
import modelsDb.Proveedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(OrdenPed.class)
public class OrdenPed_ { 

    public static volatile SingularAttribute<OrdenPed, Proveedor> idProv;
    public static volatile SingularAttribute<OrdenPed, BigInteger> estado;
    public static volatile CollectionAttribute<OrdenPed, DetalleOp> detalleOpCollection;
    public static volatile SingularAttribute<OrdenPed, Empleado> rutEmp;
    public static volatile SingularAttribute<OrdenPed, BigInteger> totalPed;
    public static volatile SingularAttribute<OrdenPed, BigDecimal> idOrden;

}