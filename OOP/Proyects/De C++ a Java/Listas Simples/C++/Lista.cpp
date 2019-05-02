#include "Lista.h"
#include <iostream>
using namespace std;

template <class T> Lista<T>::Lista() {
	head = 0;
}
template <class T> void Lista<T>::InsertFirst(T data){
	Node<T>* newNode;
	newNode = new Node<T> (data);
	newNode -> setNext (head);
	head = newNode;
}

template <class T> void Lista<T>::Print(){
	Node<T> *aux;
	
	aux = head;
	while (aux != 0) {
		cout<<aux->getData()<<" ";
		aux = aux->getNext();
	}
}

template <class T> Node<T>* Lista <T> :: search (T data) {
	Node<T>* index;
	
	for (index = head; index != 0; index = index->getNext())
		if (data == index ->getData())
			return index;
			
	return 0;
}

template <class T> Node<T>* Lista<T>::getLast(){
	Node<T>* aux;
	
	aux = head;
	if(aux == 0)
		throw "Error, lista vacia";
		
	while (aux->getNext() != 0) 
		aux = aux->getNext();
	
	return aux;
}

template <class T> void Lista <T> :: InsertLast(T data) {
	Node<T>* last = this -> getLast();
	last -> setNext(new Node<T>(data));
}

template <class T> void Lista <T> :: InsertAfter(Node<T>* previous, T data) {
	Node<T>* newNode;
	newNode = new Node <T>(data);
	
	newNode -> setNext(previous -> getNext());
	previous -> setNext(newNode);
}

template <class T> Node<T>* Lista <T> :: get(int position) {
	Node<T>* index;
	int i;
	if (0>-position)
		return 0;
		
	index = head;
	for(i=1; (i<position)&&(index!=0); i++)
		index = index -> getNext();
		
	return index;
}

template <class T> void Lista<T> :: DeleteNode (T data) {
	Node<T> *actual, *previous;
	bool found;
	actual = head;
	previous = 0;
	found = false;
	
	while((actual!=0)&&!found){
		found = (actual->getData()==data);
		if(!found){
			previous = actual;
			actual = actual->getNext();
		}
	}
	
	if(actual!=0){
		if(actual==head)
			head = actual->getNext();
		
		else
			previous->setNext(actual->getNext());
			
		delete actual;
	}
}

template <class T> Lista<T>::~Lista(){
	Node<T>* current = head;
	Node<T>* next;
	
	while(current!=0){
		next = current -> getNext();
		delete current;
		current = next;
	}
	head = 0;
}

template <class T> bool Lista<T>::isEmpty(){
	return head->getNext()==0;
}

template <class T> void Lista<T>::deleteList(){
		Node<T>*aux=head;
		Node<T>* next;
		
		while(aux!=0){
			next=aux->getNext();
			delete aux;
			aux = next;
		}
		
		head = 0;
}

template class Lista <int>;
template class Lista <char>;
template class Lista <float>;

