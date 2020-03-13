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
import javax.persistence.CascadeType;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pixuuh
 */
@Entity
@Table(name = "TIPO_INS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoIns.findAll", query = "SELECT t FROM TipoIns t")
    , @NamedQuery(name = "TipoIns.findByIdTipoIns", query = "SELECT t FROM TipoIns t WHERE t.idTipoIns = :idTipoIns")
    , @NamedQuery(name = "TipoIns.findByNomIns", query = "SELECT t FROM TipoIns t WHERE t.nomIns = :nomIns")
    , @NamedQuery(name = "TipoIns.findByDescripcion", query = "SELECT t FROM TipoIns t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoIns.findByFechaVenc", query = "SELECT t FROM TipoIns t WHERE t.fechaVenc = :fechaVenc")
    , @NamedQuery(name = "TipoIns.findByPrecioCompra", query = "SELECT t FROM TipoIns t WHERE t.precioCompra = :precioCompra")
    , @NamedQuery(name = "TipoIns.findByPrecioVenta", query = "SELECT t FROM TipoIns t WHERE t.precioVenta = :precioVenta")
    , @NamedQuery(name = "TipoIns.findByStock", query = "SELECT t FROM TipoIns t WHERE t.stock = :stock")
    , @NamedQuery(name = "TipoIns.findByStockCritico", query = "SELECT t FROM TipoIns t WHERE t.stockCritico = :stockCritico")})
public class TipoIns implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPO_INS")
    private BigDecimal idTipoIns;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOM_INS")
    private String nomIns;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "FECHA_VENC")
    private String fechaVenc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO_COMPRA")
    private BigInteger precioCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO_VENTA")
    private BigInteger precioVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STOCK")
    private BigInteger stock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STOCK_CRITICO")
    private BigInteger stockCritico;
    @JoinColumn(name = "ID_CLASS", referencedColumnName = "ID_CLASS")
    @ManyToOne(optional = false)
    private ClasIns idClass;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoIns")
    private Collection<DetalleOp> detalleOpCollection;

    public TipoIns() {
    }

    public TipoIns(BigDecimal idTipoIns) {
        this.idTipoIns = idTipoIns;
    }

    public TipoIns(BigDecimal idTipoIns, String nomIns, String descripcion, String fechaVenc, BigInteger precioCompra, BigInteger precioVenta, BigInteger stock, BigInteger stockCritico) {
        this.idTipoIns = idTipoIns;
        this.nomIns = nomIns;
        this.descripcion = descripcion;
        this.fechaVenc = fechaVenc;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.stockCritico = stockCritico;
    }

    public BigDecimal getIdTipoIns() {
        return idTipoIns;
    }

    public void setIdTipoIns(BigDecimal idTipoIns) {
        this.idTipoIns = idTipoIns;
    }

    public String getNomIns() {
        return nomIns;
    }

    public void setNomIns(String nomIns) {
        this.nomIns = nomIns;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public BigInteger getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigInteger precioCompra) {
        this.precioCompra = precioCompra;
    }

    public BigInteger getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigInteger precioVenta) {
        this.precioVenta = precioVenta;
    }

    public BigInteger getStock() {
        return stock;
    }

    public void setStock(BigInteger stock) {
        this.stock = stock;
    }

    public BigInteger getStockCritico() {
        return stockCritico;
    }

    public void setStockCritico(BigInteger stockCritico) {
        this.stockCritico = stockCritico;
    }

    public ClasIns getIdClass() {
        return idClass;
    }

    public void setIdClass(ClasIns idClass) {
        this.idClass = idClass;
    }

    @XmlTransient
    public Collection<DetalleOp> getDetalleOpCollection() {
        return detalleOpCollection;
    }

    public void setDetalleOpCollection(Collection<DetalleOp> detalleOpCollection) {
        this.detalleOpCollection = detalleOpCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoIns != null ? idTipoIns.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoIns)) {
            return false;
        }
        TipoIns other = (TipoIns) object;
        if ((this.idTipoIns == null && other.idTipoIns != null) || (this.idTipoIns != null && !this.idTipoIns.equals(other.idTipoIns))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.TipoIns[ idTipoIns=" + idTipoIns + " ]";
    }
    
}
