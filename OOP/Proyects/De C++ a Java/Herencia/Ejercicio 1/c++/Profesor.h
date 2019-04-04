#ifndef PROFESOR_H //definimos nuestra clase profesor
#define PROFESOR_H //definimos profesor como macro
#include "Persona.h" //incluimos nuestra clase persona

class Profesor : public Persona //definimos nuestra clase profesor usando el modificador de acceso publico
{
	private: //utilizamos el modificador de acceso privado
		char IdProfesor;
	public: //utilizamos el modificador de acceso publico
		Profesor(char, char, int);
		void setIdProfesor(char IdProfesor);
		char getIdProfesor();
		void show();
	protected: //utilizamos el modificador de acceso protected
};

#endif
