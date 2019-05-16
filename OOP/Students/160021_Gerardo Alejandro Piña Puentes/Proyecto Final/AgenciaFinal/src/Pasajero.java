public abstract class Pasajero{ //Se crea una clase abstracta
	  String nombre;//definimos el nombre tipo string
	  boolean equipaje;//un boolean que definira si tiene o no equipaje
	  public Pasajero(String nombre, boolean equipaje){
	    this.nombre = nombre;
	    this.equipaje = equipaje;//construimos los objetos
	  }
	  public String getNombrePasajero(){
	    return nombre;
	  }
	  public boolean getEquipaje(){
	    return equipaje;
	  }
    public void verInfo(){
      System.out.println("Nombre del pasajero: " + nombre +"Equipaje: "+ equipaje);
    }
	}
