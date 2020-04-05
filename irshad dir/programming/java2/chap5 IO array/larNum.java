//program to find largest of given numbers
import java.io.*;
class larNum{
public static void main(String args[])throws IOException
{
int n,max=0;
String s;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the size of array ");
s=br.readLine();
n=Integer.parseInt(s);
int a[]=new int [n];
for(int i=0;i<n;i++)
{
System.out.print("("+(i+1)+")  Enter the Element : ");
s=br.readLine();
a[i]=Integer.parseInt(s);
}
a[0]=max;
for(int i=1;i<n;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.println("largest number is  "+ max+" ");


/*for(int j:a)
System.out.println(j);*/
}
}