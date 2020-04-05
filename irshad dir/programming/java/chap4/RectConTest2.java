//static method
class RectCon2
{
//private int length,width;
/*RectCon()
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
*/
public int areaRect(int length,int width)
{
int a;
a=length*width;
return a;
}
}

class RectConTest2
{
public static void main(String args[])
{
/*RectCon r1=new RectCon(20);
RectCon r2=new RectCon(32,20);
RectCon r3=new RectCon(30,40);*/
//int a1,a2,a3,a4;

System.out.println("Area of rect is: "+RectCon2.areaRect(20,80));
/*a2=r2.areaRect();
//System.out.println("Area of rect is: "+a2);
//a3=r3.areaRect();
//System.out.println("Area of rect is: "+a3);*/
}
}
