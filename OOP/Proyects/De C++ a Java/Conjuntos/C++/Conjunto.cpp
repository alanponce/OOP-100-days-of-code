#include "Conjunto.h"//incluimos la clase conjunto
#include <iostream>//incluimos la biblioteca standard iostream
using namespace std;

Conjunto::Conjunto() //funcion del constructor
{
	tam=0;//el tamano se inicializa en cero
}

void Conjunto::Vaciar(){ //funcion vaciar
	tam=0; //tamano se inicializa en cero		
}

bool Conjunto::Pertenece(int x){ // este metodo inidica si el elemento x pertenece al conunto o no
	for(int i=0;i<tam;i++) //creamos ciclo for
		if(conjunto[i]==x) //definimos que entra al ciclo	
			return true; //si entra al ciclo regresa verdadero			
			
	return false; //si no entra al ciclo regresa falso
}

void Conjunto::Insertar(int x){ // este metodo inserta el elemento x en el conjunto 
	if(!Pertenece(x)){ 
		conjunto[tam]=x;
		tam++; //existe un incremento en el tamano
	}else
		cout<<"No se pudo insertar "<< x <<" ya que ya existe en el conjunto "<<endl;// si el elemento ya pertenece a nuestro conunto ya no lo inserta	
}

bool Conjunto::esVacio(){ //este metodo indica que el conjunto es vacio
	if(tam==0) //si el tamano es igual a cero
		return true;//si el tamano es igual a cero regresa verdadero
	else
		return false;//si el tamano es diferente de cero nos regresa un falso
}

int Conjunto::tamano(){ //funcion del tamano del conunto
	return tam; //retorna el tamano
}

int Conjunto::Mostrar(int posicion){ //funcion de mostrar la posicion del copnunto
	if(posicion<0 || posicion>=tam){ //si la posicion es mayor a cero o la posicion es mayor o igual al tamano
		cout<<"posicion "<< posicion <<" invalida!!!"<<endl<<endl;// 
		return -1; //si la posicion es invalida regresa -1
	}
	return conjunto[posicion];//si la posicion es valida regresa la posicion del conjunto
}

void Conjunto::imprimir(){ //funcion para imprimir
int x;
 cout<<"[ ";
	for(int i=0;i<tam;i++){ //creamos un ciclo for 
 		x=conjunto[i];
		cout<< x <<",";	 
	}
	cout<<"]";
}
