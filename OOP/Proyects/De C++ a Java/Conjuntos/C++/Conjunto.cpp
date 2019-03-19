#include "Conjunto.h"
#include <iostream>
using namespace std;

Conjunto::Conjunto()
{
	tam=0;
}

void Conjunto::Vaciar(){
	tam=0;		
}
	


bool Conjunto::Pertenece(int x){
	for(int i=0;i<tam;i++)
		if(conjunto[i]==x)		
			return true;			
			
	return false;
}

void Conjunto::Insertar(int x){
	if(!Pertenece(x)){
		conjunto[tam]=x;
		tam++;
	}else
		cout<<"No se pudo insertar "<< x <<" ya que ya existe en el conjunto "<<endl;		
}


void Conjunto::Eliminar(int x){
	bool y=false;
	
	for(int i=0;i<tam;i++)
		if(conjunto[i]==x){	
			y=true;
			conjunto[i]=conjunto[tam-1];
			tam--;
		}	
}

bool Conjunto::esVacio(){
	if(tam==0)
		return true;
	else
		return false;
}



int Conjunto::tamano(){
	return tam;	
}

int Conjunto::Mostrar(int posicion){
	if(posicion<0 || posicion>=tam){
		cout<<"posicion "<< posicion <<" invalida!!!"<<endl<<endl;
		return -1;
	}
	return conjunto[posicion];
}

void Conjunto::imprimir(){
int x;
 cout<<"[ ";
	for(int i=0;i<tam;i++){
 		x=conjunto[i];
		cout<< x <<",";	 
	}
	cout<<"]";
}
