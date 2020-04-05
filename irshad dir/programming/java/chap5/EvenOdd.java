import java.io.*;
class EvenOdd
{
public static void main(String args[])throws IOException
{
int a;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s;
System.out.print("Entre number :");
s=br.readLine();
a=Integer.parseInt(s);
if(a%2==0)
{
System.out.println("enterd number is Even");
}
else
{
System.out.println("Enterd number is Odd");
}
}
}