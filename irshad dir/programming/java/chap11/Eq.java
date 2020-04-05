class MyClass
{
int x;
MyClass(int x)
{
this.x=x;
}
}
class Eq
{
public static void main(String args[])
{
MyClass obj1=new MyClass(10);
MyClass obj2=new MyClass(10);
if(obj1.equals(obj2))
System.out.println("obj1 equal obj2");
else
System.out.println("obj1 not equal obj2");
Integer obj3=new Integer(15);
Integer obj4=new Integer(16);
if(obj3.equals(obj4))
System.out.println("obj3 equal obj4");
else
System.out.println("obj3 not equal obj4");
String s1=new String("hi");
String s2=new String("hii");
if(s1.equals(s2))
System.out.println("s1 equal s2");
else
System.out.println("s1 not equal s2");
}
}