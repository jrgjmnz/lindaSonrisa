package modelsDb;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.Empleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(TipoEmp.class)
public class TipoEmp_ { 

    public static volatile SingularAttribute<TipoEmp, BigDecimal> idTipoe;
    public static volatile CollectionAttribute<TipoEmp, Empleado> empleadoCollection;
    public static volatile SingularAttribute<TipoEmp, String> cargo;

}