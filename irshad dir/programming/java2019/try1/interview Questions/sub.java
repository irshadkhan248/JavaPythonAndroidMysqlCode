class sub{
	public static void public static void main(String[] args) {
		int arr[]=new int [1000];
		int num=Integer.parseInt(args[0]);
		int i=0;
		while(num>0){
			arr[i]=num%2;
			num=num/2;
			i++;
		}
		for(int j=i-1;j>=0;j--){
			System.out.println(arr[j]);
		}

	}
}