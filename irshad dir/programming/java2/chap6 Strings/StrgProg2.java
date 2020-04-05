//jp to replace substring to new string
import java.io.*;
class StrgProg2
{
public static void main(String args[])throws IOException
{
String str1,str2,str3,str4,str5,str6,str7;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print(" Enter the String : ");
str1=br.readLine();

System.out.print(" Enter the Substring : ");
str2=br.readLine();

System.out.print(" Enter the new Substring : ");
str3=br.readLine();

str4=str1.replace(str2,str3);

System.out.print(" "+str4);

str5=str1.toLowerCase();
str6=str1.toUpperCase();
System.out.println(" Lower Case "+str5);
System.out.println(" Upper Case "+str6);
str7=str1.trim();
System.out.println(" trim "+str7);
}
}