//check armstrong number.
class armstrong{
	public static void main(String args[]){
	int n=Integer.parseInt(args[0]);
	int org_n=n,last_digit=0,sum=0;
	if(n<0){
		System.out.println("be +ve");
	}
	else
	{
		while(n>0){
			last_digit=n%10;
			sum=sum+(last_digit*last_digit*last_digit);
			n=n/10;
		}
		if(sum==org_n)
			System.out.println("yes");
		else
			System.out.println("no");
	}
		
	}
}