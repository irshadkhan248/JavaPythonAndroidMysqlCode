import java.io.*;
class StrProg2
{
public static void main(String args[])throws IOException
{
String str1,str2,str3,str4,s;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter String :");
str1=br.readLine();
System.out.println("Enter Sub String :");
str2=br.readLine();
System.out.println("Enter New  String :");
str3=br.readLine();
str4=str1.replace(str2,str3);
System.out.println("Original String :"+str1);
System.out.println("Modified String :"+str4);
}
}

