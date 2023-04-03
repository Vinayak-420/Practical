	package Inheritance;
	
	class Arithmatic
	{
		int n1;
		int n2;
		int res;
		void add(int n1,int n2)
		{
			 res= n1+n2;
		}
	}
	
	class Adder extends Arithmatic
	{
		void display()
		{
			System.out.println("The result is "+res);
		}
	}
	public class Inheritance_assignment 
	{
		public static void main(String args[])
		{
			Adder a=new Adder();
			a.add(10, 20);
			a.display();
		}
	
	}
