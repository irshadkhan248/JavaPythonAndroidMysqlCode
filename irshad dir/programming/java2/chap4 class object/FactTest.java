class Factorial{
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
Factorial f=new Factorial();
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
System.out.println("Factroial of 4 = "+f.fact(n1));
System.out.println("Factroial of 6 = "+f.fact(n2));
}
}