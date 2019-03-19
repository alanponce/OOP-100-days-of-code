package conjunto;


public class Crear_Conjunto {
    private int[] conjunto = new int[50];
    private int tam;
    
    public Crear_Conjunto(){
        tam=0;
    }
    
    public void Vaciar(){
        tam = 0;
    } 
    
    public boolean Pertenece(int x){
        for(int i=0;i<tam;i++){
            if(conjunto[i] == x )
                return true;
        }
    return false;
    }
    
    public void Insertar(int x){
        if(!Pertenece(x)){
            conjunto[tam]=x;
            tam++;
        }else{
            System.out.print("No se pudo insertar "+x+" ya que ya existe en el conjunto. ");
            
        }
     } 
    
   public void Eliminar(int x){
       boolean band = false;
            
       for(int i=0; i<tam; i++){
         band=true;  
         conjunto[i] = conjunto[tam-1];
         tam--;
       }
   } 
    
   boolean esVacio(){
        return tam == 0;
   
   }
   
   public int tamaño(){
       return tam;
   } 
   
   public int Mostrar(int posicion){
       if(posicion<0 || posicion>=tam){
           System.out.print("Posiicon "+posicion+" Invalida!!!!\n");
           return -1;
       }
       return conjunto[posicion];
   }
  
   public void imprimir(){
       int x;
       System.out.print("[ ");
        for(int i = 0; i<tam; i++){
            x = conjunto[i];
            System.out.print(x+", ");
        }
        System.out.print("]");
   } 
   
   
}