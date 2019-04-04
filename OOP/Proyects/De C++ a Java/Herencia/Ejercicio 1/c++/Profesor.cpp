#include "Profesor.h" //incluimos nuestra clase profesor

Profesor::Persona(char name, char LastName, int age) //declaramos que la funcion persona pertenece a la clase profesor y le asignamos datos tipo char e int que almacenaran nombre,apellido y la edad
{
	typedef(name, LastName, age);//utilizamos la palabra reservada typedef para asignar nombres alternativos
	IdProfesor = "Unknown";//la variable id profesor es igual a desconocido
}


public void setIdProfesor(char IdProfesor){ //utilizamos el modificador de acceso publico para que cualquier clase o metodo puedan tener acceso a cambiar los datos del id del profesor
	this->IdProfesor = IdProfesor;//utilizamos el puntero this para recuperar el idprofesor del objeto oculto por la variable idprofesor
}

public char getIdProfesor(){//utilizamos el modificador de acceso publico y utilizamops un dato de tipo char para obtener el idprofesor
	return IdProfesor;//nos muestra el id del profesor
}

public void Show(){//declaramos el acceso publico para que cualquiera pueda ver la informacion almacenada
	printf("Teacher: ",getName(), " ", getLastName(), " with Id: ", getIdProfesor()); //imprime el nombre,apellido y el id del profesor
}
