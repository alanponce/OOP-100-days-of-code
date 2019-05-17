package equipo.de.baloncesto;

public class JugadorBase extends Jugador implements Jugadas {/*Se crea la clase JugadorBase, la cual hereda atributos 
   de la clase padre Jugador y métodos de la interfaz Jugadas.*/
   
   public JugadorBase(String Nombre, String Posicion, boolean Visitante, int Estatura, int NivelPase, int NivelTiro){
   /*Se crea un constructor para inicializar las instancias de la clase y se utiliza super para llamar
     al constructor de la clase padre Jugador.*/
   super(Nombre, Posicion, Visitante, Estatura, NivelPase, NivelTiro);
}
    @Override
    public void Retroceder(){/*El método Retroceder hace que el jugador se mueva hacia su
        canasta con una distancia determinada.*/
       if(Partido.getDistancia()<14&&Partido.getDistancia()>-14){/*Verifica que el jugador se encuentre
           dentro de los límites de la cancha, de lo contrario, no podrá retroceder.*/
            if(this.isVisitante()){/*Verifica si el jugador es local o visitante y dependiendo del
            resultado ajusta la distancia para retroceder hacia su propia canasta.*/
                Partido.setDistancia(Partido.getDistancia()+3);
            }
            else{
                Partido.setDistancia(Partido.getDistancia()-3);        
            }
            
            if (Partido.getDistancia()>14){
                Partido.setDistancia(14);/*Ajusta la distancia actual del jugador para que no salga de los 
            límites de la cancha.*/
            }
            else if (Partido.getDistancia()<-14){
                Partido.setDistancia(-14);/*Ajusta la distancia actual del jugador para que no salga de los 
            límites de la cancha.*/
            }
        /*El siguiente condicional if verifica la posición en la que se encuentra el balón, y dependiendo de
        este valor, indicará la posición y si se encuentra dentro del lado local o del lado visitante.
        Se utiliza Math.abs para mostrar el valor absoluto.*/
        if(Partido.getDistancia()>0){
        Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre()+" ha retrocedido y ahora se encuentra a "+ Math.abs(Partido.getDistancia()) + " metros de la linea central, dentro del lado del equipo visitante.\n");    
        /*Almacena en el atributo ResumenDeJugadas de la clase Partido un texto que indica que el jugador ha 
        retrocedido, y la distancia actual medida desde el centro de la cancha.*/   
        }
        else if(Partido.getDistancia()<0){
        Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre()+" ha retrocedido y ahora se encuentra a "+ Math.abs(Partido.getDistancia()) + " metros de la linea central, dentro del lado del equipo local.\n");
        /*Almacena en el atributo ResumenDeJugadas de la clase Partido un texto que indica que el jugador ha 
        retrocedido, y la distancia actual medida desde el centro de la cancha.*/    
        }
        else if(Partido.getDistancia()==0){
        Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre()+" ha retrocedido y ahora se encuentra a "+ Math.abs(Partido.getDistancia()) + " metros de la linea central.\n");
        }
        
       }
    }
    @Override
    public void Avanzar(){/*El método Avanzar hace que el jugador se mueva hacia la
        canasta enemiga con una distancia determinada.*/
        if(Partido.getDistancia()<14&&Partido.getDistancia()>-14){/*Verifica que el jugador se encuentre
           dentro de los límites de la cancha, de lo contrario, no podrá avanzar.*/
        if(this.isVisitante()){/*Verifica si el jugador es local o visitante y dependiendo del
            resultado ajusta la distancia para avanzar hacia su propia canasta.*/
        Partido.setDistancia(Partido.getDistancia()-3);
        if(Partido.getDistancia()<-14){
            Partido.setDistancia(-14);/*Ajusta la distancia actual del jugador para que no salga de los 
            límites de la cancha.*/
        }
        }
        else{
        Partido.setDistancia(Partido.getDistancia()+3);
        }
        if(Partido.getDistancia()>14){
            Partido.setDistancia(14);/*Ajusta la distancia actual del jugador para que no salga de los 
            límites de la cancha.*/
        }
        /*El siguiente condicional if verifica la posición en la que se encuentra el balón, y dependiendo de
        este valor, indicará la posición y si se encuentra dentro del lado local o del lado visitante.
        Se utiliza Math.abs para mostrar el valor absoluto.*/
        if(Partido.getDistancia()>0){
        Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre()+" ha avanzado y ahora se encuentra a "+ Math.abs(Partido.getDistancia()) + " metros de la linea central, dentro del lado del equipo visitante.\n");
        /*Almacena en el atributo ResumenDeJugadas de la clase Partido un texto que indica que el jugador ha 
        avanzado, y la distancia actual medida desde el centro de la cancha.*/    
        }
        else if(Partido.getDistancia()<0){
        Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre()+" ha avanzado y ahora se encuentra a "+ Math.abs(Partido.getDistancia()) + " metros de la linea central, dentro del lado del equipo local.\n");
        /*Almacena en el atributo ResumenDeJugadas de la clase Partido un texto que indica que el jugador ha 
        avanzado, y la distancia actual medida desde el centro de la cancha.*/    
        }
        else if(Partido.getDistancia()==0){
        Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre()+" ha avanzado y ahora se encuentra a "+ Math.abs(Partido.getDistancia()) + " metros de la linea central.\n");
        /*Almacena en el atributo ResumenDeJugadas de la clase Partido un texto que indica que el jugador ha 
        avanzado, y la distancia actual medida desde el centro de la cancha.*/    
        }
        
    }}
    @Override
    public void Tirar(){//El método Tirar hace que el jugador realice un tiro hacia la canasta enemiga
    this.setJugada((int) ((Math.random()*(this.getNivelTiro()+51)))-Partido.getDistancia());/*Genera 
    un número aleatorio entre 1 y el valor del atributo NivelTiro más 50.*/
    if(this.isVisitante()){/*Se verifica si el jugador que realiza el tiro es del equipo local o visitante
    una vez verificado, se ajustará el objetivo para que al finalizar el tiro, un jugador del equipo contrario
    consiga el balón.*/
    this.setObjetivo((int) (Math.random()*5+1));/*Este número aleatorio se castea como entero porque 
    el método Math.random genera números que incluyen decimales.*/
    }
    else{
    this.setObjetivo((int) (Math.random()*5+6));/*Este número aleatorio se castea como entero porque
    el método Math.random genera números que incluyen decimales.*/
    }
    Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre() + " ha decidido tirar a canasta.\n");
    /*Almacena en el atributo ResumenDeJugadas de la clase Partido un texto que indica que el jugador decidió tirar a canasta.*/
        if (this.getJugada()<=this.getNivelTiro()){/*Verifica si el número aleatorio generado es menor
            que el valor del atributo NivelTiro del objeto instanciado. En caso de serlo, realiza
            lo siguiente:*/
            Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre()+" ha encestado con su tiro.\n");/*Almacena
            el texto indicado en el atributo ResumenDeJugadas de la clase Partido. Este texto indica que el jugador
            ha logrado encestar con su tiro.*/
            if(this.isVisitante()){/*Verifica si el jugador es local o visitante y dependiendo del resultado,
            añade los puntos al equipo correspondiente*/
            Partido.setPuntuacion2(Partido.getPuntuacion2()+2);    
            }
            else{
            Partido.setPuntuacion1(Partido.getPuntuacion1()+2);
            }
            if(Partido.getDistancia()<=7){/*Verifica la distancia donde fue lanzado el balón, si el tiro
            fue desde más de 7 metros de la canasta del equipo visitante, el equipo local recibe un punto más.*/
            if(this.isVisitante())
            {
            }
            else{
            Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+"Ha sido un tiro de 3 puntos.\n");/*Almacena
            el texto indicado en el atributo ResumenDeJugadas de la clase Partido. El texto indica que el tiro ha sido
            de 3 puntos.*/
            Partido.setPuntuacion1(Partido.getPuntuacion1()+1);
            }
            }
            if (Partido.getDistancia()>=-7){/*Verifica la distancia donde fue lanzado el balón, si el tiro
            fue desde más de 7 metros de la canasta del equipo local, el equipo visitante recibe un punto más.*/
            if(this.isVisitante()){
            Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+"Ha sido un tiro de 3 puntos.\n");/*Almacena
            el texto indicado en el atributo ResumenDeJugadas de la clase Partido. El texto indica que el tiro ha sido
            de 3 puntos.*/
            Partido.setPuntuacion2(Partido.getPuntuacion2()+1);
            }
            else{
            }
            }
        }
        else{
            Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre()+" ha fallado su tiro.\n");/*Almacena
            el texto indicado en el atributo ResumenDeJugadas de la clase Partido. El texto indica que el tiro
            ha fallado.*/
        }
    //Una vez realizado el tiro, sucede lo siguiente:
    Partido.setTiempo(Partido.getTiempo()+1);//El tiempo del partido avanza un minuto.
    Partido.ResumenDeJugadas();//Imprime en pantala un texto que contiene todas las jugadas realizadas antes del tiro.
    Partido.Info();//Imprime en pantalla el estado actual del partido.
    if(this.isVisitante()){/*Verifica si el jugador actual es local o visitante y ajusta la distancia para que
        el balón se encuentre del lado del equipo contrario.*/
        Partido.setDistancia(-5);
    }
    else{
        Partido.setDistancia(5);
    }
    if(Partido.getTiempo()==10||Partido.getTiempo()==20||Partido.getTiempo()==30){/*Verifica si la cantidad
        de minutos que han pasado son 10, 20 o 30, pues en el baloncesto se juegan cuatro cuartos de 10 minutos
        cada uno. El partido inicia en el cuarto 1 que abarca desde el minuto 0 hasta el 10, el cuarto 2 va
        desde el 10 hasta el 20, el cuarto 3 va desde el 20 hasta el 30, y el cuarto 4 desde el 30 hasta el 40.*/
        Partido.setCuarto(Partido.getCuarto()+1);//Le suma 1 al valor actual del cuarto del partido.
        }
    }
    @Override
    public void Pasar(){//El método Pasar hace que el jugador pase el balón hacia uno de sus compañeros.
        this.setJugada((int) (Math.random()*(this.getNivelPase()+21)));/*Genera un número aleatorio entre
        1 y el valor del atributo NivelPase más 20.*/
        Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre() + " ha decidido hacer un pase.\n");/*Almacena
        el texto indicado en el atributo ResumenDeJugadas de la clase Partido.*/
        if (this.getJugada()<=this.getNivelPase()){/*Verifica si el número aleatorio generado es menor que
            el atributo NivelPase del objeto instanciado, en caso de serlo, realiza lo siguiente:*/
            if(this.isVisitante()){/*Verifica si el objeto instanciado es un jugador visitante.*/
        do{/*En caso de ser visitante y de realizar el pase con éxito, un miembro del mismo equipo
            recibirá el balón.*/ 
        this.setObjetivo((int) (Math.random()*5+6));/*Este número aleatorio se castea como entero porque el método Math.random genera números que incluyen
          decimales.*/
        }while(Jugador.getObjetivo()==10);/*Se repite esta acción hasta que el objetivo sea diferente al
        número 10 (el número que identifica a este jugador) para evitar que el jugador se pase el balón
        a él mismo.*/
        }
        else{/*Si el objeto instanciado es local, se realiza el mismo método pero ajustado para que
               el pase sea hacia un jugador del equipo local.*/
        do{
        this.setObjetivo((int) (Math.random()*5+1));/*Este número aleatorio se castea como entero porque el método Math.random genera números que incluyen
          decimales.*/
        }while(Jugador.getObjetivo()==5);    
        }
            Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+"El pase de "+this.getNombre()+" ha sido exitoso.\n");/*Almacena
        el texto indicado en el atributo ResumenDeJugadas de la clase Partido. Este texto indica que el pase se ha realizado
            con éxito.*/
        }
        else{/*Si el valor aleatorio es mayor que el atributo NivelPase del objeto instanciado, se realiza
            lo siguiente:*/
            Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+"El pase de "+this.getNombre()+" ha fallado.\n");/*Almacena
        el texto indicado en el atributo ResumenDeJugadas de la clase Partido. El texto indica que el pase realizado
        por el jugador ha fallado.*/
        if(this.isVisitante()){/*Se realiza el mismo método de verificación para ver si el objeto instanciado
            forma parte del equipo local o del visitante. Como en este caso el pase del jugador ha fallado, 
            se ajusta para que el balón sea recibido por un jugador del equipo contrario.*/
        do{
        this.setObjetivo((int) (Math.random()*5+1));/*Este número aleatorio se castea como entero porque el método Math.random genera números que incluyen
          decimales.*/
        }while(Jugador.getObjetivo()==5);    
        }
        else{
        do{
        this.setObjetivo((int) (Math.random()*5+6));/*Este número aleatorio se castea como entero porque el método Math.random genera números que incluyen
          decimales.*/
        }while(Jugador.getObjetivo()==10);
        }
        }
    }
    @Override
    public void Jugar(){/*El método Jugar hace que el jugador tome una desición en cuanto a lo que
        va a realizar una vez que tenga el balón*/
        Partido.setResumenDeJugadas(Partido.getResumenDeJugadas()+this.getNombre()+" ha conseguido el balón.\n");/*Almacena
        el texto indicado en el atributo ResumenDeJugadas de la clase Partido. Este texto indica que el jugador
        ha conseguido el balón.*/
        do{
          Jugador.setDecisionDeJuego((int) (Math.random()*6+1));/*Genera un número al azar del 1 al 6.
          Este número aleatorio se castea como entero porque el método Math.random genera números 
          que incluyen decimales.*/
        switch (Jugador.getDecisionDeJuego()){/*Dependiendo del número generado, el jugador hará alguno 
            de los siguientes métodos. Despues de cada case se agrega un break para que no se realice
            otra jugada.*/
            case 1:
                this.Avanzar();
                break;
            case 2:
                this.Avanzar();
                break;
            case 3:
                 this.Retroceder();
                break;
            case 4:
                this.Tirar();
                break;
            case 5:
                this.Pasar();
                break;
            case 6:
                this.Pasar();
                break;
        }
        }while(Jugador.getDecisionDeJuego()<=3);/*Esto se repetirá hasta que el jugador decida pasar el balon
        o tirar a canasta.*/
    } 
}
