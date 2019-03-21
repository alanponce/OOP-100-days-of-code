package dulces;

public class DulcesBolsa {
    int Azules;//Se declara dato privado
    int Rojos;//Se declara dato privado
    int Verdes;//Se declara dato privado
    int Total;//Se declara dato privado
    
    public DulcesBolsa(){//Se crea el constructor 
        Rojos = 0;//Rojos se inicializa en cero
	Azules = 0;//Azules se inicializa en cero
	Verdes = 0;//Verdes se inicializa en cero
        Total = 0;//Total se inicializa en cero
    }
    public int MeterDulceRojo(){
        Rojos++;
        Total++;
        
        return 1;
    }
    public int MeterDulceAzul(){
        Azules++;
        Total++;
        
        return 1;
    }
    public int MeterDulceVerde(){
        Verdes++;
        Total++;
        
        return 1;
    }
    
    public int SacarDulceAzul() {//Se crea la funcion SacarDulceAzul
	Azules--;//Azules decrementa 1
	Total--;//Total decrementa 1

	return 1;//Se regresa 1 por cada dulce que se saca
    }
    
    public int SacarDulceRojo() {//Se crea la funcion SacarDulceRojo
	Rojos--;//Rojos decrementa 1
	Total--;//Total decrementa 1

	return 1;//Se regresa 1 por cada dulce que se saca
    }
    
    public int SacarDulceVerde() {//Se crea la funcion SacarDulceVerde
	Verdes--;//Verdes decrementa 1
	Total--;//Total decrementa 1

	return 1;//Se regresa 1 por cada dulce que se saca
    }
}
