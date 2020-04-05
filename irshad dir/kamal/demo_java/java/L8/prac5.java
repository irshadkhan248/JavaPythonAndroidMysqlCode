///user name and password

import java.io.*;
class prac5
{
	public static void main(String args[])
	{
		Console c=System.console();
		String un=c.readLine("Enter UnserName:");
		char[] p=c.readPassword("Enter Password:");
		String pw=new String(p);
		if(un.equals("irshad")&& pw.equals("abc123"))
		
			System.out.println("Success");
		
		else
		
			System.out.println("Failure");
		
	}
}
