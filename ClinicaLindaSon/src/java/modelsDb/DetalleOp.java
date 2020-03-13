/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pixuuh
 */
@Entity
@Table(name = "DETALLE_OP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleOp.findAll", query = "SELECT d FROM DetalleOp d")
    , @NamedQuery(name = "DetalleOp.findByIdDetalle", query = "SELECT d FROM DetalleOp d WHERE d.idDetalle = :idDetalle")
    , @NamedQuery(name = "DetalleOp.findByCantidad", query = "SELECT d FROM DetalleOp d WHERE d.cantidad = :cantidad")})
public class DetalleOp implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DETALLE")
    private BigDecimal idDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private BigInteger cantidad;
    @JoinColumn(name = "ID_ORDEN1", referencedColumnName = "ID_ORDEN")
    @ManyToOne
    private OrdenPed idOrden1;
    @JoinColumn(name = "ID_TIPO_INS", referencedColumnName = "ID_TIPO_INS")
    @ManyToOne(optional = false)
    private TipoIns idTipoIns;

    public DetalleOp() {
    }

    public DetalleOp(BigDecimal idDetalle) {
        this.idDetalle = idDetalle;
    }

    public DetalleOp(BigDecimal idDetalle, BigInteger cantidad) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
    }

    public BigDecimal getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(BigDecimal idDetalle) {
        this.idDetalle = idDetalle;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    public OrdenPed getIdOrden1() {
        return idOrden1;
    }

    public void setIdOrden1(OrdenPed idOrden1) {
        this.idOrden1 = idOrden1;
    }

    public TipoIns getIdTipoIns() {
        return idTipoIns;
    }

    public void setIdTipoIns(TipoIns idTipoIns) {
        this.idTipoIns = idTipoIns;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleOp)) {
            return false;
        }
        DetalleOp other = (DetalleOp) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.DetalleOp[ idDetalle=" + idDetalle + " ]";
    }
    
}
