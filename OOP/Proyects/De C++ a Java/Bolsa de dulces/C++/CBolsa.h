#ifndef CBOLSA_H
#define CBOLSA_H

class CBolsa
{
	private:
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
	
	public:
		CBolsa();
	
		
		int meterdulce(int color);
		int sacardulce(int color);
		
		void Imprimir();
};

#endif
