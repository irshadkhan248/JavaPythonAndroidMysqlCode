class A
{
int data1=10;
void show1()
{
System.out.println("A data="+data1);
}
}
class B extends A
{
int data2=20;
void show2()
{
System.out.println("B data="+data2);
}
}
class RefTest10e1
{
public static void main(String args[])
{
A a=new B();
System.out.println("Data1= "+a.data1);
System.out.println("Data2= "+a.data2);
a.show1();
a.show2();
}
}

 