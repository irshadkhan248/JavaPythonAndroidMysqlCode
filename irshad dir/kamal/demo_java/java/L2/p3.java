//prog to read two numbers from command line exchange the number using third variable.

class p3
{
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int temp;
System.out.println("Before Swapping");
System.out.println("n1="+n1+" n2="+n2);
temp=n1;
n1=n2;
n2=temp;

System.out.println("After Swapping");
System.out.println("n1="+n1+" n2="+n2);
}
}