package Inheritance;

//Multilevel Inheritance Example 2
class Vehicle //Parent class
{
	void running()
	{
		System.out.println("RUnning mode on");
	}
}

class Car extends Vehicle //Child 1 class
{
	void run()
	{
		System.out.println("Car run mode on");
	}
}

class I10 extends Car //child 2 class
{
	void Speed()
	{
		System.out.println("Speed is very high");
	}
}
public class Multilevel2 //main class
{
public static void main(String args[])
{
	I10 d=new I10();
	d.running();
	d.run();
	d.Speed();
}
}
