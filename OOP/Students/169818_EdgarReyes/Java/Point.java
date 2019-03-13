//Nombre: Edgar Omar Reyes Olivas	Fecha: 03/12/2019	Hora:11:25


public class Point{ //Declaration of the class named Point. It is public so other classes can access it.
	
	private int x;	//Declaration of the field x. It is private so other classes can no access it.
	private int y;	//Declaration of the field y. It is private so other classes can no access it.
	
	public void Circle(){	//Declaration of a constructor for the class. The constructor has no parameters.
		x = 0;				//The variable x will get the value of 0 if this constructor is called when instantiating the class.
		y = 0;				//The variable y will get the value of 0 if this constructor is called when instantiating the class.
	}	

	public void Circle(int posX, int posY){		//Declaration of a constuctor for the class. The constructor has two parameters.
												//When a class is instantiated, if there is two int arguments in the constructor 
												//this constructor will be called.
		x = posX;								//The value of posX will be assigned to the variable x.
		y = posY;								//The value of posY will be assigned to the variable y.
	}
	
	public void printCoordinates(){				//Declaration of a method called printCoordinates which prints the coordinates of the point.
												//It is public so other classes can access it. It is void because it does not return any type of value.
		System.out.println("Coordinates for X: " + x + " Coordinates for Y: " + y);	//Prints the coordinates.
	}	
	
	public void setX(int posX){
		x = posX;
	}
	
	public int getX(){
		return x;
	}
	
	public void setY(int posY){
		x = posY;
	}
	
	public int getY(){
		return y;
	}
}