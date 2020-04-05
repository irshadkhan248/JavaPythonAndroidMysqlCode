//wajp to read the string from the user and sort the letters

import java.io.*;
import java.util.*;
class prac1{
public static void main(String args[]){
Console c=System.console();
String str=c.readLine("Enter a String");
char ch[]=str.toCharArray();
Arrays.sort(ch);
String nstr=new String(ch);
System.out.println(str+" "+nstr);
}
}