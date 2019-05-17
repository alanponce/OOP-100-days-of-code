
package professionalgym;//Nombre del paquete en el cual se guardan las clases del proyecto.

public class Professionalgym {
    
    //Main para realizar pruebas del proyecto.

    public static void main(String[] args) {
    
        Administrador A1 = new Administrador(1, "Brandon", "Praderas del sur", "6565544094");
        Recepcionista R1;
        R1=A1.addRecepcionista(1, "Jorge", "Calexico", "6563040024");
        Cliente C1;
        C1=A1.addCliente("Ivan", "Torres", "6565231254", "AB positivo");
        Cliente C2;
        C2=R1.addCliente("Ulises", "Pradera de los aces", "656630221", "O positivo");
        
        A1.getId();
        A1.getNombre();
        A1.setSalario(1500, 500);
        A1.getSalario();
        A1.getTelefono();
        
        R1.getId();
        R1.getNombre();
        R1.setSalario(2500);
        R1.getSalario();
        R1.getTelefono();
        
        C1.getNombre();
        C1.getDireccion();
        C1.getTelefono();
        C1.getTipoSangre();
        
        C2.getNombre();
        C2.getDireccion();
        C2.getTelefono();
        C2.getTipoSangre();
        
        C1=R1.deleteCliente(C1);
        
        if(C1==null)
            System.out.println("Cliente eliminado exitosamente");   
        else
            System.out.println("No se pudo eliminar el cliente");
        
        Inventario I1;
        I1=A1.addMaquina("Magnum", "Caminadora","15 km/h");
        
        Inventario I2;
        I2=R1.addPesa("AFG", "Mancuerna","15 Kg");
        
        I1.getMarca();
        I1.getCapacidad();
        I1.getTipo();
        
        I2.getMarca();
        I2.getCapacidad();
        I2.getTipo();
        
        I2=A1.deleteInventario(I2);
        
        if(I2==null)
            System.out.println("Equipo eliminado exitosamente");
        else
            System.out.println("No se pudo eliminar el equipo");
        
        
    }
    
}
