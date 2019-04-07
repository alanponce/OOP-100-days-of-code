package midocumento;
import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class ModeloCliente extends AbstractListModel<Clientes> {
    private ArrayList<Clientes> lista = new ArrayList<>();
    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Clientes getElementAt(int index) {
        Clientes c = lista.get(index);
        return c.getNombre();
    }

    public void agregarCliente(Clientes u) {
        lista.add(u);
        this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }
    
    public void eliminarCliente(int index0) {
        lista.remove(index0);
        this.fireIntervalRemoved(index0,getSize(),getSize()+1);
        
    }
    public Clientes getCliente(int index) {
        return lista.get(index);
    }
}