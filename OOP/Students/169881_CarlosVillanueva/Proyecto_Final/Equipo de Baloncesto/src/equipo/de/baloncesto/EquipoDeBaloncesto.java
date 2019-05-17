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
    
    /*Se crea el arreglo de string Opciones, el cual almacenará 11 strings distintos.*/
    String[] Opciones = {"Jorge", "Juan", "José", "Jesús", "Jacinto", "Andrés", "Antonio", "Ángel", "Adolfo", "Armando", "Iniciar Partido"};
    int VerJugador;//Se crea la variable VerJugador de tipo int para utilizarla posteriormente.
    do{//Se realizarán estas acciones hasta que se elija la opción de iniciar partido, que corresponde al case 10.
    VerJugador = JOptionPane.showOptionDialog(null,"Selecciona un jugador para ver sus características.","Jugadores de Baloncesto", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,Opciones,Opciones[0]);
    /*Este método mostrará un menú de selección donde puedes ver los atributos de cada jugador, o iniciar el partido.
      Cuando se selecciona una opción, esto le brindará un valor de 0 a 10 a la variable VerJugador, la cual será
      utilizada en el switch que viene a continuación.*/
    switch(VerJugador){/*Dependiendo de la opción elegida, se mostrarán los atributos del jugador seleccionado.
        Despues de cada case se agrega un break para que no mostrar los atributos de otro jugador.*/
        case 0:
        Base.Stats();
        break;
        case 1:
        Escolta.Stats();    
        break;
        case 2:
        Alero.Stats();
        break;
        case 3:
        AlaPivot.Stats();
        break;
        case 4:
        Pivot.Stats();
        break;
        case 5:
        BaseVis.Stats();
        break;
        case 6:
        EscoltaVis.Stats();
        break;
        case 7:
        AleroVis.Stats();
        break;
        case 8:
        AlaPivotVis.Stats();
        break;
        case 9:
        PivotVis.Stats();
        break;
        case 10:
        break;
    }}while(VerJugador!=10);/*Este bucle acaba cuando se selecciona la opción de iniciar partido,
    que corresponde al número 10.*/
    
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
            el jugador anterior, se decidirá cuál es el próximo jugador en obtener el balón.Despues de cada 
            case se agrega un break para evitar que se un jugador empiece a jugar cuando no le corresponde.*/
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
    if(Partido.getPuntuacion1()>Partido.getPuntuacion2()){/*Se comparan las puntuaciones finales de cada equipo,
        y dependiendo de sus valores se mostrará en pantalla un mensaje que indica cuál equipo fue el ganador,
        o si hubo un empate.*/
        JOptionPane.showMessageDialog(null,"Con "+Partido.getPuntuacion1()+" puntos, el equipo local ha conseguido la victoria.");
    }
    else if(Partido.getPuntuacion1()<Partido.getPuntuacion2()){
        JOptionPane.showMessageDialog(null,"Con "+Partido.getPuntuacion2()+" puntos, el equipo visitante ha conseguido la victoria.");
    }
    else if(Partido.getPuntuacion1()==Partido.getPuntuacion2()){
        JOptionPane.showMessageDialog(null,"El equipo local consiguio "+Partido.getPuntuacion1()+" puntos, y el equipo visitante ha conseguido "+Partido.getPuntuacion2()+", por lo tanto, el partido termina con un empate.");
    }
    }
    }

