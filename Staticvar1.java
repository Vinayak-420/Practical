class Staticvar 
{
	int rollno;
	String name;
	float fee;
	static String college="MIT";
	Staticvar(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee+" "+college);	
	}
}
public class Staticvar1
{
	public static void main(String args[])
	{
		Staticvar s1=new Staticvar(102,"ram",5000);
		Staticvar s2=new Staticvar(103,"sham",2000);
		s1.display();
		s2.display();
	}
}