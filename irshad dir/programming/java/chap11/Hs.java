class MyClass1
{
int x;
MyClass1(int x)
{
this.x=x;
}
}
class Hs
{
public static void main(String args[])
{
MyClass1 obj1=new MyClass1(10);
MyClass1 obj2=new MyClass1(10);
System.out.println("hash code for obj1= "+obj1.hashCode());
System.out.println("hash code for obj2= "+obj2.hashCode());
Integer obj3=new Integer(155645);
Integer obj4=new Integer(1636);
System.out.println("hash code for obj3= "+obj3.hashCode());
System.out.println("hash code for obj4= "+obj4.hashCode());
String s1 =new String("hi");
System.out.println("hash code for s1= "+s1.hashCode());
String s2 =new String("his");
System.out.println("hash code for s2= "+s2.hashCode());
System.gc();

}
}