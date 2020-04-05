import java.io.*;
class prac4{
public static void main(String args[]){
Console c=System.console();
String un=c.readLine("Enter UserName:");
char[] p=c.readPassword("Enter Password:");
String pw=new String(p);

if(un.equals("kamal") && pw.equals("abc123"))
System.out.println("Success");
else
System.out.println("Failure");
System.out.println("Enterd password:"+pw);
}
}