#ifndef DULCES_H	//Sirve para que no se procese dos veces la clase, solo se incluye si no se incluyo antes
#define DULCES_H

class dulces	//Se declara la clase llamada dulces
{
	
	private:	//funciones que solo pueden ser accesados por miembros de la misma clase
		int azules;		//Se declara dato privado
		int rojos;		//Se declara dato privado
		int verdes;		//Se declara dato privado
		
		int total;		//Se declara dato privado
		
	public:		//pueden ser accedidos de cualquier parte donde este declarado un objeto de la clase
		
		dulces();	//Constructor de la clase
		
		int meterdulcerojo();	//Funcion que devuelve un valor entero
		int meterdulceazul();	//Funcion que devuelve un valor entero
		int meterdulceverde();	//Funcion que devuelve un valor entero
		
		int sacardulcerojo();	//Funcion que devuelve un valor entero
		int sacardulceazul();	//Funcion que devuelve un valor entero
		int sacardulceverde();	//Funcion que devuelve un valor entero
		
		friend class CBolsa;	//Le da acceso a CBolsa a los datos privados 
};

#endif
