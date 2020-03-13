/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pixuuh
 */
@Entity
@Table(name = "ORDEN_PED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenPed.findAll", query = "SELECT o FROM OrdenPed o")
    , @NamedQuery(name = "OrdenPed.findByIdOrden", query = "SELECT o FROM OrdenPed o WHERE o.idOrden = :idOrden")
    , @NamedQuery(name = "OrdenPed.findByTotalPed", query = "SELECT o FROM OrdenPed o WHERE o.totalPed = :totalPed")
    , @NamedQuery(name = "OrdenPed.findByEstado", query = "SELECT o FROM OrdenPed o WHERE o.estado = :estado")})
public class OrdenPed implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORDEN")
    private BigDecimal idOrden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_PED")
    private BigInteger totalPed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private BigInteger estado;
    @OneToMany(mappedBy = "idOrden1")
    private Collection<DetalleOp> detalleOpCollection;
    @JoinColumn(name = "RUT_EMP", referencedColumnName = "RUT_EMP")
    @ManyToOne
    private Empleado rutEmp;
    @JoinColumn(name = "ID_PROV", referencedColumnName = "ID_PROV")
    @ManyToOne(optional = false)
    private Proveedor idProv;

    public OrdenPed() {
    }

    public OrdenPed(BigDecimal idOrden) {
        this.idOrden = idOrden;
    }

    public OrdenPed(BigDecimal idOrden, BigInteger totalPed, BigInteger estado) {
        this.idOrden = idOrden;
        this.totalPed = totalPed;
        this.estado = estado;
    }

    public BigDecimal getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(BigDecimal idOrden) {
        this.idOrden = idOrden;
    }

    public BigInteger getTotalPed() {
        return totalPed;
    }

    public void setTotalPed(BigInteger totalPed) {
        this.totalPed = totalPed;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<DetalleOp> getDetalleOpCollection() {
        return detalleOpCollection;
    }

    public void setDetalleOpCollection(Collection<DetalleOp> detalleOpCollection) {
        this.detalleOpCollection = detalleOpCollection;
    }

    public Empleado getRutEmp() {
        return rutEmp;
    }

    public void setRutEmp(Empleado rutEmp) {
        this.rutEmp = rutEmp;
    }

    public Proveedor getIdProv() {
        return idProv;
    }

    public void setIdProv(Proveedor idProv) {
        this.idProv = idProv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrden != null ? idOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenPed)) {
            return false;
        }
        OrdenPed other = (OrdenPed) object;
        if ((this.idOrden == null && other.idOrden != null) || (this.idOrden != null && !this.idOrden.equals(other.idOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.OrdenPed[ idOrden=" + idOrden + " ]";
    }
    
}
