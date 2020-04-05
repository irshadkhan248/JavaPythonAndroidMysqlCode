//string is palindrome or not
class palindrome{
	public static void main(String args[]){
		String str1=args[0];
		String reverse="";
		int len=str1.length();
		for(int i=len-1;i>=0;i--){
			reverse=reverse+str1.charAt(i);
		}
		if(reverse.equals(str1))
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}