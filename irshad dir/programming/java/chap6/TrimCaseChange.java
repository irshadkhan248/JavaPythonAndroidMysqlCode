class TrimCaseChange
{
public static void main(String args[])
{
String s1,s2,s3,s4,s5,temp1,temp;
s1="             Mahatama Gandhi            ";
System.out.println(s1);
temp1=s1.trim();
System.out.println(temp1);
temp=temp1.toUpperCase();
System.out.println(temp);
temp=temp1.toLowerCase();
System.out.println(temp);
}
}