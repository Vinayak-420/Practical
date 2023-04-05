package method_overloading;
//overload main method is possible which received string type array
public class overload_main_method
{
	//JVM call the main method with string array
	public static void main(String args[])
	{
		System.out.println("Main with string type array");
	}
	
	public static void main(String args)
	{
		System.out.println("Main with without array");
	}
	
	public static void main()
	{
		System.out.println("Main with without arguments");
	}
}
