package equipo.de.baloncesto;

public class JugadorBase extends Jugador{//Se crea la clase JugadorBase, que hereda de la clase Jugador.

   public JugadorBase(String Nombre, String Posicion, int Estatura, int NivelDefensa, int NivelPase, int NivelTiro){ /*Se crea un
   constructor para la clase.*/
this.setNombre(Nombre);
this.setPosicion(Posicion);
this.setEstatura(Estatura);
this.setNivelDefensa(NivelDefensa);
this.setNivelPase(NivelPase);
this.setNivelTiro(NivelTiro);
/*Se inicializan utilizando los métodos setter de la clase jugador, esto se hace para poder utilizar los atributos de la clase padre,
  que son privados*/
}


    @Override
    public void Retroceder(){//Se sobreescribe el método abstracto Retroceder de la clase Jugador.
        Partido.Distancia-=3;/*El método le resta 3 al valor del atributo Distancia de la clase Partido, y se define el resultado como
        el nuevo valor del atributo.*/
    }
    @Override
    public void Avanzar(){//Se sobreescribe el método abstracto Avanzar de la clase Jugador.
        Partido.Distancia+=3;/*El método le suma 3 al valor del atributo Distancia de la clase Partido, y se define el resultado como
        el nuevo valor del atributo.*/
    }
    @Override
    public void Tirar(){//Se sobreescribe el método abstracto Tirar de la clase Jugador.
    int Tiro = (int) (Math.random()*this.getNivelTiro()+20);/*Se crea la variable Tiro de tipo int, se genera un número al azar
    entre 0 y el valor del atributo NivelTiro de la clase Jugador, se le suma 20 a este resultado, se castea como tipo entero para
    redondear los decimales que genera Math.random, y se asigna este valor a la variable Tiro.*/
        if (Tiro<=this.getNivelTiro()){/*Se comparan los valores de la variable tiro y la variable NivelTiro de la clase Jugador.
        En caso de que el valor de la variable tiro sea menor o igual al valor de la variable NivelTiro, se hace lo siguiente:*/
            System.out.println(this.getNombre()+" ha encestado con su tiro.");/*Se imprime en pantalla un mensaje que indica que 
            el jugador ha encestado.*/
            Partido.Puntuacion1 += 1;/*Se le suma 1 al valor del atributo Puntuacion1 de la clase Jugador, y se asigna el 
            resultado como el nuevo valor.*/
        }
            
    }
    @Override
    public void Defender(){//Se sobreescribe el método abstracto Defender de la clase Jugador.
        
    }
    @Override
    public void Pasar(){//Se sobreescribe el método abstracto Pasar de la clase Jugador.
        
    }
}
