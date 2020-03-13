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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pixuuh
 */
@Entity
@Table(name = "BOLETA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boleta.findAll", query = "SELECT b FROM Boleta b")
    , @NamedQuery(name = "Boleta.findByIdBoleta", query = "SELECT b FROM Boleta b WHERE b.idBoleta = :idBoleta")
    , @NamedQuery(name = "Boleta.findByFechaBol", query = "SELECT b FROM Boleta b WHERE b.fechaBol = :fechaBol")
    , @NamedQuery(name = "Boleta.findByTotal", query = "SELECT b FROM Boleta b WHERE b.total = :total")})
public class Boleta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_BOLETA")
    private BigDecimal idBoleta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FECHA_BOL")
    private String fechaBol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL")
    private BigInteger total;
    @JoinColumn(name = "ID_RES", referencedColumnName = "ID_RES")
    @ManyToOne(optional = false)
    private Reserva idRes;

    public Boleta() {
    }

    public Boleta(BigDecimal idBoleta) {
        this.idBoleta = idBoleta;
    }

    public Boleta(BigDecimal idBoleta, String fechaBol, BigInteger total) {
        this.idBoleta = idBoleta;
        this.fechaBol = fechaBol;
        this.total = total;
    }

    public BigDecimal getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(BigDecimal idBoleta) {
        this.idBoleta = idBoleta;
    }

    public String getFechaBol() {
        return fechaBol;
    }

    public void setFechaBol(String fechaBol) {
        this.fechaBol = fechaBol;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public Reserva getIdRes() {
        return idRes;
    }

    public void setIdRes(Reserva idRes) {
        this.idRes = idRes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBoleta != null ? idBoleta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boleta)) {
            return false;
        }
        Boleta other = (Boleta) object;
        if ((this.idBoleta == null && other.idBoleta != null) || (this.idBoleta != null && !this.idBoleta.equals(other.idBoleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.Boleta[ idBoleta=" + idBoleta + " ]";
    }
    
}
