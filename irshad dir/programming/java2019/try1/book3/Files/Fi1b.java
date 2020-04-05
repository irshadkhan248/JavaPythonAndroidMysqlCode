//createing a File

import java.io.*;
class Fi1b{
public static void main(String args[]){
File f=new File(args[0]);
System.out.println(f.exists());
try{
f.createNewFile();
}//end of try
catch(IOException e){
System.out.println(e);
}	//end of catch
System.out.println(f.exists());
}	//end of main
}	//end of calss