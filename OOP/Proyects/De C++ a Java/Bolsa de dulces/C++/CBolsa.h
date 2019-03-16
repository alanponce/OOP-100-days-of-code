#ifndef CBOLSA_H //Sirve para que no se procese dos veces la clase, solo se incluye si no se incluyo antes
#define CBOLSA_H

class CBolsa	//Se declara la clase llamada CBolsa
{	
	private: 	//funciones que solo pueden ser accesados por miembros de la misma clase
		int azules;
		int rojos;
		int verdes;
		
		int total;
		
		int meterdulcerojo();	
		int meterdulceazul();
		int meterdulceverde();
		
		int sacardulcerojo();
		int sacardulceazul();
		int sacardulceverde();
	
	public:		//pueden ser accedidos de cualquier parte donde este declarado un objeto de la clase
		CBolsa();	//Constructor de la clase 
	
		
		int meterdulce(int color);		//Recibe un entero y permite acceder al dato privado color
		int sacardulce(int color);		//Recibe un entero y permite acceder al dato privado color
		
		void Imprimir();	//no recibe argumentos y se utilizara para mostrar por pantalla la información.
};

#endif //Define el fin de incluir la clase
