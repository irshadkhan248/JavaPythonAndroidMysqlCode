import java.io.*;
class Add
{
public static void main(String args[])throws IOException
{
String s;
int a,b,c;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter First Number ");
s=br.readLine();
a=Integer.parseInt(s);
System.out.println("Enter First Number ");
s=br.readLine();
b=Integer.parseInt(s);
System.out.println("Addition of NUmbers "+(c=a+b));
}
}