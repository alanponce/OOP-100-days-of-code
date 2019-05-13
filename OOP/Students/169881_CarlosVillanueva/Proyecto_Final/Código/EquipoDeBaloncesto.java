package equipo.de.baloncesto;
public class EquipoDeBaloncesto {
    public static void main(String[] args) {
    JugadorBase Base = new JugadorBase("Jorge",185,100,70);
    JugadorEscolta Escolta = new JugadorEscolta("Juan",193,80,100);
    JugadorAlero Alero = new JugadorAlero("José",201,90,90);
    JugadorAlaPivot AlaPivot = new JugadorAlaPivot("Jesús",204,60,95);
    JugadorPivot Pivot = new JugadorPivot("Jacinto",210,55,100);
    Base.Stats();
    Escolta.Stats();
    Alero.Stats();
    AlaPivot.Stats();
    Pivot.Stats();
    Base.Jugar();
    do{
        do{
        switch(Jugador.getObjetivo()){
            case 1:
            Escolta.Jugar();
            break;
            case 2:
            Alero.Jugar();
            break;
            case 3:
            AlaPivot.Jugar();
            break;
            case 4:
            Pivot.Jugar();
            case 5:
            Base.Jugar();
            break;
        }
        }while(Jugador.getDecision()!=4);
        Partido.setTiempo(Partido.getTiempo()+1);
    if(Partido.getTiempo()%10==0){
        Partido.setCuarto(Partido.getCuarto()+1);
        if(Partido.getCuarto()>4){
            Partido.setCuarto(4);
        }
    }
    Partido.Resumen();
    Partido.Info();
    }while(Partido.getTiempo()<40);
     
    }
   
}
