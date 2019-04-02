#ifndef PROFESOR_H
#define PROFESOR_H
#include "Persona.h"

class Profesor : public Persona
{
	private: 
		char IdProfesor;
	public:
		Profesor(char, char, int);
		void setIdProfesor(char IdProfesor);
		char getIdProfesor();
		void show();
	protected:
};

#endif
