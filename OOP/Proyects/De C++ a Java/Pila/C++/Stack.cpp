#include "Stack.h"
#include <iostream>

Stack::Stack()
{
	TOP=0;
}

bool Stack::isEmpty(){
	return(TOP==0);
}

bool Stack::Push(int elemento){
	if(isFull())
		return false;
	arrStack[TOP]=elemento;
	TOP++;
}

TipoDeDato Stack::Pop(){
	int x;
	
	if(isEmpty())
		return -1000000;
	
	TOP--;
	x=arrStack[TOP];
	return x;
}

TipoDeDato Stack::Top(){
	int x;
	
	if(isEmpty())
		return -1000000;
	
	x=arrStack[TOP-1];
	return x;
}

bool Stack::isFull(){
	return(TOP==TAM);
}
