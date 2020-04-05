//reverse of digit
class ReverseOfDigits{
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int last_digit,rev=0;
		while(n>0){
			last_digit=n%10;
			rev=rev*10+last_digit;
			n=n/10;
		}
		System.out.println(rev);
	}
}