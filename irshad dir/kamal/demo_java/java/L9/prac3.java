//check string palindrome or not
import java.io.*;
import java.util.*;
class prac3{
public static void main(String args[]){
Console c=System.console();
String str=c.readLine("Enter a String:");

StringBuffer sb=new StringBuffer(str);

sb.reverse();
if(str.equals(sb.toString()))
System.out.println("Yes it is");
else 
System.out.println("no it is not");
}
}
