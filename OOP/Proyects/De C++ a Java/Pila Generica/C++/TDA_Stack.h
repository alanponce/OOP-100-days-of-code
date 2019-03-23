#ifndef TDA_STACK_H
#define TDA_STACK_H

const int TAM=20;
const int INITIAL_VALUE=0;

template <class T> class TDA_Stack
{
	private:
		int TOP;
		T arrStack[TAM];
	
	public:
		TDA_Stack();
		
		bool Push(T elemento);
		T Pop();
		void Empty();
		T Top();
		bool isEmpty();
		bool isFull();
		
		void Print();
		
	protected:
};

#endif
