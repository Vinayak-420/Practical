package super_keyword;
/*super keyword--reference variable which refer immediate parent class object
 *usage of super keyword 
 *refer immediate parent class constructor
 */
class Shape2//parent class
{
	//default constructor of parent class
	Shape2()
	{
		System.out.println("Hello");
	}
}

class Size extends Shape2//child class
{
	//default constructor of child class
	Size()
	{
		//invoke immediate parent class constructor at line no 9
		super();
		System.out.println("Hi");
	}
}

public class SuperCons 
{
	public static void main(String args[])
	{
	Size s=new Size();
	}
}

/*super() is added in each class constructor automatically by compiler if there is no super()*/
