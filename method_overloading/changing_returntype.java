package method_overloading;
//changing return type is not possible in case of method overloading 
public class changing_returntype
{
	static int sum(int a,int b)
	{
	return a+b;
	}
	
	static double sum(int a,int b)
	{
	return a+b;
	}
	
	public static void main(String args[])
	{
		System.out.println(changing_returntype.sum(6, 5));
	}
}
