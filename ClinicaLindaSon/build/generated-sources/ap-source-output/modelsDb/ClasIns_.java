package modelsDb;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.TipoIns;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(ClasIns.class)
public class ClasIns_ { 

    public static volatile CollectionAttribute<ClasIns, TipoIns> tipoInsCollection;
    public static volatile SingularAttribute<ClasIns, String> nomFam;
    public static volatile SingularAttribute<ClasIns, BigDecimal> idClass;

}