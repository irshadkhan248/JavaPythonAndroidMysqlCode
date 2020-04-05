import java.io.*;
class WrapperObj2
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter number");
String s1=br.readLine();
int i=Integer.parseInt(s1);
Integer n=new Integer(i);
byte b=n.byteValue();
System.out.println("b= "+b);
short s=n.shortValue();
System.out.println("s= "+s);
double d=n.doubleValue();
System.out.println("d= "+d);
float f=n.floatValue();
System.out.println("f= "+f);
long l=n.longValue();
System.out.println("l= "+l);
/*












*/
/*Float f=new Float("3.45665f");
System.out.println("f= "+f.toString());
String d=Double.toString(7.23);
System.out.println("String value = "+d);*/
}
}