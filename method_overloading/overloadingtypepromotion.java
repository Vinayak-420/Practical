package method_overloading;

public class overloadingtypepromotion 
{
	
		void add(int a,int b)//integer type arguments
		{
			System.out.println(a+b);
		}
		
		void add(int a,int b,int c)//double type arguments
		{
			System.out.println(a+b+c);
		}
		
		public static void main(String args[])
		{
			overloadingtypepromotion obj=new overloadingtypepromotion();
			obj.add(1, 2);
			obj.add(1,2,3 );
		}


}
