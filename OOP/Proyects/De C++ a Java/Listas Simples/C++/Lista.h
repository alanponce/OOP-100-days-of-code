#ifndef LISTA_H
#define LISTA_H
#include "Node.h"

template <class T> class Lista
{
	private:
		Node<T> *head;
	
	public:
		Lista();
		~Lista();
		void InsertFirst(T data);
		void InsertLast(T data);
		void InsertAfter(Node<T>* previous, T data);
		
		Node<T>* getLast();
		Node<T>* search(T data);
		Node<T>* get(int position);
		
		void DeleteNode(T data);
		
		bool isEmpty();
		void deleteList();	//igual que el constructor
		
		void Print();
		
	protected:
};

#endif


