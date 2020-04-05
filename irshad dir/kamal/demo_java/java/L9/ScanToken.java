import java.util.*;
class ScanToken{
public static void main(String args[]){
String data="21 4 32 87 123";
Scanner scan=new Scanner(data);
int a,b,c,reult;
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
reult=a+b+c;
System.out.println("Result"+reult);
}
}