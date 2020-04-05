class Temp4{
public static void main(String args[])
{
int x=100;
int a=x++;
int b=++x;
int c=x++;
int d=(a<b) ? (a<c)? a:(b<c) ? b : c: a;
System.out.println(d);
int xx=11 & 9;
int y= xx^3;
//System.out.println(y | 12);
System.out.println(y);
}
}
