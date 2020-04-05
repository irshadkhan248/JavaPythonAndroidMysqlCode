import java.util.*;
class MC2{
	public static void main(String args[]){
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=1;i<=10;i++){
		map.put(i,i*i);
		}
		System.out.println(map.get(1));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue(4));
		}
		}
		