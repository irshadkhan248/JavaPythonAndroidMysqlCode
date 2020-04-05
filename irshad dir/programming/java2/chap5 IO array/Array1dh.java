//#sum of array element
import java.io.*;
class Array1dh
{
static int total;
public static void main(String args[])throws IOException
{

InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the size of Array ");
String s=br.readLine();
int sa=Integer.parseInt(s);
System.out.println("\n\n\n\n");
int a[]=new int[sa];
for(int i=0;i<sa;i++)
{
System.out.println("Enter the Element"+(i+1));
String s1=br.readLine();
a[i]=Integer.parseInt(s1);
for(int j=0;i<sa;j++)
{
total=total+a[i];
}
System.out.println("total "+total);
}
}
}