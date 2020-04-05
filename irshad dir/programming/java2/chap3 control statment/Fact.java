class Fact
{
public static void main(String args[])
{
int i,num,fact=1;
num=Integer.parseInt(args[0]);
for(i=1;i<=num;i++)
{
fact*=i;
}
System.out.println("the factroial of "+num+"  is "+fact);
}
}