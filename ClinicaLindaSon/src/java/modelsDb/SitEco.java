/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pixuuh
 */
@Entity
@Table(name = "SIT_ECO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SitEco.findAll", query = "SELECT s FROM SitEco s")
    , @NamedQuery(name = "SitEco.findByIdSit", query = "SELECT s FROM SitEco s WHERE s.idSit = :idSit")
    , @NamedQuery(name = "SitEco.findByAfp", query = "SELECT s FROM SitEco s WHERE s.afp = :afp")
    , @NamedQuery(name = "SitEco.findByLiquidacion", query = "SELECT s FROM SitEco s WHERE s.liquidacion = :liquidacion")
    , @NamedQuery(name = "SitEco.findByFiniquito", query = "SELECT s FROM SitEco s WHERE s.finiquito = :finiquito")})
public class SitEco implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SIT")
    private BigDecimal idSit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "AFP")
    private String afp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "LIQUIDACION")
    private String liquidacion;
    @Size(max = 15)
    @Column(name = "FINIQUITO")
    private String finiquito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSit")
    private Collection<Cliente> clienteCollection;

    public SitEco() {
    }

    public SitEco(BigDecimal idSit) {
        this.idSit = idSit;
    }

    public SitEco(BigDecimal idSit, String afp, String liquidacion) {
        this.idSit = idSit;
        this.afp = afp;
        this.liquidacion = liquidacion;
    }

    public BigDecimal getIdSit() {
        return idSit;
    }

    public void setIdSit(BigDecimal idSit) {
        this.idSit = idSit;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(String liquidacion) {
        this.liquidacion = liquidacion;
    }

    public String getFiniquito() {
        return finiquito;
    }

    public void setFiniquito(String finiquito) {
        this.finiquito = finiquito;
    }

    @XmlTransient
    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSit != null ? idSit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SitEco)) {
            return false;
        }
        SitEco other = (SitEco) object;
        if ((this.idSit == null && other.idSit != null) || (this.idSit != null && !this.idSit.equals(other.idSit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.SitEco[ idSit=" + idSit + " ]";
    }
    
}
