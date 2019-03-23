#include "TDA_Stack.h"

#include <iostream>

template <class T> TDA_Stack<T>::TDA_Stack(){
	TOP=INITIAL_VALUE;
}

template <class T> bool TDA_Stack<T>::isEmpty(){
	return TOP==INITIAL_VALUE;
}

template <class T> bool TDA_Stack<T>::isFull(){
	return TOP==TAM-1;
}

template <class T> void TDA_Stack<T>::Empty(){
	TOP=INITIAL_VALUE;
}

template <class T> bool TDA_Stack<T>::Push(T elemento){
	if(isFull())
		return false;
		
	arrStack[TOP++]=elemento;
	
	return true;
}

template <class T> T TDA_Stack<T>::Pop(){
	if(isEmpty())
		throw "POP no realizado por pila vacia";
			
	T aux;
	aux=arrStack[--TOP];
		
	return aux;
}
	
template <class T> T TDA_Stack<T>::Top(){
	if(isEmpty())
		throw"TOP no realizado por pila vacia";
		
	return arrStack[TOP-1];
}
	
template <class T> void TDA_Stack<T>::Print(){
	std::cout<<"[";
	
	for(int i=0;i<TOP;i++)
		std::cout <<arrStack[i]<<", ";
		
	std::cout <<"]"<<std::endl;
}

template class TDA_Stack<float>;
template class TDA_Stack<int>;
template class TDA_Stack<char>;


