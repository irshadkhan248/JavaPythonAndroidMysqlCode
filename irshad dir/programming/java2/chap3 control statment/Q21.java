class Q21
{
public static void main(String args[])
{
boolean keepGoing=true;
int result=1;
int i=10;
do{
i--;
if(i==5)
{
keepGoing=false;
}
result >>=1;
}
while(keepGoing);
System.out.println(result);
}
}