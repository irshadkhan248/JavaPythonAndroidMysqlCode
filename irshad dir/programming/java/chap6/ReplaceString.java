class ReplaceString
{
public static void main(String args[])
{
String s1,s2,s3,s4,s5,temp;
s1="Bye Bye Bye";
s2=s1.replace('y','e');
System.out.println(s1);
System.out.println(s2);
s3=s1.replace("By","e");
System.out.println(s3);
s4=s1.replaceFirst("By","Me");
System.out.println(s4);
s5=s1.replaceAll("By","Me");
System.out.println(s5);

}
}