//wajp to find max and min element from the element provided by the user.
import java.io.*;
class Prac1
{
public static void main(String args[])
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("Enter Number Of element In Array:"));
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=Integer.parseInt(c.readLine("Enter Element:"));
}
int max=0;

max=arr[0];
for(int i=1;i<n;i++)
{
if (arr[i]>max)
max=arr[i];
}
System.out.println("Max: "+max);
int min=0;
min=arr[0];
for(int i=1;i<n;i++)
{
if (arr[i]<min)
min=arr[i];
}
System.out.println("Min: "+min);
}
}