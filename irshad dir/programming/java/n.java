import java.io.*;
class n
{
public static void main(String args[])throws IOException
{
int a,b,c,d,e,f,g,h,i;
String s;
System.out.println("\n\n\n\n\t\t\t\t\t********Nadakar Saab ********");
while(true)
{
System.out.print("\n\n");
System.out.println(" Enter any  Number from 1 to 10 To know gratest thoughts of Nadakar Saab ");

for(i=1;i<11;i++)
{
System.out.println(i+".");
}
System.out.print("Enter Number here: ");

InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
s=br.readLine();
c=Integer.parseInt(s);
System.out.print("\n\n\n");
switch(c)
{
case 1: System.out.println(" Listen to me very carefully, technology can be a troublemaker sometimes.");
break;
case 2: System.out.println(" I’m not cranky. I just have a violent reaction to stupid people.");
break;
case 3: System.out.println(" Seven billion smiles in the world,but the one on your face is still my favorite.");
break;
case 4: System.out.println(" You don't know me, you only know what i allow yoo to know");
break;
case 5: System.out.println(" it is good to be important but it is more important to be good ");
break;
case 6: System.out.println("  Fear can hold you prisoner and hope will set you free");
break;
case 7: System.out.println(" Only real friends will tell you when your face is dirty.");
break;
case 8: System.out.println(" Always keep in mind you are unique – just like everybody else.");
break;
case 9: System.out.println(" From birth we have to options; become the slave or master of our destiny");
break;
case 10: System.out.println(" Don't mess with me or I will mess with your DNA.");
break;
default: System.out.println(" Enter Correct Number otherwise Nadakar Saab will hunt you down to the bottom of hell.");
break;
}
}
}
}