#include "Perros.h"

Perros::Perros(char name, int age, float weight)
{
	this->name = name;
	this->age = age;
	this->weight = weight;
}

char Perros::getName(){
	return name;
}

int Perros::getAge(){
	return age;
}

float Perros::getWeight(){
	return weight;
}
