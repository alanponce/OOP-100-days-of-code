#include <iostream> //incluimos nuesra biblioteca iostream
#include "Profesor.h"//incluimos la clase Profesor
#include "Persona.h"//incluimos la clase Persona

int main(int argc, char** argv) {//Metodo estatico de tipo void con modificador de acceso publico con parametros de aareglo vacio de tipo String
	Profesor p("Juan", "Hernandez", 33); //Se crea un objeto profesor1 de la clase Profesor y se le asignan valores
	
	p.setIdProfesor("prof 22-387-11");//ingresa el id del profesor y se almacena en IdProfesor
	p.show(); //Se llama al metodo show de la clase profesor
	
	return 0;
}
