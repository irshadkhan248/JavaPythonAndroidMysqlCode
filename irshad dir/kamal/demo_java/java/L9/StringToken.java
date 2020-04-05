class StringToken{
public static void main(String args[]){
String s="12 23 45 67 89";
String arr[]=s.split(" ");
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int c=Integer.parseInt(arr[2]);
int d=Integer.parseInt(arr[3]);
int e=Integer.parseInt(arr[4]);
int result=(a+b+c+d+e);
System.out.println(result);
}
}