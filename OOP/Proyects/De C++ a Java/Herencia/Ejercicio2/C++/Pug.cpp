#include "Pug.h"//Se incluye la clase Pug

Perros::Pug(char, int , float)//Constructor que recibe parametros de tipo char, int y float
{
	typedef(name, age, weiht);
	nameOwner = "Unknow";
}

void Pug::setNameOwner(){//Funcion setNameOwner de tipo void
	this->nameOwner = nameOwner;//this llama la funcion privada nameOwner 
}

char Pug::getNameOwner(){//Funcion getNameOwner de tipo char
	return nameOwner;//Retorna la variable nameOwner
}

void print(){//funcion print de tipo void
	printf("Dog's name: ", getName(), " with weight ", getWeight(),", Owner's name: ", getNameOwner());//Muestra las funciones
}
