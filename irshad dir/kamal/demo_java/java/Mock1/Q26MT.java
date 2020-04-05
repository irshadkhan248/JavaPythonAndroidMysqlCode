class MyClass{
String hello="Hello,dear";
MyClass(){
}
void printMessage(){
System.out.println(hello);
}
}

class Q26MT{
public static void main(String args[]){
MyClass mc=new MyClass();
mc.printMessage();
}
}