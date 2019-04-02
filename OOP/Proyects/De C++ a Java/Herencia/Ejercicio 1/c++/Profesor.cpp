#include "Profesor.h"

Profesor::Persona(char name, char LastName, int age)
{
	typedef(name, LastName, age);
	IdProfesor = "Unknown";
}


public void setIdProfesor(char IdProfesor){
	this->IdProfesor = IdProfesor;
}

public char getIdProfesor(){
	return IdProfesor;
}

public void Show(){
	printf("Teacher: ",getName(), " ", getLastName(), " with Id: ", getIdProfesor());
}
