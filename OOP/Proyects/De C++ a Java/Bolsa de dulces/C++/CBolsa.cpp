#include "CBolsa.h"
#include <iostream>

CBolsa::CBolsa()
{
	rojos=0;
	azules=0;
	verdes=0;
	
	total=0;
}

int CBolsa::meterdulcerojo()
{
	rojos++;
	total++;
	
	return 1;	
}
int CBolsa::meterdulceazul()
{
	azules++;
	total++;
	
	return 1;	
}

int CBolsa::meterdulceverde()
{
	verdes++;
	total++;
	
	return 1;
}

int CBolsa::meterdulce(int color)
{
	if (color==1)
		return meterdulcerojo();
		
	if (color==2)
		return meterdulceazul();
		
	if (color==3)
		return meterdulceverde();
		
	return 0;
}

int CBolsa::sacardulcerojo()
{
	rojos--;
	total--;
	
	return 1;	
}
int CBolsa::sacardulceazul()
{
	azules--;
	total--;
	
	return 1;	
}

int CBolsa::sacardulceverde()
{
	verdes--;
	total--;
	
	return 1;
}

int CBolsa::sacardulce(int color)
{
	if (color==1)
		return sacardulcerojo();
		
	if (color==2)
		return sacardulceazul();
		
	if (color==3)
		return sacardulceverde();
		
	return 0;
}

void CBolsa::Imprimir()
{
	std::cout<<azules<<std::endl;
	std::cout<<rojos<<std::endl;
	std::cout<<verdes<<std::endl;
	std::cout<<total;
}
