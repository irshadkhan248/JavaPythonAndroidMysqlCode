package p1;
import java.io.*;
class Temp2{
public static void main(String args[]){
Console c=System.console();
int num=Integer.parseInt(c.readLine("Enter Number:"));
char pw[];
pw=c.readPassword("Enter password");
String s=new String(pw);
System.out.println("Enterd number:"+num+" Enterd Password:"+s);
}
}