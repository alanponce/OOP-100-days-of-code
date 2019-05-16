public class PrimeraClase extends Pasajero{//clase que extiende de pasajero
	  boolean desayuno;//boleano que decidira si se tiene o no desayuno
	  String tipoAsiento;
	  public PrimeraClase(String nombre, boolean equipaje, boolean desayuno, String tipoAsiento){
	    super(nombre, equipaje);
	    this.desayuno = desayuno;
	    this.tipoAsiento = tipoAsiento;
	  }
	  public boolean getDesayuno(){//retornara si hay desayuno o no
	    return desayuno;
	  }
    public void verInfo(){ //Sobreescritura del metodo verInfo para imprimir la informacion de Primera Clase
      System.out.println("Nombre del pasajero: " + nombre +"Equipaje: "+ equipaje + "Desayuno: " + desayuno + "Tipo de asiento: " + tipoAsiento);
    }
	}
