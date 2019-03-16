#include "CBolsa.h"		//se incluye la clase CBolsa
#include <iostream>		//libreria que es utilizada para las operaciones de entrada y salida "cin" y "cout"
#include "dulces.h"		//se incluye la clase dulces

CBolsa::CBolsa(){
}

int CBolsa::meterdulce(int color)	//funcion de meter dulce
{
	if (color==1)	//Si color es 1, que equivale a rojo, entra al ciclo
		return d.meterdulcerojo();	//Entra a la funcion meterdulcerojo
		
	if (color==2)	//Si color es 2, que equivale a azul, entra al ciclo
		return d.meterdulceazul();	//Entra a la funcion meterdulceazul	
		
	if (color==3)	//Si color es 3, que equivale a verde, entra al ciclo
		return d.meterdulceverde();	//Entra a la funcion meterdulceverde
		
	return 0;	//Si no entra a ningun ciclo regresa un 0
}



int CBolsa::sacardulce(int color)	//funcion de sacar dulce
{
	if (color==1)	//Si color es 1, que equivale a rojo, entra al ciclo
		return d.sacardulcerojo();	//Entra a la funcion sacardulcerojo
		
	if (color==2)	//Si color es 2, que equivale a azul, entra al ciclo
		return d.sacardulceazul();	//Entra a la funcion sacardulceazul
		
	if (color==3)	//Si color es 3, que equivale a verde, entra al ciclo
		return d.sacardulceverde();	//Entra a la funcion sacardulceverde
		
	return 0;	//Si no entra a ningun ciclo regresa un 0
}

void CBolsa::Imprimir()		//funcion de imprimir
{
	std::cout<<"Azul: "<<d.azules<<std::endl;	//imprime el contador de azules
	std::cout<<"Rojo: "<<d.rojos<<std::endl;	//imprime el contador de rojos
	std::cout<<"Verde: "<<d.verdes<<std::endl;	//imprime el contador de verdes
	std::cout<<"Total: "<<d.total;	//imprime el contador de total
}
