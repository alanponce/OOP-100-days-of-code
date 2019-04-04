#ifndef PERROS_H
#define PERROS_H

class Perros//Se declara la clase Perros
{
	private:
		char name;//Se declara la variable privada name de tipo char 
		int age;//Se declara la variable privada age de tipo int
		float weight;//Se declara la variable privada weight de tipo float
	public:
		Perros(char, int, float);//Constructor que recibe parametros de tipo char, int y float
		char getName();//Se declara la funcion getName de tipo char
		int getAge();//Se declara la funcion getAge de tipo int
		float getWeight();//Se declara la funcion getWeight de tipo float
	protected:
};

#endif
