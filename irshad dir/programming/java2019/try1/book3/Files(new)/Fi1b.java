import java.io.*;
class Fi1b{
	public static void main(String args[]){
	File f=new File(args[0]);
try{
	f.createNewFile();
}catch(Exception e){
	System.out.println(e);
}	
System.out.println(f.exists());
	}
	}
	