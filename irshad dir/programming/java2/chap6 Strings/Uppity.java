class Uppity{
public static void main(String args[])
{
String str1="lower",str2="LOWER",str3="UPPER",str4,str5;
str4=str1.toUpperCase();
str5=str4.replace("LOWER","UPPER");
System.out.println((str5));
System.out.println((str5.equals(str2))+ " "+(str5.equals(str3)));

}
}