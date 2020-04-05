public class S1
{
static int x=0;
public static void go()
{
System.out.println(++x);
go();
}
public static void main(String args[])
{
S1.go();
}
}

