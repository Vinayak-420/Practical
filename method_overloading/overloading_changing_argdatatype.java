package method_overloading;
//method overloading-same name method
//two way we can overload the methods
//1.changing no of arguments
//2.changing data type of arguments
public class overloading_changing_argdatatype
{
	static int sum(int a,int b)//integer type arguments
	{
		return a+b;
	}
	
	static double sum(double a,double b)//double type arguments
	{
		return a+b;
	}
	
	public static void main(String args[])
	{
		System.out.println(overloading_changing_argdatatype.sum(5,6 ));
		System.out.println(overloading_changing_argdatatype.sum(5.1,6.2 ));
	}

}
