package equipo.de.baloncesto;
public class EquipoDeBaloncesto {
    public static void main(String[] args) {
    /*Se declaran las instancias de las subclases de la clase padre Jugador, junto con sus
     atributos.*/
    JugadorBase Base = new JugadorBase("Jorge",false,185,100,70);
    JugadorEscolta Escolta = new JugadorEscolta("Juan",false,193,80,100);
    JugadorAlero Alero = new JugadorAlero("José",false,201,90,90);
    JugadorAlaPivot AlaPivot = new JugadorAlaPivot("Jesús",false,204,60,95);
    JugadorPivot Pivot = new JugadorPivot("Jacinto",false,210,55,100);
    JugadorBase BaseVis = new JugadorBase("Andrés",true,188,90,80);
    JugadorEscolta EscoltaVis = new JugadorEscolta("Antonio",true,191,90,90);
    JugadorAlero AleroVis = new JugadorAlero("Ángel",true,204,90,90);
    JugadorAlaPivot AlaPivotVis = new JugadorAlaPivot("Adolfo",true,200,65,90);
    JugadorPivot PivotVis = new JugadorPivot("Armando",true,212,75,80);
    
    Partido.setInicio((int)(Math.random()*2));/*Se declara el valor del atributo Inicio de la clase Partido
    como el resultado aleatorio de dos posibilidades*/
    Partido.setJugadas("El partido ha comenzado\n");/*Declara el valor del atributo Jugadas en la clase Partido
    con el texto insertado en el setter.*/
    if(Partido.getInicio()==1){/*Dependiendo del resultado aleatorio entre dos posibilidades,
        se decidirá qué jugador iniciará el partido.*/
        Base.Jugar();
    }
    else{
        BaseVis.Jugar();
    }
    do{/*Se crea un bucle que repite las acciones dentro de sus llaves hasta que el tiempo del partido llegue
        a 40 minutos*/
        switch(Jugador.getObjetivo()){/*Dependiendo del objetivo fijado por el tiro o pase realizado por 
            el jugador anterior, se decidirá cuál es el próximo jugador en obtener el balón*/
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
            break;
            case 5:
            Base.Jugar();
            break;
            case 6:
            EscoltaVis.Jugar();
            break;
            case 7:
            AleroVis.Jugar();
            break;
            case 8:
            AlaPivotVis.Jugar();
            break;
            case 9:
            PivotVis.Jugar();
            break;
            case 10:
            BaseVis.Jugar();
            break;
        }
    }while(Partido.getTiempo()<40);
    }
    }

