package super_keyword;

class Student
{
	int stud_id;
	String name;
	Student(int stud_id,String name)
	{
		this.stud_id=stud_id;
		this.name=name;
	}
}
class Course extends Student
{
	float Cour_fees;
	Course(int stud_id,String name,float Cour_fees)
	{
		super(stud_id,name);
		this.Cour_fees=Cour_fees;
	}
	void show() 
	{
		System.out.println(stud_id+" "+name+" "+Cour_fees);
	}
}

public class solapur_batch 
{
	public static void main(String[] args) 
	{
		Course obj = new Course(1,"Vinayak",1000);
		obj.show();
	}
}
