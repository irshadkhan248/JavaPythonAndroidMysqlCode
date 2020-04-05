import java.io.*;
class CharTest{
public static void main(String args[])throws IOException{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print(" Enter  Char : ");
char c = (char) System.in.read();
System.out.print(c);
}
}