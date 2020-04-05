//java program to read write into/from files using BufferClasses.

import java.io.*;
public class FileBufferCopier{
public static void main(String args[])throws IOException{
File inputFile=new File("scjp.txt");
FileReader br=new FileReader(inputFile);
BufferedReader in=new BufferedReader(br);


File outputFile=new File("scjpcopy.txt");
FileWriter fw=new FileWriter(outputFile);
BufferedWriter out=new BufferedWriter(fw);
String line;
while((line=in.readLine())!=null)
out.write(line);
in.close();
out.close();
}
}