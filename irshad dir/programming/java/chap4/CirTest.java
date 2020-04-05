class Circle
{
private double r;
public void setData(double ri)
{
r=ri;
}

public double areaCir()
{
double cirArea;
cirArea=3.14*r*r;
return cirArea;
}
public double Circum()
{
double circumArea;
circumArea=2*3.14*r;
return circumArea;
}
}
class CirTest
{
public static void main(String args[])
{
Circle c1=new Circle();
Circle c2=new Circle();
double a1,a2,a3,a4;
c1.setData(7.5);
c2.setData(10.5);
a1=c1.areaCir();
System.out.println("area of first circle is "+a1);
a2=c2.areaCir();
System.out.println("area of second circle  is "+a2);
a3=c1.Circum();

System.out.println("circumfrence of first circle is "+a3);
a4=c2.Circum();
System.out.println("circumfrence of first circle is "+a4);
}
}
