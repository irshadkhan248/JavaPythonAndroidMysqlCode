import java.io.*;
class Ed12
{
public static void main(String args[])throws IOException
{
System.out.println("Program of Exception Handling Started");
int a,b,c,r;
String s;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
try{
System.out.println("Enter value of a");
s=br.readLine();
a=Integer.parseInt(s);
System.out.println("Enter value of b");
s=br.readLine();
b=Integer.parseInt(s);
System.out.println("Enter value of c");
s=br.readLine();
c=Integer.parseInt(s);
r=(a+b)/c;
System.out.println("result "+r);
}

catch(ArithmeticException e)
{
System.out.println("Exception is "+e);
System.out.println("divide by zero error");
}
catch(NumberFormatException e)
{
System.out.println("Mistake: please enter integer value");
System.out.println("Exception is. "+e);
}
/*catch(Exception e)
{
System.out.println("some another issue ");
}*/
}
}