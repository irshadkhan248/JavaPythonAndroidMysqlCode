class Eg2{
public static void main(String args[]){
String s1="India";
String s2="My India";
String s3="INDIA";
String s4="India";
System.out.println(s1.equals(s4));
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s3));
String s5="Java";
String s6=new String(s5);
System.out.println(s5.equals(s6));
System.out.println(s5==s6);
System.out.println(s5==s5);
}
}