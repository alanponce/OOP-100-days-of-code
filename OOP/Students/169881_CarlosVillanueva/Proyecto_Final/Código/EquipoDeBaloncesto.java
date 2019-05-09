package equipo.de.baloncesto;
public class EquipoDeBaloncesto {
    public static void main(String[] args) {
    System.out.println(Partido.Tiempo);//Se imprime el valor actual del atributo Tiempo de la clase Partido.
    Partido.Tiempo = Partido.Tiempo + 1;//Se le suma 1 a este valor y se asigna como el nuevo valor del atributo.
    System.out.println(Partido.Tiempo);//Se imprime el valor actual del atributo, que deberá ser mayor al primer valor impreso.
    JugadorBase Base = new JugadorBase("Jorge","Base",178,100,70,70);/*Se crea un nuevo jugador de la clase JugadorBase,
    y se definen sus atributos de nombre, posición, estatura, nivel de defensa, nivel de pase y nivel de tiro.*/
    Base.Tirar();//Se realiza el método tirar del objeto Base.
    System.out.println(Partido.Puntuacion1);/*Se muestra la puntuación actual del primer equipo, que puede ser diferente en caso de que
    el jugador haya encestado con su tiro*/
    System.out.println(Base.getStats());//Se utiliza el método para imprimir en pantalla los atributos del objeto Base.
    }
    
}
