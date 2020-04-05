///decimal to binary
class P12{
	public static void main(String args[]){
		int arr[]=new int[1000];
		int i=0;
		int num=Integer.parseInt(args[0]);
		while(num>0){
			arr[i]=num%2;
			num=num/2;
			i++;}
		for(int j=i-1;j>=0;j--){
			System.out.print(" "+arr[j]);}}}