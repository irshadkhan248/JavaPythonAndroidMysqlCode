import java.io.*;
public class talk{
public static void main(String args[]){
Console c=System.console();
String pw;
System.out.print("password:");
pw=c.readLine();
System.out.println("got "+pw);
}
}