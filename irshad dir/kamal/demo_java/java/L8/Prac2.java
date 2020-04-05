/*count the number of vovel and consuntant*/
import java.io.*;
class Prac2{
public static void main(String args[]){
Console c=System.console();
int vc=0,cc=0;
String str=c.readLine("Enter a String:");
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(Character.isLetter(ch))
{
switch(ch)
{
case 'a','e','i','o','u','A','E','I','O','U' ->vc++;
default -> cc++;
}
}
}
System.out.println("vc= "+vc+" cc= "+cc);
}
}