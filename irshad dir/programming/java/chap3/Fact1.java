class Fact1
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
long fact=1;
for(long i=1;i<=num;i++)
{
fact*=i;
}
//System.out.println(i);
System.out.println("factroial of := "+fact);
}
}