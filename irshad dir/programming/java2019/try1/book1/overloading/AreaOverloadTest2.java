class AreaOverload{
public static int area(int l,int w){
int area=l*w;
return area;
}
public static float area(float r){
float area=3.14f*r*r;
return area;
}
}
class AreaOverloadTest2{
public static void main(String args[]){
//AreaOverload avl=new AreaOverload();
System.out.println("area of circle:"+AreaOverload.area(7.0f));
System.out.println("area of Rectangle:"+AreaOverload.area(10,20));
}
}