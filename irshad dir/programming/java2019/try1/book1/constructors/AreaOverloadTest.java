class AreaOverload{
public int area(int l,int w){
int area=l*w;
return area;
}
public float area(float r){
float area=3.14f*r*r;
return area;
}
}
class AreaOverloadTest{
public static void main(String args[]){
AreaOverload avl=new AreaOverload();
System.out.println("area of circle:"+avl.area(7.0f));
System.out.println("area of Rectangle:"+avl.area(10,20));
}
}