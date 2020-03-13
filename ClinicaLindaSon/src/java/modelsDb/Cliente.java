/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsDb;

import java.io.Serializable;
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
@Table(name = "CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByRutCli", query = "SELECT c FROM Cliente c WHERE c.rutCli = :rutCli")
    , @NamedQuery(name = "Cliente.findByNomCli", query = "SELECT c FROM Cliente c WHERE c.nomCli = :nomCli")
    , @NamedQuery(name = "Cliente.findByApeCli", query = "SELECT c FROM Cliente c WHERE c.apeCli = :apeCli")
    , @NamedQuery(name = "Cliente.findByDireCli", query = "SELECT c FROM Cliente c WHERE c.direCli = :direCli")
    , @NamedQuery(name = "Cliente.findByFonoCli", query = "SELECT c FROM Cliente c WHERE c.fonoCli = :fonoCli")
    , @NamedQuery(name = "Cliente.findByUsuarioCli", query = "SELECT c FROM Cliente c WHERE c.usuarioCli = :usuarioCli")
    , @NamedQuery(name = "Cliente.findByPasswordCli", query = "SELECT c FROM Cliente c WHERE c.passwordCli = :passwordCli")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "RUT_CLI")
    private String rutCli;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOM_CLI")
    private String nomCli;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "APE_CLI")
    private String apeCli;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DIRE_CLI")
    private String direCli;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "FONO_CLI")
    private String fonoCli;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USUARIO_CLI")
    private String usuarioCli;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "PASSWORD_CLI")
    private String passwordCli;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rutCli")
    private Collection<Reserva> reservaCollection;
    @JoinColumn(name = "ID_SIT", referencedColumnName = "ID_SIT")
    @ManyToOne(optional = false)
    private SitEco idSit;

    public Cliente() {
    }

    public Cliente(String rutCli) {
        this.rutCli = rutCli;
    }

    public Cliente(String rutCli, String nomCli, String apeCli, String direCli, String fonoCli, String usuarioCli, String passwordCli) {
        this.rutCli = rutCli;
        this.nomCli = nomCli;
        this.apeCli = apeCli;
        this.direCli = direCli;
        this.fonoCli = fonoCli;
        this.usuarioCli = usuarioCli;
        this.passwordCli = passwordCli;
    }

    public String getRutCli() {
        return rutCli;
    }

    public void setRutCli(String rutCli) {
        this.rutCli = rutCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public String getDireCli() {
        return direCli;
    }

    public void setDireCli(String direCli) {
        this.direCli = direCli;
    }

    public String getFonoCli() {
        return fonoCli;
    }

    public void setFonoCli(String fonoCli) {
        this.fonoCli = fonoCli;
    }

    public String getUsuarioCli() {
        return usuarioCli;
    }

    public void setUsuarioCli(String usuarioCli) {
        this.usuarioCli = usuarioCli;
    }

    public String getPasswordCli() {
        return passwordCli;
    }

    public void setPasswordCli(String passwordCli) {
        this.passwordCli = passwordCli;
    }

    @XmlTransient
    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    public SitEco getIdSit() {
        return idSit;
    }

    public void setIdSit(SitEco idSit) {
        this.idSit = idSit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rutCli != null ? rutCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.rutCli == null && other.rutCli != null) || (this.rutCli != null && !this.rutCli.equals(other.rutCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelsDb.Cliente[ rutCli=" + rutCli + " ]";
    }
    
}
