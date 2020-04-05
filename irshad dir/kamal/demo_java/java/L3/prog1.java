//wajp to find area if circle for which radius is supplied from command line 
class prog1
{
public static void main(String args[])
{
double radius,area;
final double PI=3.14159;
radius=Double.parseDouble(args[0]);
area=PI*radius;
System.out.println("Area ="+area);
System.out.printf("Area =%.2f",area);
}
}