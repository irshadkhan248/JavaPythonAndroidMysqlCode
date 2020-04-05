//wajp to write data into file... file name and data is provided by user.

import java.io.*;
class Prac3{
public static void main(String args[])throws IOException{
Console c=System.console();
String file_name=c.readLine("Enter file name to write:");
File f= new File(file_name);
if(f.exists()){
String data=c.readLine("please Enter data into "+file_name+" file ");
FileWriter fw=new FileWriter(f,true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw);
pw.println(data);
pw.close();
System.out.println("Write done successfully ");
}
else{
System.out.println(f+" does not exists ");
}
}
}