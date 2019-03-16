#include <iostream>		//libreria que es utilizada para las operaciones de entrada y salida "cin" y "cout"
#include "dulces.h"		//Se incluye la clase dulces

dulces::dulces()	//funcion del constructor
{
	rojos=0;	//rojos se inicializa en cero
	azules=0;	//azules se inicializa en cero
	verdes=0;	//verdes se inicializa en cero
	
	total=0;	//total se inicializa en cero
}

int dulces::meterdulcerojo()	//funcion de meter dulce rojo
{
	rojos++;	//Se incrementa 1 al valor de rojos
	total++;	//Se inclementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce rojo que entra
}

int dulces::meterdulceazul()	//funcion de meter dulce azul
{
	azules++;	//Se incrementa 1 al valor de azules
	total++;	//Se inclementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce azul que entra
}
int dulces::meterdulceverde()	//funcion de meter dulce verde
{
	verdes++;	//Se incrementa 1 al valor de verdes
	total++;	//Se inclementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce rojo que entra
}

int dulces::sacardulcerojo()	//funcion de sacar dulce rojo
{
	rojos--;	//Se decrementa 1 al valor de rojos
	total--;	//Se decrementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce rojo que sale
}

int dulces::sacardulceazul()	//funcion de sacar dulce azul	
{
	azules--;	//Se decrementa 1 al valor de azules
	total--;	//Se decrementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce azul que sale
}

int dulces::sacardulceverde()	//funcion de sacar dulce verde
{
	verdes--;	//Se decrementa 1 al valor de verdes
	total--;	//Se decrementa 1 al valor de total
	
	return 1;	//Se regresa un 1 por cada dulce verde que sale
}

