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
@Table(name = "RESERVA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r")
    , @NamedQuery(name = "Reserva.findByIdRes", query = "SELECT r FROM Reserva r WHERE r.idRes = :idRes")
    , @NamedQuery(name = "Reserva.findByFechaRes", query = "SELECT r FROM Reserva r WHERE r.fechaRes = :fechaRes")
    , @NamedQuery(name = "Reserva.findByHoraRes", query = "SELECT r FROM Reserva r WHERE r.horaRes = :horaRes")
    , @NamedQuery(name = "Reserva.findByEstado", query = "SELECT r FROM Reserva r WHERE r.estado = :estado")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_RES")
    private BigDecimal idRes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FECHA_RES")
    private String fechaRes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "HORA_RES")
    private String horaRes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private BigInteger estado;
    @JoinColumn(name = "RUT_CLI", referencedColumnName = "RUT_CLI")
    @ManyToOne(optional = false)
    private Cliente rutCli;
    @JoinColumn(name = "ID_SERV", referencedColumnName = "ID_SERV")
    @ManyToOne(optional = false)
    private Servicio idServ;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRes")
    private Collection<Boleta> boletaCollection;

    public Reserva() {
    }

    public Reserva(BigDecimal idRes) {
        this.idRes = idRes;
    }

    public Reserva(BigDecimal idRes, String fechaRes, String horaRes, BigInteger estado) {
        this.idRes = idRes;
        this.fechaRes = fechaRes;
        this.horaRes = horaRes;
        this.estado = estado;
    }

    public BigDecimal getIdRes() {
        return idRes;
    }

    public void setIdRes(BigDecimal idRes) {
        this.idRes = idRes;
    }

    public String getFechaRes() {
        return fechaRes;
    }

    public void setFechaRes(String fechaRes) {
        this.fechaRes = fechaRes;
    }

    public String getHoraRes() {
        return horaRes;
    }

    public void setHoraRes(String horaRes) {
        this.horaRes = horaRes;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
    }

    public Cliente getRutCli() {
        return rutCli;
    }

    public void setRutCli(Cliente rutCli) {
        this.rutCli = rutCli;
    }

    public Servicio getIdServ() {
        return idServ;
    }

    public void setIdServ(Servicio idServ) {
        this.idServ = idServ;
    }

    @XmlTransient
    public Collection<Boleta> getBoletaCollection() {
        return boletaCollection;
    }

    public void setBoletaCollection(Collection<Boleta> boletaCollection) {
        this.boletaCollection = boletaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRes != null ? idRes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.idRes == null && other.idRes != null) || (this.idRes != null && !this.idRes.equals(other.idRes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.Reserva[ idRes=" + idRes + " ]";
    }
    
}
