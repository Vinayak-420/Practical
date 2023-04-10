//final keyword-provide restriction
//final variable--cannot change the value of final variable


package Final_eg;

public class FinalVariable 
{
	final int value=50;//initialization of final variable
	void display()
	{
		//value=70;
		System.out.println(value);
		//we cant change the value of final variable
		//compile time error
	}
	
	public static void main(String args[])
	{
		FinalVariable fv=new FinalVariable();
		fv.display();
	}

}
