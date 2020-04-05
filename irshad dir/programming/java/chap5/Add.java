import java.io.*;
class Add
{
public static void main(String args[])throws IOException
{
String s;
int a,b,c;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter first number ");
s=br.readLine();
a=Integer.parseInt(s);
System.out.println("Enter second number ");
s=br.readLine();
b=Integer.parseInt(s);
c=a+b;
System.out.print(a);
System.out.print(" +");
System.out.print(b);
System.out.print("is"+c);
//System.out.println(a" + "+b+"   is   "+c);
}
}