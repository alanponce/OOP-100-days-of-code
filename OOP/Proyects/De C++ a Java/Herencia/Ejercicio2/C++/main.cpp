#include <iostream>//Se incluye la libreria para operaciones de entrada y salida
#include "Perros.h"//Se incluye la clase Perros
#include "Pug.h"//se incluye la clase Pug

int main(int argc, char** argv) {
	Pug Dog ("Dixie", 7, 10.35);//Se crea el objeto Dog y se le asignan los valores
	
	Dog.setNameOwner("Diego Almanza");//Se ingresa el nombre del dueño con la funcion setNameOwner
	
	Dog.print();//Se imprime la informacion con la funcion print
	
	return 0;
}
