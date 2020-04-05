class MyString{
String msg;
MyString(String msg){
this.msg=msg;
}
public String toString(){
	return msg;
}
}
class Test23{
public static void main(String args[]){
MyString ms=new MyString("KAVA SE 8");
System.out.println(ms.msg);
System.out.println("Hello " +new MyString("Java SE 8"));
}
}