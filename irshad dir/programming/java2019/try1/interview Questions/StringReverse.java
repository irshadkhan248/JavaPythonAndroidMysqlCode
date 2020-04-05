import java.io.*;
class StringReverse{
	
	public static void main(String args[])throws IOException{
		String str1="",reverse="";
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter a String");
		str1=br.readLine();
		
		if(str1.length()==0){
			System.out.println("input String not found");
			return;
		}
		int len=str1.length();
		for(int i=len-1;i>=0;i--){
			reverse=reverse+str1.charAt(i);
			}
		System.out.println(reverse);
		
		if(str1.equals(reverse))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}