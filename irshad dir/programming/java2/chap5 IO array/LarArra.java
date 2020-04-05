import java.io.*;
class LarArra
{
public static void main(String args[])throws IOException
{
int max=0,i,a[],n,sum=0;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the Size of Array ");
String s=br.readLine();
n=Integer.parseInt(s);
a=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter Element: "+(i+1));
s=br.readLine();
a[i]=Integer.parseInt(s);
}
//max=a[0];
for(i=0;i<n;i++)
{
sum+=a[i];



if(a[i]>max)
max=a[i];
}
System.out.println("max Number is "+max);
System.out.println("sum of elements Number is "+sum);
}
}