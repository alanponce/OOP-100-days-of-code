public abstract class Pasajero{ //Se crea una clase abstracta
  String nombre;
  boolean equipaje;
  public Pasajero(String nombre, boolean equipaje){
    this.nombre = nombre;
    this.equipaje = equipaje;
  }
  public String getNombrePasajero(){
    return nombre;
  }
  public boolean getEquipaje(){
    return equipaje;
  }
}
