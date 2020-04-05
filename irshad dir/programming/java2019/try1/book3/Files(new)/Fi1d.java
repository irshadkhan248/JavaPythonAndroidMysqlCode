import java.io.*;
class Fi1d{
	public static void main(String args[]){
		File d=new File(args[0]);
		if(!d.exists()){
			d.mkdir();
			System.out.println("Directory created");
			d.delete();
		}
		else
			System.out.println("Directory Alredy Exists");
		try{
		File f=new File(d,args[1]);
		if (!f.exists()){
			f.createNewFile();
			System.out.println("File created");
		}
		else
			System.out.println("File Alredy Exists");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}


// java Fi1d d8 f8.txt
// Directory created
// java.io.IOException: The system cannot find the path specified