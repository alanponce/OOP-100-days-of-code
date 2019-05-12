package equipo.de.baloncesto;
public class JugadorAlaPivot extends Jugador{
   public JugadorAlaPivot(String Nombre, int Estatura, int NivelDefensa, int NivelPase, int NivelTiro){
   this.setNombre(Nombre);
   this.setPosicion("Escolta");
   this.setEstatura(Estatura);
   this.setNivelDefensa(NivelDefensa);
   this.setNivelPase(NivelPase);
   this.setNivelTiro(NivelTiro);
}


    @Override
    public void Retroceder(){
        Partido.setDistancia(Partido.getDistancia()-1);    }
    @Override
    public void Avanzar(){
        Partido.setDistancia(Partido.getDistancia()+1);
    }
    @Override
    public void Tirar(){
    int Tiro = (int) (Math.random()*this.getNivelTiro()+20);
        if (Tiro<=this.getNivelTiro()){
            System.out.println(this.getNombre()+" ha encestado con su tiro.");
            Partido.setPuntuacion1(Partido.getPuntuacion1()+1);
        }
        else{
            System.out.println(this.getNombre()+" ha fallado su tiro.");
        }    
    }
    @Override
    public void Defender(){
    }
    @Override
    public void Pasar(){
        int Pase = (int) (Math.random()*this.getNivelPase()+20);
        if(Pase<=this.getNivelPase()){
            System.out.println("El pase de "+this.getNombre()+" ha sido exitoso.");
        }
        else{
            System.out.println("El pase de "+this.getNombre()+" ha fallado.");
        }
    }
}
