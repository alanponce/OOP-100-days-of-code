/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author ENEMY345
 */
public class Asignar {
    
    private int slotAsign,slotRem;//Se declaran 2 variables de tipo entero privadas
    
    
    public int getSlotRem() {//Se genera un getter para poder obtener el valor de la variable encapsulada
        return slotRem;//Nos regresa el valor de la variable
    }
    
    public void genslot(int cajNorm, int[] saveSlot, int matricula)//Creamos un metodo que nos genera el slot que ocupara la persona
    {
        for(int i = 0; i < cajNorm; i++)//Se crea un bucle para poder saber si hay un espacio disponible
        {
            if(saveSlot[i] == 0)//Se crea una condicional para saber si se encontro un espacio vacio en el estacionamiento
            {
                saveSlot[i] = matricula;//Se graba la matricula en el slot que le toco a la persona
                slotAsign = i;//le asignamos un valor a asign para decirle a la persona que lugar le toco
                
                System.out.println("Su slot es: " + slotAsign);//le decimos a la persona que lugar le toco
                break;//Detenemos el Bucle cuando se cumple la condicion
            }
            
        }
    }
    
    public void remSlot(int cajNorm, int[] saveSlot, int matricula)//Creamos un metodo que nos removera los slot ocupados que ya no van a ser utilizados
    {
        for(int i = 0; i < cajNorm; i++)//Se crea un bucle que verifica si la matricula se encuentra en el estacionamiento para depues removerla
        {
            if(saveSlot[i] == matricula)//En esta condicional buscamos saber si en el array se encuentra la matricula
            {
                saveSlot[i] = 0;//si encuentra la matricula simplemente sustituimos la matricula por 0
                slotRem = i;//imprimimos el lugar que ya no esta ocupado
                
                System.out.println("Slot removido: " + i);//indicamos que slot se removio
                break;//detenemos el bucle
            }
            
            slotRem = 101;//con esto sabemos si se removio una matricula del estacionamiento
            
        }
    }
    
}
