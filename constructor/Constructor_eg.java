package constructor;

public class Constructor_eg 
{
		String name;
		int age;
		String designation;
		Constructor_eg()
		{
			name="";
			age=0;
			designation="";
		}
		Constructor_eg(String n,int a,String d)
		{
			name=n;
			age=a;
			designation=d;
		}
		void show()
		{
			System.out.println(name+" "+age+" "+designation);
		}
		public static void main(String args[])
		{
			System.out.println("\n\tParameterized Constructor");
			Constructor_eg c=new Constructor_eg("Vnk",21,"Manager");
			Constructor_eg c2=new Constructor_eg("swapnil",22,"Co-Manager");
			Constructor_eg c3=new Constructor_eg("nikhil",23,"UI-Designer");
			Constructor_eg c4=new Constructor_eg("Rohit",21,"Tester");
			c.show();
			c2.show();
			c3.show();
			c4.show();
			
			System.out.println("\n\tDefault Constructor");
			Constructor_eg c5=new Constructor_eg();
			c5.name="Swaraj";
			c5.age=23;
			c5.designation="Intern";
			c5.show();
			
			
		}


}
