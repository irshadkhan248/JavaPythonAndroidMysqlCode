import java.io.*;
class Char1
{
public static void main(String args[])throws IOException
{
char ch;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a character ");
ch=(char)br.read();
if(Character.isLetter(ch))
{
System.out.println("the character is letter ");
}
else
{
if(Character.isDigit(ch))
{
System.out.println("the character is digit ");
}
else
System.out.println("the character is other chatacter ");
}
}
}