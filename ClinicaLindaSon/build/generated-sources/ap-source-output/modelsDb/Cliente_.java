package modelsDb;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelsDb.Reserva;
import modelsDb.SitEco;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T14:58:13")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> rutCli;
    public static volatile SingularAttribute<Cliente, String> fonoCli;
    public static volatile SingularAttribute<Cliente, String> apeCli;
    public static volatile SingularAttribute<Cliente, SitEco> idSit;
    public static volatile SingularAttribute<Cliente, String> nomCli;
    public static volatile SingularAttribute<Cliente, String> direCli;
    public static volatile SingularAttribute<Cliente, String> usuarioCli;
    public static volatile CollectionAttribute<Cliente, Reserva> reservaCollection;
    public static volatile SingularAttribute<Cliente, String> passwordCli;

}