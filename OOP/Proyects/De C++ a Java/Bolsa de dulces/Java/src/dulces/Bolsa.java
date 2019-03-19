package dulces;//Se crea el package dulces en el que estaran las clases relacionadas entre si.

public class Bolsa {//Se declara la clase Bolsa.
	//Los datos privados solo pueden ser accesados por miembros de la misma clase
    private int Azules;//Se declara dato privado
    private int Rojos;//Se declara dato privado
    private int Verdes;//Se declara dato privado

    private int Total;//Se declara dato privado

    private int MeterDulceAzul;//Se declara dato privado
    private int MeterDulceRojo;//Se declara dato privado
    private int MeterDulceVerde;//Se declara dato privado
	
    private int SacarDulceAzul;//Se declara dato privado
    private int SacarDulceRojo;//Se declara dato privado
    private int SacarDulceVerde;//Se declara dato privado
    
    public Bolsa(){//Se crea el constructor 
        Rojos = 0;//Rojos se inicializa en cero
	Azules = 0;//Azules se inicializa en cero
	Verdes = 0;//Verdes se inicializa en cero
        Total = 0;//Total se inicializa en cero
    }

    int MeterDulceAzul(){//Se crea la funcion MeterDulcesAzul 
        Azules++;//Azul incrementa 1
        Total++;//Total incrementa 1
        
        return 1;//Se regresa un 1 por cada Dulce Azul que se ingresa
    }
    
    int MeterDulceRojo(){//Se crea la funcion MeterDulceRojo
	Rojos++;//Rojo incrementa 1
	Total++;//Total incrementa 1

	return 1;//Se regresa un 1 por cada Dulce Rojo que se ingresa 
    }
    
    int MeterDulceVerde(){//Se crea la funcion MeterDulceVerde
	Verdes++;//Verde incrementa 1
	Total++;//Total incrementa 1

	return 1;//Se regresa un 1 por cada Dulce Verde que se ingresa
    }
    
    
    
    public int MeterDulce(int color){//Se crea la funcion MeterDulce
        if (color == 1)//Si color es 1 (Azul), entra al ciclo.
	return MeterDulceAzul();//Entra la funcion MeterDulceAzul

	if (color == 2)//Si color es 2 (Rojo), entra al ciclo
	return MeterDulceRojo();//Entra la funcion MeterDulceRojo

	if (color == 3)//Si color es 3 (Verde), entra al ciclo 
	return MeterDulceVerde();//entra la funcion MeterDulceVerde

	return 0;//Si no entra a ningun ciclo se regresa un 0
    }
	
    int SacarDulceAzul() {//Se crea la funcion SacarDulceAzul
	Azules--;//Azules decrementa 1
	Total--;//Total decrementa 1

	return 1;//Se regresa 1 por cada dulce que se saca
    }
    
    int SacarDulceRojo() {//Se crea la funcion SacarDulceRojo
	Rojos--;//Rojos decrementa 1
	Total--;//Total decrementa 1

	return 1;//Se regresa 1 por cada dulce que se saca
    }
    
    int SacarDulceVerde() {//Se crea la funcion SacarDulceVerde
	Verdes--;//Verdes decrementa 1
	Total--;//Total decrementa 1

	return 1;//Se regresa 1 por cada dulce que se saca
    }
    
    int SacarDulce(int color){//Se crea la funcion SacarDulce
	if (color == 1)//Si color es 1 (Azul), entra al ciclo
		return SacarDulceAzul();//Entra la funcion SacarDulceAzul

	if (color == 2)//Si color es 2 (Rojo), entra al ciclo
		return SacarDulceRojo();//Entra la funcion SacarDulcerojo

	if (color == 3)//Si color es 3 (Verde), entra al ciclo
		return SacarDulceVerde();//Entra la funcion SacarDulceVerde

	return 0;//Si no entra a ningun ciclo regresa un 0
    }

    void Imprimir(){//Se crea la funcion Imprimir  
        System.out.print("\nTotal Azules: "+Azules);//Mostramos el total de azules
        System.out.print("\nTotal Rojos: "+Rojos);//Mostramos el total de Rojos
        System.out.print("\nTotal Verdes: "+Verdes);//Mostramos el total de Verdes
        System.out.print("\nTotal De Dulces: "+Total);//Mostramos el total
        System.out.print("\n");
    }
    
    
}