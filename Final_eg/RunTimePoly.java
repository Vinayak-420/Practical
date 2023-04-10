package Final_eg;
/*runtime polymorphism--dynamic method dispatch
 * overload a static method in java---compile time poly
 * overridden method callled by the reference variable of parent class
 * overridden method is resolved at runtime rather than
 */
public class RunTimePoly 
{
	public static void main(String args[])
	{
		Java_student js;//reference variable of parent class 
		js=new Vinayak();
		System.out.println("Quality of vinayak is:"+js.quality());
	}
}

class Java_student//parent class
{
	String quality()//parent method
	{
		return null;
	}
}

class Vinayak extends Java_student//child class
{
	String quality()//overridden method
	{
		return "Active";
	}
}
