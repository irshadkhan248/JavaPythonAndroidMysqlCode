//wajp  to delete a file whose name is provided by user.

import java.io.*;
class Prac2{
public static void main(String args[]){
Console c=System.console();
String file_name=c.readLine("Enter file name to Delete:");
File f= new File(file_name);
if(! f.exists()){
System.out.println(f +" File not Exists");
}
else{
f.delete();
System.out.println("File deleted");
}
}
}