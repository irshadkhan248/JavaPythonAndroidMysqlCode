public class Pass {

public static void main(String args[])
{
int x=5;
doStuff(x);
System.out.println("main x= "+x);
}
 static void doStuff(int x)
{
System.out.println("doStuff x = "+ (x+10));
}
}