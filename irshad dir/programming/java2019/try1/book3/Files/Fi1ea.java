//creating a subdirectory.

import java.io.*;
class Fi1ea{
public static void main(String args[]){
try{
File dir1=new File("K1");
dir1.mkdir();
File dir2=new File(dir1,"K2");
dir2.mkdir();

File f=new File(dir1,"f1.text");
f.createNewFile();

File f2=new File(dir1,"f2.text");
f2.createNewFile();

File f3=new File(dir2,"f3.text");
f3.createNewFile();

f.delete();
dir2.delete();

File dir3=new File("k3");
dir1.renameTo(dir3);

}		//end of try.
catch(IOException e){}
}
}