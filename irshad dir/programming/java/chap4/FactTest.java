class Factroial
{
public int fact(int n)
{
if(n==0)
return 1;
else
return(n*fact(n-1));
}
}
class FactTest
{
public static void main(String args[])
{
Factroial f1=new Factroial();
System.out.println("factroial of 4 is "+f1.fact(4));
System.out.println("factroial of 4 is "+f1.fact(5));
}
}