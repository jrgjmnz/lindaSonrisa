package modelsDb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.Boleta;
import modelsDb.Cliente;
import modelsDb.Servicio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, String> fechaRes;
    public static volatile SingularAttribute<Reserva, Cliente> rutCli;
    public static volatile SingularAttribute<Reserva, BigInteger> estado;
    public static volatile SingularAttribute<Reserva, BigDecimal> idRes;
    public static volatile SingularAttribute<Reserva, Servicio> idServ;
    public static volatile CollectionAttribute<Reserva, Boleta> boletaCollection;
    public static volatile SingularAttribute<Reserva, String> horaRes;

}