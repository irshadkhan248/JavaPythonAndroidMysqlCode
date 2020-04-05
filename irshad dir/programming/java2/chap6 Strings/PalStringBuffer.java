		//palindrome uising string buffer
import java.io.*;
class PalStringBuffer
{
public static void main(String args[])throws IOException
{
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter String to Check : ");
String str=br.readLine();
StringBuffer sb=new StringBuffer(str);
sb.reverse();
if(str.equals(sb.toString()))
System.out.println("String is palindrome ");
else
System.out.println("String is not palindrome ");
}
}