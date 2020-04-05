class Cast
{
public static void main(String args[])
{
byte b;
int i;
//         1. byte to integer
b=65;
i=b*2;
System.out.println(i);
b=(byte)i;
System.out.println(b);
double d=123.785;
float f=(float)d;
System.out.println(f);
}
}
