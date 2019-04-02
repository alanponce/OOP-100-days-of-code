#include "Persona.h"

Persona::Persona(char name, char LastName, int age)
{
	this->name = name;
	this->LastName = LastName;
	this->age = age;
}

char Persona::getName(){
	return name;	
}

char Persona::getLastName(){
	return LastName;
} 

int Persona::getAge(){
	return age;
} 


