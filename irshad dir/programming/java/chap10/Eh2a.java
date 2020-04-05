import java.io.*;
class Eh2a
{
public static void main(String args[])throws IOException
{
System.out.println("Program of Exception Handling Started");
int a;
String s;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
try{
System.out.println("Enter value of a");
s=br.readLine();
a=Integer.parseInt(s);
System.out.println("a= "+a);
}
catch(NumberFormatException e)
{
System.out.println("Exception is "+e);
}
System.out.println("Program execution Ended");
}
} 