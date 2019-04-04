#include "Persona.h" //incluimos la clase persona

Persona::Persona(char name, char LastName, int age) //declaramos que la funcion persona pertenece a la clase persona y se le asignan valores de tipo char e int que almacenan nombre,apellido y edad
{
	this->name = name;//declaramos un puntero this para recuperar name del objeto oculto por nuestra variable name
	this->LastName = LastName;//declaramos un puntero this para recuperar lastname del objeto oculto por nuestra variable lastname
	this->age = age;//declaramos un puntero this para recuperar age del objeto oculto por nuestra variable age
}

char Persona::getName(){ //declaramos que la funcion getname pertenece a la clase persona y es de tipo char
	return name; //regresa el nombre
}

char Persona::getLastName(){ //declaramos que la funcion getlastname pertenece a la clase persona y es de tipo char
	return LastName;//regresa el apellido
} 

int Persona::getAge(){ //declaramos que la funcion getage pertenece a la clase persona y es de tipo entero
	return age;//nos regresa la edad
} 


