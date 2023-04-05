package Inheritance;

class A
{
	void show()
	{
		System.out.println("This is class A");
		
	}
}

class B extends A
{
	void print()
	{
		System.out.println("This is class B");
		
	}
}

class c extends B
{
	void declare()
	{
		System.out.println("This is class c");
		
	}
}


public class Multilevel3 
{
	public static void main(String args[])
	{
		c c1=new c();
		c1.show();
		c1.print();
		c1.declare();
		
	}

}
