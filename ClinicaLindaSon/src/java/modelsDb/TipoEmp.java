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
@Table(name = "TIPO_EMP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEmp.findAll", query = "SELECT t FROM TipoEmp t")
    , @NamedQuery(name = "TipoEmp.findByIdTipoe", query = "SELECT t FROM TipoEmp t WHERE t.idTipoe = :idTipoe")
    , @NamedQuery(name = "TipoEmp.findByCargo", query = "SELECT t FROM TipoEmp t WHERE t.cargo = :cargo")})
public class TipoEmp implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPOE")
    private BigDecimal idTipoe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CARGO")
    private String cargo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoe")
    private Collection<Empleado> empleadoCollection;

    public TipoEmp() {
    }

    public TipoEmp(BigDecimal idTipoe) {
        this.idTipoe = idTipoe;
    }

    public TipoEmp(BigDecimal idTipoe, String cargo) {
        this.idTipoe = idTipoe;
        this.cargo = cargo;
    }

    public BigDecimal getIdTipoe() {
        return idTipoe;
    }

    public void setIdTipoe(BigDecimal idTipoe) {
        this.idTipoe = idTipoe;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoe != null ? idTipoe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEmp)) {
            return false;
        }
        TipoEmp other = (TipoEmp) object;
        if ((this.idTipoe == null && other.idTipoe != null) || (this.idTipoe != null && !this.idTipoe.equals(other.idTipoe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.TipoEmp[ idTipoe=" + idTipoe + " ]";
    }
    
}
