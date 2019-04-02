#ifndef PERROS_H
#define PERROS_H

class Perros
{
	private:
		char name;
		int age;
		float weight;
	public:
		Perros(char, int, float);
		char getName();
		int getAge();
		float getWeight();
	protected:
};

#endif
