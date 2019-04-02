#ifndef PUG_H
#define PUG_H
#include "Perros.h"

class Pug : public Perros
{
	private:
		char nameOwner;
	public:
		Pug();
		void setNameOwner();
		char getNameOwner();
		void print();
	protected:
};

#endif
