
/*wajp to accept number from user and print the reverse of digit*/
class P4
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
int rev=0;
if (num<0)
{
System.out.println("b +ve");
}
else
{
while(num>0)
{
int digit=num%10;
rev=rev*10+digit;
num=num/10;
}
System.out.println("rev= "+rev);
}
}
}