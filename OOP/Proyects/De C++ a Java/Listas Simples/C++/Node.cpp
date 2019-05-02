#include "Node.h"

template <class T> Node <T> :: Node (T d)
{
	data = d;
	next = 0;
}

template <class T> Node <T> :: Node (T d, Node* n)
{
	data = d;
	next = n;
}

template <class T> T Node <T> :: getData ()
{
	return data;
}

template <class T> Node <T>* Node <T> :: getNext ()
{
	return next;
}

template <class T> void Node<T> :: setNext (Node* n)
{
	next = n;
}

template class Node <int>;
template class Node <char>;
template class Node <float>;
