public class ReturnDemo{
public static String getName(){
String temp=new  String("Jane Doe");
String temp1=new  String(" Jane Doe");
return temp + temp1;
}
public static void main(String args[]){
	String result;
	result=getName();
	System.out.println(result);
	System.out.println(result.getClass());
}
}
