class Q7T10
{
public static void main(String args[])
{
try
{
args=null;
args[0]="Test";
System.out.println(args[0]);
}

catch(NullPointerException npe)
{
System.out.println("null pointerException");
}
catch(Exception e)
{
System.out.println("Exception occured");
}
}
}