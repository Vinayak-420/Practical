public class Staticmethod2
{
	int m=30;
	static int n=20;
	static int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String args[])
	{
		int c=Staticmethod2.add(5,4);
		System.out.println(c);
		
		Staticmethod2 refvar=new Staticmethod2();
		System.out.println(refvar.m);
		System.out.println(n);
		
	}
}
