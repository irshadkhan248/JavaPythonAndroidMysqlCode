//wajp  to create a file whose name is provided by user.

import java.io.*;
class Prac1{
public static void main(String args[]){
Console c=System.console();
String file_name=c.readLine("Enter file name to create:");
File f= new File(file_name);
if(f.exists()){
System.out.println(f +" File Already Exists");
}
else{
try{
f.createNewFile();
System.out.println("File Created");
}
catch(IOException ie){
System.out.println("create issue" +ie);
}
}
}
}