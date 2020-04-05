import java.util.*;
class Q7Token{
public static void main(String args[]){

String csv="Sue,5,true,3.2,3";
Scanner scan=new Scanner(csv);
scan.useDelimiter(",");
String name=scan.next();
int age=scan.nextInt();
boolean b=scan.nextBoolean();
double d=scan.nextDouble();
}
}