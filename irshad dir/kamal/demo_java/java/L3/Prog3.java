//wajp to find max of three ineger from command line argumnet

class Prog3
{
public static void main(String args[])
{
int n1,n2,n3,max;
n1=Integer.parseInt(args[0]);
n2=Integer.parseInt(args[1]);
n3=Integer.parseInt(args[2]);
if(n1>n2)
max=n1;
else
max=n2;
if(n3>max)
max=n3;
System.out.println("Max is "+max);
}
}