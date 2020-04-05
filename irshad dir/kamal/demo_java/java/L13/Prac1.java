/*wajp  that takes as input three CLA and perform the operation
java Prac1 10 plus 20 o/p:30
java Prac1 10 minus 20 o/p:-10
*/
class Prac1
{
public static void main(String args[])
{
try
{
double n1=Double.parseDouble(args[0]);
String op=args[1];
double n2=Double.parseDouble(args[2]);
double res=0.0;
switch(op)
{
case "plus": res=n1+n2;
System.out.println(res);
break;
case "minus": res=n1-n2;
System.out.println(res);
break;
default:
System.out.println("Invalid operation!");
}
}
catch(IllegalArgumentException|ArrayIndexOutOfBoundsException e)
{
System.out.println("Invalid Input!");
}
}
}