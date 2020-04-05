//createing new directory and file in that directory.

import java.io.*;
class MyDir_MyFile{
public static void main(String args[]){
File d=new File(args[0]);
if(! d.exists()){
d.mkdir();
System.out.println("Direcotry craeted ");
}
else{
System.out.println("Direcotry already exists ");
}


File f=new File(d,args[1]);
try{
if(! f.exists()){

f.createNewFile();
System.out.println("File craeted ");
}
else{
System.out.println("File already exists ");
}
}
catch(IOException e){}
}
}