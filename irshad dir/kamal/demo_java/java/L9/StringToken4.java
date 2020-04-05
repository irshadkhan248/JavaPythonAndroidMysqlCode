class StringToken4{
public static void main(String args[]){
String s="12 abc 12";
String arr[]=s.split(" ");
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int c=Integer.parseInt(arr[2]);
//int d=Integer.parseInt(arr[3]);
//int e=Integer.parseInt(arr[4]);
int result=(a+b+c);
System.out.println(result);
}
}