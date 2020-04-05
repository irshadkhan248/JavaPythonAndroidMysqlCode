class RectCon
{
private int length,width;
public RectCon()
{
length=1;
width=1;
}
public RectCon(int l)
{
length=width=l;
}
public RectCon(int l,int w)
{
length=l;
width=w;
}

public int areaRect()
{
int a;
a=length*width;
return a;
}
}

class RectConTest
{
public static void main(String args[])
{
RectCon r1=new RectCon(20);
RectCon r2=new RectCon(32,20);
RectCon r3=new RectCon(30,40);
int a1,a2,a3,a4;
a1=r1.areaRect();
System.out.println("Area of rect is: "+a1);
a2=r2.areaRect();
System.out.println("Area of rect is: "+a2);
a3=r3.areaRect();
System.out.println("Area of rect is: "+a3);
}
}
