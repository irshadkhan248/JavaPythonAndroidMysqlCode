class Rectangle{
private int length;
private int width;

Rectangle(){
this.length=0;
this.width=0;
}

Rectangle(int length,int width){
this.length=length;
this.width=width;
}

public int areaRect(){
int area;
area=length*width;
return area;
}
}

public  class RectTest{
public static void main(String args[]){
Rectangle rect1=new Rectangle();
Rectangle rect2=new Rectangle(10,20);
System.out.println("area1= "+rect1.areaRect());
System.out.println("area2= "+rect2.areaRect());
}
}