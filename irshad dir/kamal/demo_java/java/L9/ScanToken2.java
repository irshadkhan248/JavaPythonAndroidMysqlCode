import java.util.*;
class ScanToken2{
public static void main(String args[]){
String data="21,4,32,87,123";
Scanner scan=new Scanner(data);
scan.useDelimiter(",");
int a,b,c,reult;
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
reult=a+b+c;
System.out.println("Result"+reult);
}
}