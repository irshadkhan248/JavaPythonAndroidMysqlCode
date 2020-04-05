//prime Number Finder
class PrimeNumberFinder{
	public static void main(String args[]){
		int num,m=0,flag=0;
		num=Integer.parseInt(args[0]);
		m=num/2;
		if(num==0 || num==1)
			System.out.println(num+" not prime Number");
		else
		{
			for(int i=2;i<=m;i++){
				if(num%i==0){
					System.out.println(num+" not prime Number");
					flag=1;
					break;
				}
			}
				if(flag==0)
					System.out.println(num+" is prime Number");
		
		}
		
	}
}