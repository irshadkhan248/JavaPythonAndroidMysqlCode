import java.util.*;
public class ALE1b{
	public static void main(String args[]){
		ArrayList<String>al=new ArrayList<>();
		al.add("Java");
		al.add("C++");
		al.add("Java");
		al.add("Oracle");
		al.add("C");
		al.add("AJAX");
		System.out.println("Content of array list:"+al);
		Collections.sort(al);
		System.out.println("Content of array list:"+al);
	}
}