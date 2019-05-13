package equipo.de.baloncesto;

public class JugadorBase extends Jugador{

   public JugadorBase(String Nombre, int Estatura, int NivelPase, int NivelTiro){
   this.setNombre(Nombre);
   this.setPosicion("Base");
   this.setEstatura(Estatura);
   this.setNivelPase(NivelPase);
   this.setNivelTiro(NivelTiro);
}
    @Override
    public void Retroceder(){
        if(Partido.getDistancia()>0){
        Partido.setDistancia(Partido.getDistancia()-3);
        if(Partido.getDistancia()<0){
            Partido.setDistancia(0);
        }
        Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha retrocedido y ahora se encuentra a "+ Partido.getDistancia() + " metros de la linea central.\n");
        }
        else{
            Partido.setDistancia(Partido.getDistancia()-3); 
            Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha retrocedido y ahora se encuentra a "+ Partido.getDistancia() + " metros de la linea central.\n");

        }
    }
    @Override
    public void Avanzar(){
        if(Partido.getDistancia()<14);{
        Partido.setDistancia(Partido.getDistancia()+3);
    }
        if(Partido.getDistancia()>14){
            Partido.setDistancia(14);
        }
        Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha avanzado y ahora se encuentra a "+ Partido.getDistancia() + " metros de la linea central.\n");
    }
    @Override
    public void Tirar(){
    this.setJugada((int) ((Math.random()*(this.getNivelTiro()+20)))-Partido.getDistancia());
    do{
    this.setObjetivo((int) (Math.random()*5+1));
    }while(Jugador.getObjetivo()==5);
    Partido.setJugadas(Partido.getJugadas()+this.getNombre() + " ha decidido tirar a canasta.\n");
        if (this.getJugada()<=this.getNivelTiro()){
            Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha encestado con su tiro.\n");
            Partido.setPuntuacion1(Partido.getPuntuacion1()+2);
            if(Partido.getDistancia()<=7){
            Partido.setJugadas(Partido.getJugadas()+"Ha sido un tiro de 3 puntos.\n");
            Partido.setPuntuacion1(Partido.getPuntuacion1()+1);
            }}
        else{
            Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha fallado su tiro.\n");
        }    
    }
    @Override
    public void Pasar(){
        this.setJugada((int) (Math.random()*this.getNivelPase()+20));
        do{
        this.setObjetivo((int) (Math.random()*5+1));
        }while(Jugador.getObjetivo()==5);
        Partido.setJugadas(Partido.getJugadas()+this.getNombre() + " ha decidido hacer un pase.\n");
        if (this.getJugada()<=this.getNivelPase()){
            Partido.setJugadas(Partido.getJugadas()+"El pase de "+this.getNombre()+" ha sido exitoso.\n");
        }
        else{
            Partido.setJugadas(Partido.getJugadas()+"El pase de "+this.getNombre()+" ha fallado.\n");
        }
    }
    @Override
    public void Jugar(){
        Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha conseguido el balón.\n");
        do{
          Jugador.setDecision((int) (Math.random()*6+1));
        switch (Jugador.getDecision()){
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
        }while(Jugador.getDecision()<=3);
    } 
}
