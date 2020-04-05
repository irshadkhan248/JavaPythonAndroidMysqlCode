import java.io.*;
class FileBufferCopier1b{
public static void main(String args[])throws IOException{
		File inputFile=new File("scjp.txt");
		File outputFile=new File("scjpcopy.txt");
		
		try(FileReader fr=new FileReader(inputFile);
		BufferedReader in=new BufferedReader(fr);
		FileWriter fw=new FileWriter(outputFile,true);
		BufferedWriter out=new BufferedWriter(fw);)
		{
		{
		String line;
		while((line=in.readLine())!=null){
			out.write(line);
			out.newLine();
		}
}
}