class A
{
A()
{
System.out.println(".A() SupCC");
}
A(int d)
{
System.out.println("A(d)SupCC"+d);
}
}
class B extends A
{
B()
{
System.out.println("B() SubCC");
}
B(int d)
{
super(40);
System.out.println("B(d) SubCC"+d);
}
}
class ST33
{
public static void main(String args[])
{
A a=new A();
B b=new B();
B b1=new B(5);
}
}