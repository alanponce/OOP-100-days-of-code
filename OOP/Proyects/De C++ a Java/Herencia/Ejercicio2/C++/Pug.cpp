#include "Pug.h"

Perros::Pug(char, int , float)
{
	typedef(name, age, weiht);
	nameOwner = "Unknow";
}

void Pug::setNameOwner(){
	this->nameOwner = nameOwner;
}

char Pug::getNameOwner(){
	return nameOwner;
}

void print(){
	printf("Dog's name: ", getName(), " with weight ", getWeight(),", Owner's name: ", getNameOwner());
}
