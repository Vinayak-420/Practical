package Inheritance;

public class Student
{
	int Stuid;
	String Stuname;
	Address add;
	Student(int Stuid,String Stuname,Address add)
	{
		this.Stuid=Stuid;
		this.Stuname=Stuname;
		this.add=add;
	}
	
	void show()
	{
		System.out.println(Stuid+" "+Stuname);
		System.out.println(add.city+" " +add.dist+" "+add.country);
	}
}
