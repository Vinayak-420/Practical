 class Static_Method 
{
	int rollno;
	String name;
	float fee;
	static String college="AGPIT"; 
	
	//static method to change value of static variable
	static void change() 
	{
	college="MIT";
		
	}
	
	Static_Method(int rollno, String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() 
	{
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class Static_Method1
	{
		public static void main(String[] args) {
			//Static_Method.change();
			Static_Method s1 = new Static_Method(101,"Ram",5000);
			Static_Method s2 = new Static_Method(102,"Vinayak",85000);
			s1.display();
			s2.display();
		}
		
	}
	

}