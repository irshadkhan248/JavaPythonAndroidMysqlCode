/*assignment*/
class MyClass
{
MyClass(int i)
{
System.out.println(i);
}
MyClass()
{
}
void printTheThing(String message)
{
System.out.println(message);
}
}
class Test
{
public static void main(String args[]){
MyClass mc=new MyClass();
MyClass mc1=new MyClass(25);
mc.printTheThing("hello i did not crash");
}
}