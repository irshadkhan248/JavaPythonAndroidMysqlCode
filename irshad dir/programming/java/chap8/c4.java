abstract class c2
{
abstract void show1();
}
abstract class c3 extends c2
{
abstract void show2();
}
class c4 extends c3
{
void show1()
{
System.out.println("Show1()");
}
void show2()
{
System.out.println("Show2()");
}
public static void main(String args[])
{
c4 c=new c4();
c.show1();
c.show2();
}
}