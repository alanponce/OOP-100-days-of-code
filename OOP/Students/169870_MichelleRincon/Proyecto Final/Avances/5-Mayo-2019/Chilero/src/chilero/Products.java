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
@Table(name = "PRODUCTS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByIdProduct", query = "SELECT p FROM Products p WHERE p.idProduct = :idProduct"),
    @NamedQuery(name = "Products.findByName", query = "SELECT p FROM Products p WHERE p.name = :name"),
    @NamedQuery(name = "Products.findByPricePerPiece", query = "SELECT p FROM Products p WHERE p.pricePerPiece = :pricePerPiece"),
    @NamedQuery(name = "Products.findByPricePerKilo", query = "SELECT p FROM Products p WHERE p.pricePerKilo = :pricePerKilo")})
public class Products implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRODUCT")
    private Integer idProduct;
    @Column(name = "NAME")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE_PER_PIECE")
    private Double pricePerPiece;
    @Column(name = "PRICE_PER_KILO")
    private Double pricePerKilo;

    public Products() {
    }

    public Products(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        Integer oldIdProduct = this.idProduct;
        this.idProduct = idProduct;
        changeSupport.firePropertyChange("idProduct", oldIdProduct, idProduct);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Double getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(Double pricePerPiece) {
        Double oldPricePerPiece = this.pricePerPiece;
        this.pricePerPiece = pricePerPiece;
        changeSupport.firePropertyChange("pricePerPiece", oldPricePerPiece, pricePerPiece);
    }

    public Double getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(Double pricePerKilo) {
        Double oldPricePerKilo = this.pricePerKilo;
        this.pricePerKilo = pricePerKilo;
        changeSupport.firePropertyChange("pricePerKilo", oldPricePerKilo, pricePerKilo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduct != null ? idProduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.idProduct == null && other.idProduct != null) || (this.idProduct != null && !this.idProduct.equals(other.idProduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "chilero.Products[ idProduct=" + idProduct + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
