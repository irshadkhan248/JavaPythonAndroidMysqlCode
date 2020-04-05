//wajp to find occurances of element from the element provided by the user.
import java.io.*;
class Prac2
{
public static void main(String args[])
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("Enter Number Of element In Array:"));
if(n<=0)
System.out.println("! Array Size cannot be 0 or negative. ");
else
{
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=Integer.parseInt(c.readLine((i+1)+")"+"Enter Element:"));
int es=Integer.parseInt(c.readLine("Enter element to Search:"));
int oc=0;
for(int i=0;i<n;i++)
{
if (arr[i]==es){
oc++;
}
}
}
}
}