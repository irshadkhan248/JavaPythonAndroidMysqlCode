//plaindrome test
import java.io.*;
class ReverseMethodTest{
public static void main(String args[]) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a String:");
String s1=br.readLine();
StringBuffer sb=new StringBuffer(s1);

sb.reverse();
if(s1.equals(sb.toString()))
System.out.println("yes it is");
else
System.out.println("NO it is not");
}
}