import java.util.*;
public class ALE1bc{
	public static void main(String args[]){
		LinkedList<String>al=new LinkedList<String>();
		al.add("java");
		al.add("C++");
		al.add("Oracle");
		al.add("C");
		al.add("Ajax");
		al.addFirst("Lava");
		Collections.sort(al);
		for(String s:al)
			System.out.print(s +" ");
		System.out.println();
		System.out.println("java is present at "+Collections.binarySearch(al,"java"));
		al.add("Android");
		Collections.reverse(al);
		for(String s:al)
			System.out.print(s +" ");
		System.out.println();
	}
}