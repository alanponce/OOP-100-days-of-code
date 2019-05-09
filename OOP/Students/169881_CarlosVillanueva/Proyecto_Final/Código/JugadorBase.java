package equipo.de.baloncesto;

public class JugadorBase extends Jugador{

   public JugadorBase(String Nombre, String Posicion, int Estatura, int NivelDefensa, int NivelPase, int NivelTiro){
this.setNombre(Nombre);
this.setPosicion(Posicion);
this.setEstatura(Estatura);
this.setNivelDefensa(NivelDefensa);
this.setNivelPase(NivelPase);
this.setNivelTiro(NivelTiro);
}


    @Override
    public void Retroceder(){
        Partido.Distancia-=3;
    }
    @Override
    public void Avanzar(){
        Partido.Distancia+=3;
    }
    @Override
    public void Tirar(){
    int Tiro = (int) (Math.random()*this.getNivelTiro()+20);
        if (Tiro<=this.getNivelTiro()){
            System.out.println(this.getNombre()+" ha encestado con su tiro.");
            Partido.Puntuacion1 += 1;
        }
            
    }
    @Override
    public void Defender(){
        
    }
    @Override
    public void Pasar(){
        
    }
}
