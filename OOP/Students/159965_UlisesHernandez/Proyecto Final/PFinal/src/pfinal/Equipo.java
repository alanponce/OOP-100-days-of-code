package pfinal;//Nombre del paquete en el que se guardan las clases del proyecto

public abstract class Equipo {//declaro una clase abstracta publica llamada equipo

    protected final String Nombre;//Declaramos una variable con modificador de acceso protected,utilizando final de tipo string
    protected final String Apellido;
    private int Edad;//Declaramos una variable con modificador de acceso private de tipo int
    private final double ID;//declaramos una variable con modificador de acceso private, utilizando final de tipo double
    protected double Sueldo;//decalramos una varible con modificador de acceso protected de tipo double
    private int aniosContrato;//declaramos una variable con modificador de acceso private de tipo int
    
    
    public Equipo(String nombre,String apellido,int edad,double Id,int anioscontrato)//constructor de la clase equipo
    {
        //le asignamos valores a los atributos de la clase mediante los parametros recibidos en el constructor
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.Edad=edad;
        this.ID=Id;
        this.aniosContrato=anioscontrato;
    }
    
    /**
     *<p>Metodo abstracto el cual permite fijar el sueldo de la clase en la que se declare el metodo
     * @param a
     */
    public abstract void setSueldo(int a);//declaramos un metodo abtracto con modificado de acceso public, con retorno void y un parametro entero
    
    /**
     * Metodo para obtener los años de contrato (atributo) de la clase en la que se implemente
     * @return 
     */
    public int getAniosContrato()//declaramos un metodo con modificado de acceso public, con retorno int
    {
        return this.aniosContrato;//retornamos el atributo anioscontrato
    }
    
    /**
     * Metodo para obtener el atributo sueldo de la clase en la que se implemente
     * @return 
     */
    public double getSueldo() //declaramos un metodo con modificado de acceso public, con retorno double
    {
       return this.Sueldo;//retornamos el atributo sueldo 
    }
    
    /**
     * <p>Metodo para obtener el atributo edad de la clase en la que se implemente
     * @return 
     */
    public int getEdad()//declaramos un metodo con modificado de acceso public, con retorno int 
    {
        return this.Edad;//retornamos en atributo edad
    }
    
    /**
     * <P>Metodo para obtener el atributo id de la clase en la que se implemente
     * @return 
     */
    public double getD()//declaramos un metodo abtracto con modificado de acceso public, con retorno void y un parametro entero
    {
        return this.ID;
    }
    
    public String getNombre()//declaramos un metodo abtracto con modificado de acceso public, con retorno void y un parametro entero
    {
        return this.Nombre;
    }
    
    public String getApellido()//declaramos un metodo abtracto con modificado de acceso public, con retorno void y un parametro entero
    {
        return this.Apellido;
    }
   
    public  abstract void entrenar();//declaramos un metodo abtracto con modificado de acceso public, con retorno void y un parametro entero
    public abstract void jugarPartido();//declaramos un metodo abtracto con modificado de acceso public, con retorno void y un parametro entero
    
}
