/*try catch exception handling EvenOdd.*/

import java.io.*;
class EvenOdd{
public static void main(String args[]){
Console c=System.console();
try{
while(true){

int op =Integer.parseInt(c.readLine("1: check and 2: exit  "));
if(op==1){
int num=Integer.parseInt(c.readLine("Enter Number:"));
String msg="";
if(num%2==0)
msg="Even";
else 
msg="odd";
System.out.println(msg);
}
else if(op==2)
{
break;
}
else{
System.out.println("Invalid Option ");
}
}
}

catch(IllegalArgumentException e)
{
System.out.println("Wrong  Dataaaaaaaa "+e);
}
catch(NumberFormatException e)
{
System.out.println("Wrong  Data "+e);
}





catch(Exception e)
{
System.out.println("!!! Invalid Data::::");
}
}
}