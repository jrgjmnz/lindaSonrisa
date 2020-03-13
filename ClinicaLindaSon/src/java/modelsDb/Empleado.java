/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDb;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pixuuh
 */
@Entity
@Table(name = "EMPLEADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByRutEmp", query = "SELECT e FROM Empleado e WHERE e.rutEmp = :rutEmp")
    , @NamedQuery(name = "Empleado.findByNomEmp", query = "SELECT e FROM Empleado e WHERE e.nomEmp = :nomEmp")
    , @NamedQuery(name = "Empleado.findByApeEmp", query = "SELECT e FROM Empleado e WHERE e.apeEmp = :apeEmp")
    , @NamedQuery(name = "Empleado.findByUsuarioEmp", query = "SELECT e FROM Empleado e WHERE e.usuarioEmp = :usuarioEmp")
    , @NamedQuery(name = "Empleado.findByPasswordEmp", query = "SELECT e FROM Empleado e WHERE e.passwordEmp = :passwordEmp")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "RUT_EMP")
    private String rutEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOM_EMP")
    private String nomEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "APE_EMP")
    private String apeEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USUARIO_EMP")
    private String usuarioEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "PASSWORD_EMP")
    private String passwordEmp;
    @OneToMany(mappedBy = "rutEmp")
    private Collection<OrdenPed> ordenPedCollection;
    @JoinColumn(name = "ID_TIPOE", referencedColumnName = "ID_TIPOE")
    @ManyToOne(optional = false)
    private TipoEmp idTipoe;

    public Empleado() {
    }

    public Empleado(String rutEmp) {
        this.rutEmp = rutEmp;
    }

    public Empleado(String rutEmp, String nomEmp, String apeEmp, String usuarioEmp, String passwordEmp) {
        this.rutEmp = rutEmp;
        this.nomEmp = nomEmp;
        this.apeEmp = apeEmp;
        this.usuarioEmp = usuarioEmp;
        this.passwordEmp = passwordEmp;
    }

    public String getRutEmp() {
        return rutEmp;
    }

    public void setRutEmp(String rutEmp) {
        this.rutEmp = rutEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getApeEmp() {
        return apeEmp;
    }

    public void setApeEmp(String apeEmp) {
        this.apeEmp = apeEmp;
    }

    public String getUsuarioEmp() {
        return usuarioEmp;
    }

    public void setUsuarioEmp(String usuarioEmp) {
        this.usuarioEmp = usuarioEmp;
    }

    public String getPasswordEmp() {
        return passwordEmp;
    }

    public void setPasswordEmp(String passwordEmp) {
        this.passwordEmp = passwordEmp;
    }

    @XmlTransient
    public Collection<OrdenPed> getOrdenPedCollection() {
        return ordenPedCollection;
    }

    public void setOrdenPedCollection(Collection<OrdenPed> ordenPedCollection) {
        this.ordenPedCollection = ordenPedCollection;
    }

    public TipoEmp getIdTipoe() {
        return idTipoe;
    }

    public void setIdTipoe(TipoEmp idTipoe) {
        this.idTipoe = idTipoe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rutEmp != null ? rutEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.rutEmp == null && other.rutEmp != null) || (this.rutEmp != null && !this.rutEmp.equals(other.rutEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.Empleado[ rutEmp=" + rutEmp + " ]";
    }
    
}
