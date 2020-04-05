import java.io.*;
class Sub
{
public static void main(String args[])throws IOException
{
String s,s11;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
while(true)
{
System.out.println("\n\n\n\n\n");
System.out.println("\t\t\t::::::::::::Alumni Portal Project Group::::::::::::");
System.out.println("\nTo know your Subject Please Enter Number followed by your name.\n");
System.out.println("1.Arshad.");
System.out.println("2.Irshad.");
System.out.println("3.Mujahid.");
System.out.println("4.Shahnawaz."); 
s=br.readLine();
int i=Integer.parseInt(s);
switch(i)
{
case 1:s11="Arshad Syed your Subject is Parellel Distributed System. (PDS)";
break;
case 2:s11="Irshad Ahmed your Subject is Data Warehouse And Mining.(DWM)";
break;
case 3:s11="Siddibapa Mujahid your Subject is Human Machine Interaction. (HMI)";
break;
case 4:s11="Ansari Shahnawaz your Subject is Machine Learning. (ML)";
break;
default:s11="Invalid Entry.";
break;
}
System.out.println(s11);
//System.out.println("\n\n\nThankyou");
}
}
}
