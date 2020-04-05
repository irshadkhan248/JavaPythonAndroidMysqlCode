class AreaOverload2
{
public int area(int length,int width)
{
return (length*width);
}

public float area(float radius)
{
return (3.14f*radius*radius);
}

public int area(int side)
{
return (side*side);
}

public float area(float length,float width)
{
return (0.5f*length*width);
}
}

class AreaOverloadTest2
{
public static void main(String args[])
{
AreaOverload2 obj=new AreaOverload2();
System.out.println("Area of Square= "+obj.area(2));
System.out.println("Area of circle= "+obj.area(7.0f));
System.out.println("Area of Rectangle= "+obj.area(7,8));
System.out.println("Area of triangle= "+obj.area(7.0f,8.0f));
}
}