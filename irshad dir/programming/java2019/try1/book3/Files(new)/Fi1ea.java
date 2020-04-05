import java.io.*;
class Fi1ea{
public static void main(String args[]){
try{
	File dir1=new File("k1");
	dir1.mkdir();
	
	File dir2=new File(dir1,"k2");
	dir2.mkdir();
	
	File f1=new File(dir1,"F1.txt");
	f1.createNewFile();
	
	File f2=new File(dir1,"f2.txt");
	f2.createNewFile();
	
	File f3=new File(dir2,"f3.txt");
	f3.createNewFile();
	
	f3.delete();
	dir2.delete();
	
	File dir3=new File("k3");
	dir1.renameTo(dir3);
	
}catch(Exception e){
	System.out.println(e);
}
}
}