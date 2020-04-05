//read a charcater to determine weather it is letter digit or other char
import java.io.*;
class Char1
{
public static void main(String args[])throws IOException
{
String s;
char ch;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a character ");
ch=(char)br.read();
if(Character.isLetter(ch))
System.out.println("character is letter");
else
if(Character.isDigit(ch))
System.out.println("character is digit");
else
if(Character.isWhitespace(ch))
System.out.println("character is Whitespace");
else
System.out.println("character is other");
}

}