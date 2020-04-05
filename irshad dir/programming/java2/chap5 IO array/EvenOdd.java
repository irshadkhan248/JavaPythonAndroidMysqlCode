import java.io.*;
class EvenOdd
{
public static void main(String args[])throws IOException
{
String s;
int a;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter Number to Check Even or Odd ");
s=br.readLine();
a=Integer.parseInt(s);
if(a%2==0)
System.out.println("Number "+a+ " is Even Number");
else
System.out.println("Number "+a+ " is Odd Number");
}
}