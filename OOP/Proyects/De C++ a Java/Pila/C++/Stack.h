#ifndef STACK_H
#define STACK_H

typedef int TipoDeDato;
const int TAM = 50;

class Stack
{
	private: 
		int TOP; 
		TipoDeDato arrStack[TAM]; 
		
  public: 
		Stack ();
		bool Push(TipoDeDato elemento); 
		TipoDeDato Pop(); 
		void Empty(); 
		TipoDeDato Top();
		bool isEmpty(); 
		bool isFull(); 
};

#endif
