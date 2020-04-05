class Q13
{
public static void main(String args[])
{
int x=0;
int primes[]={1,2};
for(int i:primes)
switch(i)
{
case 1: x+=i;
case 5: x+=i;
default:x+=i;
case 2: x+=i;
}
System.out.println(x);
}
}