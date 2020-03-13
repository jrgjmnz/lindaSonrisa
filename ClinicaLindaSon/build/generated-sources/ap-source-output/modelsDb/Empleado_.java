package modelsDb;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.OrdenPed;
import modelsDb.TipoEmp;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile CollectionAttribute<Empleado, OrdenPed> ordenPedCollection;
    public static volatile SingularAttribute<Empleado, String> usuarioEmp;
    public static volatile SingularAttribute<Empleado, TipoEmp> idTipoe;
    public static volatile SingularAttribute<Empleado, String> passwordEmp;
    public static volatile SingularAttribute<Empleado, String> rutEmp;
    public static volatile SingularAttribute<Empleado, String> apeEmp;
    public static volatile SingularAttribute<Empleado, String> nomEmp;

}