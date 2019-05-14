package equipo.de.baloncesto;

public class JugadorPivot extends Jugador {
    
   public JugadorPivot(String Nombre,boolean Visitante, int Estatura, int NivelPase, int NivelTiro){
   this.setNombre(Nombre);
   this.setPosicion("Pivot");
   this.setVisitante(Visitante);
   this.setEstatura(Estatura);
   this.setNivelPase(NivelPase);
   this.setNivelTiro(NivelTiro);
}
    @Override
    public void Retroceder(){
       if(Partido.getDistancia()<14&&Partido.getDistancia()>-14){
            if(this.isVisitante()){
                Partido.setDistancia(Partido.getDistancia()+1);
            }
            else{
                Partido.setDistancia(Partido.getDistancia()-1);        
            }
            
            if (Partido.getDistancia()>14){
                Partido.setDistancia(14);
            }
            else if (Partido.getDistancia()<-14){
                Partido.setDistancia(-14);
            }
        Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha retrocedido y ahora se encuentra a "+ Partido.getDistancia() + " metros de la linea central.\n");
        }
    }
    @Override
    public void Avanzar(){
        if(Partido.getDistancia()<14&&Partido.getDistancia()>-14){
        if(this.isVisitante()){
        Partido.setDistancia(Partido.getDistancia()-1);
        if(Partido.getDistancia()<-14){
            Partido.setDistancia(-14);
        }
        }
        else{
        Partido.setDistancia(Partido.getDistancia()+1);
        }
        if(Partido.getDistancia()>14){
            Partido.setDistancia(14);
        }
        Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha avanzado y ahora se encuentra a "+ Partido.getDistancia() + " metros de la linea central.\n");
    }}
    @Override
    public void Tirar(){
    this.setJugada((int) ((Math.random()*(this.getNivelTiro()+50)))-Partido.getDistancia());
    if(this.isVisitante()){
    this.setObjetivo((int) (Math.random()*5+1));
    }
    else{
    this.setObjetivo((int) (Math.random()*5+6));
    }
    Partido.setJugadas(Partido.getJugadas()+this.getNombre() + " ha decidido tirar a canasta.\n");
        if (this.getJugada()<=this.getNivelTiro()){
            Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha encestado con su tiro.\n");
            if(this.isVisitante()){
            Partido.setPuntuacion2(Partido.getPuntuacion2()+2);
            }
            else{
            Partido.setPuntuacion1(Partido.getPuntuacion1()+2);
            }
            if(Partido.getDistancia()<=7){
            if(this.isVisitante())
            {
            }
            else{
            Partido.setJugadas(Partido.getJugadas()+"Ha sido un tiro de 3 puntos.\n");
            Partido.setPuntuacion1(Partido.getPuntuacion1()+1);
            }
            }
            if (Partido.getDistancia()>=-7){
            if(this.isVisitante()){
            Partido.setJugadas(Partido.getJugadas()+"Ha sido un tiro de 3 puntos.\n");
            Partido.setPuntuacion2(Partido.getPuntuacion2()+1);
            }
            else{
            }
            }
        }
        else{
            Partido.setJugadas(Partido.getJugadas()+this.getNombre()+" ha fallado su tiro.\n");
        }
    Partido.setTiempo(Partido.getTiempo()+1);
    Partido.Resumen();
    Partido.Info();
    if(this.isVisitante()){
        Partido.setDistancia(-5);
    }
    else{
        Partido.setDistancia(5);
    }
    if(Partido.getTiempo()==10||Partido.getTiempo()==20||Partido.getTiempo()==30){
        Partido.setCuarto(Partido.getCuarto()+1);
        }
    }
    @Override
    public void Pasar(){
        this.setJugada((int) (Math.random()*this.getNivelPase()+20));
        Partido.setJugadas(Partido.getJugadas()+this.getNombre() + " ha decidido hacer un pase.\n");
        if (this.getJugada()<=this.getNivelPase()){
            if(this.isVisitante()){
        do{
        this.setObjetivo((int) (Math.random()*5+6));
        }while(Jugador.getObjetivo()==9);
        }
        else{
        do{
        this.setObjetivo((int) (Math.random()*5+1));
        }while(Jugador.getObjetivo()==4);    
        }
            Partido.setJugadas(Partido.getJugadas()+"El pase de "+this.getNombre()+" ha sido exitoso.\n");
        }
        else{
            Partido.setJugadas(Partido.getJugadas()+"El pase de "+this.getNombre()+" ha fallado.\n");
        if(this.isVisitante()){
        do{
        this.setObjetivo((int) (Math.random()*5+1));
        }while(Jugador.getObjetivo()==4);    
        }
        else{
        do{
        this.setObjetivo((int) (Math.random()*5+6));
        }while(Jugador.getObjetivo()==9);
        }
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
                this.Retroceder();
                break;
            case 3:
                this.Avanzar();
                break;
            case 4:
                this.Tirar();
                break;
            case 5:
                this.Tirar();
                break;
            case 6:
                this.Pasar();
                break;
        }}while(Jugador.getDecision()<=2);
    }
}
