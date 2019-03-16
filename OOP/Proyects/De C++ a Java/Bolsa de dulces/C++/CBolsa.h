#ifndef CBOLSA_H //Sirve para que no se procese dos veces la clase, solo se incluye si no se incluyo antes
#define CBOLSA_H

class CBolsa	//Se declara la clase llamada CBolsa
{	
	private: 	//funciones que solo pueden ser accesados por miembros de la misma clase
		int azules;		//Se declara dato privado
		int rojos;		//Se declara dato privado
		int verdes;		//Se declara dato privado
		
		int total;		//Se declara dato privado
		
		int meterdulcerojo();		//Se declara dato privado
		int meterdulceazul();		//Se declara dato privado
		int meterdulceverde();		//Se declara dato privado
		
		int sacardulcerojo();		//Se declara dato privado
		int sacardulceazul();		//Se declara dato privado
		int sacardulceverde();		//Se declara dato privado
	
	public:		//pueden ser accedidos de cualquier parte donde este declarado un objeto de la clase
		CBolsa();	//Constructor de la clase 
	
		
		int meterdulce(int color);		//Recibe un entero y permite acceder al dato privado color
		int sacardulce(int color);		//Recibe un entero y permite acceder al dato privado color
		
		void Imprimir();	//no recibe argumentos y se utilizara para mostrar por pantalla la informaci�n.
};

#endif //Define el fin de incluir la clase
