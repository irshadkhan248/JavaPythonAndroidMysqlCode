import java.io.*;
class Ah2{
	public static void main(String args[]){
		Console c=System.console();
		int age=Integer.parseInt(c.readLine("Enter Age:"));
		assert age>=18: "You can't vote";
		System.out.println("you can vote");}}