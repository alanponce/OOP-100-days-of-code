#include <iostream>
#include "Node.h"
#include "Lista.h"

using namespace std;

int main(int argc, char** argv) {
	Lista<int> x;

	x.InsertFirst(4);
	x.InsertFirst(3);
	x.InsertFirst(7);
	x.InsertFirst(9);
	
	
	x.DeleteNode(7);
	
	x.Print();
	
	x.isEmpty();
	//x.deleteList();
  	
	return 0;
}

