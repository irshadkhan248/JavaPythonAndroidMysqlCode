//sum of digit.
class SumOfDigit{
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int last_digit,sum=0;
		if(n<0)
			System.out.println("b +ve");
		else
		{
			while(n>0){
			last_digit=n%10;
			sum+=last_digit;
			n=n/10;
			}
			System.out.println(sum);
		}
	}
}