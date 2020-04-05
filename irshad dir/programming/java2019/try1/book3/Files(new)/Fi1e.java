import java.io.*;
class Fi1e{
	public static void main(String args[]){
		File d=new File(args[0]);
try{
	String z="bab";
		File f=new File(z,args[0]);
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


// Desktop\java june19\book3\Files(new)>javac Fi1e.java

// Desktop\java june19\book3\Files(new)>java Fi1e es
// java.io.IOException: The system cannot find the path specified
