package Inheritance;

//Hierarchical Inheritance

class Operating_system
{
	void Boost()
	{
		System.out.println("Booting the os");
	}
}

class Windows extends Operating_system
{
	void run()
	{
		System.out.println("Installling the windows");
	}
}

class Linux extends Operating_system
{
	void parrot()
	{
		System.out.println("Processing speeed is high");
	}
}

public class Hierarchical_inheritance 
{
	public static void main(String args[])
	{
	Linux l=new Linux();
	l.Boost();
	l.parrot();
	
	Windows w=new Windows();
	w.run();
	w.Boost();
	}
	
}
