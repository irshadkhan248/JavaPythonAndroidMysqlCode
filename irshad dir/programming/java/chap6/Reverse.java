import java.io.*;
class Reverse
{
public static void main(String args[])
{
InputStreamReader isr=new InputStraemReader(System.in);
BufferedReader br=new BufferedReader(isr);
StringBuffer sb=new StringBuffer();
sb=br.readLine();
System.out.println("Eneter String ");
sb.reverse();
System.out.println(sb);
}
}