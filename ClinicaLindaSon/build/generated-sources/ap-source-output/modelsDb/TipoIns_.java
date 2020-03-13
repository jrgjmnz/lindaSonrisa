package modelsDb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.ClasIns;
import modelsDb.DetalleOp;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(TipoIns.class)
public class TipoIns_ { 

    public static volatile SingularAttribute<TipoIns, String> descripcion;
    public static volatile SingularAttribute<TipoIns, String> nomIns;
    public static volatile SingularAttribute<TipoIns, BigDecimal> idTipoIns;
    public static volatile CollectionAttribute<TipoIns, DetalleOp> detalleOpCollection;
    public static volatile SingularAttribute<TipoIns, BigInteger> precioCompra;
    public static volatile SingularAttribute<TipoIns, BigInteger> stockCritico;
    public static volatile SingularAttribute<TipoIns, ClasIns> idClass;
    public static volatile SingularAttribute<TipoIns, String> fechaVenc;
    public static volatile SingularAttribute<TipoIns, BigInteger> precioVenta;
    public static volatile SingularAttribute<TipoIns, BigInteger> stock;

}