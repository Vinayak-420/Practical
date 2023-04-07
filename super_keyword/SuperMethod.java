package super_keyword;
/*super keyword--reference variable which refer immediate parent class object
 *usage of super keyword 
 *refer immediate parent class constructor
 */

class Shape1//parent class
{
	void print()//parent class method
	{
		System.out.println("Print circle");
	}
}

class more extends Shape1//child class
{
	void print()//same method of parent class 
	{
		System.out.println("Print triangle");
	}
	
	void display()//new method of child class
	{
		System.out.println("print nothing ");
	}
	
	void show()//final method
	{
		super.print();//refer immediate parent method
		display();
		print();
	}
}
public class SuperMethod 
{
	public static void main(String args[])
	{
		more m=new more();
		m.show();
	}
}
