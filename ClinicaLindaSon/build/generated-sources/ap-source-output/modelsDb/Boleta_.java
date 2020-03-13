package modelsDb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.Reserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(Boleta.class)
public class Boleta_ { 

    public static volatile SingularAttribute<Boleta, String> fechaBol;
    public static volatile SingularAttribute<Boleta, BigInteger> total;
    public static volatile SingularAttribute<Boleta, Reserva> idRes;
    public static volatile SingularAttribute<Boleta, BigDecimal> idBoleta;

}