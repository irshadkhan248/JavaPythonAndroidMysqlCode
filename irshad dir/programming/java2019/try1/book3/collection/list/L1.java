import java.util.*;
class L1{
	public static void main(String args[]){
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(9);list.add(5);list.add(9);list.add(4);list.add(5);list.add(3);
		System.out.println(list);
		list.add(0,8);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		list.set(1,7);
		for(Integer i:list)
			System.out.print(i+" ");
		System.out.println();
	list.remove(3);
	Iterator i =list.iterator();
	while(i.hasNext())
		System.out.print(i.next()+" ");
	System.out.println();
	list.remove(new Integer(3));
	System.out.println(list);
	System.out.println(list.contains(8));
	System.out.println(list.contains(new Integer(
	
	8)));
	}
}