class GarCol
{
private int a,b;
static int count;
public static void main(String args[])
{
GarCol g1=new GarCol();
GarCol g2=new GarCol();
GarCol g3=new GarCol();
g1=g3;
g2=g3;
//System.out.println("count is s "+count);
System.gc();
output();
}
protected void finalize()
{
count++;
}
public static void output()
{
System.out.println("Garbage collector run "+count+"  times");
}
}
