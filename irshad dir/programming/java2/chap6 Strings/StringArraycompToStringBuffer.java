class StringArraycompToStringBuffer
{
public static void main(String args[])
{
String str="java";
StringBuffer sbr=new StringBuffer("java");
if(str.equals(sbr.toString()))
System.out.println("equal");
else
System.out.println("not equal");
}
}