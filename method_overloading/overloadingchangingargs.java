package method_overloading;

public class overloadingchangingargs 
{
	static int sum(int a,int b)
	{
		return a+b;
	}
	
	static int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	
	public static void main(String args[])
	{
		System.out.println(overloadingchangingargs.sum(5,6 ));
		System.out.println(overloadingchangingargs.sum(4,5,6 ));
	}
}
