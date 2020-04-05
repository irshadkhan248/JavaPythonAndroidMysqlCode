//array
import java.util.*;
class SecondHighestElementInArray{
	public static void main(String args[]){
		int arr[]={10,5,85,79,2,13,54,65,9,12,45,9,75,25,70,6};
		Arrays.sort(arr);
		for(int n:arr)
			System.out.print(n+" ");
		System.out.print("\n\n");
		int len=arr.length;
		len=len-2;
		System.out.println("Second heighest "+arr[len]);
	}
}