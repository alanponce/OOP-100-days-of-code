#ifndef NODO_H
#define NODO_H

template <class T> class Node
{
	private:
		T data;
		Node* next;
	
	public:
		Node (T d);
		Node (T d, Node* n);
		
		T getData();
		//void setData(T data);
		
		Node* getNext();
		void setNext(Node* n);
		
	protected:
};

#endif
