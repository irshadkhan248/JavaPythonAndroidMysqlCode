abstract class MyClass
{
abstract void calculate(double x);
}
class Sub1 extends MyClass
{
void calculate(double x)
{
System.out.println("Square "+(x*x));
}
}
class Sub2 extends MyClass
{
void calculate(double x)
{
System.out.println("Square root "+Math.sqrt(x));
}
}
class Sub3 extends MyClass
{
void calculate(double x)
{
System.out.println("cube "+(x*x*x));
}
}

class Different
{
public static void main(String args[])
{
Sub1 o1=new Sub1();
Sub2 o2=new Sub2();
Sub3 o3=new Sub3();
o1.calculate(3);
o2.calculate(9);
o3.calculate(5);
}
}