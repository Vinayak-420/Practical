package super_keyword;
/*super keyword--reference variable which refer immediate parent class object 
 usage of super keyword 
 refer immediate parent class constructor
 by using super keyword we can use parent class data member
 */
class Shape//parent class
{
	String name="Circle";//data member of parent class
}

class less extends Shape//child class
{
	String name="No size";//data member of child class
	void print()//child class method
	{
		System.out.println(name);//it represent child class
		System.out.println(super.name);//it represent immediate parent class
	}
}
public class SuperII
{
	public static void main(String args[])
	{
		less obj=new less();
		obj.print();
	}
}
