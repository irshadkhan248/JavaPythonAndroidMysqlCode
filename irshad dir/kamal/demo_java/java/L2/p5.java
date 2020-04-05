//wapp to swapp without using third vriable

class P5
{
public static void main(String args[])
{
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
System.out.println("Before Swapp");
System.out.println("num1="+ num1+" num2="+ num2);
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("After Swapp");
System.out.println("num1="+ num1+" num2="+ num2);
}
}