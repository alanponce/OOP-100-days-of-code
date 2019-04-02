#include <iostream>
#include "Perros.h"
#include "Pug.h"

int main(int argc, char** argv) {
	Pug Dog ("Dixie", 7, 10.35);
	
	Dog.setNameOwner("Diego Almanza");
	
	Dog.print();
	
	return 0;
}
