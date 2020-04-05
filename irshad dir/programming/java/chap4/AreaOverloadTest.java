class AreaOverload
{
public float area(float length, float width)
{
float ar;
ar=length*width;
return ar;
}
public float area(float r)
{
return(3.14f*r*r);
}
}
class AreaOverloadTest
{
public static void main(String args[])
{
AreaOverload a=new AreaOverload();
System.out.println("area of  rectangle is "+a.area(1.5f,3.6f));
System.out.println("area of  circle is "+a.area(2.5f));
}
}
