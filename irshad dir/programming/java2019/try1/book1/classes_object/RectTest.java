class Rectangle{
private int length;
private int width;
public void setData(int length,int width){
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
Rectangle rect2=new Rectangle();
int a,b,c,d;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
d=Integer.parseInt(args[3]);
rect1.setData(a,b);
rect2.setData(c,d);
System.out.println("area1= "+rect1.areaRect());
System.out.println("area2= "+rect2.areaRect());
}
}