/*waoojp */
class Rectangle{
private int length;
private int width;

public void setData(int length,int width){
this.length=length;
this.width=width;
}
public void showData(){
System.out.println("Length "+ length +"  width " + width);
}
}
class RectTest{
public static void main(String args[]){
Rectangle rect1=new Rectangle();
Rectangle rect2=new Rectangle();
int length,width;
length=Integer.parseInt(args[0]);
width=Integer.parseInt(args[1]);
rect1.setData(length,width);
rect1.showData();
rect2.setData(100,200);
rect2.showData();
}
}