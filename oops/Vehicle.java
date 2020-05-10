package oops;
/* basic concepts like class,construcor with and without parameters,method creation...
main method is not included.
and main method is creaed in another class named Test.java
*/

public class Vehicle {
	int wheels;
	int capacity;
	String color;
	String model;
	
	public Vehicle(int wheels,int capacity,String color,String model) {
		
		this.wheels=wheels;
		this.capacity=capacity;
		this.color=color;
		this.model=model;
	}
	
	public Vehicle()
	{
		
	}
	
	public void drive()
	{
		System.out.println("no of wheels for vehicle: "+wheels);
		System.out.println("no of passengers in vehicle: "+capacity);
		
	}
	
	public void display()
	{
		System.out.println(" vehicle color: "+color);
		System.out.println(" vehicle model: "+model);
	}
	

}
