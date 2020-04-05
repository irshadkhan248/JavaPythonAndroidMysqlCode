class AreaOverload
{
public float area(float length,float width)
{
return(length*width);
}

public float area(float radius)
{
return(3.14f*radius*radius);
}
}


class areaOverLoadTest
{
public static void main(String args[])
{
AreaOverload obj=new AreaOverload();
System.out.println("Area of Rectangle ="+obj.area(5.3f,3.5f));
System.out.println("Area of circle ="+obj.area(7));
}
}