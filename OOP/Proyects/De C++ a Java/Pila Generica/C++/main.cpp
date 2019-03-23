#include <iostream>
#include "TDA_Stack.h"

using namespace std;

int main(int argc, char** argv) {
	
	TDA_Stack <int>s;
	
	cout<<"Pila de enteros: "<<endl;
	s.Push(1);
	s.Push(2);
	s.Push(3);
	s.Print();
	
	
	cout<<"Pila de floatantes: "<<endl;
	TDA_Stack <float> f;
	f.Push(2.5);
	f.Push(3.23);
	f.Print();
	
	try{
		cout << "POP: "<< f.Pop()<<endl;
		cout << "POP: "<< f.Pop()<<endl;
		cout << "POP: "<< f.Pop()<<endl;
		
		cout << "TOP: "<< f.Top()<<endl;
	}
	
	catch(const char* e){
		cout << e << endl;
	}
	
	cout<<"Pila de caracteres: "<<endl;
	TDA_Stack<char> c;
	c.Push('A');
	c.Push('B');
	c.Print();
	
	return 0;
}
