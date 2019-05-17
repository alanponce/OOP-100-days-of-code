package pfinal;

//Declaro una clase final para que no tenga mas subclases,esta es una subclase de cuerpo tecnico 
public final class Director extends CuerpoTecnico {

    private final int idFifa;//declaro una variable de tipo int final para que el dato que se ingrese no cambie, qui almacenaremos el id de la fifa de irector tecnico

    private int partidosGanados,incremento;//declaro dos variables de tipo int con modificador de acceso private para guardar los aprtidos ganados del director y el aumento que se le dara de salario

    private final int bono;//declaro una variable final de tipo private que es el bono que se le dara por partido ganado
    
    
    
    public Director(String nombre,String apellido,int edad,double Id,int anioscontrato,int idfifa) //constructor de la clase
    {
        super(nombre,apellido,edad,Id,anioscontrato);//constructor que se hereda de la clasecuerpo tecnico
        this.bono = 100;//le asigno el valor al avariable bono
        this.idFifa=idfifa;//le asigno el valor a la variable id fifa con el valor del parametro recbido en idfifa
        
    }

    //metodo para obtener el idfifa de la clase
    public int getIDFifa() 
    {
        return this.idFifa;//retorno el valor de la variable
    }

  
    //metodo para poner los partido que se han ganado,recibe un parametro dde tipo entero
    protected void setPartidosGanados(int a)
    {
        this.partidosGanados=a;//le asigno el valor del parametro recibido a el atributo partidos ganados
    }
    
    //metodo sobre escrito de la clase padre, el cual recibe un parametro de tipo entero , esta funcion pone el sueldo que el dt, ganara
    @Override
    public void setSueldo(int a) 
    {
        incremento=this.bono*this.partidosGanados;//le damos el valor de la multiplicacion entre bono y partidos ganados a incremento, el cual es el incremento del sueldo del dt
        Sueldo=a+incremento;//sumamos sueldo e incremento y el valor se lo asignamos a sueldo
    }

    //metodo sobreescrito ed la clase cuerpotecnico la cual simula lo que el director tecnico hace en el entrenamiento
    @Override
    public void entrenar() 
    {
        System.out.println("Entrenando al equipo");
    }

    //metodo sobreescrito de la clase cuerpotecnico la cual simula lo que el director tecnico hace en un partido
    @Override
    public void jugarPartido() 
    {
        System.out.println("Dirigiendo al equipo desde la banca");
    }

    //metodo sobreescrito de la clase cuerpotecnico la cualda la informacion edl tecnico mediante llamada a metodos get
    @Override
    public void obtenerInfo()
    {
        System.out.println("El nombre del DT es : "+this.Nombre);
        System.out.println("El apellido del DT es: "+this.Apellido);
        System.out.println("La edad del DT es: "+this.getEdad());
        System.out.println("El ID del DT es: "+this.getD());
        System.out.println("Los años de contrato del DT son: "+this.getAniosContrato());
        
    }
  
}
