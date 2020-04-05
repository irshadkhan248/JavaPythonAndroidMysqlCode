class Rectangle
{
private int length,width;//instance variable

public void setData(int l,int w)
{
length=l;//instance method
width=w;
}

public int areaRect()
{
int area;    //local variable
area=length*width;
return area;
}
}

class RectTest
{
public static void main(String args[]){

Rectangle rect1=new Rectangle();
Rectangle rect2=new Rectangle();

int a1,a2;

rect1.setData(20,15);
rect2.setData(40,30);

a1=rect1.areaRect();
System.out.println("Area of Rect1 is: "+a1);
a2=rect2.areaRect();
System.out.println("Area of Rect2 is: "+a2);
}
}
