package Inheritance;
//Multiple inheritance is not supported through java class
public class Multiple_eg
{
public static void main(String args[])
{
	Child   c=new Child();
	c.run();
}
}

class Parent1
{
	void run()
	{
		System.out.println("Paren1 run method");
	}
}

class Parent2
{
	void run()
	{
		System.out.println("Parent2 run method");
	}
}

interface Child implements Parent1,Parent2{}