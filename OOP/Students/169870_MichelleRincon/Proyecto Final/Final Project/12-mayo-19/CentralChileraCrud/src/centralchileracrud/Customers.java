package centralchileracrud;     //Indica que pertenece al grupo de clases de centralchileracrud

import java.beans.PropertyChangeListener;   //Se importa el paquete beans que contiene el metodo PropertyChangeListener que se utiliza cuando una de sus propiedades es cambiada
import java.beans.PropertyChangeSupport;    //Se importa el paquete beans que contiene el metodo PropertyChangeSupport que administra todo lo que tiene un propertyChangeListener
import java.io.Serializable;    //Se importa el paquete io que contiene la interfaz serializable 
import javax.persistence.Basic; //
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/*Serializable, no contiene metodos se utiliza para convertir el objeto en un conjunto de bytes
que pueden ser utilizados en una forma*/

/**
 *
 * @author tanya
 */
@Entity //Entidad que permite manipular la base de datos desde el objeto
@Table(name = "CUSTOMERS", catalog = "", schema = "APP")    //query que nombra la tabla
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"), //query que hace slect de la tabla
    @NamedQuery(name = "Customers.findByIdCustomer", query = "SELECT c FROM Customers c WHERE c.idCustomer = :idCustomer"), //Query que hace select de la columna idCustomer
    @NamedQuery(name = "Customers.findByName", query = "SELECT c FROM Customers c WHERE c.name = :name"), //Query que hace select de la columna name
    @NamedQuery(name = "Customers.findByRfc", query = "SELECT c FROM Customers c WHERE c.rfc = :rfc"),  //Query que hace select de la columna rfc
    @NamedQuery(name = "Customers.findByContactphone", query = "SELECT c FROM Customers c WHERE c.contactphone = :contactphone")})  //Query que hace select de la columna contacPhone
public class Customers implements Serializable { //inicia clase Customers que se implementa de la interfaz serializable
    @Transient  //Al declarar las variables siguientes como transient se dice que no siempre se va a acceder a ellas
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this); 
    //32. Se declara un objeto con modificador de acceso privado que a su vez es un objeto del metodo PropertyChangeSupport
    private static final long serialVersionUID = 1L;
    //34. Se inicializa la variable serialVersionUID = 1L con modificador de acceso privado, estatica y declarada como foinal de tipo long
    @Id //Se indica que variable sera la primary key
    @Basic(optional = false)    //Indica que el dato debe ser obligatorio
    @Column(name = "ID_CUSTOMER")   //Se indica que la primary key se incluye en la columna ID_CUSTOMER
    private Integer idCustomer; //Se declara idCustomer de tipo integer con modificador de acceso privado como dato que se guardara en la columna anterior
    @Column(name = "NAME")  //Se selecciona columna Name
    private String name; //Se declara name de tipo String con modificador de acceso privado como dato que se guardara en la columna anterior
    @Column(name = "RFC") //Se selecciona columna RFC
    private String rfc; //Se declara rfc de tipo String con modificador de acceso privado como dato que se guardara en la columna anterior
    @Column(name = "CONTACTPHONE") //se selecciona columna contactphone
    private String contactphone; //Se declara contactPhone de tipo String con modificador de acceso privado como dato que se guardara en la columna anterior

    public Customers() {} //Constructor de la clase sin parametros ni metodos

    //SOBRECARGA
    public Customers(Integer idCustomer) { //Constructor de la clase que contiene como parametro la variable idCustomer de tipo integer
        this.idCustomer = idCustomer; //se asignara a la variable idCustomer el valor almacenado en la misma.
    }

    public Integer getIdCustomer() {//metodo getIdCustomer de tipo integer con modificador de acceso publico
        return idCustomer;  //regresa el valor almacenado en idCustomer
    }

    public void setIdCustomer(Integer idCustomer) { //metodo setIdCustomer de tipo void con modificador de acceso publico y como parametro IdCustomer de ipo integer
        Integer oldIdCustomer = this.idCustomer; //se declara variable oldIdCustomer de tipo integer que almacenra el dato almacenado en idCustomer
        this.idCustomer = idCustomer; //se asignara a la variable idCustomer el valor almacenado en la misma.
        changeSupport.firePropertyChange("idCustomer", oldIdCustomer, idCustomer); 
        //61.Se utiliza metodo firePropertyChange para indicar que hubo un cambio y buscar la actualizacion si es que la tuvo
    }

    public String getName() {   //metodo getName de tipo String con modificador de acceso publico
        return name;    //regresa el valor almacenado en name
    }

    public void setName(String name) { //metodo setname de tipo void con modificador de acceso publico y como parametro la variable name de tipo string
        String oldName = this.name; //se declara variable oldname de tipostring que almaceena el valor guardado en name
        this.name = name; //se asigna a la variable Name el valor almacenado en name
        changeSupport.firePropertyChange("name", oldName, name);
        //72.Se utiliza metodo firePropertyChange para indicar que hubo un cambio y buscar la actualizacion si es que la tuvo
    }

    public String getRfc() {    //metodo getRFC de tipostring con modificador de acceso publico 
        return rfc; //regresa el valor almacenado en rfc
    }

    public void setRfc(String rfc) { //metodo setRFC de tipo void con modificador de acceso publico y como parametro la variable rfc de tipo string
        String oldRfc = this.rfc; //se declara la variable oldrfc de tipo string que almacenara el valor guardado en rfc
        this.rfc = rfc; //se asigna a la variable rfc el valor almacenado en rfc
        changeSupport.firePropertyChange("rfc", oldRfc, rfc);
        //83. Se utiliza metodo firePropertyChange para indicar que hubo un cambio y buscar la actualizacion si es que la tuvo
    }

    public String getContactphone() {   //metodo getContactPhone de tipo string ocn modificador de acceso publico
        return contactphone; //regresa el valor almacenado en contactphone
    }

    public void setContactphone(String contactphone) { //metodo de tipo void con modificador de acceso publico y como parametro la variable contactphone de tipo string
        String oldContactphone = this.contactphone; //se declara la variable oldContactPhone de tipo String que almacenara el valor guardadp en contactphone
        this.contactphone = contactphone; //se asigna a la variable rfc el valor almacenado en contactphone
        changeSupport.firePropertyChange("contactphone", oldContactphone, contactphone);
        //94. Se utiliza metodo firePropertyChange para indicar que hubo un cambio y buscar la actualizacion si es que la tuvo
    }

    @Override   //sobreesccritura
    public int hashCode() { //metodo de tipo entero con modificador de acceso publico
        //el metodo hash revisa si los datos de la primary key con iguales, revisa de dos en dos
        int hash = 0;   //se inicializa variable hash a 0 de tipo entero
        hash += (idCustomer != null ? idCustomer.hashCode() : 0); 
        //a hash se le suma el valor almacenado en la misma + el datos de idCustomer siempre que sea diferente de cero
        return hash; //se regresa el valor almacenado en hash
    }

    @Override   //sobreescritura
    public boolean equals(Object object) { //metodo de tipo booleano con modificador de acceso publico que tiene como parametro el objeto
        //este método no funcionará en el caso de que los campos de identificación no estén establecidos
        if (!(object instanceof Customers)) { //se revisa si hay un objeto instanciado en la clase customers
            return false; //se regresa un falso si no ha sido instanciado
        }
        Customers other = (Customers) object; //se crea un objeto other de la clase customers 
        if ((this.idCustomer == null && other.idCustomer != null) || (this.idCustomer != null && !this.idCustomer.equals(other.idCustomer))) {
            //se revisara si los datos de idCustomer y other son iguales
            return false; //si lo son retorna falso
        }
        return true; //si son diferentes retorna true
    }

    @Override //sobreescritura
    public String toString() { //metodo de tipo string con modificador de acceso publico
        return "centralchileracrud.Customers[ idCustomer=" + idCustomer + " ]"; //regresa el valor almacenado en idCustomer pero como tipo string
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) { 
        //metodo de tipo void con modificador de acceso public y como parametro la variable listener de tipo PropertyChangeListener
        changeSupport.addPropertyChangeListener(listener); 
        //agrega el valor que fue cambiado en alguna de las variables
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        //metodo de tipo void con modificador de acceso public y como parametro la variable listener de tipo PropertyChangeListener
        changeSupport.removePropertyChangeListener(listener);
        //elimina el valor que fue cambiado en algunas de las variables
    }    
}