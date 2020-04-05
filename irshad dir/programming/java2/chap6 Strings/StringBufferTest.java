class StringBufferTest
{
public static void main(String args[]){
StringBuffer sb=new StringBuffer("java is cool");
System.out.println(sb);
System.out.println(sb.length());
System.out.println(sb.capacity());
System.out.println(sb.charAt(8));
sb.setCharAt(5,'w');
System.out.println(sb);
sb.append(" x=100");System.out.println(sb);
sb.insert(5,"super");
System.out.println(sb);
sb.reverse();
System.out.println(sb);
}
}                  