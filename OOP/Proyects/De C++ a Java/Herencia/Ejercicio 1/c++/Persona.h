#ifndef PERSONA_H //definimos nuestra clase persona
#define PERSONA_H //definimos persona como macro

class Persona //creamos nuestra clase persona
{
	private://utilizamos el modificador de acceso privado
		char name;//declaramos un dato de tipo char y lo llamamos name aqui se almacenara el nombre
		char LastName;//declaramos un dato de tipo char y lo llamamos last name aqui se almacenara el apellido
		int age;//definimos un dato de tipo entero donde se almacenara la edad
	public://utilizamos el modificador de acceso publico
		Persona(char, char, int);
		char getName();//declaramos un dato de tipo char que obtendra el nombre
		char getLastName();//declaramos un dato de tipo char que obtendra el apellido
		int getAge();//declaramos un dato de tipo entero que obtendra la edad
	protected://utilizamos el modificador de acceso protected
};

#endif
