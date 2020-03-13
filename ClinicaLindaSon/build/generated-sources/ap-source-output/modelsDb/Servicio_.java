package modelsDb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.Reserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> descripcion;
    public static volatile SingularAttribute<Servicio, BigDecimal> idServ;
    public static volatile SingularAttribute<Servicio, BigInteger> valor;
    public static volatile CollectionAttribute<Servicio, Reserva> reservaCollection;
    public static volatile SingularAttribute<Servicio, String> nombre;

}