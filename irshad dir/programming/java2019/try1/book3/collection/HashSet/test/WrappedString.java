import java.util.*;
public class WrappedString {
private String s;
public WrappedString(String s) { this.s = s; }
public boolean equals(Object o) {
WrappedString w = (WrappedString)o;
return (s.equals(w.s));
}
public int hashCode() {return s.hashCode(); }
public static void main(String[] args) {
HashSet<Object> hs = new HashSet<Object>();
WrappedString ws1 = new WrappedString("aardvark");
WrappedString ws2 = new WrappedString("aardvark");
WrappedString ws3 = new WrappedString("aardvark");
String s1 = new String("aardvark");
String s2 = new String("aardvark");
hs.add(ws1); hs.add(ws2); hs.add(ws3); hs.add(s1); hs.add(s2);
System.out.println(hs.size()); } }