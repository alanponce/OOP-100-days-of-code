/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products_CRUD;

interface Inventario {
    //Se declaran todos los metodos de los productos
     void setPrecio(double a);
    double getPrecio();
    void setID(int a);
    int getID();
    String getNombre();
    int getStock();
}
