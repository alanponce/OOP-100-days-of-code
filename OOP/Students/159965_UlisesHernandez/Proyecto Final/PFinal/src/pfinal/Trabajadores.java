
package pfinal;

//interface creada par los metodos que los trabajadores tienen en comun
public interface Trabajadores  
{
    void setSueldo(float tiempo,int tiempos);//funcion para dar el valro el sueldo del trabajador
    float sueldo=1650.50f;//atributo sueldo de tipo float 
    int bonoExtra=200;//atributo bono de tipo int
    void setBonoExtra(boolean a);///metodo que se utiliza para saber si se le dara el bono al trabajador
    void getInformacion();//metodo utilizado para obtener la informacion de los trabajadores
}