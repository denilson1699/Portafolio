/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciasConHibernate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jaram
 */
@Entity
@Table(name = "message")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m")
    , @NamedQuery(name = "Message.findByIDMessage", query = "SELECT m FROM Message m WHERE m.iDMessage = :iDMessage")
    , @NamedQuery(name = "Message.findByFechaPublicado", query = "SELECT m FROM Message m WHERE m.fechaPublicado = :fechaPublicado")
    , @NamedQuery(name = "Message.findByNameUsu", query = "SELECT m FROM Message m WHERE m.nameUsu = :nameUsu")
    , @NamedQuery(name = "Message.findByCorreoUsu", query = "SELECT m FROM Message m WHERE m.correoUsu = :correoUsu")})
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Message")
    private Integer iDMessage;
    @Column(name = "FechaPublicado")
    private String fechaPublicado;
    @Column(name = "NameUsu")
    private String nameUsu;
    @Column(name = "correoUsu")
    private String correoUsu;
    @Lob
    @Column(name = "Message")
    private String message;

    public Message() {
    }

    public Message(Integer iDMessage) {
        this.iDMessage = iDMessage;
    }

    public Integer getIDMessage() {
        return iDMessage;
    }

    public void setIDMessage(Integer iDMessage) {
        this.iDMessage = iDMessage;
    }

    public String getFechaPublicado() {
        return fechaPublicado;
    }

    public void setFechaPublicado(String fechaPublicado) {
        this.fechaPublicado = fechaPublicado;
    }

    public String getNameUsu() {
        return nameUsu;
    }

    public void setNameUsu(String nameUsu) {
        this.nameUsu = nameUsu;
    }

    public String getCorreoUsu() {
        return correoUsu;
    }

    public void setCorreoUsu(String correoUsu) {
        this.correoUsu = correoUsu;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMessage != null ? iDMessage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.iDMessage == null && other.iDMessage != null) || (this.iDMessage != null && !this.iDMessage.equals(other.iDMessage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencias.Message[ iDMessage=" + iDMessage + " ]";
    }
    
}
