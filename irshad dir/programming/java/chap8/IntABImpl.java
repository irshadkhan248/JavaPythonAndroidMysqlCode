interface A
{
int x=20;
void method();
}
interface B
{
int x=30;
void method();
}
class IntABImpl implements A,B
{
public void method()
{
System.out.println("A's x="+A.x+" B's x= "+B.x);
}
public static void main(String args[])
{
IntABImpl in =new IntABImpl();
in.method();
}
}