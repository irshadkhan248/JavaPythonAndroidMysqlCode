import java.io.*;
class T9Q3{
public static void main(String args[]){
PrintStream pw=new PrintStream(System.out);
double d=2.73258;
int x=3;
pw.format("%4.2f %s %d %n",d,"is almost",x);
pw.close();
}
}