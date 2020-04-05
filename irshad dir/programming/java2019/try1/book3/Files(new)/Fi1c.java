import java.io.*;
class Fi1c{
public static void main(String args[]){
File f=new File(args[0]);
System.out.println(f.exists());
f.mkdir();
System.out.println(f.exists());
}
}