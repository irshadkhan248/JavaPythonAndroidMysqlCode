class StringBufferTest{
public static void main(String args[]){
String str=new String("hello");
StringBuffer sb=new StringBuffer("World");
sb.append(" of java");
System.out.println("Sb= "+sb);
String str2=new String(sb);
String str3=str2.toUpperCase();
StringBuffer sb1=new StringBuffer(str3);
System.out.println("Sb in UpperCase = "+sb1);
sb1.insert(4,"Earth");
System.out.println("Sb insert = "+sb1);
sb1.delete(0,sb1.length());
System.out.println("Sb deleted = "+sb1);
}
}