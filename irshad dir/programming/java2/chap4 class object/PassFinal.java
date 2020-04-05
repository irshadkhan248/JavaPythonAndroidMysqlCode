class Add{
void add(final int n1,final int n2)
{
n1++;// 
n2++;
System.out.println("Addition = "+(n1+n2));
}
}
class PassFinal
{
public static void main(String args[])
{
int num1=10;
int num2=20;
Add obj=new Add();
obj.add(num1,num2);
}
}