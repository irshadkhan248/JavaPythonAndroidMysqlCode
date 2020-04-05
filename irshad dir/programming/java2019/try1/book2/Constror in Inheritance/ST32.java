class A{
A(){
System.out.println("1");
}
/*A(int a){
System.out.println("50");
}*/
}
class B extends A{
B(){
System.out.println("2");
}

B(int b){
//this();
System.out.println("3");
}
}
class ST32{
public static void main(String args[]){
A a=new A();
//A a1=new A(1);
B B1=new B();
B b=new B(2);
}
}