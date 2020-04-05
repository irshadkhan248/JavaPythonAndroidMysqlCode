class StartEndWith
{
public static void main(String args[])
{
String s1,s2,s3;
s1=args[0];
boolean b=s1.startsWith("i");
s2=args[1];
boolean b1=s2.endsWith("d");
System.out.println(b);
System.out.println(b1);
System.out.println(s1.indexOf('a'));
System.out.println(s2.lastIndexOf('e'));
char c=s1.charAt(2);
System.out.println(c);
}
}