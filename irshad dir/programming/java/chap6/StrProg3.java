import java.io.*;
class StrProg3
{
public static void main(String args[])throws IOException
{
String s1,s2,s3,s4,s5;
boolean result;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter First String ");
s1=br.readLine();
System.out.println("Enter Second String ");
s2=br.readLine();
result=s1.equalsIgnoreCase(s2);
if(result)
{
s3=s1.concat(s2);
s4=s3.toLowerCase();
System.out.println("Concatenated String in Lower Case "+s4);
}
else 
System.out.println("Strings are not same");
}
}