//wajp to convert   calicus to  fahrinate.
class Temp
{
public static void main(String args[])
{
double t=Double.parseDouble(args[0]);
double f=(t*9/5+32);
System.out.println("fahrinate="+f);
System.out.printf("Cel =%.3f  is fah=%.3f ",t,f);
}
} 