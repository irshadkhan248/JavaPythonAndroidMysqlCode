class A {
static int counter = 0;
public void printCount(){
System.out.println(counter + " ");
} }
class B extends A{
static public int counter = 10;
public void printCount(){
System.out.println(counter + " ");
} }
public class Test{
public static void main(String[] args){
A foo = new A();
A bar = new B();
foo.printCount();
bar.printCount();
} 
}