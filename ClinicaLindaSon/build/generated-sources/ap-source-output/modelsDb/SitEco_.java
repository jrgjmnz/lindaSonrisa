package modelsDb;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.Cliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(SitEco.class)
public class SitEco_ { 

    public static volatile SingularAttribute<SitEco, BigDecimal> idSit;
    public static volatile SingularAttribute<SitEco, String> afp;
    public static volatile SingularAttribute<SitEco, String> liquidacion;
    public static volatile SingularAttribute<SitEco, String> finiquito;
    public static volatile CollectionAttribute<SitEco, Cliente> clienteCollection;

}