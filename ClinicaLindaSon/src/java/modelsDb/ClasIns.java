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
@Table(name = "CLAS_INS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClasIns.findAll", query = "SELECT c FROM ClasIns c")
    , @NamedQuery(name = "ClasIns.findByIdClass", query = "SELECT c FROM ClasIns c WHERE c.idClass = :idClass")
    , @NamedQuery(name = "ClasIns.findByNomFam", query = "SELECT c FROM ClasIns c WHERE c.nomFam = :nomFam")})
public class ClasIns implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CLASS")
    private BigDecimal idClass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOM_FAM")
    private String nomFam;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClass")
    private Collection<TipoIns> tipoInsCollection;

    public ClasIns() {
    }

    public ClasIns(BigDecimal idClass) {
        this.idClass = idClass;
    }

    public ClasIns(BigDecimal idClass, String nomFam) {
        this.idClass = idClass;
        this.nomFam = nomFam;
    }

    public BigDecimal getIdClass() {
        return idClass;
    }

    public void setIdClass(BigDecimal idClass) {
        this.idClass = idClass;
    }

    public String getNomFam() {
        return nomFam;
    }

    public void setNomFam(String nomFam) {
        this.nomFam = nomFam;
    }

    @XmlTransient
    public Collection<TipoIns> getTipoInsCollection() {
        return tipoInsCollection;
    }

    public void setTipoInsCollection(Collection<TipoIns> tipoInsCollection) {
        this.tipoInsCollection = tipoInsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClass != null ? idClass.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasIns)) {
            return false;
        }
        ClasIns other = (ClasIns) object;
        if ((this.idClass == null && other.idClass != null) || (this.idClass != null && !this.idClass.equals(other.idClass))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.ClasIns[ idClass=" + idClass + " ]";
    }
    
}
