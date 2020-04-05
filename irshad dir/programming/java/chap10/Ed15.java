class Ed15
{
public static void main(String args[])
{
int a,b,ans;
try
{
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
if(a<1 || a>9)
{
throw new Exception("a should be betwwen 1 and 9");
}
ans=a/b;
System.out.println("the result is= "+ans);
}
catch(Exception e)
{
System.out.println("Some issue");
System.out.println("exception is "+e);
}
finally
{
System.out.println("this statment will get executed");
}
}
}