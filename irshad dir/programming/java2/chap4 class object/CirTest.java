class Circle
{
private float radius;

public void setData(float r)
{
radius=r;
}

public float areaCir()
{
float area;
area=3.14f*radius*radius;
return area;
}
public float circumCir()
{
 float circum;
circum=2*3.14f*radius;
return circum;
}
}

class CirTest
{
public static void main(String args[])
{
float a1,a2,a3,a4;
Circle c1=new Circle();
Circle c2=new Circle();

c1.setData(7);
c2.setData(14);

a1=c1.areaCir();
System.out.println("Area of Cir 1 is: "+a1);
a2=c2.areaCir();
System.out.println("Area of Cir 2 is: "+a2);
a3=c1.circumCir();
System.out.println("circum of Cir 1 is: "+a3);
a4=c2.circumCir();
System.out.println("circum of Cir 2 is: "+a4);

}
}