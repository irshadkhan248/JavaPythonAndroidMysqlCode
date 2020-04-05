import java.io.*;
class AEg2
{
public static void main(String args[])
{
int a;
String s;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter number between 0 and 20: ");
try{
a=Integer.parseInt(br.readLine());
assert(a>=0 && a<=20):"invalid Number,Number should be in between 1 and 20";
System.out.println("You entered correct number");
}
catch(Exception e)
{
System.out.println("exception occored");
}
}
}