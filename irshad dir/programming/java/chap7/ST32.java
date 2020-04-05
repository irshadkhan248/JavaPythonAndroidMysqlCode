class A
{
A()
{
System.out.println("1.A() SupCC");
}
}
class B extends A
{
B()
{
System.out.println("2.B() SubCC");
}
B(int d)
{
this();
System.out.println("3.B(d) SubCC");
}
}
class ST32
{
public static void main(String args[])
{
A a=new A();
B b=new B();
B b1=new B(5);
}
}