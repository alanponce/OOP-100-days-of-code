#include "Perros.h"//Se incluye la clase perros

Perros::Perros(char name, int age, float weight)//Se crea el constructor y contiene como parametros las variables privadas de la clase 
{
	this->name = name;//Se utiliza this para acceder a la variable privada name
	this->age = age;//Se utiliza this para acceder a la variable privada age
	this->weight = weight;//Se utiliza this para acceder a la variable privada weight
}

char Perros::getName(){//Funcion getName de tipo char
	return name;//retorna la variable name
}

int Perros::getAge(){//funcion getAge de tipo entero
	return age;//retorna la variable age
}

float Perros::getWeight(){//funcion getWeight de tipo flotante
	return weight;//retorna la variable weight
}
