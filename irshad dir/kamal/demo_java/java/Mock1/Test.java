class MyClass_Q28MT{
static int i=5;
static int j=7;
public static void printSomething(){
System.out.print("i "+i);
System.out.print("J "+j);
}
}
class Test{
public static void main(String args[]){
MyClass_Q28MT.printSomething();
MyClass_Q28MT mct=new MyClass_Q28MT();
mct.printSomething();
}
}