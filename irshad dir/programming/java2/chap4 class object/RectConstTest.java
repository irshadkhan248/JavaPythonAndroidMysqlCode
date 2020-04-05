class Rectangle
{

private int lenght,width;

public Rectangle()
{
lenght=0;
width=0;
}

public Rectangle(int l)
{
lenght=width=l;
}

public Rectangle(int l,int w)
{
lenght=l;
width=w;
}

public int areaRect()
{
return (lenght*width);
}
}

class RectConstTest{
public static void main(String args[]){
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle(20);
Rectangle r3=new Rectangle(20,30);
int a1,a2,a3;
a1=r1.areaRect();
a2=r2.areaRect();
a3=r3.areaRect();
System.out.println("area of first Rectangle "+a1);
System.out.println("area of first Rectangle "+a2);
System.out.println("area of first Rectangle "+a3);
}
}