#include <iostream>
#include "Stack.h"

using namespace std;

int main(int argc, char** argv) {
	
	Stack p;
	
	p.isEmpty();
	p.isFull();
	
	p.Push(1);
	p.Push(2);
	p.Push(3);
	
	cout<<"Datos que se sacaron de la pila\n";
	
	cout<<p.Pop()<<endl;
	cout<<p.Pop()<<endl;
	
	cout<<"\nUltimo dato en la pila: ";
	cout<<p.Top();
	
	
	return 0;
}
