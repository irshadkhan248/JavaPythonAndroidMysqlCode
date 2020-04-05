class RetTest
{
public static void main(String arr[])
{
boolean ans;
ans=doStuff();
if(ans)
System.out.println("yes: ");
else
System.out.println("no ");
}
static boolean doStuff()
{
for(int x=0;x<3;x++)
{
System.out.println("in for loop");
return false;
}
return false;
}
}
