package constructor;

public class Parameterized 
{
int age;
String name;
 Parameterized(int a,String n)
 {
	 age=a;
	 name=n;
 }
 void show()
 {
	 System.out.println(age+ " " +name);	 
 }
 public static void main (String args[])
 {
	 Parameterized d=new Parameterized(21, "vnk");
	 Parameterized d1=new Parameterized(22, "nik");
	 Parameterized d2=new Parameterized(23, "ck");
	 d.show();
	 d1.show();
	 d2.show();
 }
}
