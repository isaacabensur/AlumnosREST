/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chidalgol
 */
@Entity
@Table(name = "ALUMNOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumnos.findAll", query = "SELECT a FROM Alumnos a"),
    @NamedQuery(name = "Alumnos.findById", query = "SELECT a FROM Alumnos a WHERE a.id = :id"),
    @NamedQuery(name = "Alumnos.findByPrimerNombre", query = "SELECT a FROM Alumnos a WHERE a.primerNombre = :primerNombre"),
    @NamedQuery(name = "Alumnos.findBySegundoNombre", query = "SELECT a FROM Alumnos a WHERE a.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "Alumnos.findByApellidoPaterno", query = "SELECT a FROM Alumnos a WHERE a.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Alumnos.findByApellidoMaterno", query = "SELECT a FROM Alumnos a WHERE a.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Alumnos.findByFechaNacimiento", query = "SELECT a FROM Alumnos a WHERE a.fechaNacimiento = :fechaNacimiento")})
public class Alumnos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Size(max = 50)
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Size(max = 50)
    @Column(name = "APELLIDO_PATERNO")
    private String apellidoPaterno;
    @Size(max = 50)
    @Column(name = "APELLIDO_MATERNO")
    private String apellidoMaterno;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    public Alumnos() {
    }

    public Alumnos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos)) {
            return false;
        }
        Alumnos other = (Alumnos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumnos.Alumnos[ id=" + id + " ]";
    }
    
}
