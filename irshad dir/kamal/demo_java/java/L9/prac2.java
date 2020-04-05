//wajp to find two string and find if they are anagram. (silent listen)
import java.io.*;
import java.util.*;
class prac2{
public static String mySort(String s){
char ch[]=s.toCharArray();
Arrays.sort(ch);
String s1=new String(ch);
return s1;
}
public static void main(String args[]){
Console c=System.console();
String str1=c.readLine("Enter a String:");
String str2=c.readLine("Enter a String:");
str1=mySort(str1);
str2=mySort(str2);
System.out.println(str1+" "+str2);
if(str1.equals(str2))
System.out.println("Yes ");
else
System.out.println("No ");
}
}