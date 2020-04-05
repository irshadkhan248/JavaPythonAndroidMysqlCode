import java.io.*;
public class Kesey{
public static void main(String args[])throws Exception{
File file=new File("BigData.txt");
FileWriter w=new FileWriter(file);
w.write("lots o data");
w.flush();
w.close();
}
}