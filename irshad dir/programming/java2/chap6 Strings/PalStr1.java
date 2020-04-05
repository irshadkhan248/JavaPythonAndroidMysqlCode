//program  to check palindrome string

import java.io.*;
class PalStr1
{
public static void main(String args[])throws IOException
{
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String str2;

System.out.print(" Enter  String : ");
str2=br.readLine();
StringBuffer sb=new StringBuffer(str2);
sb.reverse();

if(str2.equals(sb.toString()))
System.out.println(" String is palindrome");
else
System.out.println(" String is not palindrome");

StringBuffer str5=new StringBuffer("abcdef");
str5.delete(2,5);
System.out.println(str5);
}
}