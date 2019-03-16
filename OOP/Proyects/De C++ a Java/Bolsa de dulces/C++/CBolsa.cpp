#include "CBolsa.h"		//se incluye la clase CBolsa
#include <iostream>		//libreria que es utilizada para las operaciones de entrada y salida "cin" y "cout"

CBolsa::CBolsa()	//funcion del constructor
{
	rojos=0;	//rojos se inicializa en cero
	azules=0;	//azules se inicializa en cero
	verdes=0;	//verdes se inicializa en cero
	
	total=0;	//total se inicializa en cero
}

int CBolsa::meterdulcerojo()	//funcion de meter dulce rojo
{
	rojos++;	//Se incrementa 1 al valor de rojos
	total++;	//Se inclementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce rojo que entra
}
int CBolsa::meterdulceazul()	//funcion de meter dulce azul
{
	azules++;	//Se incrementa 1 al valor de azules
	total++;	//Se inclementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce rojo que entra
}

int CBolsa::meterdulceverde()	//funcion de meter dulce verde
{
	verdes++;	//Se incrementa 1 al valor de verdes
	total++;	//Se inclementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce rojo que entra
}

int CBolsa::meterdulce(int color)	//funcion de meter dulce
{
	if (color==1)	//Si color es 1, que equivale a rojo, entra al ciclo
		return meterdulcerojo();	//Entra a la funcion meterdulcerojo
		
	if (color==2)	//Si color es 2, que equivale a azul, entra al ciclo
		return meterdulceazul();	//Entra a la funcion meterdulceazul	
		
	if (color==3)	//Si color es 3, que equivale a verde, entra al ciclo
		return meterdulceverde();	//Entra a la funcion meterdulceverde
		
	return 0;	//Si no entra a ningun ciclo regresa un 0
}

int CBolsa::sacardulcerojo()	//funcion de sacar dulce rojo
{
	rojos--;	//Se decrementa 1 al valor de rojos
	total--;	//Se decrementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce rojo que sale
}
int CBolsa::sacardulceazul()	//funcion de sacar dulce azul	
{
	azules--;	//Se decrementa 1 al valor de azules
	total--;	//Se decrementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce azul que sale
}

int CBolsa::sacardulceverde()	//funcion de sacar dulce verde
{
	verdes--;	//Se decrementa 1 al valor de verdes
	total--;	//Se decrementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce verde que sale
}

int CBolsa::sacardulce(int color)	//funcion de sacar dulce
{
	if (color==1)	//Si color es 1, que equivale a rojo, entra al ciclo
		return sacardulcerojo();	//Entra a la funcion sacardulcerojo
		
	if (color==2)	//Si color es 2, que equivale a azul, entra al ciclo
		return sacardulceazul();	//Entra a la funcion sacardulceazul
		
	if (color==3)	//Si color es 3, que equivale a verde, entra al ciclo
		return sacardulceverde();	//Entra a la funcion sacardulceverde
		
	return 0;	//Si no entra a ningun ciclo regresa un 0
}

void CBolsa::Imprimir()		//funcion de imprimir
{
	std::cout<<azules<<std::endl;	//imprime el contador de azules
	std::cout<<rojos<<std::endl;	//imprime el contador de rojos
	std::cout<<verdes<<std::endl;	//imprime el contador de verdes
	std::cout<<total;	//imprime el contador de total
}
