import java.io.*;
class Ed41
{
public static void div()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s;
int a,b;
System.out.println("Enter a and b");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
System.out.println("a= "+a+" b= "+b);
}
public static void main(String args[])
{
try{
div();
}
catch(Exception e)
{
System.out.println("Exception Occoured");
}
}
}
