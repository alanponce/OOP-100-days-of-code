#ifndef PERSONA_H
#define PERSONA_H

class Persona
{
	private:
		char name;
		char LastName;
		int age;
	public:
		Persona(char, char, int);
		char getName();
		char getLastName();
		int getAge();
	protected:
};

#endif
