import java.util.*;
class ScanToken2{
public static void main(String args[]){
String data="4w80w5w61w75";
Scanner scan=new Scanner(data);
scan.useDelimiter("w");
int a,b,c,res;
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
res=a+b+c;
System.out.println(res);
}
}