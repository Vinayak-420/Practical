package Com.cognizant.shapes;

import java.util.Scanner;

public class Circle 
{
	float radius;
	static float pi=3.5f;
	public Circle() //Default constructor
	{
		radius=1.5f;
	}
	public Circle(float radius)//constructor 2
	{
	this.radius=radius;	
	}
	public Circle(float radius,float pi)//constructor 3
	{
		this.radius=radius;
	}
	static float calculateCircleArea(float radius)
	{
		return pi*radius*radius;
	}
	static float calculateCircumference(float radius)
	{
		return 2*pi*radius;
	}
	public static void main(String args[])
	{
		Circle obj=new Circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		float radius = sc.nextFloat();
		System.out.println("The area is:="+calculateCircleArea(radius));
		System.out.println("The Circumference is:="+calculateCircumference(radius));
		
	}
}
