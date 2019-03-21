package dulces;

public class Bolsa {
    DulcesBolsa d = new DulcesBolsa();
    
    public Bolsa(){//Se crea el constructor 
    }
    
    public int MeterDulce(int color){//Se crea la funcion MeterDulce
        if (color == 1)//Si color es 1 (Azul), entra al ciclo.
	return d.MeterDulceAzul();//Entra la funcion MeterDulceAzul

	if (color == 2)//Si color es 2 (Rojo), entra al ciclo
	return d.MeterDulceRojo();//Entra la funcion MeterDulceRojo

	if (color == 3)//Si color es 3 (Verde), entra al ciclo 
	return d.MeterDulceVerde();//entra la funcion MeterDulceVerde

	return 0;//Si no entra a ningun ciclo se regresa un 0
    }
    
    int SacarDulce(int color){//Se crea la funcion SacarDulce
	if (color == 1)//Si color es 1 (Azul), entra al ciclo
		return d.SacarDulceAzul();//Entra la funcion SacarDulceAzul

	if (color == 2)//Si color es 2 (Rojo), entra al ciclo
		return d.SacarDulceRojo();//Entra la funcion SacarDulcerojo

	if (color == 3)//Si color es 3 (Verde), entra al ciclo
		return d.SacarDulceVerde();//Entra la funcion SacarDulceVerde

	return 0;//Si no entra a ningun ciclo regresa un 0
    }
    
    void Imprimir(){//Se crea la funcion Imprimir  
        System.out.print("\nTotal Azules: "+d.Azules);//Mostramos el total de azules
        System.out.print("\nTotal Rojos: "+d.Rojos);//Mostramos el total de Rojos
        System.out.print("\nTotal Verdes: "+d.Verdes);//Mostramos el total de Verdes
        System.out.print("\nTotal De Dulces: "+d.Total);//Mostramos el total
        System.out.print("\n");
    }
}
