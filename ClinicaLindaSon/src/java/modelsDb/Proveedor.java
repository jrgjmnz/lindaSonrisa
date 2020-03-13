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
@Table(name = "PROVEEDOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p")
    , @NamedQuery(name = "Proveedor.findByIdProv", query = "SELECT p FROM Proveedor p WHERE p.idProv = :idProv")
    , @NamedQuery(name = "Proveedor.findByNomProv", query = "SELECT p FROM Proveedor p WHERE p.nomProv = :nomProv")
    , @NamedQuery(name = "Proveedor.findByFonoProv", query = "SELECT p FROM Proveedor p WHERE p.fonoProv = :fonoProv")
    , @NamedQuery(name = "Proveedor.findByRubroProv", query = "SELECT p FROM Proveedor p WHERE p.rubroProv = :rubroProv")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PROV")
    private BigDecimal idProv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOM_PROV")
    private String nomProv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "FONO_PROV")
    private String fonoProv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "RUBRO_PROV")
    private String rubroProv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProv")
    private Collection<OrdenPed> ordenPedCollection;

    public Proveedor() {
    }

    public Proveedor(BigDecimal idProv) {
        this.idProv = idProv;
    }

    public Proveedor(BigDecimal idProv, String nomProv, String fonoProv, String rubroProv) {
        this.idProv = idProv;
        this.nomProv = nomProv;
        this.fonoProv = fonoProv;
        this.rubroProv = rubroProv;
    }

    public BigDecimal getIdProv() {
        return idProv;
    }

    public void setIdProv(BigDecimal idProv) {
        this.idProv = idProv;
    }

    public String getNomProv() {
        return nomProv;
    }

    public void setNomProv(String nomProv) {
        this.nomProv = nomProv;
    }

    public String getFonoProv() {
        return fonoProv;
    }

    public void setFonoProv(String fonoProv) {
        this.fonoProv = fonoProv;
    }

    public String getRubroProv() {
        return rubroProv;
    }

    public void setRubroProv(String rubroProv) {
        this.rubroProv = rubroProv;
    }

    @XmlTransient
    public Collection<OrdenPed> getOrdenPedCollection() {
        return ordenPedCollection;
    }

    public void setOrdenPedCollection(Collection<OrdenPed> ordenPedCollection) {
        this.ordenPedCollection = ordenPedCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProv != null ? idProv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.idProv == null && other.idProv != null) || (this.idProv != null && !this.idProv.equals(other.idProv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.Proveedor[ idProv=" + idProv + " ]";
    }
    
}
