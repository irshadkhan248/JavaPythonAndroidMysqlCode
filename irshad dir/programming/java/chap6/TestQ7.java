class TestQ7
{
public static void main(String args[])
{
String str1="lower",str2="LOWER",str3="UPPER",temp;boolean temp2;
temp=str1.toUpperCase();
System.out.println("STR1 in upppercase "+temp);
temp=str1.replace("LOWER","UPPER");
System.out.println("STR1 after replace "+temp);
System.out.println((str1.equals(str2)));
temp2=str1.equals(str3);
System.out.println(temp2);
}
}