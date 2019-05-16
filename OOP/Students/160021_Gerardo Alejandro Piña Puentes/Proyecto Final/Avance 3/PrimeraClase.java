//Aplicando polimorfismo y herencia para crear objetos de un tipo de pasajero
public class PrimeraClase extends Pasajero{
  boolean desayuno;
  String tipoAsiento;
  public PrimeraClase(String nombre, boolean equipaje, boolean desayuno, String tipoAsiento){
    super(nombre, equipaje);
    this.desayuno = desayuno;
    this.tipoAsiento = tipoAsiento;
  }
  public boolean getDesayuno(){
    return desayuno;
  }
}
