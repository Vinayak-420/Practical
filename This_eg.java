public class This_eg 
{
	int age;
	String name;
	 This_eg(int age,String name)
	 {
		 this.age=age;
		 this.name=name;
	 }
	 void show()
	
	 {
		 System.out.println(age+ " " +name);	 
	 }
	 public static void main (String args[])
	 {
		 This_eg  d=new This_eg (21, "vnk");
		 This_eg  d1=new This_eg (22, "nik");
		 This_eg  d2=new This_eg (23, "ck");
		 d.show();
		 d1.show();
		 d2.show();
	 }
	}


