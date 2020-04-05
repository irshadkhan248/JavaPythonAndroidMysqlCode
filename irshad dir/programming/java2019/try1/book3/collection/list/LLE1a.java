import java.util.*;
public class LLE1a{
	public static void main(String args[]){
		LinkedList<String>al=new LinkedList<String>();
		al.add("C");al.add("C++");al.addFirst("Java");al.addLast("Oracle");al.add("PHP");al.add(1,"Ajax");al.remove("PHP");al.remove(2);al.removeFirst();al.removeLast();
		System.out.println("Content of LinkedList:"+al);
	}
}