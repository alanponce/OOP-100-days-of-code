/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chilero;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author tanya
 */
@Entity
@Table(name = "CUSTOMERS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"),
    @NamedQuery(name = "Customers.findByIdCustomer", query = "SELECT c FROM Customers c WHERE c.idCustomer = :idCustomer"),
    @NamedQuery(name = "Customers.findByName", query = "SELECT c FROM Customers c WHERE c.name = :name"),
    @NamedQuery(name = "Customers.findByRfc", query = "SELECT c FROM Customers c WHERE c.rfc = :rfc"),
    @NamedQuery(name = "Customers.findByContactPhone", query = "SELECT c FROM Customers c WHERE c.contactPhone = :contactPhone")})
public class Customers implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CUSTOMER")
    private Integer idCustomer;
    @Column(name = "NAME")
    private String name;
    @Column(name = "RFC")
    private String rfc;
    @Column(name = "CONTACT_PHONE")
    private String contactPhone;

    public Customers() {
    }

    public Customers(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        Integer oldIdCustomer = this.idCustomer;
        this.idCustomer = idCustomer;
        changeSupport.firePropertyChange("idCustomer", oldIdCustomer, idCustomer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        String oldRfc = this.rfc;
        this.rfc = rfc;
        changeSupport.firePropertyChange("rfc", oldRfc, rfc);
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        String oldContactPhone = this.contactPhone;
        this.contactPhone = contactPhone;
        changeSupport.firePropertyChange("contactPhone", oldContactPhone, contactPhone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCustomer != null ? idCustomer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.idCustomer == null && other.idCustomer != null) || (this.idCustomer != null && !this.idCustomer.equals(other.idCustomer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "chilero.Customers[ idCustomer=" + idCustomer + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
