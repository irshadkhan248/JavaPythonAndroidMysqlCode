import java.io.*;
public class ReadingFor {
public static void main(String[ ] args) {
String s;
try {
	Writer writer = new PrintWriter(System.out);
FileReader fr = new FileReader("myfile.txt");
BufferedReader br = new BufferedReader(fr);
 while((s = br.readLine()) != null)
System.out.println(s);
//writer.flush();
} 
catch (IOException e) { 
System.out.println("io error"+e); 
}
} 
}