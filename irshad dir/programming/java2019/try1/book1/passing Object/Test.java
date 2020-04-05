class MyClass{
//MyClass(int i){}
void printTheThing(String message){
System.out.println(message);
}

/*MyClass(String message){
System.out.println(message);
}*/
//MyClass(){}
}
class Test{
public static void main(String args[]){
MyClass myclass=new MyClass();
myclass.printTheThing("Hello ,i did not crash");
}
}