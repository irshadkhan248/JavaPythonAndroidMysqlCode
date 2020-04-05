interface IntA
{
int X=20;
void display();
}

interface IntB extends IntA
{
int X=30;
void show();
}
class InterABImpl implements IntB
{
public void display()
{
System.out.println("A's x= "+IntA.X);
}
public void show()
{
System.out.println("A's x= "+IntA.X);
System.out.println("B's x= "+IntB.X);
}
public static void main(String args[])
{
InterABImpl ai=new InterABImpl();
ai.show();
ai.display();
}
}
