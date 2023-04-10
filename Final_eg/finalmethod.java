//final keyword-provide restriction
//final variable--cannot chage the value fo final variable

package Final_eg;

class finalmethod1 //parent class
{
	final void display()//create a final method
	{
		System.out.println("This is a fianl method");
	}
}

class child1 extends finalmethod1//child class name
{
	//try to override final method
	/*public final void display()
	{
		System.out.println("The final method is overridden");
	}*/
}

public class finalmethod
{
	public static void main(String args[])
	{
		child1 c=new child1();//creating object
		c.display();//calling the object
	}
}