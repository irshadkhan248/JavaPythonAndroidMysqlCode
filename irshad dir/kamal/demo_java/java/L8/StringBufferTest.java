import java.io.*;
class StringBufferTest{
public static void main(String args[]){
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("how are you iam");
System.out.println(sb.capacity());
System.out.println("sb="+sb);
//sb.delete(0,sb.length());
//System.out.println("sb="+sb);
sb.delete();
System.out.println("sb="+sb);
}
}
