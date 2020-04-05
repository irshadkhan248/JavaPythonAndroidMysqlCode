class Cast
{
public static void main(String agrs[])
{
byte b;
int i;
//1.byte to integer
b=65;
i=b*2;
System.out.println("integer to byte "+i);
//1.integer to byte
b=(byte)i;
System.out.println("byte to integer "+b);
double d=123.756;
i=(int)d;
System.out.println("double to integer "+i);
}
}