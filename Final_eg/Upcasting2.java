package Final_eg;

class sub
{
	 int marks()
	{
		return  0;
	}
}

class history extends sub
{
	int marks()
	{
		return 80;
	}
}

class geography extends sub
{
	int marks()
	{
		return 85;
	}
}

class datastructure extends sub
{
	int marks()
	{
		return 90;
	}
}

class computer extends sub
{
	int marks()
	{
		return 95;
	}
}

class english extends sub
{
	int marks()
	{
		return 92;
	}
}


public class Upcasting2 
{
	public static void main(String args[])
	{
		sub h;
		h=new computer();
		System.out.println("Marks of Computer is: "+h.marks());

		h=new english();
		System.out.println("Marks of Computer is: "+h.marks());

		
	}
}
