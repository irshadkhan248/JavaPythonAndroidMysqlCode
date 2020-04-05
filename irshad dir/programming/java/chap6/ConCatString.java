class ConCatString
{
public static void main(String args[])
{
String s1,s2,temp;
s1=args[0];
s2=args[1];
System.out.println(s1);
System.out.println(s2);
temp=s1.concat(s2);
System.out.println(temp);
temp=s1+" "+s2;
System.out.println(temp);
}
}