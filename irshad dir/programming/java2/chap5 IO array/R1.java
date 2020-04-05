import java.io.*;
class R1
{
public static void main(String args[])throws IOException
{

int a;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s;
System.out.println("Enter value ");
s=br.readLine();
int n=Integer.parseInt(s);
System.out.println("Entered value "+n);
}

}