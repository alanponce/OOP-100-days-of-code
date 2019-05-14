/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicstore;


import javax.swing.JOptionPane;

/**
 *
 * @author 169868 169840
 */
public class ElectronicStore {

    
    
    public static void main(String[] args) {
        int option = 0;
        int optionProducts = 0;
        //-----------------------Diversos menu-----------------
        // Menú principal para el sistema ABC
        // Se dará la opción de elegir un numero para acceder a las funciones
        String menu="***** Electronic_ABC  *****\n";
        menu+="1.- Registrar producto\n";// menu = menu + "cadena";
        menu+="2.- Consultar producto\n";
        menu+="3.- Eliminar producto\n";
        menu+="4.- Modificar producto\n";
        menu+="5.- Salir\n";
        menu+="Elige una opción";
        
        // El siguiente menú es para los productos
        String productMenu ="** Qué tipo de producto es? ** \n";
        productMenu+="1. TV\n";
        productMenu+="2. Celular\n";
        productMenu+="3. Laptop\n";
        productMenu+="4. USB\n";
        productMenu+="5. Default\n";
        productMenu+="Elige una opción";
        //-------------------------------------------------------------------
        int indice = 0;
        //Creamos un array de objetos de la clase productos, en este caso almacenara solo 10
                    Products arrayProducts[]=new Products[10];
        do{
            option=Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (option) {
                //------------------- Crear Productos---------------------------------------------------
                case 1:{
                    
 
                    for (int i=indice;i<arrayProducts.length;i++){
                    //i = indice; // Evitar crear productos siempre en la posicion 0
                    
                    
                    //Indicamos cada uno de los parametros del objeto
                    String ID=JOptionPane.showInputDialog("Escribe el ID");
                    int id=Integer.parseInt(ID);
                    String name=JOptionPane.showInputDialog("Nombre del producto");

                    String texto=JOptionPane.showInputDialog("Cuantos productos son?");
                    int stock=Integer.parseInt(texto);

                    texto=JOptionPane.showInputDialog("Precio del producto individual");
                    float precio=Float.parseFloat(texto);

                    indice++;//Avanzar el arreglo para que no se repita
                    
                    //Se desplegará el menu de los productos para saber si el producto es de algun tipo
                    optionProducts=Integer.parseInt(JOptionPane.showInputDialog(productMenu));
                    //---------------- Estarán los diversos casos que pueden pasar -------------
                            switch(optionProducts){
                                case 1: // Caso de la TV
                                    texto=JOptionPane.showInputDialog("Tamaño de la pantalla");
                                         int screen=Integer.parseInt(texto);
                                    arrayProducts[i] = new TV(id, name, stock, precio,screen);
                                    break;
                                    
                                case 2: //Caso de Celular
                                    texto=JOptionPane.showInputDialog("Pixeles de la camara");
                                         int camera=Integer.parseInt(texto);
                                    arrayProducts[i] = new Phone(id, name, stock, precio,camera);
                                    break;
                                    
                                case 3: //Caso de Laptop
                                     texto=JOptionPane.showInputDialog("Memoria RAM");
                                         int memoryRAM=Integer.parseInt(texto);
                                     String processor=JOptionPane.showInputDialog("Nombre del procesador");    
                                    arrayProducts[i] = new Laptop(id, name, stock, precio,memoryRAM,processor);
                                    break;
                                    
                                case 4: //Caso USB
                                    texto=JOptionPane.showInputDialog("De cuanta memoria es?(en GigaBytes)");
                                         int storage=Integer.parseInt(texto);
                                    arrayProducts[i] = new USB(id, name, stock, precio,storage);
                                    break;
                                    
                                case 5: //Caso default
                                     arrayProducts[i]=new Products(id, name, stock, precio);
                                 break;
                            }
                            break; //break para evitar crear otro producto sin que el usuario elija
                    //--------------- Fin de diversos casos que pueden pasar                   
                     }
                break;// break para terminar el ciclo donde cada producto se va guardando en el arreglo
                }
                //---------------Fin de creacion de productos--------------------
                
                //------------- Inicio de la consulta de productos-----------
                case 2:{
                    if(indice > 0){ //comprobamos que existen productos
                        String displayProducts = "Estos son los productos diponibles\n";
                        for (int i = 0; i<10;i++) {
                            displayProducts += indice+".- " + arrayProducts[i].showAll()+"\n";                        
                        }
                    //JOptionPane.showMessageDialog(displayProducts);
                        System.out.println(displayProducts);
                        
                    }
                    else{ // En caso de que no existan productos
                        System.out.println("No exiten productos");
                    }
                    break;
                }
        
            }
        
        }while(option!=5);
        
    }
    
}
