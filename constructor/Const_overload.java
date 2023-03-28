package constructor;

public class Const_overload 
{
	int age;
	String name;
	String address;
	
	//Constructor 1 with 2 arguments
	
	Const_overload(int a,String n)
	{
		age=a;
		name=n;	
	}
	
	//Constructor 2 with 3 arguments
	
	Const_overload(int a,String n,String ad)
	{
		age=a;
		name=n;
		address=ad;
		
	}
	public void show()
	{
		System.out.println("Name="+name+" Age="+age+" Address="+address);
	}
	public static void main(String args[])
	{
		Const_overload o=new Const_overload(21,"VNK");
		Const_overload o2=new Const_overload(22,"swap","Solapur");
		o.show();
		o2.show();
		
	}
}


