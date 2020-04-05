import java.io.*;
class Circle
{
public static void main(String args[])
{
Console c=System.console();
double r=Double.parseDouble(c.readLine("Enter Radius:"));
double area=Math.PI*Math.pow(r,2);
System.out.printf("area %.3f%n",area);
System.out.println("area "+area);
}
}