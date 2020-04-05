import java.util.*;
class ScanToken{
public static void main(String args[]){
String data="4 80 5 61 75";
Scanner scan=new Scanner(data);
int a,b,c,res;
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
res=a+b+c;
System.out.println(res);
}
}