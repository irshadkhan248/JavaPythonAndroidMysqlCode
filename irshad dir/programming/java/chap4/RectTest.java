class Rectangle
{
private int l1,l2,length,width;

//System.out.println("default value of L1 is: "+ l1);
//System.out.println("default value of l2 is: "+ l2);
public void setData(int l,int w)
{
//System.out.println("a "+a1);
length=l;
width=w;

}

public int areaRect()
{
int area;
area=length*width;
return area;
}
}

class RectTest
{
public static void main(String args[])
{
Rectangle rect1=new Rectangle();
Rectangle rect2=new Rectangle();
int a1,a2;
rect1.setData(20,20);
rect2.setData(25,17);
a1=rect1.areaRect();


System.out.println("area of first rect is "+a1);
a2=rect2.areaRect();
System.out.println("area of first rect is "+a2);
}
}
