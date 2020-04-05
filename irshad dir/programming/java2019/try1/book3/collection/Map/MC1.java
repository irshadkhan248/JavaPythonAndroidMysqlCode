import java.util.*;
class MC1{
	public static void main(String args[]){
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(15,"john");
		hm.put(11,"Alice");
		hm.put(15,"Tom");
		hm.put(14,"bob");
		hm.putIfAbsent(15,"jim");
		System.out.println(hm);
	}
}