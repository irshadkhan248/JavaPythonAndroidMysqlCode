class Record
{
int n1;
}
class pp3
{
public static void c1(Record r2)
{
r2.n1=25;
}
public static void main(String args[])
{
Record r1=new Record();
r1.n1=20;
System.out.println("n= "+r1.n1);
c1(r1);
System.out.println("n= "+r1.n1);
}
}