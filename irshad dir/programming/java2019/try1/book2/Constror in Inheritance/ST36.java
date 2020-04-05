class A{
A(){}
A(int a){
System.out.println("1");
}
void displayA(){
System.out.println("2");
}
}

class B extends A{
void displayB(){
System.out.println("3");
}
}

class ST36{
public static void main(String args[]){
A a=new A(20);
a.displayA();
B B1=new B();
B1.displayA();
}
}