package Final_eg;

//if the reference variable of pareant class refers to the object of child class
class A
{
	void run()
	{
		System.out.println("Parent class");
	}
}

class B extends A
{
	void run()
	{
		System.out.println("Child class");
	}
}
public class Runtime_poly_upcasting
{
	public static void main(String args[])
	{
		A obj =new B();//upcasting
		obj.run();
	}
}
