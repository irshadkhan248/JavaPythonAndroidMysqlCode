class A{
A(int a){
System.out.println("A");
}
A(){
System.out.println("B");
}
}
class B extends A{
/*B(){
System.out.println("C");
}*/

B(int b){
System.out.println("D");
}
}
class ST30{
public static void main(String args[]){
A a=new A(1);
B b=new B(2);
}
}