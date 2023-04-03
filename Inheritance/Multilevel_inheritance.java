package Inheritance;

public class Multilevel_inheritance 
{
	public static void main(String args[])
	{
		SIChild2 child=new SIChild2();
		child.display();
		child.show();
		child.print();
	}
}

class SIParent1
{
	void show()
	{
		System.out.println("Show the details of parent class");
	}
}

class SIChild1 extends SIParent1
{
	void display()
	{
		System.out.println("Display the result of child class");
	}
}

class SIChild2 extends SIChild1
{
		void print()
		{
			System.out.println("Print the output of child class 2");
		}
}