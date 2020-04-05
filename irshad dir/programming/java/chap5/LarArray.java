import java.util.*;
import java.io.*;
class LarArray
{
public static void main(String args[])throws IOException
{
int i;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("\n\n\n");
System.out.print("Enter the size of array: ");
String s=br.readLine();
int n=Integer.parseInt(s);
int a[]=new int [n];
for(i=0;i<n;i++)
{
System.out.print("\nEnter the "+(i+1)+" Element: ");
s=br.readLine();
a[i]=Integer.parseInt(s);
}
System.out.println("\n\n\t\t\t::::::::::::::::::Enterd Elements are:::::::::::::::::::::::::\n\n");
for(int j:a)
System.out.println("Enterd Elements are "+j);
int max;
max=a[0];
for(i=0;i<n;i++)
if(a[i]>max)
{
max=a[i];
}
System.out.println("\n\n\t\t\t::::::::::::::::::Largest Enterd Elements are::::::::::::::::::\n\n");
System.out.println("\nLargest Enterd Element is : "+max);
Arrays.sort(a);
System.out.println("\n\n\t\t\t::::::::::::::::::Sordted Elements are::::::::::::::::::\n\n");
for(int x:a)
{
System.out.println("\n"+x);
}
System.out.println("\nElement found at location: "+Arrays.binarySearch(a,100));
System.out.println("\nNote:- IF NEGETIVE LOCATION ARRIVE THEN ITS SHOWS THAT ELEMENT IS NOT FOUND.");
}
}