import java.io.*;
class FileBufferCopier1a{
public static void main(String args[])throws IOException{
		File inputFile=new File("scjp.txt");
		FileReader fr=new FileReader(inputFile);
		BufferedReader in=new BufferedReader(fr);
		
		File outputFile=new File("scjpcopy.txt");
		FileWriter fw=new FileWriter(outputFile,true);
		BufferedWriter out=new BufferedWriter(fw);
		
		String line;
		while((line=in.readLine())!=null){
			out.write(line);
			out.newLine();
		}
		in.close();
		out.close();
}
}