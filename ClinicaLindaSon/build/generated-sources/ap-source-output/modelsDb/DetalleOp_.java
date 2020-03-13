package modelsDb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.OrdenPed;
import modelsDb.TipoIns;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(DetalleOp.class)
public class DetalleOp_ { 

    public static volatile SingularAttribute<DetalleOp, TipoIns> idTipoIns;
    public static volatile SingularAttribute<DetalleOp, BigDecimal> idDetalle;
    public static volatile SingularAttribute<DetalleOp, BigInteger> cantidad;
    public static volatile SingularAttribute<DetalleOp, OrdenPed> idOrden1;

}