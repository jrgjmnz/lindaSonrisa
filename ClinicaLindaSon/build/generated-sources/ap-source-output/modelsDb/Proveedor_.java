package modelsDb;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.OrdenPed;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, BigDecimal> idProv;
    public static volatile CollectionAttribute<Proveedor, OrdenPed> ordenPedCollection;
    public static volatile SingularAttribute<Proveedor, String> fonoProv;
    public static volatile SingularAttribute<Proveedor, String> rubroProv;
    public static volatile SingularAttribute<Proveedor, String> nomProv;

}