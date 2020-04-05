class CompareString
{
public static void main(String args[])
{
String s1,s2;
String s4=new String("hello");
//s4="Hello";
s1="Hello";
s2="Hello";
String s3="hello";
boolean b2=s1==s4;
boolean b=s1.equalsIgnoreCase(s3);
System.out.println(b2);
System.out.println(b);
}
}