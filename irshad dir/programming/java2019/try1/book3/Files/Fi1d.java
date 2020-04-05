//creating a directory and file inside that directory.

import java.io.*;
class Fi1d{
public static void main(String args[]){
File d =new File(args[0]);
if(! d.exists()){
d.mkdir();
System.out.println("Directory created");
}
else{
System.out.println("directory already exists");
}
File f=new File(d,args[1]);
try{
if(! f.exists()){
f.createNewFile();
System.out.println("File created");
}
else{
System.out.println(f+ "already exists");
}
}
catch(IOException e){
System.out.println(e);
}
}
}