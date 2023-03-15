class Datatype
{
int a;
short b;
long c;
double d;
float e;
char f;
void show()
{
System.out.println("int :" +a);
System.out.println("short :" +b);
System.out.println("long :" +c);
System.out.println("double :" +d);
System.out.println("float :" +e);
System.out.println("char :" +f);
}
public static void main(String args[])
{
Datatype object = new Datatype();
System.out.println("The default values are given below");
object.show();
}
}
