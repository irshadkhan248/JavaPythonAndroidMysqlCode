public class Runner{
public static String name="unknown";
public  void start(){
System.out.println(name);
}
public static void main(String args[]){
name="Daniel";
//start();
Runner r1= new Runner();
r1.start();
}
} 