/* wajp to remove the vovel*/
import java.io.*;
class Prac3{
public static void main(String args[]){
Console c=System.console();
int vc=0,cc=0;
String str=c.readLine("Enter a String:");
String vstr="";
String cstr="";
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);

switch(ch)
{
case 'a','e','i','o','u','A','E','I','O','U' ->
vstr=vstr + ch;
default ->cstr=cstr + ch;
}
}
System.out.println("str= "+cstr);
}
}