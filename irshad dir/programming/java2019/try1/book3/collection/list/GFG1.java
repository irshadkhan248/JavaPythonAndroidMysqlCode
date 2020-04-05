// Java program to demonstrate 
// size() method for Integer value 

import java.util.*; 

public class GFG1 { 
	public static void main(String[] arg) 
	{ 
		// Creating object of ArrayList<Integer> 
		List<Integer> list = new ArrayList<Integer>(); 

		// Populating List 
		list.add(1001); 
		list.add(1002); 
		list.add(1003); 
		list.add(1004); 
		list.add(1005); 

		// print List 
		System.out.println("Before operation: "
						+ list); 

		// getting total size of list 
		// using size() method 
		int size = list.size(); 

		// print the size of list 
		System.out.println("Size of list = "
						+ list.get(list.size()-1)); 
	} 
} 
