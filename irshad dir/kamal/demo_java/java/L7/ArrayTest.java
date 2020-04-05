import java.io.*;
import java.util.*;
class ArrayTest
{
public static void main(String args[])throws IOException
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("Enter Number of Element In Array:"));
int a[]=new int[n];
for(int i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(c.readLine("Enter Element In Array:"));
}
Arrays.sort(a);
for(int ai:a){
System.out.print(ai+",");
}
int es=Arrays.binarySearch(a,36);
System.out.print(es);
}
}