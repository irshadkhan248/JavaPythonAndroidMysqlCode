import java.util.*;
import java.util.Collections; 
class ArrayClass{
public static void main(String args[]){
String s[]={"c","f","e","k","w","t","y","z","x","a","r","q"};
System.out.print("\n\n\nUnsorted Array ");
for(String s2:s)
System.out.print(s2);

System.out.print("\nSorted Array ");
Arrays.sort(s,Collections.reverseOrder());
for(String s1:s)
System.out.print(s1);
Arrays.sort(s);
//String key="y";
System.out.println("\n\n\nElement    found  at  "+Arrays.binarySearch(s,"j")); 
}
}