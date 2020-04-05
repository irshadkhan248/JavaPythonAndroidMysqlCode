class A
{
int data=10;
void show()
{
System.out.println("A data="+data);
}
}
class B extends A
{
int data=20;
void show()
{
System.out.println("B data="+data);
}
}
class RefTest10e
{
public static void main(String args[])
{
A a=new B();
System.out.println("Data1= "+a.data);
System.out.println("Data2= "+a.data);
a.show();
a.show();
a.show();
}
}

 