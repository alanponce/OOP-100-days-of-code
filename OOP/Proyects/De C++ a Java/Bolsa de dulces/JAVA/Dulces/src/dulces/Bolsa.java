
package dulces;

public class Bolsa {
    private int Azules;
    private int Rojos;
    private int Verdes;

    private int Total;

    private int MeterDulceAzul;
    private int MeterDulceRojo;
    private int MeterDulceVerde;
	
    private int SacarDulceAzul;
    private int SacarDulceRojo;
    private int SacarDulceVerde;
    
    public Bolsa(){
        Rojos = 0;
	Azules = 0;
	Verdes = 0;
        Total = 0;
    }

    int MeterDulceAzul(){
        Azules++;
        Total++;
        
        return 1;
    }
    
    int MeterDulceRojo(){
	Rojos++;
	Total++;

	return 1;
    }
    
    int MeterDulceVerde(){
	Verdes++;
	Total++;

	return 1;
    }
    
    
    
    public int MeterDulce(int color){
        if (color == 1)
	return MeterDulceAzul();

	if (color == 2)
	return MeterDulceRojo();

	if (color == 3)
	return MeterDulceVerde();

	return 0;
    }
	
    int SacarDulceAzul() {
	Azules--;
	Total--;

	return 1;
    }
    
    int SacarDulceRojo() {
	Rojos--;
	Total--;

	return 1;
    }
    
    int SacarDulceVerde() {
	Verdes--;
	Total--;

	return 1;
    }
    
    int SacarDulce(int color){
	if (color == 1)
		return SacarDulceAzul();

	if (color == 2)
		return SacarDulceRojo();

	if (color == 3)
		return SacarDulceVerde();

	return 0;
    }

    void Imprimir(){
        System.out.print("\nTotal Azules: "+Azules);
        System.out.print("\nTotal Rojos: "+Rojos);
        System.out.print("\nTotal Verdes: "+Verdes);
        System.out.print("\nTotal De Dulces: "+Total);
        System.out.print("\n");
    }
    
    
}
 
    

