import java.util.*;
public class ListTest{
	public static void main(String args[]){
		List<String> al=new List<>();
		al.add("one");
		al.add("two");
		al.add("7");
		System.out.print(al+" ");
		for(Object o:al)
			System.out.print(o+" ");
		for(String s:al)
			System.out.print(s+" ");		
	}
}