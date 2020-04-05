class max3
{
public static void main(String args[])
{
int a,b,max,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
if(a>b)
max=a;
else 
max=b;
if (c>b)
max=c;
System.out.println("max is "+max);

}
}