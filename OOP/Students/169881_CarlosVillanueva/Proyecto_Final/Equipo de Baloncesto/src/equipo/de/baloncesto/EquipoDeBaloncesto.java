package equipo.de.baloncesto;
import javax.swing.JOptionPane;

public class EquipoDeBaloncesto {
    public static void main(String[] args) {
    /*Se declaran las instancias de las subclases de la clase padre Jugador, junto con sus
     atributos.*/
    JugadorBase Base = new JugadorBase("Jorge","Base",false,185,100,70);
    JugadorEscolta Escolta = new JugadorEscolta("Juan","Escolta",false,193,80,100);
    JugadorAlero Alero = new JugadorAlero("José","Alero",false,201,90,90);
    JugadorAlaPivot AlaPivot = new JugadorAlaPivot("Jesús","Ala Pivot",false,204,60,95);
    JugadorPivot Pivot = new JugadorPivot("Jacinto","Pivot",false,210,55,100);
    JugadorBase BaseVis = new JugadorBase("Andrés","Base",true,188,90,80);
    JugadorEscolta EscoltaVis = new JugadorEscolta("Antonio","Escolta",true,191,90,90);
    JugadorAlero AleroVis = new JugadorAlero("Ángel","Alero",true,204,90,90);
    JugadorAlaPivot AlaPivotVis = new JugadorAlaPivot("Adolfo","Ala Pivot",true,200,65,90);
    JugadorPivot PivotVis = new JugadorPivot("Armando","Pivot",true,212,75,80);
    
    JOptionPane.showMessageDialog(null, "Equipo 1");/*Imprime en pantalla a los miembros del equipo 1
    junto con sus atributos.*/
    Base.Stats();
    Escolta.Stats();
    Alero.Stats();
    AlaPivot.Stats();
    Pivot.Stats();
    JOptionPane.showMessageDialog(null, "Equipo 2");/*Imprime en pantalla a los miembros del equipo 1
    junto con sus atributos.*/
    BaseVis.Stats();
    EscoltaVis.Stats();
    AleroVis.Stats();
    AlaPivotVis.Stats();
    PivotVis.Stats();
    
    Partido.setInicio((int)(Math.random()*2));/*Se declara el valor del atributo Inicio de la clase Partido
    como el resultado aleatorio de dos posibilidades*/
    Partido.setResumenDeJugadas("El partido ha comenzado\n");/*Declara el valor del atributo ResumenDeJugadas en la 
    clase Partido con el texto insertado en el setter.*/
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

