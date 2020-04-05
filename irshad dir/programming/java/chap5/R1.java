import java.io.*;
class R1
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
System.out.print("Enterd number is :"+s);
}
}