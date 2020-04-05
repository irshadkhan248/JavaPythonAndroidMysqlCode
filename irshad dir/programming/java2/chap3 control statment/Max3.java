class Max3
{
public static void main(String Args[])
{
int a,b,c,max;
a=Integer.parseInt(Args[0]);
b=Integer.parseInt(Args[1]);
c=Integer.parseInt(Args[2]);
if(a>b)
max=a;
else 
max=b;
if(c>max)
max=c;
System.out.println("greater Number is "+max);
}
}