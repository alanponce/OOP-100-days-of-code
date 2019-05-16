public class Turista extends Pasajero{//clase turista que extiende de pasajero
	  boolean ventana;//boleano ventan que dira si su asiento estara al lado de una
	  public Turista(String nombre, boolean equipaje, boolean ventana){
	    super(nombre, equipaje);
	    this.ventana = ventana;//construimos los objetos
	  }
	  public boolean getVentana(){
	    return ventana;//devolvemos el resultado
	  }
		public void verInfo(){ //Sobreescritura del metodo verInfo para imprimir la informacion de Primera Clase
			System.out.println("Nombre del pasajero: " + nombre +"Equipaje: "+ equipaje + "Ventana: " + ventana);
		}
	}
