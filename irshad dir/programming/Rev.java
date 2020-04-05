import java.io.*;
class Rev{
public static void main(String args[]){
Console c=System.console();
String s=c.readLine("Enter a String:");
System.out.println("Entered  String :"+s);
StringBuffer sb=new StringBuffer(s);
sb.reverse();
if(s.equals(sb.toString()))
	System.out.println("Yes,it is.");
else
	System.out.println("No,it is not.");
}
}