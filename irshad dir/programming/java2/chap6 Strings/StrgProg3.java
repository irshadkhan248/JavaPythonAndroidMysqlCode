import java.io.*;
class StrgProg3{
public static void main(String args[])throws IOException{
String s1,s2,s3,s4,s5,s6;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print(" Enter the First String: ");
s1=br.readLine();
System.out.print(" Enter the Second String: ");
s2=br.readLine();
boolean result=s1.equalsIgnoreCase(s2);
if(result)
{
s3=s1.concat(s2);
s4=s3.toLowerCase();
System.out.println(" concatinated string in lower case : "+s4);
}
else
System.out.println(" String are not same");
}
}