//reverse of given String
class P10{
	public static void main(String args[]){
		String str1=args[0];
		String reverse="";
		int len=str1.length();
		for(int i=len-1;i>=0;i--){
			reverse=reverse+str1.charAt(i);
		}
		System.out.println(reverse);
	}
}