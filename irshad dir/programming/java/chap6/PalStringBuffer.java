import java.io.*;
class PalStringBuffer
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(isr);
System.out.println("Enter the String");
String str1=br.readLine();
StringBuffer sb=new StringBuffer(str1);
sb.reverse();
System.out.println("Reverse of Given String is:: "+sb);
if(str1.equals(sb.toString()))
System.out.println(str1+"  is palindrome");
else
System.out.println(str1+"  is not palindrome");
}
}