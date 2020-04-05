import java.io.*;
class StringLengthTest{
public static void main(String args[])throws IOException{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s,s1;
System.out.print(" Enter first String : ");
s=br.readLine();
System.out.print(" Enter second String : ");
s1=br.readLine();
System.out.println(" Length of first String "+s+" : "+s.length() +"\n length of second String "+s1+" : "+s1.length() +"\n concatenated String : "+(s+s1));
String temp=s.substring(0,4);
System.out.println("SubString is "+temp);
char c=s.charAt(2);
System.out.println("Character at 2 of String"+s+" is " + c);
System.out.println(s.concat(s1)+"  concatenated staring ");

System.out.println(s.indexOf('g')); 
boolean out=s.equalsIgnoreCase(s1);
System.out.println(out);
//String s2="irsahd";
String s3=s.replace("i","y");
System.out.println(s3);
}
}


//char c = (char) System.in.read();