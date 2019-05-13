package centralchileracrud;

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
@Table(name = "ORDERS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByIdOrder", query = "SELECT o FROM Orders o WHERE o.idOrder = :idOrder"),
    @NamedQuery(name = "Orders.findByTotal", query = "SELECT o FROM Orders o WHERE o.total = :total"),
    @NamedQuery(name = "Orders.findByIdCustomer", query = "SELECT o FROM Orders o WHERE o.idCustomer = :idCustomer"),
    @NamedQuery(name = "Orders.findByIdProducts", query = "SELECT o FROM Orders o WHERE o.idProducts = :idProducts")})
public class Orders implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ORDER")
    private Integer idOrder;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private Double total;
    @Column(name = "ID_CUSTOMER")
    private Integer idCustomer;
    @Column(name = "ID_PRODUCTS")
    private Integer idProducts;

    public Orders() {
    }

    public Orders(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        Integer oldIdOrder = this.idOrder;
        this.idOrder = idOrder;
        changeSupport.firePropertyChange("idOrder", oldIdOrder, idOrder);
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        Double oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        Integer oldIdCustomer = this.idCustomer;
        this.idCustomer = idCustomer;
        changeSupport.firePropertyChange("idCustomer", oldIdCustomer, idCustomer);
    }

    public Integer getIdProducts() {
        return idProducts;
    }

    public void setIdProducts(Integer idProducts) {
        Integer oldIdProducts = this.idProducts;
        this.idProducts = idProducts;
        changeSupport.firePropertyChange("idProducts", oldIdProducts, idProducts);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrder != null ? idOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.idOrder == null && other.idOrder != null) || (this.idOrder != null && !this.idOrder.equals(other.idOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "centralchileracrud.Orders[ idOrder=" + idOrder + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }    
}