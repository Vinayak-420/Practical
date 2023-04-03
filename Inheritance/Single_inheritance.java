package Inheritance;

public class Single_inheritance 
{
	public static void main(String args[])

	{
		SIChild si=new SIChild();
		si.display();
		si.show();
	}
}

class SIParent
{
	void show()
	{
		System.out.println("Show the details of parent class");
	}
}

class SIChild extends SIParent
{
	void display()
	{
		System.out.println("Display the result of child class");
	}
}