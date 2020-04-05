import java.io.*;
class StrProg1
{
public static void main(String args[])throws IOException
{
String str1,str2,s;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("Enter first String                  : ");
str1=br.readLine();
System.out.print("Enter Second String                 : ");
str2=br.readLine();
int len1,len2;
len1=str1.length();
len2=str2.length();
System.out.println("Length of First string  "+str1+" is   : "+len1);
System.out.println("Length of Second string "+str2+" is   : "+len2);
s=str1+str2;
System.out.println("Concatenated String                 : "+s);
}
}