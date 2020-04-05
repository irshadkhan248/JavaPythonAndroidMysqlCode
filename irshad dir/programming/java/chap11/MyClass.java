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
/*Integer obj3=new Integer(15);
Integer obj4=new Integer(15);
if(obj3.equals(obj4));
System.out.println("obj3 equal obj4");
else
System.out.println("obj3 not equal obj4");*/
}
}